package control;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modelo.FAV;
import utilidades.Utilidad;

public class LoginController implements Initializable {
	
	private FAV fav;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private TextField txtClave;
	
	@FXML
	private Button iniciar;
	
	public LoginController() {
		fav = fav.getInstance();
	}
	
	@FXML
	protected void iniciarAction(ActionEvent event) {
		
		if (condition) {
			
		}
		
		try {
			Stage stage = Utilidad.obtenerStage(event);
			stage.close();
			
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Principal.fxml"));
				Pane root = loader.load();			
				
				Scene scene = new Scene(root);
			    stage.setScene(scene);
			    
			    stage.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@FXML
	protected void CrearCuentaAction(ActionEvent event) {
		try {
			Stage stage = Utilidad.obtenerStage(event);
			stage.close();
			
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/SingUp.fxml"));
				Pane root = loader.load();			
				
				Scene scene = new Scene(root);
			    stage.setScene(scene);
			    
			    stage.show();
			} catch (Exception e) {
				
			}
		} catch (Exception e) {
			
		}
		
	}
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
