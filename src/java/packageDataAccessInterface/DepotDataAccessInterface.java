package packageDataAccessInterface;

import packageException.*;
import packageModel.*;

import java.util.*;

public interface DepotDataAccessInterface {
    
    public ArrayList<Depot> getAllDepots() throws ExceptionData;
    
}
