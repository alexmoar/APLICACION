package modelo;

import java.util.ArrayList;

public class FAV {
	
	
	private ArrayList<UsuarioDTO> usuarios;
	private static FAV instance;
	
	
	private FAV() {
		usuarios = new ArrayList<UsuarioDTO>();
	}
	
	
	public static FAV getInstance() {
		if(instance==null)
			instance = new FAV();
		
		return instance;
	}
	
	
	public boolean crearUsuario(String nombre, String edad, String nick, String clave, String correo  ) 
	{
		if (nombre.isEmpty()||edad.isEmpty()||nick.isEmpty()||clave.isEmpty()||correo.isEmpty()) {

			UsuarioDTO us = new UsuarioDTO(nombre, nick, edad, clave, correo);
			this.usuarios.add(us);
			return true;
		}else {
			return false;
		}
		
		
	}


	public boolean validarInfo(String nick, String password) {
		UsuarioDTO us;
		for (int i =0; i<this.usuarios.size();i++) {
			us =this.usuarios.get(i);
			if (us.getNick()== nick &&us.getClave()== password) {
				return true;
				}
			}
		
		return fals
		
	}
	
	/*public void validadCampos() {
		
		if(txtNombre.getText().isEmpty()|| txtCorreo.getText().isEmpty()||txtNick.getText().isEmpty()
				||txtEdad.getText().isEmpty()||txtClave.getP ) {	
			System.out.println("oiga hijuputa llene toda lo campos ");
			}else {
	}*/
	public ArrayList getUsuarios() {
		return usuarios;
	}
	
	


	
	
	

}
