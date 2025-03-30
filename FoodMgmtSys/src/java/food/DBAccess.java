package food;

import bean.Food;
import bean.Userlist;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class DBAccess {

    HttpSession session;
    DBConnection dbconnection;
    Connection con;
    ResultSet rs;

    public DBAccess(HttpSession session) {
        this.session = session;
        dbconnection = new DBConnection();
    }

    public boolean validateUser(String uname, String pwd) {
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users WHERE "
                    + "User_Name = '" + uname + "' AND Password ='" + pwd + "'");

            if (rs.next()) {
                session.setAttribute("s_uid", rs.getString("User_ID"));
                System.out.println("food.DBAccess.validateUser()" + session.getAttribute("s_uid"));
                session.setAttribute("s_user_name", rs.getString("User_Name"));
                return true;
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return false;
    }

    public String getUserType(String uname) {
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users WHERE "
                    + "User_Name = '" + uname + "'");

            if (rs.next()) {
                System.out.println("food.DBAccess.getUserType()" + rs.getString("User_type"));
                return rs.getString("User_type");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return null;
    }

    public int getUserID(String uname) {
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT User_ID FROM users WHERE User_Name = '" + uname + "'");

            if (rs.next()) {
                return rs.getInt("User_ID");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return 0;
    }
      public boolean raiserequest(String uid, String fid) {
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            String sqlStr = "INSERT INTO requests (User_ID,Food_ID)"
                    + "VALUES ('" + uid + "', '" + fid + "')";

            int nRows = stmt.executeUpdate(sqlStr);
            if (nRows > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int addUser(String Fullname, String Mobile_no, String Email, String Address, String User_Name, String Password) {

        int nRows = 0;
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            String sqlStr = "INSERT INTO users (Fullname, Mobile_no, Email, Address, User_Name, Password)"
                    + "VALUES ('" + Fullname + "', '" + Mobile_no + "', '" + Email + "', '" + Address + "', '" + User_Name + "', '" + Password + "')";
            nRows = stmt.executeUpdate(sqlStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nRows;
    }

    public int deleteUser(String uid) {

        int nRows = 0;
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            String sqlStr = "DELETE from  users WHERE User_ID =" + uid;
            nRows = stmt.executeUpdate(sqlStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nRows;
    }

    public int deletefood(String fid) {

        int nRows = 0;
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            String sqlStr = "DELETE from  food WHERE Food_ID =" + fid;
            nRows = stmt.executeUpdate(sqlStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nRows;
    }

    public int addfood(String Food_name, String Food_type, String Food_description, String Food_qty, String Fod_date, String Expiry_date, String Food_location) {

        int nRows = 0;
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            String sqlStr = "INSERT INTO food (Food_name, Food_type, Description, Quantity, Date_of_add, Expiry_date, Location)"
                    + "VALUES ('" + Food_name + "', '" + Food_type + "', '" + Food_description + "', '" + Food_qty + "', '" + Fod_date + "', '" + Expiry_date + "','" + Food_location + "')";
            nRows = stmt.executeUpdate(sqlStr);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return nRows;
    }

    public ArrayList<Food> Listoffood() {
        ArrayList<Food> food = new ArrayList<>();
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM food");

            while (rs.next()) {
                food.add(new Food(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return food;
    }

    public ArrayList<Food> ListTodayfood() {
        ArrayList<Food> food = new ArrayList<>();
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM food WHERE Date_of_add = CURRENT_DATE");

            while (rs.next()) {
                food.add(new Food(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return food;
    }
    public ArrayList<Userlist> listofuser() {
        ArrayList<Userlist> user = new ArrayList<>();
        try {
            con = dbconnection.getCon();
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                user.add(new Userlist(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return user;
    }

}
