package br.edu.up.view;

import br.edu.up.model.Aluno;
import br.edu.up.model.Resumo;
import java.util.List;

public class AlunoView {
    public void imprimirAlunos(List<Aluno> alunos) {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void imprimirResumo(Resumo resumo) {
        System.out.println("\nResumo:");
        System.out.println("Quantidade de Alunos: " + resumo.getQuantidadeAlunos());
        System.out.println("Quantidade de Aprovados: " + resumo.getQuantidadeAprovados());
        System.out.println("Quantidade de Reprovados: " + resumo.getQuantidadeReprovados());
        System.out.println("Menor Nota: " + resumo.getMenorNota());
        System.out.println("Maior Nota: " + resumo.getMaiorNota());
        System.out.println("Média Geral: " + resumo.getMediaGeral());
    }
}
