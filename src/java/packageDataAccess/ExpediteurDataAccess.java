/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageDataAccess;

import packageModel.*;
import packageException.*;

import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Charley
 */
public class ExpediteurDataAccess {
    private Connection connection;
    private String sqlQuery;
    
    public ExpediteurDataAccess() throws ExceptionData{
        connection = ConnexionSingleton.getInstance();
    }
    
    public ArrayList<Expediteur> getAllExpediteurs() throws ExceptionData{
        
        ArrayList <Expediteur> allExpediteur = new ArrayList <Expediteur>();
        
        // A FINIR
        
        return allExpediteur;
    
    }
}
