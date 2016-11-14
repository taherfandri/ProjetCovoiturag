package tpandroid.projetcovoiturage.Modele;

import java.util.Date;

/**
 * Created by MEDION on 14/11/2016.
 */
public class Avis {


    private int idAvis;
    private float noteAvis;
    private String Commentaire;
    private Date dateAvis;

    public Avis(int idAvis, float noteAvis, String commentaire, Date dateAvis) {
        this.idAvis = idAvis;
        this.noteAvis = noteAvis;
        this.Commentaire = commentaire;
        this.dateAvis = dateAvis;
    }

    public int getIdAvis() {
        return this.idAvis;
    }

    public void setIdAvis(int idAvis) {
        this.idAvis = idAvis;
    }

    public float getNoteAvis() {
        return this.noteAvis;
    }

    public void setNoteAvis(float noteAvis) {
        this.noteAvis = noteAvis;
    }

    public String getCommentaire() {
        return this.Commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.Commentaire = commentaire;
    }

    public Date getDateAvis() {
        return this.dateAvis;
    }

    public void setDateAvis(Date dateAvis) {
        this.dateAvis = dateAvis;
    }
}
