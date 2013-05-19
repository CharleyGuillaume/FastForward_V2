package packageDataAccessInterface;

import packageException.*;
import packageModel.*;

import java.util.*;

public interface LivraisonDataAccessInterface {
    
    public ArrayList<Livraison> getAllLivraisons() throws ExceptionData;
    
}
