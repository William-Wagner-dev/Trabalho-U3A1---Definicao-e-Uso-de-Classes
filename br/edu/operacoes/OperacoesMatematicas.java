package br.edu.operacoes;

public abstract class OperacoesMatematicas {
//Definição do metodo abstrato que será implementado pelas classes filhas

    public abstract double calcular(double a, double b) throws Exception;
    //throws Exception é usado para indicar que o método pode lançar uma exceção, 
    // permitindo que as classes filhas possam lidar com erros de forma adequada.
}