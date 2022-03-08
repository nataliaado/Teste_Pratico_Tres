package DB;

import org.junit.Test;


import java.sql.*;

public class DB {

   // String name_product;


    @Test
    public void executeQuery() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_teste_automacao", "root", "");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM banco_teste_automacao.massas");


        while (rs.next()) {
            //  Map<String, String> map = new HashedMap<>();
           // map.put(("NAME_PRODUCT"), name_product);

            String name_product = rs.getString("NAME_PRODUCT");
            String customization = rs.getString("CUSTOMIZATION");
            String display = rs.getString("DISPLAY");
            String display_resolution = rs.getString("DISPLAY_RESOLUTION");
            String display_size = rs.getString("DISPLAY_SIZE");
            String memory = rs.getString("MEMORY");
            String operating_system = rs.getString("OPERATING_SYSTEM");
            String processor = rs.getString("PROCESSOR");
            String touchscreen = rs.getString("TOUCHSCREEN");
            String weight = rs.getString("WEIGHT");
            String color = rs.getString("COLOR");


        }


    }


}
