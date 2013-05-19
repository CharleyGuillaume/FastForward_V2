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
    public ArrayList<Expediteur> getAllExpediteurs() throws ExceptionData {
		ArrayList <Expediteur> allExpediteurs = new ArrayList <Expediteur>();
        		
        sqlQuery = "SELECT * FROM expediteur e INNER JOIN adresse a ON e.num_adresse = a.adr_numero";
        
        try {
            PreparedStatement prepStat = connection.prepareStatement(sqlQuery);
            ResultSet data = prepStat.executeQuery();
            while(data.next()) {
                allExpediteurs.add(CreateExpediteur(data));
            }
        }
        catch(Exception e) {
            throw new ExceptionData("Impossible de récupérer la liste des expéditeurs", e);
        }
        return allExpediteurs;
    }
    public static Expediteur CreateExpediteur(ResultSet data) throws SQLException, ExceptionData {
		Expediteur expediteur = new Expediteur();
		expediteur.setIdnumero(data.getInt("exp_numero"));
		expediteur.setNum_compte(data.getInt("num_compte"));
		expediteur.setFax(data.getInt("fax"));
		expediteur.setAdresse(AdresseDataAccess.CreateAdresse(data));
		return expediteur;
	}
}
