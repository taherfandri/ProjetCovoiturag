package tpandroid.projetcovoiturage.DAO;

import java.util.List;
import tpandroid.projetcovoiturage.Modele.Avis;

public interface AvisDAO {
	public void add( Avis avis );
    public void delete( int avisId );
    public void update( Avis avis );
    public List<Avis> getAll();
    public Avis getById( int avisId );
}