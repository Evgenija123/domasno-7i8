package domasno6.zadaca2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Makedonija");
        lista.add("Srbija");
        lista.add("Italija");
        lista.add("Rusija");
        lista.add("Slovenija");

        System.out.println("Listata sodrzhi "+ lista.size()+" elementi.");

        if(lista.size() == 3) {
            lista.add("Germanija");
            lista.add("Ukrajna");

            System.out.println(lista);
        }
        else {
            System.out.println(lista);
        }
    }
}

