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
                //alimenta a matriz conforme cada poltrona, ou seja, nos lugares determinados.
                switch (poltronas) {
                    case 1 :  matriz[fileiras][poltronas] = nome + "/" + fileiras + "/A";break;
                    case 2 :  matriz[fileiras][poltronas] = nome + "/" + fileiras + "/B";break;
                    case 3 :  matriz[fileiras][poltronas] = nome + "/" + fileiras + "/C";break;
                    case 4 :  matriz[fileiras][poltronas] = nome + "/" + fileiras + "/H";break;
                    case 5 :  matriz[fileiras][poltronas] = nome + "/" + fileiras + "/J";break;
                    case 6 :  matriz[fileiras][poltronas] = nome + "/" + fileiras + "/K";break;
                }
                //armazena os divisores, posteriormente, se o contador for > 2, nao será primo
                for(int i = 1; i <= idade; i++){
                    if(idade % i == 0){
                        contadorPrimos += 1;
                    }
                }
                // uno os números para ver se segue o padrão 9 e 11 que inferi por análise
                String f = Integer.toString(fileiras);
                String p = Integer.toString(poltronas);
                String union = f + p;
                int valor = Integer.parseInt(union);
                //matrizAux[fileiras][poltronas] = Integer.parseInt(union);


                //confere se é impar ou múltiplo de sete, conforme as condicoes propostas:
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
                auxiliar += 9; //intervalo crescente de lugares
            }else{
                auxiliar += 11;//intervalo decrescente de lugares
            }
            verif += 1;
        } // for 1

        // finalmente, impressão dessa joça
        for(int fileiras = 1; fileiras <= 29; fileiras ++){
            for(int poltronas = 1; poltronas < 7; poltronas ++){
                    for(int i = 0; i < selecionados.length; i++){
                        //System.out.println(matriz[fileiras][poltronas]+" "+selecionados[i]);
            // ==
                        if(selecionados[i] != null){ //comparo o vetor de selecionados com os acentos da matriz
                            if(selecionados[i].equals(matriz[fileiras][poltronas]))
                            System.out.println(matriz[fileiras][poltronas]);
                        }

                    }
                }
            }
        }
        //end
}
