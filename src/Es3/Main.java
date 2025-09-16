package Es3;

import Es3.entities.Rubrica;

public class Main {
    public static void main(String[] args) {
        Rubrica myRub = new Rubrica();
        myRub.inserisci("pippo", "3574859246");
        myRub.inserisci("pluto", "5412643897");
        myRub.inserisci("tizio", "5148249537");
        System.out.println(myRub.cercaNumero("pippo"));
        System.out.println(myRub.cercaNome("5412643897"));
        myRub.cancella("tizio");
        myRub.print();

    }
}
