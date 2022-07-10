package br.com.charlespereira;

public class TarefaFluxo {

	public static void main(String[] args) {
		int nota1 = 7;
		int nota2 = 4;
		int nota3 = 8;
		int nota4 = 9;
		
		int media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println(media);
		
		if(media >=7) {
			System.out.println("Aluno está aprovado");
		}else if(media >=5) {
			System.out.println("Aluno está em recuperação");
		}else {
			System.out.println("Aluno está reprovado");
		}

	}

}
