package ex1;

import java.util.Date;
/***
 * un programme qui affiche le statut de l'entreprise
 * @author Aubin KAMANDA
 */
public class Entreprise {

    public static final int CAPITAL_MAX = 3000000;
    public int siret;
    public String nom;
    public String adresse;
    public Date dateCreation;

    /***
     * une fonction qui affiche le statut de l'entreprise
     */
    public void Afficher_statut() {
        System.out.println("Statut de l'entreprise " + nom + " :");
        System.out.println("Numéro SIRET : " + siret);
        System.out.println("Adresse : " + adresse);
        System.out.println("Date de création : " + dateCreation);
        System.out.println("Capital maximum autorisé : " + CAPITAL_MAX);

    }

}
