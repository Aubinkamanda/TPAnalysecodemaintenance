package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;

    /**
     * Constructeur
     *
     * @param nom
     */
    public Caisse(String nom) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean accepteItem(Item item) {
        int poidsItem = item.getPoids();
        if (poidsItem < 5 && nom.equals("Petits objets")) {
            return true;
        } else if (poidsItem >= 5 && poidsItem <= 20 && nom.equals("Moyens objets")) {
            return true;
        } else if (poidsItem >= 20 && nom.equals("Grands objets")) {
            return true;
        }
        return false;
    }
}
