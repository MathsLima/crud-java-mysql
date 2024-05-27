package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Insert {
    public static void main(String[] args){

        //cria a conexao
        Connection conn = null;
        PreparedStatement st = null;

        //seta formato da data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "INSERT INTO seller"
                        + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                        +  "VALUES"
                        +"(?,?,?,?,?)");

            st.setString(1, "Carl Purple");
            st.setString(2, "carl@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("24/05/1990").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);

            int rowsInserted = st.executeUpdate();
            System.out.println("Inserted: " + rowsInserted + " lines on Database.");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        finally{
            DB.closeConnection();
        }
    }
}