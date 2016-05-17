package mvc;

public class ImcModel {
	
	
	public static String calcular(double peso, double altura) {
		double resultado = 0;
		
		if(altura >= 3){
			return "";
		}
		else {
			if(altura == 0){
				resultado = 0;
			}else{
				resultado = peso / (altura*altura);
			}
		}
		
		return String.format("%.2f", resultado); 
	}
	
	public static String resultado(double peso, double altura) {

		double res = 0;
		
		res = peso / (altura*altura);
		
		if(altura == 0 || altura >= 3){
			return "Altura Incorreta!!";
		}
		else{
			if (res < 17){
				return "Muito Abaixo do Peso!";
			}
			else if (res >= 17 && res <= 18.49){
				return "Abaixo do Peso!";
			}
			else if (res >= 18.5 && res <= 24.99){
				return "Peso Normal!";
			}
			else if (res >= 25 && res <= 29.99){
				return "Acima do Peso!";
			}
			else if (res >= 30 && res <= 34.99){
				return "Obesidade I";
			}
			else if (res >= 35 && res <= 39.99){
				return "Obesidade II";
			}
			else{
				return "Obesidade III";
			}
		}
	}

	

}
