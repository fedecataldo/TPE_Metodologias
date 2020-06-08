import java.util.Vector;


public class Registro  {
	
	private Vector<Persona> listaUsuarios;
	
	public Registro (){listaUsuarios = new Vector<Persona>();}
	
	public boolean validarEmail(String email){
		int i = 0;
		boolean existe = false;
		if ((email.indexOf("@") == -1) || (email.indexOf(".com") == -1)) {
			System.out.println("El mail no es valido");
			existe = true;
		}
		else{
			while (!(existe) && (i < listaUsuarios.size())){
				if (listaUsuarios.get(i).getEmail().equals(email)){
					System.out.println("Este email ya esta siendo usado por otro usuario, por favor ingrese otro");
					existe = true;
				}
				else i++;
			}
		}
		return existe;
	}
	
	public void setUsuario(Persona p){
		listaUsuarios.add(p);
	}
	
	public boolean contraseñaValida(String contrasena){
		return ((contrasena.length() > 7) && (contrasena.length() < 17));
	}
}
