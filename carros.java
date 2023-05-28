
import java.util.Random;

public class carros {
    private int velocidade1;
    private int velocidade2;
    private int velocidade3;

    
    Random gerador = new Random();
    
    public carros() {
        this.velocidade1 = gerador.nextInt(10);
        this.velocidade2 = gerador.nextInt(10);
        this.velocidade3 = gerador.nextInt(10);
    }
   
    public int getVelocidade1() {
        return velocidade1;
    }
    public void setVelocidade1(int velocidade1) {
        this.velocidade1 = velocidade1;
    }
    public int getVelocidade2() {
        return velocidade2;
    }
    public void setVelocidade2(int velocidade2) {
        this.velocidade2 = velocidade2;
    }
    public int getVelocidade3() {
        return velocidade3;
    }
    public void setVelocidade3(int velocidade3) {
        this.velocidade3 = velocidade3;
    }
}


