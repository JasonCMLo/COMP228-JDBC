
import java.sql.*;

public class BaseCentennialConnection {

    static final String DRIVER = "oracle.jdbc.OracleDriver";
    static final String DATABASE_URL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD";
    static final String USERNAME = "COMP228_F22_ya_19";
    static final String PASSWORD = "password";

    public static void main(String[] args) {
        try{
            System.out.println(">> Starting Program!");

            Class.forName(DRIVER);
            System.out.println(">> Driver Loaded Successfully!");

            Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME, PASSWORD);
            System.out.println(">> Database Connected Successfully!");

            Statement st = connection.createStatement();
            // DOESN'T WORK
            // st.executeQuery("DELETE FROM TEST WHERE NAME = 'Johns'");

            ResultSet rs = st.executeQuery("Select * FROM PLAYERS");
            ResultSetMetaData md = rs.getMetaData();

            while (rs.next()) {
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    System.out.print(md.getColumnName(i)+ " \t " + rs.getObject(i) + " \t ");
                }
                System.out.println();
            }
            rs.close();
            st.close();
            connection.close();



            System.out.println("Command executed successfully");

        }catch (Exception e){
            System.out.println("Exception Found!");
            e.printStackTrace();
        }
    }
}
