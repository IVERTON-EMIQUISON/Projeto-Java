 
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class matematica {
    Scanner sc = new Scanner(System.in);
    private int dias;
    private int horas;
    private int minutos;
    private double angulo,rad,hip;
    private double a,b,c;
    private int n;
   
    public void Menu(){
        System.out.println("+-------------------------------------+");
        System.out.println("|1 - Converte minutos em Dias e Horas.|");
        System.out.println("|2 - Trigonometria.                   |");
        System.out.println("|3 - Verificar se a equação tem raiz. |");
        System.out.println("|4 - Aprendendo a tabuada.            |");
        System.out.println("|5 - Questões de física.              |"); 
        System.out.println("|0 - Voltar para o menu principal.    |");
        System.out.println("+-------------------------------------+");
        System.out.printf("Escolha uma opção: ");
    }
    public void Calculartempo(int minutos){
        horas = minutos / 60;
        minutos %= 60;
        dias = horas / 24;
        horas %= 24;
   
        System.out.print("\tTempo total:\n");
        System.out.printf(" %d Dias",dias);
        System.out.printf(" %d horas", horas);
        System.out.printf(" %d minutos\n", minutos);
    }
 
    public void Trigonometria(double angulo){
        rad = (Math.PI/180) * angulo;
        System.out.printf("A conversão para radiano é: %.5g\n",rad);
        System.out.println("\n1 - Seno\n2 - Cosseno\n3 - Tangente\n4 - Tabela trigonométrica");
        System.out.print("\nOpção escolhida: ");
        int escolha = sc.nextInt();
 
        if(escolha == 1){
            double seno = Math.sin(rad);
            System.out.printf("\nO Seno do ângulo " + angulo + " e: %.4g",Math.sin(rad));
            System.out.print("\nDigite a Hipotenusa: ");
            hip = sc.nextDouble();
            System.out.printf("\nO Resultado foi: %.4g\n",seno * hip );
        }
        else if(escolha == 2){
            double cosseno = Math.cos(rad);
            System.out.printf("\nO Cosseno do ângulo " + angulo + " e: %.4g",Math.cos(rad));
            System.out.print("\nDigite a Hipotenusa: ");
            hip = sc.nextDouble();
            System.out.println("\nO Resultado foi: %.4g\n" + cosseno * hip );
        }
        else if(escolha == 3){
            double tangente = Math.tan(rad);
            System.out.printf("\nA Tangente do ângulo " + angulo + " e: %.4g",Math.tan(rad));
            System.out.print("\nDigite o Cateto Adjacente: ");
            double ca = sc.nextDouble();
            System.out.printf("\nO Resultado foi: %.4g\n",tangente * ca );
       
        }
        else if(escolha == 4){
            System.out.printf("\n+---Tabela trigonométrica---+\n");
            System.out.printf("| O seno é: %.4g\n| O cosseno é: %.4g\n| A tangente é: %.4g\n| A cossecante é: %.4g\n| A secante é: %.4g\n| A cotangente é: %.4g\n",Math.sin(rad), Math.cos(rad), Math.tan(rad), Math.acos(rad), Math.asin(rad), Math.atan(rad));
            System.out.printf("+---------------------------+\n");
        }
        else{
            System.out.println("opção inválida\n");
        }
        return ;
    }
 
    public void tabuada(){
        int op,operador;
        do{
            System.out.printf("\n1 - Tabuada\n2 - Calculadora Java\n0 - sair......\nEscolha uma opção: ");
            op = sc.nextInt();
            if(op == 1){
                System.out.printf("Informe o número pra tabuada: ");
                int n = sc.nextInt();
                System.out.printf("Informe o tipo de operação!\n1- para Multiplicação\n2- para Divisão\n3- para Somar\n4- para Subtração\nEscolha uma opção: ");
                operador = sc.nextInt();
                System.out.printf("\n+--Resultado--+\n");
                if (operador == 1) {
                    for (int i=1; i<=10; i++) {
                        System.out.printf("| %2d * %d = %2d |\n", i, n, (i*n));
                    }
                } else if (operador == 2) {
                    for (int i=1; i<=10; i++) {
                        System.out.printf("| %2d ÷ %d = %2d |\n", (n*i), n,i );
                    }
                
                } else if (operador == 3) {
                    for (int i=1; i<=10; i++) {
                        System.out.printf("| %2d + %d = %2d |\n", i, n, (i+n));
                    }
                
                } else if (operador == 4) {
                    for (int i=1; i<=10; i++) {
                        System.out.printf("| %2d - %d = %2d |\n", (n+i), n, i);
                    }
                
                }
            
             System.out.printf("+--Resultado--+\n");
            }

            if(op == 2){
                System.out.printf("\n\nInforme o número: ");
                double valor = sc.nextDouble();
                System.out.printf("1- para Multiplicação\n2- para Divisão\n3- para Somar\n4- para Subtração\nQual operação deseja: ");
                operador = sc.nextInt();
                if(operador == 1){
                    System.out.printf("Entre com outro número: ");  a = sc.nextDouble();
                    System.out.println("Resultado: "+valor+" * "+a+" = "+valor*a);
 
                }else if(operador == 2){
                    System.out.printf("Entre com outro número: ");  a = sc.nextDouble();
                    System.out.println("Resultado: "+valor+" ÷ "+a+" = "+valor/a);
 
                }else if(operador == 3){
                    System.out.printf("Entre com outro número: ");  a = sc.nextDouble();
                    System.out.println("Resultado: "+valor+" + "+a+" = "+valor+a);
 
                }else if(operador == 4){
                    System.out.printf("Entre com outro número: ");  a = sc.nextDouble();
                    c = valor-a;
                    System.out.println("Resultado: "+valor+" - "+a+" = "+c);
                }
                // if(valor!=0){
                //     System.out.printf("\n1 - Consultar outro número\n2- realizar uma operação específico\n0 - sair......\nOpção escolhida: ");
                //     op = sc.nextInt();
                // }
            }
           
        }while(op != 0);
   
    }
    public void equacao(){
        System.out.printf("valor de a: ");
        a = sc.nextDouble();
        System.out.printf("valor de b: ");
        b = sc.nextDouble();
        System.out.printf("valor de c: ");
        c = sc.nextDouble();
 
        double x1, x2, delta = b*b - 4*a*c;
 
        if (delta < 0) {//caso seja negativo
            JOptionPane.showMessageDialog(null,delta,"A equacao nao possui raizes reais ",JOptionPane.ERROR_MESSAGE);
        } else {
            if (delta == 0) {
                x1 = -b/(2*a);
                JOptionPane.showMessageDialog(null,x1,"A equação possui uma raiz real igual a ",JOptionPane.WARNING_MESSAGE);
 
            } else {
                x1 = (-b+Math.sqrt(delta))/(2*a);
                x2 = (-b-Math.sqrt(delta))/(2*a);
                System.out.println("A equação possui duas raízes reais iguais a " + x1 + " e " + x2);
            }
        }
    }
   
    public double getAngulo() {
        return angulo;
    }
 
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
 
    public int getMinutos() {
        return minutos;
    }
 
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
 
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int getop() {
        return n;
    }
    public void setop(int op) {
        this.n = op;
    }
}
 
