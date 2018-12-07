package Jogo;

public abstract class Construção extends Objeto{
        protected boolean existente;
        protected int capacidade;

    /**
     * verifica o custo de construir determinada construção e o desconta
     *
     * @param madeira
     * @param raça
     */
    public void custoConstruir(int madeira, Raça raça){
            if(raça.madeira >= madeira){
                raça.madeira -= madeira;
                System.out.println("Construção costruida com sucesso: custo = " + madeira + " madeiras");
            } else {
                System.out.println("Madeira Insuficiente");
            }
        }

    /**
     * checa os recursos necessarios para gerar uma unidade, se forem suficientes desconta os valores e return true
     *
     * @param madeira
     * @param ouro
     * @param comida
     * @param raça
     * @return
     */
      public boolean checkCustoUnidade(int madeira, int ouro, int comida, Raça raça){
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
