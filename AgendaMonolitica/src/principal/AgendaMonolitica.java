package principal;


import java.io.IOException;

import iu.*;
import negocio.*;

public class AgendaMonolitica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuAgenda ma = new MenuAgenda();
		
		InterfazLC lc = new InterfazLC();
		
		OpcionesMenu Opcion= OpcionesMenu.NOOPCION;
		
		while (Opcion != OpcionesMenu.SALIR) {
			ma.MostrarMenu();
			//Opcion = OpcionesMenu.valueOf((int)lc.LeerEntero("Escoja una opcion"));
			Opcion = ma.LeerOpcionMenu();
			ma.ProcesarMenu(Opcion);
		}
		
	}

}
