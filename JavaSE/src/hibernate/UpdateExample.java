package hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {
    public static void main(String[] args) {

        String jdbcURL = "jdbc:postgresql://localhost:5432/veritabani_adi";
        String kullaniciAdi = "postgres";
        String sifre = "root";

        try {
            Connection conn = DriverManager.getConnection(jdbcURL,kullaniciAdi,sifre);
            String updateSQL = "UPDATE tablo_adi SET name = ? WHERE surname =?";
            PreparedStatement updateStatement = conn.prepareStatement(updateSQL);
            updateStatement.setString(1,"Yeni Isim");
            updateStatement.setString(1,"Kaya");
            int affectedRows = updateStatement.executeUpdate();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
