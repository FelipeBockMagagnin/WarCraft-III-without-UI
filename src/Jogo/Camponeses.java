package Jogo;

public class Camponeses extends UnidadeQAtaca{

    /**
     * Constroi de acordo com o input do usuario, e adciona a construção ao array de cosntruções da raça
     *
     * @param pos
     * @param tipoContrução
     * @param raça
     */
    public void constroi(Posição pos, String tipoContrução, Raça raça){
        switch(tipoContrução){
            case "casa" :
                if(raça.madeira >= 30) {
                    raça.madeira = raça.madeira - 30;
                    Casa casa = new Casa(pos.x, pos.y, raça);
                } else {
                    System.out.println("Não há recursos");
                }
                break;
            case "torre" :
                if(raça.madeira >= 70) {
                    raça.madeira = raça.madeira - 70;
                    Torre torre = new Torre(pos.x, pos.y, raça);
                } else {
                    System.out.println("Não há recursos");
                }
                break;
            case "templo" :
                if(raça.madeira >= 250) {
                    raça.madeira = raça.madeira - 250;
                    Templo templo = new Templo(pos.x, pos.y, raça);
                } else {
                    System.out.println("Não há recursos");
                }
                break;
            case "centro" :
                if(raça.madeira >= 200) {
                    raça.madeira = raça.madeira - 200;
                    CentroCidade centroCidade = new CentroCidade(pos.x, pos.y, raça);
                } else {
                    System.out.println("Não há recursos");
                }
                break;
            case "quartel" :
                if(raça.madeira >= 125) {
                    raça.madeira = raça.madeira - 125;
                    Quartel quartel = new Quartel(pos.x, pos.y, raça);
                } else {
                    System.out.println("Não há recursos");
                }
                break;
            default :
                System.out.println("Não existem construções com esse nome");
                break;
        }
    }

    /**
     * adiciona comida a raça
     *
     * @param raça
     */
    public void colhe(Raça raça){
        raça.comida = raça.comida + 1;
        System.out.println("Comida da raça: " + raça.comida);
    }

    /**
     * adiciona madeira a raça
     *
     * @param raça
     */
    public void corta(Raça raça){
        raça.madeira = raça.madeira + 1;
        System.out.println("Madeira da raça: " + raça.madeira);
    }

    /**
     * adiciona ouro a raça
     *
     * @param raça
     */
    public void minerar(Raça raça){
        raça.ouro = raça.ouro + 1;
        System.out.println("Ouro da raça: " + raça.ouro);
    }

    Camponeses(double x, double y){
        pontosVitais = 50;
        ataque = 3;
        alcance = 0;
        armadura = 0;
        velocidade = 2.0;
        imagem = "Campones";
        pos.x = x;
        pos.y = y;
        vivo = true;
        maxPontosVitais = pontosVitais;
        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
