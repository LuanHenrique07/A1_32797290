package br.edu.up.dao;

import br.edu.up.model.Aluno;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    public List<Aluno> lerArquivoCSV(String caminhoArquivo) {
        List<Aluno> alunos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            // Ignora o cabeçalho do arquivo CSV
            br.readLine();

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length >= 3) {
                    String matricula = dados[0].trim();
                    String nome = dados[1].trim();
                    double nota = Double.parseDouble(dados[2].replace(',', '.')); // Substitui vírgula por ponto na nota
                    Aluno aluno = new Aluno(matricula, nome, nota);
                    alunos.add(aluno);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return alunos;
    }
}
