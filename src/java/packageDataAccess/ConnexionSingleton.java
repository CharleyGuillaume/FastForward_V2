package packageDataAccess;

import packageException.ExceptionData;
import java.sql.SQLException;
import java.sql.Connection;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.Context;

// import java.util.*;
// import java.sql.*;

public class ConnexionSingleton {
    private static Connection connection;
    
    private ConnexionSingleton()throws ExceptionData{
        try { 
            Context ctx = new InitialContext();
            DataSource source = (DataSource) ctx.lookup("jdbc/FastForwardDatasource");
            connection = source.getConnection();
            }
        catch (Exception e){
            throw new ExceptionData("Connection à la base de données impossible");
        }
    }
    
    public static Connection getInstance()throws ExceptionData{
        if (connection == null){
           new ConnexionSingleton();
        }
        return connection;
    }
    
}