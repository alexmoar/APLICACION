package modelo;

public class Mensaje {
 private String fecha ;
 private String mensaje;
 private String mencion;
 
 
 


 
 
 
 // Getter y Setters y Constructores
 
 
public Mensaje(String mensaje) {
	
	this.mensaje = mensaje;
}
public Mensaje(String mensaje, String mencion) {
	
	this.mensaje = mensaje;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getMensaje() {
	return mensaje;
}
public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}
 
 
}
