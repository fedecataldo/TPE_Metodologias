package Login;
import java.util.*;

public class Login {

	List<String> Users = new ArrayList<String>();
	List<String> Passwords = new ArrayList<String>();
	
	
	public Login() {
		
	}
	
	public boolean VerifyUser(String nombre) {	//VERIFICA SI EL USUARIO ESTA CONTENIDO EN LA LISTA DE USUARIOS
		return Users.contains(nombre);
	}
	

	public boolean VerifyPassword(String password) { //VERIFICA SI EL PASSWORD ESTA CONTENIDO EN LA LISTA DE PASSWORDS
		return Passwords.contains(password);
	}
	
	
	//---------------------------------------MAIN DE PRUEBA	 	
	public static void main (String args[]) {
	
		Login sistema = new Login();
		
		Persona n1 = new Persona("Carlos","Delgado","Peperoni", "Muzzarella");
		
		if(!sistema.VerifyUser(n1.GetUser())) 
		{
			System.out.println("\nEL USUARIO NO EXISTE");
		}
		else
		{
			if(!sistema.VerifyPassword(n1.GetPass()))
			{
				System.out.println("\nEL PASSWORD ES INCORRECTO");
			}
			else
				System.out.println("\nBIENVENIDO/A: " + n1.GetUser());
		}
	}
}
