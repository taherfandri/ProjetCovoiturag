package tpandroid.projetcovoiturage.Modele;

/**
 * Created by MEDION on 14/11/2016.
 */

import tpandroid.projetcovoiturage.Modele.MarqueVoiture;
import tpandroid.projetcovoiturage.Modele.Personne;


import java.util.ArrayList;

public class Voiture {
    private String Matricule;
    private int nbrPlaceTotal;
    private String UrlImageVoiture;
    private Personne personne;
    private ArrayList<MarqueVoiture> lesMarques = new ArrayList();

    public ArrayList<MarqueVoiture> getLesMarques() {
        return this.lesMarques;
    }

    public void setLesMarques(ArrayList<MarqueVoiture> lesMarques) {
        this.lesMarques = lesMarques;
    }

    public Personne getPersonne() {
        return this.personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getMatricule() {
        return this.Matricule;
    }

    public void setMatricule(String matricule) {
        this.Matricule = matricule;
    }

    public int getNbrPlaceTotal() {
        return this.nbrPlaceTotal;
    }

    public void setNbrPlaceTotal(int nbrPlaceTotal) {
        this.nbrPlaceTotal = nbrPlaceTotal;
    }

    public String getUrlImageVoiture() {
        return this.UrlImageVoiture;
    }

    public void setUrlImageVoiture(String urlImageVoiture) {
        this.UrlImageVoiture = urlImageVoiture;
    }

    public Voiture(String matricule, int nbrPlaceTotal, String urlImageVoiture, Personne personne, ArrayList<MarqueVoiture> lesMarques) {
        this.Matricule = matricule;
        this.nbrPlaceTotal = nbrPlaceTotal;
        this.UrlImageVoiture = urlImageVoiture;
        this.personne = personne;
        this.lesMarques = lesMarques;
    }

    public Voiture(String matricule, int nbrPlaceTotal, String urlImageVoiture, Personne personne) {
        this.Matricule = matricule;
        this.nbrPlaceTotal = nbrPlaceTotal;
        this.UrlImageVoiture = urlImageVoiture;
        this.personne = personne;
    }
}
