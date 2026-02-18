package br.edu.operacoes;

//A sub classe divisão, assim como a operação "soma" herda da classe OperacoesMatematicas.
public class Divisao extends OperacoesMatematicas {
    
    @Override
    public double calcular(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Divisão por zero não é permitida.");
        }
        return a / b;
    }
    
}