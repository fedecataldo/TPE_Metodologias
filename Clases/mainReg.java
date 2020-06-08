/* Esta es una pseudo implementacion de lo que seria una pagina de registro de la aplicacion ViajesFacilitos.
 * Aqui solo se intenta mostrar como interactuaria una persona para registrar sus datos.
*/
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		String nombre, apellido, email, contra1,contra2;
		int telefono;
		Registro r = new Registro();
		Persona p0 = new Persona("pepe","sudan","ungrande@lofue.com",123456,"123456789");
		Persona p1 = new Persona("juan","pablo","pablito@gmail.com",987465,"123456789");
		Persona p2 = new Persona("ana","maria","anita@gmail.com",3452523,"123456789");
		Persona p3 = new Persona("luis","santos","ls1234@gmail.com",231654,"123456789");
		Persona p4 = new Persona("roberto","paz","pazRobert@gmail.com",6547913,"123456789");
		
		r.setUsuario(p0);
		r.setUsuario(p1);
		r.setUsuario(p2);
		r.setUsuario(p3);
		r.setUsuario(p4);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Para registrarte en ViajesFacilitos, por favor, complete la planilla con sus datos personales.");
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		System.out.println("Ingrese su nombre");
		nombre = entrada.next();
		System.out.println("Ingrese su apellido");
		apellido = entrada.next();
		System.out.println("Un numero de telefono sin 0 (p.e. 1234567)");
		telefono = entrada.nextInt();
		System.out.println("Ingrese un correo electronico");
		email = entrada.next();
		while (r.validarEmail(email)){
			email = entrada.next();
		}
		System.out.println("Ingrese una contraseña");
		System.out.println("// La contraseña debe tener un minimo de 8 caracteres y un maximo de 16 //");
		contra1 = entrada.next();
		while (!(r.contraseñaValida(contra1))){
			System.out.println("Por favor ingrese una contraseña con al menos 8 caracteres y no mas de 16 sin espacios");
			contra1 = entrada.next();
		}
		System.out.println("Confirme la contraseña");
		contra2 = entrada.next();
		while (!(contra1.equals(contra2))){
			System.out.println("La contraseña no coincide");
			contra2 = entrada.next();
		}
		// Supongo por el momento de que habra alguna extencion agena a este programa para la verificacion.
		System.out.println("----------------------------------------------------------------------------------------------");
		
		System.out.println("Genial! solo falta que active su cuenta con el mensaje que enviamos a correo electronico y");
		System.out.println("ya podra organizar sus viajes, ahora mas facilito :)");
		// Supongo que el sistema enviara un mensaje "Estandar" de confirmacion de cuenta al mail ingresado en la base de datos.
		Persona p = new Persona(nombre, apellido, email, telefono, contra1);
		r.setUsuario(p);
	}
	// FIN DEL REGISTRO DE UNA PERSONA
}
