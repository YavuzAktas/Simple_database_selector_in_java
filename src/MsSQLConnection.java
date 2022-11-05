
public class MsSQLConnection extends DBConnection{
	
	public void openConnection() {
		System.out.println("MsSQL connection opened");
	}
	
	public void closeConnection() {
		System.out.println("MsSQL connection closed");
	}
	
	public void executeQuery(String sql) {
		System.out.println("MsSQL commands executed");
	}

}
