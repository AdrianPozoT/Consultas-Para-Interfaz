package demo_jdbc;


import demo_jdbc.models.Circuit;
import demo_jdbc.respositories.CircuitRepository; 

import demo_jdbc.models.DriverResult;
import demo_jdbc.respositories.DriverResultRepository;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage; 


public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
		
		/*
		 * DriverResultRepository driverResultRepository = new DriverResultRepository();
		 * var results = driverResultRepository.getResultByYear(2000);
		 * 
		 * for(DriverResult rs: results) { System.out.println(rs.getDriverName() + "\t"
		 * + rs.getWins() + "\t"+ rs.getTotalPoints() + "\t"+ rs.getRank()); }
		 */
		
		
//		CircuitRepository circuitRepository = new CircuitRepository();
//				
//		var circuits = circuitRepository.getCircuits();
//		
//		
//		System.out.println("Total circuitos: " + circuits.size());
//		
//		String country = "Russia";
//		
//		var circuitsByCountry = circuitRepository.getCircuitsByCountry(country);
//		
//		System.out.println("Circuitos de " + country);
//		
//		for(Circuit circuit:circuitsByCountry) {
//			System.out.println(circuit.getName() + "\t" + circuit.getLocation() + "\t"+ circuit.getCountry());
//		}
		
		
//		String jdbcUrl = "jdbc:postgresql://localhost:5432/formula1";
//		String user = "postgres";
//		String password = "123";
//		
//		List<Circuit> circuits = new ArrayList();
//		
//		try {
//			// Establecer la conexion
//			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
//			System.out.println("Se conecto a la base de datos");
//			
//			// Crear una sentencia
//			Statement statement = conn.createStatement();
//			
//			// Ejecutar la consulta
//			String sql = "SELECT * FROM circuits";
//			ResultSet rs = statement.executeQuery(sql);
//			
//			// Procesar los resultados
//			while(rs.next()) {
//				int circuitid = rs.getInt("circuitid");
//				String circuitref = rs.getString("circuitref");
//				String name = rs.getString("name");
//				String location = rs.getString("location");
//				String country = rs.getString("country");
//				
//				Circuit circuit = new Circuit(circuitid, circuitref, name, location, country);
//				circuits.add(circuit);
//				
//				// System.out.println(circuitid + "\t" + circuitref + "\t"+ name + "\t" + location + "\t" + country);
//				
//			}
//			
//			
//			
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
		
		
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 600, 600);
		primaryStage.setTitle("Consulta del Ganador por Año");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	


}
