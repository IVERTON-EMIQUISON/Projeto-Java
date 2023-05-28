
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;

public class Principal<in> extends JFrame{
    ImageIcon imagem = new ImageIcon(getClass().getResource("Arthur.jpg"));
    ImageIcon imagem1 = new ImageIcon(getClass().getResource("pratagoras.jpg"));
    ImageIcon imagem2 = new ImageIcon(getClass().getResource("heraclito.jpg"));
    ImageIcon imagem3 = new ImageIcon(getClass().getResource("escolha.jpg"));
    JLabel label = new JLabel(imagem);
    JLabel label1 = new JLabel(imagem1);
    JLabel label2 = new JLabel(imagem2);
    JLabel label3 = new JLabel(imagem3);
    
    JLabel lcarro1 = new JLabel( new ImageIcon(getClass().getResource("carro1.png")));
    JLabel lcarro2 = new JLabel( new ImageIcon(getClass().getResource("carro2.png")));
    JLabel lcarro3 = new JLabel( new ImageIcon(getClass().getResource("carro3.png")));

    public void editarJanela(){
        lcarro1.setBounds(0,0,200,100);
        lcarro2.setBounds(0,100,200,100);
        lcarro3.setBounds(0,200,200,100);
        add(lcarro1);
        add(lcarro2);
        add(lcarro3);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1980, 1800);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }
    carros c = new carros();
    
    public class movimento extends Thread{
        
        public void run(){
            while(true){
                try{sleep(20);}catch(Exception erro){}
                lcarro1.setBounds(lcarro1.getX()+c.getVelocidade1(),0,600,250);
                lcarro2.setBounds(lcarro2.getX()+c.getVelocidade2(),200,600,250);
                lcarro3.setBounds(lcarro3.getX()+c.getVelocidade3(),400,600,250);

            }
        } 
    }
   
    public Principal (int n) {  
        if( n == 2){ 
            System.out.println("Parabéns você acertou o desafio!\n"); 
           add(label);
         
        }
        else if ( n == 1){ 
            System.out.println("Parabéns você acertou o desafio!\n"); 
            add(label1);
           
        } 
        else if(n == 3){ 
            System.out.println("Parabéns você acertou o desafio!\n"); 
            add(label2);
           
        } else if(n == 4){ 
            
            setSize(1200,800);
            setLocationRelativeTo(this);
            setVisible(true);
            add(label3);
           System.out.println("Escolha um carro"); 

        }
        if(n >=1 && n<=3){
            setSize(800,500);
            setLocationRelativeTo(this);
            setVisible(true);
        }
        else if(n == 5){ // 
            editarJanela();
            new movimento().start();
            System.out.println(" Carro 1 obteve velocidade = "+c.getVelocidade1()+"\n Carro 2 obteve velocidade = "+c.getVelocidade2()+"\n Carro 3 obteve velocidade = "+c.getVelocidade3());
            int maior;
            maior = c.getVelocidade1();

            if(maior > c.getVelocidade2()){
                if(maior > c.getVelocidade3()){
                    System.out.println("\n\tO carro 1 ganhou \n");
                }else{
                    System.out.println("\n\tO carro 3 ganhou \n");
                } 
            }else{
                System.out.println("\n\tO carro 2 ganhou \n");
            }
        }   
   
        else if(n == 6){
             
            editarJanela();
            while(true){
                try{sleep(20);}catch(Exception erro){}
                lcarro1.setBounds(lcarro1.getX()+2,0,600,250);
            }
            
        }
    }
    private void sleep(int i) {
    }


    public static <ImagePlus> void main(String[] args) {
        int op, op1, opção;
        Scanner sc = new Scanner(System.in);
        filosofia f = new filosofia();
        matematica m = new matematica();
        fisica fis = new fisica();
     
        do{
           System.out.printf( "\n1 - Tente descobrir o autor da frase\n2 - Escolha um carro para jogar.\n3 - Aprenda conceitos de matemática.\n0 - Finalizar....\nEscolha uma opção:");
           opção = sc.nextInt();
            if (opção == 1){
                do{
                    f.Menu();
                    op = sc.nextInt();
                    if(op == 1){
                        f.Arthur_Schopenhauer();
                        f.setN1(sc.nextInt());
                        if(f.getN1() == 2){
                            new Principal<>(f.getN1());
                        }else{
                            System.out.println("você errou! Tente outra frase.");
                        }
                            
                    }else if(op == 2){
                        f.Heráclito();;
                        f.setN1(sc.nextInt());
                        if(f.getN1() == 3){
                            new Principal<>(f.getN1());
                        }else{
                            System.out.println("você errou! Tente outra frase.");
                        }
                        
                    }else if(op == 3){
                        f.Protágoras();
                        f.setN1(sc.nextInt());
                        if(f.getN1() == 1){
                            new Principal<>(f.getN1());
                        }else{
                            System.out.println("você errou! Tente outra frase.");
                        }
                            
                    }else if(op == 0){
                        System.out.println("\n");
                    }
        
                } while(op != 0);
            }
            else if(opção == 2){
                do{
                   menu_jogo(); 
                    f.setN1(sc.nextInt()+3);

                    if(f.getN1() == 4){
                        new Principal<>(f.getN1());
                        m.setop(sc.nextInt());
                        System.out.println("O carro escolhido foi o: "+m.getop());
                        m.setop(0);
                    }
                    else if(f.getN1()== 5){
                        new Principal<>(f.getN1());
                    }
                }while(f.getN1() != 3);
            }
            else if(opção==3){
                do{
                    m.Menu();
                    op1 = sc.nextInt();
                    if(op1 == 1){
                        System.out.printf("Informe o tempo em minutos: ");
                        m.setMinutos(sc.nextInt());
                        m.Calculartempo(m.getMinutos());
                    
                    }else if(op1 == 2){
                    
                        System.out.printf("Informe o ângulo em graus: ");
                        m.setAngulo(sc.nextDouble());
                        m.Trigonometria(m.getAngulo());
                        
                    }else if(op1 == 3){
                        System.out.println("Digite os valores da equação do segundo grau.");
                        m.equacao();
                    
                    }else if(op1 == 4){
                        m.tabuada();

                    }else if(op1 == 5){
                        System.out.println("1 - Calcular velocidade média.\n2 - Cálculo de Probabilidade.");
                        int n = sc.nextInt();
                        if(n == 1){
                            fis.questao1(); 
                            fis.Aviao.setText("\nA velocidade média: "+fis.getResposta()+" Km/h");
                        }else if(n==2){
                            fis.questao2();
                           
                        }else{
                            System.out.println("Opção inválida.");
                        }
                      
                    }else if(op1 == 0){
                        System.out.println("\n");
                    }
                    else{
                        System.out.println("Opção inválida.");
                    }
                    
                } while(op1 != 0); 
           
                
            }

        } while(opção != 0);
        sc.close();
    }

    public static void menu_jogo(){
        System.out.println("\n1 - Escolher um carro para corrida.");
        System.out.println("2 - Iniciar o jogo.");
        System.out.println("0 - Sair do jogo.");
        System.out.printf("Opção escolhida: ");

    }

}