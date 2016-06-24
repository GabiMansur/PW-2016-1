package classes
        ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductManagerDao {

    private static final String URL = "jdbc:derby:database;create=true";

    public static void inclui(int ID, String nome, String descricao) throws SQLException {

        Connection conn = DriverManager.getConnection(URL);

        String sql = "insert into PRODUTOS (NOME, DESCRICAO, ID) values (?, ?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, nome);
        pstmt.setString(2, descricao);
        pstmt.setInt(3, ID);
        pstmt.executeUpdate();

        pstmt.close();

        conn.close();
    }

    public static void alterarQuantidade(int ID, int quantidade) throws SQLException {

        Connection conn = DriverManager.getConnection(URL);

        String sql = "update PRODUTOS set QUANTIDADE = ? where ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, quantidade);
        pstmt.setInt(2, ID);
        pstmt.executeUpdate();

        pstmt.close();

        conn.close();
    }

    public static void alterarDescricao(int ID, String Desc) throws SQLException {

        Connection conn = DriverManager.getConnection(URL);

        String sql = "update PRODUTOS set DESCRICAO = ? where ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, Desc);
        pstmt.setInt(2, ID);
        pstmt.executeUpdate();

        pstmt.close();

        conn.close();
    }

    public static void excluir(int ID) throws SQLException {

        Connection conn = DriverManager.getConnection(URL);

        String sql = "delete from PRODUTOS where ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, ID);
        pstmt.executeUpdate();

        pstmt.close();

        conn.close();
    }
}


