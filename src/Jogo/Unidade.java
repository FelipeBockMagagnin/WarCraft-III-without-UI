package Jogo;

abstract class Unidade extends Objeto{
    boolean vivo;
    int armadura;
    double velocidade;

    void mover(String diração){
        //move o personagem em uma determinada posição
        System.out.println("movendo");
    }
}
