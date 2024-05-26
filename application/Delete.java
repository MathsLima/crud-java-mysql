package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "DELETE FROM department "
                            + "WHERE "
                            + "Id = ?");

            st.setInt(1, 4);

            int rowsInserted = st.executeUpdate();
            System.out.println("Deleted " + rowsInserted + " lines on Database.");
        }
        catch(SQLException e){
                throw new DbException(e.getMessage());
        }
        finally{
                DB.closeConnection();
        }
    }
}