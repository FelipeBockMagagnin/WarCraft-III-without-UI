package Jogo;



abstract class Unidade extends Objeto{
    boolean vivo;
    int armadura;
    double velocidade;
    double maxPontosVitais;

    void mover(String direção){

        System.out.println("Posição x atual: " + this.pos.x);
        System.out.println("Posição y atual: " + this.pos.y);

        if(direção == "N"){
            //não necessario if pois é soma
            this.pos.y = this.pos.y + velocidade;
            System.out.println("movendo " + velocidade + " para o norte");
        } else if(direção == "S"){
            if(this.pos.y - velocidade >= 0) {
                this.pos.y = this.pos.y - velocidade;
                System.out.println("movendo " + velocidade + " para o sul");
            } else {
                System.out.println("Saindo do campo de batalha, seu medroso, volte para a luta");
            }
        } else if(direção == "L"){
            if(this.pos.x - velocidade >= 0) {
                this.pos.x = this.pos.x - velocidade;
                System.out.println("movendo " + velocidade + " para o leste");
            } else {
                System.out.println("Saindo do campo de batalha, seu medroso, volte para a luta");
            }
        } else if(direção == "O"){
            //não necessario if pois é soma
            this.pos.x = this.pos.x + velocidade;
            System.out.println("movendo " + velocidade + " para o oeste");
        } else {
            System.out.println("error");
        }

        System.out.println("Posição x final: " + this.pos.x);
        System.out.println("Posição y final: " + this.pos.y);
    }

    double calcDamage(double dano){
        if(dano - armadura > 0){
            return dano - armadura;
        } else {
            return 0;
        }
    }

    void custoUnidade(int madeira, int ouro, int comida, Raça raça){
        if(raça.madeira >= madeira) {
            raça.madeira = raça.madeira - madeira;
        } else if(raça.ouro >= ouro){
            raça.ouro = raça.ouro - ouro;
        } else if(raça.comida >= comida ) {
            raça.comida = raça.comida - comida;
            System.out.println("Unidade criada com sucesso");
        } else {
            System.out.println("Recursos insuficientes");
        }
    }


}
