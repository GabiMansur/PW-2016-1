package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/imc")
public class ImcController extends HttpServlet{

	private String valor(
			HttpServletRequest req,
			String param,
			String padrao) {

		String result = req.getParameter(param);
		if (result == null) {
			result = padrao;
		}
		return result;
	}
	
	private double toDouble(
			HttpServletRequest req,
			String param,
			String padrao) {

		return Double.parseDouble(valor(req, param, padrao));
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double peso = toDouble(req, "peso", "0");
		double altura = toDouble(req, "altura", "1");
		

		String resultadoCalculo = ImcModel.calcular(peso, altura);
		String resultadoSituacao = ImcModel.resultado(peso, altura);
		
		//Passando parâmetro para o JSP.
		req.setAttribute("resultado", resultadoCalculo);
		req.setAttribute("situacao", resultadoSituacao);

		req.getRequestDispatcher("ImcView.jsp").forward(req, resp);
	}
}
