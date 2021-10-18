import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[][] matriz = new String[30][7];
        //int matrizAux[][] = new String[30][6];
        String[] selecionados = new String[180];
        int contadorPrimos = 0;
        int auxiliar = 15;
        int verif = 1;
        int idade;
        String nome;
        //main content
        for(int fileiras = 1; fileiras <= 29; fileiras ++){
            for(int poltronas = 1; poltronas < 7; poltronas ++){
                nome = input.next();

                idade = input.nextInt();

                //armazena os divisores
                for(int i = 1; i <= idade; i++){
                    if(idade % i == 0){
                        contadorPrimos += 1;
                    }
                }

                String f = Integer.toString(fileiras);
                String p = Integer.toString(poltronas);
                String union = f + p;
                int valor = Integer.parseInt(union);
                //matrizAux[fileiras][poltronas] = Integer.parseInt(union);


                matriz[fileiras][poltronas] = nome;
                //confere se é impar ou múltiplo de sete:
                if(contadorPrimos <=2  && valor == auxiliar || idade % 7 == 0 && valor == auxiliar){
                    switch (poltronas) {
                        case 1 : selecionados[fileiras] = nome + "/" + fileiras + "/A";break;
                        case 2 : selecionados[fileiras] = nome + "/" + fileiras  + "/B";break;
                        case 3 : selecionados[fileiras] = nome + "/" + fileiras  + "/C";break;
                        case 4 : selecionados[fileiras] = nome + "/" + fileiras  + "/H";break;
                        case 5 : selecionados[fileiras] = nome + "/" + fileiras  + "/J";break;
                        case 6 : selecionados[fileiras] = nome + "/" + fileiras  + "/K";break;
                    }
                }


             contadorPrimos = 0; // reseta a variável



            }
            // for 2
            if(verif < 5 || verif >= 10 && verif < 15 || verif >= 20 && verif < 25 ){
            auxiliar += 9;
            }else{
                auxiliar += 11;
            }
            verif += 1;
        } // for 1
        for (String selecionado : selecionados) {
           if(selecionado != null){
               System.out.println(selecionado);
           }
        }
        //end
    }
}