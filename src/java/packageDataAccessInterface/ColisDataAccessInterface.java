package packageDataAccessInterface;

import packageException.*;
import packageModel.*;

import java.util.*;

public interface ColisDataAccessInterface {
    
    public void addColis(Colis colis) throws ExceptionData;
	
	public ArrayList<Colis> getAllColis() throws ExceptionData;
    
}