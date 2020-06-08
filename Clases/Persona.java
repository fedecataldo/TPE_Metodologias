package Login;

public class Persona {

	String name, lastname, user, password;
	
	public Persona(String nom, String ap, String use, String pass)
	{
		this.name = nom;
		this.lastname = ap;
		this.user = use;
		this.password = pass;
	}
	
	public String GetPass() {
		return this.password;
	}
	
	public String GetUser() {
		return this.user;
	}
	
   //---------------------------------------MAIN DE PRUEBA	
	public static void main(String args[]) {
		Persona n1 = new Persona("Elpe", "Lado", "pela", "dito");

		System.out.println(n1.GetUser());
		
		System.out.println(n1.GetPass());
	}

}

