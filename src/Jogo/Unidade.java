package Jogo;
abstract class Unidade extends Objeto{
    public boolean vivo;
    protected int armadura;
    protected double velocidade;
    public double maxPontosVitais;

    /**
     * Move o personagem para 4 direções diferentes, norte, sul, leste e oeste
     *
     * @param direção
     */
    void mover(String direção){

        System.out.println("Posição x atual: " + this.pos.x);
        System.out.println("Posição y atual: " + this.pos.y);

        if(direção == "N"){
            //não necessario if pois é soma e não ha como ficar menos do que 0
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
            //não necessario if pois é soma e não ha como ficar menos do que 0
            this.pos.x = this.pos.x + velocidade;
            System.out.println("movendo " + velocidade + " para o oeste");
        } else {
            System.out.println("error");
        }

        System.out.println("Posição x final: " + this.pos.x);
        System.out.println("Posição y final: " + this.pos.y);
    }

    /**
     * Calcula o dano de acordo com a armadura da unidade
     *
     * @param dano
     * @return
     */
    public double calcDamage(double dano){
        if(dano - armadura > 0){
            return dano - armadura;
        } else {
            return 0;
        }
    }
}
