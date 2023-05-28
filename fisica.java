
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class fisica extends JFrame{
    JLabel Aviao = new JLabel( new ImageIcon(getClass().getResource("Aviao.png")));
    JLabel lcarro3 = new JLabel( new ImageIcon(getClass().getResource("carro3.png")));

    public void editarJanela(){
       // Aviao.setBounds(0,0,200,100);
        Aviao.setBounds(45,50,200,100);
        lcarro3.setBounds(0,50,200,100);

        add(Aviao);
     //   add(lcarro3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }
    public class movimento extends Thread{
        int i;
        public void run(){
            for(i=0;i<245;i++){
                try{sleep(20);}catch(Exception erro){}
                Aviao.setBounds(Aviao.getX()+5,100,600,250);

            }
        } 
    }

    Scanner sc = new Scanner(System.in);
/**
 * 
 */

    private double num_favoravel,num_possives,prob;
    private float velocidade,pos_inicial,pos_final,resposta;
    private float tempo_viagem,tempo_inicial,tempo_final;
    private int cont;
    
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public double getNum_favoravel() {
        return num_favoravel;
    }

    public void setNum_favoravel(double num_favoravel) {
        this.num_favoravel = num_favoravel;
    }

    public double getNum_possives() {
        return num_possives;
    }

    public void setNum_possives(double num_possives) {
        this.num_possives = num_possives;
    }

    public double getProb() {
        return prob;
    }

    public void setProb(double prob) {
        this.prob = prob;
    }
    public float getResposta() {
        return resposta;
    }

    public void setResposta(float resposta) {
        this.resposta = resposta;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getPos_inicial() {
        return pos_inicial;
    }

    public void setPos_inicial(float pos_inicial) {
        this.pos_inicial = pos_inicial;
    }

    public float getPos_final() {
        return pos_final;
    }

    public void setPos_final(float pos_final) {
        this.pos_final = pos_final;
    }

    public float getTempo_viagem() {
        return tempo_viagem;
    }

    public void setTempo_viagem(float tempo_viagem) {
        this.tempo_viagem = tempo_viagem;
    }

    public float getTempo_inicial() {
        return tempo_inicial;
    }

    public void setTempo_inicial(float tempo_inicial) {
        this.tempo_inicial = tempo_inicial;
    }

    public float getTempo_final() {
        return tempo_final;
    }

    public void setTempo_final(float tempo_final) {
        this.tempo_final = tempo_final;
    }
    
    double Resposta ;
    public void questao1(){
       
        System.out.printf("Entre com posição inicial: ");
        setPos_inicial(sc.nextFloat());
         
        System.out.printf("Entre com posição final: ");
        setPos_final(sc.nextFloat());
        
        System.out.printf("Informe o tempo inicial: ");
        setTempo_inicial(sc.nextFloat());
         
        System.out.printf("Informe o tempo final: ");
        setTempo_final(sc.nextFloat());
        
        setResposta((getPos_final()-getPos_inicial())/(getTempo_final()-getTempo_inicial()));
        
        System.out.println("\nA velocidade média na trajetória foi: "+getResposta()+"Km/h");
        System.out.printf("A velocidade média foi: %.2fm/s",getResposta()/3.6);
        System.out.println("\n\n"); 
        editarJanela();
        new movimento().start();
      
      
    } 
    
   
    public void questao2(){
       
        System.out.printf("Informe o número de casos favoráveis: ");
        setNum_favoravel(sc.nextDouble());
        
        System.out.printf("Informe o número de casos possível: ");
        setNum_possives(sc.nextDouble());

        setProb(getNum_favoravel() / getNum_possives());

        System.out.printf("\nO Resultado da probabilidade foi: %.2f",getProb());
        System.out.printf("\nO Resultado em porcentagem: %.2f",getProb()*100); 
        System.out.println("\n");
      
       
    }
}
  

