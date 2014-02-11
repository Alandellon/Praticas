package testes;

import eleicoes2014.Votar;

public class Main {
	public static void main (String[] args) {
			
			Votar v = new Votar();
			
			v.votando(7);
			v.votando(78);
			v.votando(96);
			v.votando(58);
			v.votando(19);
			v.brancos();
			v.votando(64);
			v.votando(500);
			v.votando(135);
			v.votando(19);
			v.votando(65);
			v.brancos();
			v.votando(52);
			v.votando(96);
			v.votando(20);
			v.votando(83);
			v.votando(23);
			v.votando(96);
			v.votando(68);
			v.votando(14);
			v.brancos();
			v.votando(56);
			v.votando(120);
			v.votando(40);
			v.votando(01);
			v.votando(15);
			v.votando(19);
			v.brancos();
			
			StringBuffer sb = v.apuracao();
			System.out.println(sb);
			
		}
}