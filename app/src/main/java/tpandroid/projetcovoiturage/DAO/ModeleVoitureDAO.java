package tpandroid.projetcovoiturage.DAO;

import java.util.List;
import tpandroid.projetcovoiturage.Modele.ModeleVoiture;

public interface ModeleVoitureDAO {
	public void add( ModeleVoiture modeleVoiture );
    public void delete( int modeleId );
    public void update( ModeleVoiture modeleVoiture );
    public List<ModeleVoiture> getAll();
    public ModeleVoiture getById( int modeleId );
}
