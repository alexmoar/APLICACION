package utilidades;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utilidad {
	public static Stage obtenerStage(ActionEvent event) {
		Node node = (Node) event.getSource();
		
		Stage stage = (Stage) node.getScene().getWindow();
		
		
		return stage;
	}
	
	//public static Stage buscarStage(String direccion) {}

}
