
import java.sql.*;

class Validator{
	Connection con;

	static int INCOMPLETE = 0;
	static int USER_NOT_FOUND = 1;
	static int PASSWORD_MISMATCH = 2;
	static int VALIDATION_SUCCESSFUL = 3;

	public Validator(){
		try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","3745");
        } 
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
	}

	public int validate(String user, String pwd){
		if(user.equals("") || pwd.equals("")){
			try{
				con.close();
			}
			catch(SQLException e){
				System.out.println(e);
			}
			return Validator.INCOMPLETE;
		}

        int result = -1;
		try{
			Statement st = con.createStatement();
            ResultSet rst;
            rst = st.executeQuery("select COUNT(user) from users where user='"+user+"';");
            rst.next();
            if(rst.getInt(1)==0){
            	result = Validator.USER_NOT_FOUND;
            }
            else{
	            rst = st.executeQuery("select pwd from users where user='"+user+"';");
	            rst.next();
	            String corr_pwd = rst.getString(1);
	            if(corr_pwd.equals(pwd)){
	         		result = Validator.VALIDATION_SUCCESSFUL;   	
	            }
	            else{
	            	result = Validator.PASSWORD_MISMATCH;
	            }
	        }
	        con.close();
        }
        catch(SQLException e){
        	System.out.println(e);
        }
        return result;
	}
}

