import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		boolean chequemate = false;
		int nulo = 0;
		int branco = 0;
		int jos� = 0;
		int Jo�o = 0;
		
		ArrayList<Integer> urnas = new ArrayList<Integer>();
		ArrayList<Integer> titulos = new ArrayList<Integer>();
		
		boolean votar = false;
		boolean se��o = true;
		
		while(se��o) {
		System.out.println("Escolha a Op��o"
				+ "\n1 - Novo Voto"
				+ "\n2 - Contabilizar Vota��o");
		int op��o = leitor.nextInt();
			
		if(op��o == 1) {
				System.out.println("Digite o n�mero do titulo:");
				int Numtitulo = leitor.nextInt();
				titulos.add(Numtitulo);
				votar = true;
				if(chequemate == true) {
					for (int i = 1; i < titulos.size(); i++) {
						if (titulos.get(i - 1).equals(Numtitulo)) {
							System.out.println("J� votou!");
							se��o = false;
							votar = false;
						}else {
							votar = true;
						}
					}
				}if(votar == true) {
					System.out.println();
					System.out.println("Escolha a Op��o:"
							+ "\n1 - Candidato Jos� (Partido da Felicidade)"
							+ "\n2 - Candidato Jo�o (Partido da Esperan�a)"
							+ "\n3 - Anular meu Voto"
							+ "\n4 - Voto em Branco");
					int voto = leitor.nextInt();
					urnas.add(voto);
					if(voto == 3) {
						nulo++;
					}else if(voto == 4) {
						branco++;
					}
				}
				System.out.println();
				chequemate = true;
				}else if(op��o == 2) {
					for (int i = 0; i < urnas.size(); i++) {
						if (urnas.get(i) == 1) {
							jos�++;
						}else if(urnas.get(i) == 2) {
							Jo�o++;
						}else {
							nulo++;
						}
					}
					System.out.println("Total de eleitores nesta urna: " + urnas.size());
					System.out.println("Total de votos para o candidato Jos�: " + jos�);
					System.out.println("Total de votos para o candidato Jo�o:" + Jo�o);
					System.out.println("Total de votos Nulos: " + nulo);
					System.out.println("Total de votos Brancos: " + branco);
					if(jos� > Jo�o) {
						System.out.println("Vencedor das elei��es: Jos�");
					}else if(Jo�o > jos�) {
						System.out.println("Vencedor das elei��es: Jo�o");
					}else if(Jo�o == jos�) {
						System.out.println("Segundo turno!");
					}
					se��o = false;
				}
		}
		leitor.close();

	}
}
