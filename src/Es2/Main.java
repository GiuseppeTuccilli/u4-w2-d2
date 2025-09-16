package Es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static ArrayList<Integer> casual(int n) {
        if (n < 0) {
            n = -n;
        }
        ArrayList<Integer> interi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Random rdm = new Random();
            interi.add(rdm.nextInt(100));
        }
        return interi;
    }

    public static <E> ArrayList<E> invert(List<E> l) {
        ArrayList<E> newCol = new ArrayList<>();
        newCol.addAll(l);
        for (int i = (l.size() - 1); i >= 0; i--) {
            newCol.add(l.get(i));
        }
        return newCol;
    }

    public static <E> void printOddEven(List<E> l, boolean p) {
        if (p) {
            for (int i = 0; i < l.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(l.get(i));
                }
            }
        } else {
            for (int i = 0; i < l.size(); i++) {
                if (i % 2 != 0) {
                    System.out.println(l.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(casual(5));
        ArrayList<String> prova = new ArrayList<>(List.of("primo", "secondo", "terzo"));
        System.out.println(invert(prova));
        ArrayList<Integer> prova2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            prova2.add(i);
        }
        printOddEven(prova2, true);
        System.out.println("----------------------------------------------------------------");
        printOddEven(prova2, false);

    }
}
