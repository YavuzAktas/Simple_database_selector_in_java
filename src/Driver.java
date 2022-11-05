import java.util.Scanner;

public class Driver {
	
	
	public static boolean control(String x) {
		
		return x.equals("MYSQL") || x.equals("MSSQL") || x.equals("ORACLEDB");
	}
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		
		//Polymorphism used. First way
		
		DBConnection connection = (DBConnection) Class.forName(args[0]).newInstance(); //Change arg from run configurations
		connection.openConnection();
		connection.executeQuery("SELECT * FROM student");
		connection.closeConnection();
		
		
	
		//Second way
		
		/*Scanner scanner = new Scanner(System.in);
		String DBtype;
		DBConnection dbConnection = null;
		
		do {
			System.out.print("Enter your database type (MySQL or MsSQL or OracleDB) : ");
			DBtype = (scanner.nextLine()).toUpperCase();	
			if(!Driver.control(DBtype)) {
				System.out.println("You entered wrong database! Try again.");
				System.out.println("-----------------------------------------");
			}
			
		} while(!Driver.control(DBtype));
		
		
		switch(DBtype) {
			case "MYSQL":
				dbConnection = new MySQLConnection();
				break;
			
			case "MSSQL":
				dbConnection = new MsSQLConnection();
				break;
				
			case "ORACLEDB":
				dbConnection = new OracleDBConnection();
				break;
		}
		
		dbConnection.openConnection();
		dbConnection.executeQuery("SELECT * FROM student");
		dbConnection.closeConnection();*/
		
				
	}
	
	

}
