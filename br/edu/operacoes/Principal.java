package br.edu.operacoes;

public class Principal {
    public static void main(String[] args) {

        // Instanciação das classes de operações matemáticas
        OperacoesMatematicas soma = new Soma();
        OperacoesMatematicas divisao = new Divisao();

        // --- MENSAGENS INICIAIS DE REGRAS DO SISTEMA ---
        System.out.println("==============================================");
        System.out.println("SISTEMA DE OPERAÇÕES MATEMÁTICAS INICIADO");
        System.out.println("AVISO: Operações de divisão por zero não são permitidas.");
        System.out.println("Diretriz: O sistema lançará uma exceção personalizada caso ocorra.");
        System.out.println("==============================================\n");

        // 1. Execução da Soma

        try {
            double resSoma = soma.calcular(15.5, 10.5);
            System.out.println("Calculando Soma: 15.5 + 10.5");
            System.out.println("Resultado da Soma: " + resSoma);

        } catch (Exception e) {
            System.out.println("Erro inesperado na soma: " + e.getMessage());
        }

        System.out.println("----------------------------------------------");

        // 2. Execução da Divisão com Erro Proposital
        try {
            double a = 20.0;
            double b = 0.0; // Valor que causará a exceção

            System.out.println("Tentando realizar a operação: " + a + " / " + b);
            
            // O método calcular da classe Divisao fará a validação interna
            double resDiv = divisao.calcular(a, b);
            System.out.println("Resultado da Divisão: " + resDiv);

        } catch (DivisaoPorZeroException e) {

            // Aqui o sistema "alega" a mensagem de erro identificada na classe de exceção personalizada
            System.out.println("ALERTA DO SISTEMA: " + e.getMessage());
            System.out.println("Ação: Operação abortada para evitar falha crítica.");

        } catch (Exception e) {
            System.out.println("Erro genérico: " + e.getMessage());
        }

        System.out.println("\n==============================================");
        System.out.println("FIM DO PROCESSAMENTO");
        System.out.println("==============================================");
    }
}