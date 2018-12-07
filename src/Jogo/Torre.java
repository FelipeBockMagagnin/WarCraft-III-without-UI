package Jogo;

public class Torre extends ContQueAtaca {
    Torre(double x, double y, Raça raça){
        pos.x = x;
        pos.y = y;
        pontosVitais = 200;
        alcance = 7;
        ataque = 20;
        existente = true;
        imagem = "Torre";
        raça.construções.add(this);
        System.out.println("Templo criado na posição, (x:" + x + ", y:" + y + ") pontos vitais: " + pontosVitais);
    }
}
