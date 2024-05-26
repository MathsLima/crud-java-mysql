package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

public class Update {
    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE "
                    + "(DepartmentId = ?) ");

                    st.setDouble(1, 200.0);
                    st.setInt(2, 2);

            int rowsInserted = st.executeUpdate();
            System.out.println("Update: " + rowsInserted + " lines on Database.");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            DB.closeConnection();
        }
    }
}