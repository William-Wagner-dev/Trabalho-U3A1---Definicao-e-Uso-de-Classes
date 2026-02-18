package br.edu.operacoes;

//a sub classe soma, que herda da classe OperacoesMatematicas a operação
//abstrata.
public class Soma extends OperacoesMatematicas {
    
    @Override
    public double calcular(double a, double b){
        return a + b;
    }
    
}

