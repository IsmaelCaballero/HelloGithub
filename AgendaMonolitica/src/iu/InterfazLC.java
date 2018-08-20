package iu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
	
	public int LeerEntero (String sCadena) {
		int Valor;
		this.EscribirCadena(sCadena);
		Scanner sc = new Scanner(System.in);
		Valor = sc.nextInt();
		return Valor;
		
	}
}
