package tpandroid.projetcovoiturage.Modele;



import tpandroid.projetcovoiturage.Modele.ModeleVoiture;
import tpandroid.projetcovoiturage.Modele.Voiture;
import java.util.ArrayList;

/**
 * Created by MEDION on 14/11/2016.
 */




public class MarqueVoiture {
        private int idMarque;
        private String LibelleMArque;
        private ArrayList<Voiture> lesVoitures = new ArrayList();
        private ArrayList<ModeleVoiture> lesModeles = new ArrayList();

        public ArrayList<ModeleVoiture> getLesModeles() {
            return this.lesModeles;
        }

        public void setLesModeles(ArrayList<ModeleVoiture> lesModeles) {
            this.lesModeles = lesModeles;
        }

        public ArrayList<Voiture> getLesVoitures() {
            return this.lesVoitures;
        }

        public void setLesVoitures(ArrayList<Voiture> lesVoitures) {
            this.lesVoitures = lesVoitures;
        }

        public int getIdMarque() {
            return this.idMarque;
        }

        public void setIdMarque(int idMarque) {
            this.idMarque = idMarque;
        }

        public String getLibelleMArque() {
            return this.LibelleMArque;
        }

        public void setLibelleMArque(String libelleMArque) {
            this.LibelleMArque = libelleMArque;
        }

        public MarqueVoiture(int idMarque, String libelleMArque, ArrayList<Voiture> lesVoitures, ArrayList<ModeleVoiture> lesModeles) {
            this.idMarque = idMarque;
            this.LibelleMArque = libelleMArque;
            this.lesVoitures = lesVoitures;
            this.lesModeles = lesModeles;
        }

        public MarqueVoiture(int idMarque, String libelleMArque) {
            this.idMarque = idMarque;
            this.LibelleMArque = libelleMArque;
        }
    }


