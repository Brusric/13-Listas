package view;
import java.util.List;
import java.util.ArrayList;
import model.Aluno;
import controller.alunoController;

public class Main {

	public static void main(String[] args) {
		alunoController ac = new alunoController();
		ac.setAluno(new Aluno(10,"Ale","DSM",5));
		ac.setAluno(new Aluno(40,"Aline","ADS",6));
		ac.setAluno(new Aluno(20,"Ana","DSM",1));
		ac.setAluno(new Aluno(80,"Maria","COMEX",2));
		
		System.out.println("===LISTA INICIAL===");
		System.out.println(ac.mostrarAlunos());

		System.out.println("===LOCALIZAR INDEX===");
		int index = ac.localizarIndex(20);
		System.out.println(index +" é o index do aluno");
		
		System.out.println("\n===REMOVER ALUNO===");
		ac.removerAlunos(index);
		System.out.println("\n===LISTA DEPOIS DA REMOÇÃO===");
		System.out.println(ac.mostrarAlunos());

		ac.virarSemestre();
		System.out.println("===LISTA APÓS VIRAR SEMESTRE===");
		System.out.println(ac.mostrarAlunos());

		ac.limparLista();
		System.out.println("===LISTA DEPOIS DE LIMPAR===");
		System.out.println(ac.mostrarAlunos());
	}

}
