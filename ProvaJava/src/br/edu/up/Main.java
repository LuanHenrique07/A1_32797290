package br.edu.up;

import br.edu.up.controller.AlunoController;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivoAlunos = "C:\\Users\\autologon\\Desktop\\Prova\\alunos.csv";
        String caminhoArquivoResumo = "C:\\Users\\autologon\\Desktop\\Prova\\resumo.csv";

        AlunoController controller = new AlunoController();
        controller.processarDados(caminhoArquivoAlunos, caminhoArquivoResumo);
    }
}
