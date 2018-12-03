package Jogo;

public class Construção extends Objeto{
        boolean existente;
        int capacidade;

        void custoConstruir(int madeira, Raça raça){
            if(raça.madeira >= madeira){
                raça.madeira -= madeira;
                System.out.println("Construção costruida com sucesso: custo = " + madeira + " madeiras");
            } else {
                System.out.println("Madeira Insuficiente");
            }
        }

        boolean checkCustoUnidade(int madeira, int ouro, int comida, Raça raça){
            if((raça.madeira >= madeira) && (raça.ouro >= ouro) && (raça.comida >= comida )){
                raça.madeira = raça.madeira - madeira;
                raça.ouro = raça.ouro - ouro;
                raça.comida = raça.comida - comida;
                System.out.println("Recusos suficientes");
                return true;
            } else {
                System.out.println("Recursos insuficientes");
                return false;
            }
        }

}
