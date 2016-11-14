package tpandroid.projetcovoiturage.DAO;

import java.util.List;
import tpandroid.projetcovoiturage.Modele.Personne;

public interface PersonneDAO {
	public void add( Personne personne );
    public void delete( int personneId );
    public void update( Personne personne );
    public List<Personne> getAll();
    public Personne getById( int personneId );
}
