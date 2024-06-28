package br.edu.up.dao;

import br.edu.up.model.Resumo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class ResumoDAO {
    public void gravarResumoCSV(String caminhoArquivo, Resumo resumo) {
        DecimalFormat df = new DecimalFormat("#.##"); // Formato para duas casas decimais

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            bw.write("Resumo:");
            bw.newLine(); // Pula linha após "Resumo:"

            bw.write("Quantidade de Alunos: " + resumo.getQuantidadeAlunos());
            bw.newLine(); // Pula linha após "Quantidade de Alunos:"

            bw.write("Quantidade de Aprovados: " + resumo.getQuantidadeAprovados());
            bw.newLine(); // Pula linha após "Quantidade de Aprovados:"

            bw.write("Quantidade de Reprovados: " + resumo.getQuantidadeReprovados());
            bw.newLine(); // Pula linha após "Quantidade de Reprovados:"

            bw.write("Menor Nota: " + df.format(resumo.getMenorNota()));
            bw.newLine(); // Pula linha após "Menor Nota:"

            bw.write("Maior Nota: " + df.format(resumo.getMaiorNota()));
            bw.newLine(); // Pula linha após "Maior Nota:"

            bw.write("Média Geral: " + df.format(resumo.getMediaGeral()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
