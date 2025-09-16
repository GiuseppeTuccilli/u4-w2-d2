package Es1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String st = "";
        ArrayList<String> parole = new ArrayList<>();
        ArrayList<String> duplicate = new ArrayList<>();
        System.out.println("Quante parole vuoi inserire nella lista? (inserire un numero positivo)");
        st = scanner.nextLine();
        try {
            n = Integer.parseInt(st);
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    st = "";
                    System.out.println("hai scelto di inserire " + n + " parole");
                    System.out.println("inserisci la parola numero " + (i + 1));
                    st = scanner.nextLine();
                    parole.add(st);
                }
                HashSet<String> distinte = new HashSet<>();
                for (int i = 0; i < parole.size(); i++) {
                    if (!distinte.add(parole.get(i))) {
                        duplicate.add(parole.get(i));
                    }
                }
                System.out.println("parole duplicate:");
                System.out.println(duplicate);
                System.out.println("numero parole distinte: " + distinte.size());
                System.out.println("parole distinte: ");
                System.out.println(distinte);
            } else {
                System.out.println("input non valido");
            }

        } catch (Exception e) {
            System.out.println("input non valido");
        }
    }
}
