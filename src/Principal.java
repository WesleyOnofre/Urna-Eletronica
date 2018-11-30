import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		boolean chequemate = false;
		int nulo = 0;
		int branco = 0;
		int josé = 0;
		int João = 0;
		
		ArrayList<Integer> urnas = new ArrayList<Integer>();
		ArrayList<Integer> titulos = new ArrayList<Integer>();
		
		boolean votar = false;
		boolean seção = true;
		
		while(seção) {
		System.out.println("Escolha a Opção"
				+ "\n1 - Novo Voto"
				+ "\n2 - Contabilizar Votação");
		int opção = leitor.nextInt();
			
		if(opção == 1) {
				System.out.println("Digite o número do titulo:");
				int Numtitulo = leitor.nextInt();
				titulos.add(Numtitulo);
				votar = true;
				if(chequemate == true) {
					for (int i = 1; i < titulos.size(); i++) {
						if (titulos.get(i - 1).equals(Numtitulo)) {
							System.out.println("Já votou!");
							seção = false;
							votar = false;
						}else {
							votar = true;
						}
					}
				}if(votar == true) {
					System.out.println();
					System.out.println("Escolha a Opção:"
							+ "\n1 - Candidato José (Partido da Felicidade)"
							+ "\n2 - Candidato João (Partido da Esperança)"
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
				}else if(opção == 2) {
					for (int i = 0; i < urnas.size(); i++) {
						if (urnas.get(i) == 1) {
							josé++;
						}else if(urnas.get(i) == 2) {
							João++;
						}else {
							nulo++;
						}
					}
					System.out.println("Total de eleitores nesta urna: " + urnas.size());
					System.out.println("Total de votos para o candidato José: " + josé);
					System.out.println("Total de votos para o candidato João:" + João);
					System.out.println("Total de votos Nulos: " + nulo);
					System.out.println("Total de votos Brancos: " + branco);
					if(josé > João) {
						System.out.println("Vencedor das eleições: José");
					}else if(João > josé) {
						System.out.println("Vencedor das eleições: João");
					}else if(João == josé) {
						System.out.println("Segundo turno!");
					}
					seção = false;
				}
		}
		leitor.close();

	}
}
