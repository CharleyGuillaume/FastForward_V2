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
public class LivraisonDataAccess {
    private Connection connection;
    private String sqlQuery;
    
    public LivraisonDataAccess() throws ExceptionData{
        connection = ConnexionSingleton.getInstance();
    }

}
