package iu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterfazLC {


	public void EscribirCadena (String sCadena) {
		System.out.println (sCadena);
	}
	public String LeerCadena (String sCadena) throws IOException {
		String CadenaLeida = null;
		EscribirCadena (sCadena);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		CadenaLeida = br.readLine();
		return CadenaLeida;
		
	}
}
