package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    public void addItem(Item item) {

        //TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
        for (Caisse caisse : caisses) {
            if (caisse.accepteItem(item)) {
                caisse.getItems().add(item);
                return; // Sortir de la boucle après avoir ajouté l'item à une caisse
            }
        }
    }

    public int taille() {
        //TODO faites évoluer ce code.
        int size = 0;
        for (Caisse caisse : caisses) {
            size += caisse.getItems().size();
        }
        return size;
    }
}
