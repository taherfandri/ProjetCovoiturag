package tpandroid.projetcovoiturage.Modele;

/**
 * Created by MEDION on 14/11/2016.
 */


import tpandroid.projetcovoiturage.Modele.Avis;
import tpandroid.projetcovoiturage.Modele.Personne;
import java.util.ArrayList;
import java.util.Date;


public class Voyage {
    private int idVoyage;
    private Date dateVoyage;
    private int heureVoyage;
    private float prixVoyage;
    private String CordonneGPSDepart;
    private String CordonneGPSArrive;
    private float distanceVoyage;
    private int nbrPlace;
    private boolean fumeur;
    private ArrayList<Avis> lesAvis = new ArrayList();
    private ArrayList<Personne> lesPersonnes = new ArrayList();

    public Voyage(int idVoyage, Date dateVoyage, int heureVoyage, float prixVoyage, String cordonneGPSDepart, String cordonneGPSArrive, float distanceVoyage, int nbrPlace, boolean fumeur, ArrayList<Avis> lesAvis, ArrayList<Personne> lesPersonnes) {
        this.idVoyage = idVoyage;
        this.dateVoyage = dateVoyage;
        this.heureVoyage = heureVoyage;
        this.prixVoyage = prixVoyage;
        this.CordonneGPSDepart = cordonneGPSDepart;
        this.CordonneGPSArrive = cordonneGPSArrive;
        this.distanceVoyage = distanceVoyage;
        this.nbrPlace = nbrPlace;
        this.fumeur = fumeur;
        this.lesAvis = lesAvis;
        this.lesPersonnes = lesPersonnes;
    }

    public ArrayList<Avis> getLesAvis() {
        return this.lesAvis;
    }

    public void setLesAvis(ArrayList<Avis> lesAvis) {
        this.lesAvis = lesAvis;
    }

    public int getIdVoyage() {
        return this.idVoyage;
    }

    public void setIdVoyage(int idVoyage) {
        this.idVoyage = idVoyage;
    }

    public Date getDateVoyage() {
        return this.dateVoyage;
    }

    public void setDateVoyage(Date dateVoyage) {
        this.dateVoyage = dateVoyage;
    }

    public int getHeureVoyage() {
        return this.heureVoyage;
    }

    public void setHeureVoyage(int heureVoyage) {
        this.heureVoyage = heureVoyage;
    }

    public float getPrixVoyage() {
        return this.prixVoyage;
    }

    public void setPrixVoyage(float prixVoyage) {
        this.prixVoyage = prixVoyage;
    }

    public String getCordonneGPSDepart() {
        return this.CordonneGPSDepart;
    }

    public void setCordonneGPSDepart(String cordonneGPSDepart) {
        this.CordonneGPSDepart = cordonneGPSDepart;
    }

    public String getCordonneGPSArrive() {
        return this.CordonneGPSArrive;
    }

    public void setCordonneGPSArrive(String cordonneGPSArrive) {
        this.CordonneGPSArrive = cordonneGPSArrive;
    }

    public float getDistanceVoyage() {
        return this.distanceVoyage;
    }

    public void setDistanceVoyage(float distanceVoyage) {
        this.distanceVoyage = distanceVoyage;
    }

    public int getNbrPlace() {
        return this.nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    public boolean isFumeur() {
        return this.fumeur;
    }

    public void setFumeur(boolean fumeur) {
        this.fumeur = fumeur;
    }

    public ArrayList<Personne> getLesPersonnes() {
        return this.lesPersonnes;
    }

    public void setLesPersonnes(ArrayList<Personne> lesPersonnes) {
        this.lesPersonnes = lesPersonnes;
    }

    public Voyage(int idVoyage, Date dateVoyage, int heureVoyage, float prixVoyage, String cordonneGPSDepart, String cordonneGPSArrive, float distanceVoyage, int nbrPlace, boolean fumeur) {
        this.idVoyage = idVoyage;
        this.dateVoyage = dateVoyage;
        this.heureVoyage = heureVoyage;
        this.prixVoyage = prixVoyage;
        this.CordonneGPSDepart = cordonneGPSDepart;
        this.CordonneGPSArrive = cordonneGPSArrive;
        this.distanceVoyage = distanceVoyage;
        this.nbrPlace = nbrPlace;
        this.fumeur = fumeur;
    }
}
