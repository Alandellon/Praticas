package eleicoes2014;

public class Votar {
	
	private int votosBrancos;
	private int votosNulos;
	private int[] vetCandidatos = new int [100];
	
	public void brancos(){
		this.votosBrancos++;
	}
	
	public void votando(int vt){
		if (vt <= 100){
			this.vetCandidatos[vt]++;
		}
		else
			this.votosNulos++;
	}
	
	public StringBuffer apuracao(){
		StringBuffer sb = new StringBuffer();
		sb.append ("Brancos: " + this.votosBrancos + ", ");
		sb.append("Nulos: " + this.votosNulos + ", ");
		for (int i = 0; i < 100; i++){
			sb.append("Candidato " + i + " -> " + this.vetCandidatos[i] + " votos");
		}
		return sb;
	}
}