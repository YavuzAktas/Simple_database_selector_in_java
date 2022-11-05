
public class OracleDBConnection extends DBConnection{
	
	public void openConnection() {
		System.out.println("Oracle DB connection opened");
	}
	
	public void closeConnection() {
		System.out.println("Oracle DB connection closed");
	}
	
	public void executeQuery(String sql) {
		System.out.println("Oracle DB commands executed");
	}

}
