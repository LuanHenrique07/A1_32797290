package br.edu.up.model;

public class Resumo {
    private int quantidadeAlunos;
    private int quantidadeAprovados;
    private int quantidadeReprovados;
    private double menorNota;
    private double maiorNota;
    private double mediaGeral;

    public Resumo(int quantidadeAlunos, int quantidadeAprovados, int quantidadeReprovados, double menorNota,
            double maiorNota, double mediaGeral) {
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeAprovados = quantidadeAprovados;
        this.quantidadeReprovados = quantidadeReprovados;
        this.menorNota = menorNota;
        this.maiorNota = maiorNota;
        this.mediaGeral = mediaGeral;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public int getQuantidadeAprovados() {
        return quantidadeAprovados;
    }

    public int getQuantidadeReprovados() {
        return quantidadeReprovados;
    }

    public double getMenorNota() {
        return menorNota;
    }

    public double getMaiorNota() {
        return maiorNota;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    @Override
    public String toString() {
        return "Resumo [quantidadeAlunos=" + quantidadeAlunos + ", quantidadeAprovados=" + quantidadeAprovados +
                ", quantidadeReprovados=" + quantidadeReprovados + ", menorNota=" + menorNota +
                ", maiorNota=" + maiorNota + ", mediaGeral=" + mediaGeral + "]";
    }
}
