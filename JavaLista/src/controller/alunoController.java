package controller;
import java.util.List;
import java.util.ArrayList;
import model.Aluno;
public class alunoController {
	private List<Aluno> listaAlunos;
	
	public alunoController() {
		listaAlunos = new ArrayList();
	}
	
	public void setAluno(Aluno a) {
		listaAlunos.add(a);
	}
	
	public Aluno getAluno(int index) {
		return listaAlunos.get(index);
	}
	
	public String mostrarAlunos() {
		StringBuilder sb = new StringBuilder();
		for(Aluno a:listaAlunos) {
			sb.append(a.toString() + "\n");
		}
		return sb.toString();
	}
	
	public void removerAlunos(int index) {
		if (index >= 0 && index < listaAlunos.size()){
			Aluno removido = listaAlunos.remove(index);
			System.out.println(removido + " foi removido :(");
		} else{
			System.out.println("Índice inválido");
		}
		
	}
	
	public int localizarIndex(int matricula){
		for (int i=0; i<listaAlunos.size(); i++){
			if (listaAlunos.get(i).getMatricula() == matricula){
				return i;
			}
		}
		return -1;
	}
	
	public void limparLista() {
		listaAlunos.clear();
	}

	public void virarSemestre(){
		for(Aluno a:listaAlunos){
			a.setCiclo(a.getCiclo() + 1);
		}
	}
}
