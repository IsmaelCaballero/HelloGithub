package principal;


import java.io.IOException;

import iu.InterfazLC;
import negocio.Persona;

public class AgendaMonolitica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Nombre = null;
		String Apellido1 = null;
		String Apellido2 = null;
		InterfazLC lc = new InterfazLC();
		try {
			Nombre = lc.LeerCadena("Inserte su nombre:");
			Apellido1 = lc.LeerCadena("Inserte su primer apellido:");
			Apellido2 = lc.LeerCadena("Inserte su segundo apellido:");
			Persona ismael = new Persona (Nombre, Apellido1, Apellido2);
			lc.EscribirCadena("Hola "+ ismael.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
