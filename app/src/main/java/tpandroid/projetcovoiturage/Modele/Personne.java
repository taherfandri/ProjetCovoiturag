package tpandroid.projetcovoiturage.Modele;

/**
 * Created by MEDION on 14/11/2016.
 */

import tpandroid.projetcovoiturage.Modele.Voiture;
import tpandroid.projetcovoiturage.Modele.Voyage;

import java.util.ArrayList;
import java.util.Date;

public class Personne {
    private String CIN;
    private String nomPersonne;
    private Date dateNaissance;
    private String numTel;
    private String eMail;
    private int note;
    private String Urlimage;
    private String sexe;
    private ArrayList<Voyage> lesVoyages = new ArrayList();
    private ArrayList<Voiture> lesVoitures = new ArrayList();

    public ArrayList<Voiture> getLesVoitures() {
        return this.lesVoitures;
    }

    public void setLesVoitures(ArrayList<Voiture> lesVoitures) {
        this.lesVoitures = lesVoitures;
    }

    public ArrayList<Voyage> getLesVoyages() {
        return this.lesVoyages;
    }

    public void setLesVoyages(ArrayList<Voyage> lesVoyages) {
        this.lesVoyages = lesVoyages;
    }

    public String getCIN() {
        return this.CIN;
    }

    public void setCIN(String cIN) {
        this.CIN = cIN;
    }

    public String getNomPersonne() {
        return this.nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNumTel() {
        return this.numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String geteMail() {
        return this.eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getNote() {
        return this.note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getUrlImage() {
        return this.Urlimage;
    }

    public void setUrlImage(String image) {
        this.Urlimage = image;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Personne(String cIN, String nomPersonne, Date dateNaissance, String numTel, String eMail, int note, String urlimage, String sexe, ArrayList<Voyage> lesVoyages, ArrayList<Voiture> lesVoitures) {
        this.CIN = cIN;
        this.nomPersonne = nomPersonne;
        this.dateNaissance = dateNaissance;
        this.numTel = numTel;
        this.eMail = eMail;
        this.note = note;
        this.Urlimage = urlimage;
        this.sexe = sexe;
        this.lesVoyages = lesVoyages;
        this.lesVoitures = lesVoitures;
    }

    public Personne(String cIN, String nomPersonne, Date dateNaissance, String numTel, String eMail, int note, String urlimage, String sexe) {
        this.CIN = cIN;
        this.nomPersonne = nomPersonne;
        this.dateNaissance = dateNaissance;
        this.numTel = numTel;
        this.eMail = eMail;
        this.note = note;
        this.Urlimage = urlimage;
        this.sexe = sexe;
    }
}
