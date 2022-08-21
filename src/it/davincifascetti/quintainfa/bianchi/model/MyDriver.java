package it.davincifascetti.quintainfa.bianchi.model;

public class MyDriver {

	private static MyDriver driver = null;
	private String connectionString = null;

	private MyDriver() {
		String driverString = "org.mariadb.jdbc.Driver";
		connectionString = "jdbc:mariadb://localhost:3306/bianchi_formula_1";
		// leggere connString e driverString da file esterno
		/*
		 * Properties prop = new Properties(); String fileName = "dbAccess.config";
		 * 
		 * 
		 * 
		 * try (FileInputStream fis = new FileInputStream(fileName)) { prop.load(fis); }
		 * catch (FileNotFoundException ex) { System.out.println("Errore fnf"); } catch
		 * (IOException ex) { System.out.println("Errore io"); }
		 * 
		 * 
		 * 
		 * System.out.println(prop.getProperty("driver"));
		 * System.out.println(prop.getProperty("db"));
		 */

		try {
			Class.forName(driverString).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static synchronized MyDriver getInstance() {

		if (driver == null) {
			driver = new MyDriver();
		}
		return driver;

	}

	public String getConnectionString() {
		return this.connectionString;
	}

}
