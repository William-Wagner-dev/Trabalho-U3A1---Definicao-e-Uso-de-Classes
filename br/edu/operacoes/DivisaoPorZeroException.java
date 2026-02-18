package br.edu.operacoes;

public class DivisaoPorZeroException extends Exception {
    
    public DivisaoPorZeroException() {

        super("Erro Crítico: Não é possível realizar divisão por zero.");
    }
    
}