package tpandroid.projetcovoiturage.DAO;

import java.util.List;

/**
 * Created by MEDION on 14/11/2016.
 */


    import tpandroid.projetcovoiturage.Modele.Voyage;
    import java.util.List;

    public interface VoyageDAO {
        void add(Voyage var1);

        void delete(int var1);

        void update(Voyage var1);

        List<Voyage> getAll();

        Voyage getById(int var1);


}
