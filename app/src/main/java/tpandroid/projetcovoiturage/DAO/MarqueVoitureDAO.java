package tpandroid.projetcovoiturage.DAO;

import java.util.List;
import tpandroid.projetcovoiturage.Modele.MarqueVoiture;

public interface MarqueVoitureDAO {
	public void add( MarqueVoiture marqueVoiture );
    public void delete( int marqueId );
    public void update( MarqueVoiture marqueVoiture );
    public List<MarqueVoiture> getAll();
    public MarqueVoiture getById( int marqueId );
}
