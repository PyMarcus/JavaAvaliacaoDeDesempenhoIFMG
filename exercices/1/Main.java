import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int vetor1[], vetor2[];

        vetor1 = new int[65];
        vetor2 = new int[65];
        boolean verificador = true;

        // alimenta o vetor 1 em ordem crescente
        int k = 64;
        for(int i = 0; i < (vetor1.length + vetor2.length); i++){
            if(i < 65){
                vetor1[i] = input.nextInt();
            }
            if(i >= 65){
                vetor2[k] = input.nextInt();
                k--;
            }

        }input.close();

        // comparação
        for(int i = 0; i < vetor1.length; i++){
            if(vetor1[i] != vetor2[i]){
                verificador = false;
                break;
            }

        }
        //verifica se é palindromo
        if(verificador){
            System.out.println("SIM");
        }else{
            System.out.println("NAO");
        }
    }
}
