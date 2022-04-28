package vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Principal extends Application {
	
	public static void main(String[] args) {
        Application.launch(Principal.class, args);
    }
	
	@Override
	public void start(Stage stage) throws Exception  {
		
 		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
    	
        stage.setTitle("Bienvenido");
        stage.setScene(new Scene(loader.load()));
        stage.show();
		
		
	}
	
}
