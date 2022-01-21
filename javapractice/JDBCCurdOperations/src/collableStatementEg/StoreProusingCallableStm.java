package collableStatementEg;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class StoreProusingCallableStm {




	static Connection conn = null;
	static String sql = "{call Moives(?,?,?)}";
	
	

	public static void main(String[] args) {
		conn = DBConnection.getDBConnection();
		if(conn != null) {
		try {
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 1);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setDouble(3, 25);
			cstmt.registerOutParameter(3, Types.DOUBLE);
			cstmt.execute();
			System.out.println("Movie Name = "+ cstmt.getString(2));
			System.out.println("Rating Old rating = "+ cstmt.getDouble(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
		System.out.println("Connection not established");
	}
	}
}