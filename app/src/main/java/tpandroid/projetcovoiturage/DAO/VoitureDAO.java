package tpandroid.projetcovoiturage.DAO;

import java.util.List;
import tpandroid.projetcovoiturage.Modele.Voiture;

public interface VoitureDAO {
	public void add( Voiture voiture );
    public void delete( int voitureId );
    public void update( Voiture voiture );
    public List<Voiture> getAll();
    public Voiture getById( int voitureId );
}
