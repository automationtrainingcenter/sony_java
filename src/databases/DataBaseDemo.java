package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * To work with database we have gather the following information 1. DB
 * technology (MSSQL Server, MYSQL, Oracle, DB2 ..etc) 2. DB Server address 3.
 * DB credentials 4. Database Name we want to connect to 5. Table Name on which
 * we want to perform the operations 6. Column Names and their data types
 */

public class DataBaseDemo {

	public static void main(String[] args) {
		/*
		 * Load the driver class related to the DB technology dynamically using
		 * forName() method of Class class
		 */
		String driverClass = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverClass);
			/*
			 * Create connection to the required database by calling getConnection() method
			 * of DriverManager class and storing reference in Connection class object
			 */
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "surya", "password");

			/*
			 * Create Statement class object by calling createStatement() method of
			 * Connection class so that we can execute SQL queries
			 */
			Statement statement = con.createStatement();

			/*
			 * Execute SQL queries using executeQuery() method of Statement class and store
			 * the results in ResultSet class object
			 */
			ResultSet rs = statement
					.executeQuery("select * from city where Name = 'Hyderabad' and CountryCode = 'IND'");

			/*
			 * to execute update/ insert / delete queries we have to use executeUpdate()
			 * method of Statement class. this method does not return any output
			 */

			/* Iterate over the results using next() method of ResultSet class */
			while (rs.next()) {
				System.out.println(rs.getLong("ID") + "\t" + rs.getString("CountryCode") + "\t"
						+ rs.getString("District") + "\t" + rs.getLong("Population"));
			}

			/* Close the data base connection using close() method of Connection class */
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
