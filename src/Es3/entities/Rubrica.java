package Es3.entities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Rubrica {
    private HashMap<String, String> contatti;

    public Rubrica() {
        this.contatti = new HashMap<>();
    }

    public void inserisci(String nome, String numero) {
        this.contatti.put(nome, numero);
    }

    public void cancella(String nome) {
        this.contatti.remove(nome);
    }

    public String cercaNome(String numero) {
        String n = "";
        Set<String> nomi = this.contatti.keySet();
        Iterator<String> iter = nomi.iterator();
        while (iter.hasNext()) {
            String nome = iter.next();
            if (this.contatti.get(nome).equals(numero)) {
                n = nome;
            }
        }
        return n;
    }

    public String cercaNumero(String n) {
        return this.contatti.get(n);
    }

    public void print() {
        System.out.println(this.contatti);
    }
}
