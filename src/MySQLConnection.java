
public class MySQLConnection extends DBConnection{
	
	public void openConnection() {
		System.out.println("MySQL connection opened");
	}
	
	public void closeConnection() {
		System.out.println("MySQL connection closed");
	}
	
	public void executeQuery(String sql) {
		System.out.println("MySQL commands executed");
	}

}
