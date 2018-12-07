package Jogo;

public class Torre extends ContQueAtaca {



    Torre(double x, double y, Raça raça){
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 200;
        this.alcance = 7;
        this.ataque = 20;
        this.existente = true;
        this.imagem = "Torre";
        raça.construções.add(this);
        System.out.println("Templo criado na posição, (x:" + x + ", y:" + y + ") pontos vitais: " + pontosVitais);
    }
}
