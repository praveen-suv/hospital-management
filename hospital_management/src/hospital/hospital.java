package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class hospital {
		Connection con;
		String dburl="jdbc:mysql://localhost:3306/hospital";
		String dbuser="root";
		String dbpass="12345678";
		public hospital() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","12345678");
				System.out.println("dbConnected");
					}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		}

		
		}


