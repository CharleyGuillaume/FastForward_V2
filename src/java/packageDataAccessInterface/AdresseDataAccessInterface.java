package packageDataAccessInterface;

import packageException.*;
import packageModel.*;

import java.util.*;

public interface AdresseDataAccessInterface {
    
    public ArrayList<Adresse> getAllAdresses() throws ExceptionData;
    
}
