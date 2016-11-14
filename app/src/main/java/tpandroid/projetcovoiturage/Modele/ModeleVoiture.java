package tpandroid.projetcovoiturage.Modele;

/**
 * Created by MEDION on 14/11/2016.
 */
public class ModeleVoiture {

    private int idModele;
    private String libelleModele;

    public int getIdModele() {
        return this.idModele;
    }

    public void setIdModele(int idModele) {
        this.idModele = idModele;
    }

    public String getLibelleModele() {
        return this.libelleModele;
    }

    public void setLibelleModele(String libelleModele) {
        this.libelleModele = libelleModele;
    }

    public ModeleVoiture(int idModele, String libelleModele) {
        this.idModele = idModele;
        this.libelleModele = libelleModele;
    }
}
