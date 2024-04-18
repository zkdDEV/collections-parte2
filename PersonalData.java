package segunda.parte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalData {

    public static void main(String[] args){
        List<Person> male = new ArrayList<Person>();
        List<Person> female = new ArrayList<Person>();

        // ADICIONANDO DADOS FAKES
        fakeData(male, female);

        String continuar = "SIM";
        while(continuar.equalsIgnoreCase("SIM")){
            // RESGATANDO A RESPOSTA DAS ESCOLHAS INICIAIS
            String answer = choices();
            // VERIFICANDO RESPOSTA NAS CONDICIONAIS
            continuar = conditions(answer, male, female);
        }
    }

    public static void fakeData(List<Person> male, List<Person> female){
        // CRIANDO DADOS FAKES
        Person a = new Person("Gian", "masculino");
        Person b = new Person("Bruno", "masculino");
        Person c = new Person("Matheus", "masculino");
        Person d = new Person("Fernanda", "feminino");
        Person f = new Person("Letícia", "feminino");
        Person g = new Person("Ronaldo", "feminino");
        // ADICIONANDO DADOS
        male.add(a);
        male.add(b);
        male.add(c);
        female.add(d);
        female.add(f);
        female.add(g);
    }

    public static String choices(){
        Scanner s = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("Esolhas:");
        System.out.println("------------------------------------------------------");
        System.out.println("Digite 1 para ver a lista de homens.");
        System.out.println("Digite 2 para ver a lista de mulheres.");
        System.out.println("Digite 3 para adicinar alguém a alguma lista");
        System.out.println("------------------------------------------------------");
        String answer = s.next();
        return answer;
    }

    public static String conditions(String answer, List<Person> male, List<Person> female){
        Scanner s = new Scanner(System.in);

        if(answer.equals("1")){
            System.out.println("******************************************************");
            System.out.println("Lista de Homens");
            System.out.println("******************************************************");
            printing(male);
            System.out.println("******************************************************");
            System.out.println("Se deseja retornar ao início digite 'sim'");
            System.out.println("******************************************************");
            String continuar = s.next();
            return continuar;
        } else if (answer.equals("2")) {
            System.out.println("******************************************************");
            System.out.println("Lista de mulheres: ");
            System.out.println("******************************************************");
            printing(female);
            System.out.println("******************************************************");
            System.out.println("Se deseja retornar ao início digite 'sim'");
            System.out.println("******************************************************");
            String continuar = s.next();
            return continuar;
        } else if(answer.equals("3")){
            addPerson(male, female);
            System.out.println("******************************************************");
            System.out.println("Se deseja retornar ao início digite 'sim'");
            System.out.println("******************************************************");
            String continuar = s.next();
            return continuar;
        }else {
            System.out.println("Ops! parece que você digitou algo inválido,");
            System.out.println("por favor, reinicie o programa.");
            String continuar = "nao";
            return continuar;
        }
    }

    public static void printing(List<Person> listItens){
        for(Person name : listItens){
            System.out.println(name.getName());

        }
    }

    public static void addPerson(List<Person> male, List<Person> female){
        Scanner s = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("Qual é o nome da nova pessoa?");
        System.out.println("------------------------------------------------------");
        String name = s.next();

        System.out.println("------------------------------------------------------");
        System.out.println("Qual é o sexo? - masculino ou feminino");
        System.out.println("------------------------------------------------------");
        String sex = s.next();

        Person p = new Person(name, sex.toLowerCase());

        if(p.getSex().equals("masculino")){
            male.add(p);
        } else if(p.getSex().equals("feminino")){
            female.add(p);
        } else{
            System.out.println("******************************************************");
            System.out.println("Ops! parece que você digitou algo inválido,");
            System.out.println("então a pessoa não foi adicionada.");
        }
    }
}
