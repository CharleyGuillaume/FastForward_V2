package packageDataAccessInterface;

import packageException.*;
import packageModel.*;

import java.util.*;

public interface ExpediteurDataAccessInterface {
    
    public ArrayList<Expediteur> getAllExpediteurs() throws ExceptionData;
    
}
