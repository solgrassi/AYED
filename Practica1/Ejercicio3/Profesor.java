package tp1_Ejercicio3;

public class Profesor {
	private String nombre;
	private String apellido;
	private String catedra;
	private String email;
	private String facultad;
	
	
	public Profesor() {
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCatedra() {
		return catedra;
	}
	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	
	public String tusDatos() {
		String aux; 
		aux = "El nombre del profesor es: " + getNombre() + ", su apellido: " + this.getApellido() +
				". Su facultad es: " + this.getFacultad()+ ", su catedra: " + this.getCatedra() +
				", y su email: " + this.getEmail();
		return aux;
	}
	
}
