package br.edu.up.controller;

import br.edu.up.dao.AlunoDAO;
import br.edu.up.dao.ResumoDAO;
import br.edu.up.model.Aluno;
import br.edu.up.model.Resumo;
import br.edu.up.view.AlunoView;
import java.util.List;

public class AlunoController {
    private AlunoDAO alunoDAO;
    private ResumoDAO resumoDAO;
    private AlunoView alunoView;

    public AlunoController() {
        this.alunoDAO = new AlunoDAO();
        this.resumoDAO = new ResumoDAO();
        this.alunoView = new AlunoView();
    }

    public void processarDados(String caminhoArquivoAlunos, String caminhoArquivoResumo) {
        List<Aluno> alunos = alunoDAO.lerArquivoCSV(caminhoArquivoAlunos);
        Resumo resumo = calcularResumo(alunos);
        resumoDAO.gravarResumoCSV(caminhoArquivoResumo, resumo);

        alunoView.imprimirAlunos(alunos);
        alunoView.imprimirResumo(resumo);
    }

    private Resumo calcularResumo(List<Aluno> alunos) {
        int quantidadeAlunos = alunos.size();
        int quantidadeAprovados = 0;
        int quantidadeReprovados = 0;
        double menorNota = Double.MAX_VALUE;
        double maiorNota = Double.MIN_VALUE;
        double somaNotas = 0.0;

        for (Aluno aluno : alunos) {
            double nota = aluno.getNota();
            if (nota >= 6.0) {
                quantidadeAprovados++;
            } else {
                quantidadeReprovados++;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            somaNotas += nota;
        }

        double mediaGeral = somaNotas / quantidadeAlunos;

        return new Resumo(quantidadeAlunos, quantidadeAprovados, quantidadeReprovados, menorNota, maiorNota, mediaGeral);
    }
}
