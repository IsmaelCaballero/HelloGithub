package negocio;

public class Persona {
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	

	public Persona (String nombre, String apellido1, String apellido2) {
		this.setNombre(nombre);
		this.setApellido1(apellido1 );
		this.setApellido2(apellido2);
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	private String getApellido1() {
		return Apellido1;
	}
	private void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}
	private String getApellido2() {
		return Apellido2;
	}
	private void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}
	
	public String toString ()
	{
		return this.getNombre() + " " + this.getApellido1() + " " + this.getApellido2();
	}
}
