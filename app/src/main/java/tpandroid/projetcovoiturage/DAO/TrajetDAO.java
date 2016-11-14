package tpandroid.projetcovoiturage.DAO;

import java.util.List;
import tpandroid.projetcovoiturage.Modele.Trajet;

public interface TrajetDAO {
	public void add( Trajet trajet );
    public void delete( int trajetId );
    public void update( Trajet trajet );
    public List<Trajet> getAll();
    public Trajet getById( int trajetId );
}
