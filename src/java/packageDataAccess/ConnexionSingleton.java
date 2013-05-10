/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageDataAccess;

import packageException.ExceptionData;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
/**
 *
 * @author Charley
 */
public class ConnexionSingleton {
    private static ConnexionSingleton connexSingl;
    private Connection connect;
    
    private ConnexionSingleton(){
    }
}
