package tpandroid.projetcovoiturage.Modele;

/**
 * Created by MEDION on 14/11/2016.
 */


import tpandroid.projetcovoiturage.Modele.Voyage;

public class Trajet {
    private int idTrajet;
    private String code;
    private Voyage leVoyage;

    public Trajet(int idTrajet, String code, Voyage leVoyage) {
        this.idTrajet = idTrajet;
        this.code = code;
        this.leVoyage = leVoyage;
    }

    public Voyage getLeVoyage() {
        return this.leVoyage;
    }

    public void setLeVoyage(Voyage leVoyage) {
        this.leVoyage = leVoyage;
    }

    public int getIdTrajet() {
        return this.idTrajet;
    }

    public void setIdTrajet(int idTrajet) {
        this.idTrajet = idTrajet;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
