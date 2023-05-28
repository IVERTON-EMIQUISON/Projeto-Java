public class filosofia {
   
    private String Heráclito;
    private String Arthur_Schopenhauer;
    private String Protágoras;
    private int n1;
  

    public filosofia(){
        this.Arthur_Schopenhauer = "Os animais não são artigos fabricados para o nosso uso.";
        this.Heráclito = "Não podemos banhar-nos duas vezes no mesmo rio porque as águas renovam-se a cada instante.";
        this.Protágoras = "O homem é a medida de todas as coisas.";
        this.n1 = 0;
    }

    public void Menu(){
        System.out.println("\n1 - Os animais não são artigos fabricados para o nosso uso.\n2 - Não podemos banhar-nos duas vezes no mesmo rio porque as águas renovam-se a cada instante.\n3 - O homem é a medida de todas as coisas.\n0 - Voltar para o menu principal.");
        System.out.printf("Escolha uma frase: ");

    }
   
    public void Arthur_Schopenhauer(){
        System.out.printf("\nA frase escolhida foi: 'Os animais não são artigos fabricados para o nosso uso'.\n\tO trecho se refere a qual autor?\n1- para Heráclito.\n2- para Arthur Schopenhauer.\n3- para Protágoras.\nEscolha uma opção: ");
        
    }
    
    public void Heráclito(){
        System.out.println("\nA frase escolhida foi: 'Não podemos banhar-nos duas vezes no mesmo rio porque as águas renovam-se a cada instante.'\n\tO trecho se refere a qual autor?\n1- para Arthur Schopenhauer.\n2- para Protágoras.\n3- pra Heráclito.\nEscolha uma opção: ");
    }
    
    public void Protágoras(){
        System.out.println("\nA frase escolhida foi: O homem é a medida de todas as coisas.\n\tO trecho se refere a qual autor?\n1- para Protágoras.\n3- para Arthur Schopenhauer.\n2- para Heráclito.\nEscolha uma opção: ");
      
    }

    public String getHeráclito() {
        return Heráclito;
    }

    public void setHeráclito(String heráclito) {
        Heráclito = heráclito;
    
    }
    public String getArthur_Schopenhauer() {
        return Arthur_Schopenhauer;
    }

    public void setArthur_Schopenhauer(String arthur_Schopenhauer) {
        Arthur_Schopenhauer = arthur_Schopenhauer;
    }

    public String getProtágoras() {
        return Protágoras;
    }

    public void setProtágoras(String protágoras) {
        Protágoras = protágoras;
    }
   
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    @Override
    public String toString() {
        return "filosofos [Arthur_Schopenhauer = " + Arthur_Schopenhauer + "\n] [Heráclito = " + Heráclito + "\n] [Protágoras = "
                + Protágoras + "]";
    }

}

