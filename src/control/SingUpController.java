package control;

import java.io.IOException;
import java.util.Iterator;

import javax.swing.JPasswordField;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modelo.FAV;

import utilidades.Utilidad;

public class SingUpController {
	
	FAV fav;
	
	@FXML
	private TextField txtNombre;
	
	@FXML
	private PasswordField txtClave;
	
	@FXML
	private TextField txtNick;
	
	@FXML 
	private TextField txtEdad;
	
	@FXML
	private TextField txtCorreo;
	
	public SingUpController() {
		fav = fav.getInstance();
	}
	
	@FXML 
	protected void crearCuentaAction(ActionEvent e) {

		String clave="";
		if (fav.crearUsuario(txtNombre.getText(), txtEdad.getText(),
				txtNick.getText(),clave, txtCorreo.getText())){
			Stage stage = Utilidad.obtenerStage(e);
			stage.close();
			
			try {

				FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Login.fxml"));
				Pane root = loader.load();			
				
				Scene scene = new Scene(root);
			    stage.setScene(scene);
			    
			    stage.show();		    		    

			} catch (IOException ev) {
				ev.printStackTrace();
			}
			
			
		}else {
			System.out.println("Llene todos los espacios");
		}
	}
	
	@FXML
	protected void atrasAction(ActionEvent e) {
		
		
		Stage stage = Utilidad.obtenerStage(e);
		stage.close();
		
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Login.fxml"));
			Pane root = loader.load();			
			
			Scene scene = new Scene(root);
		    stage.setScene(scene);
		    
		    stage.show();		    		    

		} catch (IOException ev) {
			ev.printStackTrace();
		}
	}
	
	
	
	

}
