package modelo;

import java.util.ArrayList;

public class UsuarioDTO {

	private String nombre;
	
	private String nick;
	private String edad;
	private String clave;
	private String correo;
	private ArrayList<UsuarioDTO> amigos;
	private ArrayList<Mensaje> mensajes;

	public UsuarioDTO(String nombre, String nick, String edad, String clave, String correo) {
		this.nombre = nombre;
		this.nick = nick;
		this.edad = edad;
		this.clave = clave;
		this.correo = correo;
	}

	UsuarioDTO() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public ArrayList<UsuarioDTO> getAmigos() {
		return amigos;
	}

}
