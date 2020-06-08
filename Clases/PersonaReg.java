
public class Persona {

	private String nombre;
	private String apellido;
	private String email;
	private String contra;
	private int telefono;
	
	public Persona(String nombre, String apellido, String email, int telefono, String contra){
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.contra = contra;
		
	}
	
	public String getNombre(){
		return nombre;
	}

	public String getApellido(){
		return apellido;
	}
	
	public String getEmail(){
		return email;
	}
	
	public int getTelefono(){
		return telefono;
	}
	
	public String getContra(){
		return contra;
	}
}
