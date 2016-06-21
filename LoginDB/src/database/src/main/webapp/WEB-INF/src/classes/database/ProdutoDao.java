package classes.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DAO = Data Access Object.
 */
public class ProdutoDao {

    private static final String URL = "jdbc:derby:database;create=true";

    public static void inclui(String produto, String descricao) throws SQLException {
        // Abrir uma conexão com o banco de dados.
        Connection conn = DriverManager.getConnection(URL);
        // Executar instrução SQL.
        String sql = "insert into aluno (matricula, nome) values (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, produto);
        pstmt.setString(2, descricao);
        pstmt.executeUpdate();
        // Fechar sentença.
        pstmt.close();
        // Fechar conexão.
        conn.close();
    }

    public static void alterar(int ID, String produto) throws SQLException {
        // Abrir uma conexão com o banco de dados.
        Connection conn = DriverManager.getConnection(URL);
        // Executar instrução SQL.
        String sql = "update aluno set nome = ? where matricula = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, produto);
        pstmt.setInt(2, ID);
        pstmt.executeUpdate();
        // Fechar sentença.
        pstmt.close();
        // Fechar conexão.
        conn.close();
    }

    public static void excluir(int ID) throws SQLException {
        // Abrir uma conexão com o banco de dados.
        Connection conn = DriverManager.getConnection(URL);
        // Executar instrução SQL.
        String sql = "delete from aluno where matricula = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, ID);
        pstmt.executeUpdate();
        // Fechar sentença.
        pstmt.close();
        // Fechar conexão.
        conn.close();
    }
}
