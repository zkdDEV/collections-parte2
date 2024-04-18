package segunda.parte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class People {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Digite os nomes que deseja implementar na lista");
        System.out.println("e separe eles com a vírgula(,)");
        System.out.println("--------------------------------------------------------------");
        // COLETANDO NOMES
        String names = s.nextLine();
        // TRANSFERINDO OS NOMES CORTADOS PARA UM ARRAY
        String[] namesCut = names.split(",");
        // CRIANDO A LISTA
        List<String> namesList = new ArrayList<String>();
        // ADICIONANDO OS NOMES NA LISTA
        for(int i = 0; i < namesCut.length; i++){
            // trim() - Retira os espaços do início e final do array
            // toLowerCase() - Coloca todos os itens em letras minúsculas
            namesList.add(namesCut[i].trim().toLowerCase());
        }
        // ORDENANDO NOMES
        Collections.sort(namesList);

        System.out.println("Lista de nome em ordem Alfabética: ");

        System.out.println("****************************************************************");
        // IMPRIMINDO NOMES NO CONSOLE
        for(String name : namesList){
            System.out.println(name);
        }
        System.out.println("****************************************************************");
    }
}
