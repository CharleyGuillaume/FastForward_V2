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
public class ColisDataAccess {

    private Connection connection;

    public ColisDataAccess() throws ExceptionData {
       connection = ConnexionSingleton.getInstance();
    }

    public void addColis(Colis colis) throws ExceptionData{
        String sqlQuery = "INSERT INTO colis (num_livraison, libelle, poids, fragile, hauteur, largeur, profondeur) VALUES ";
    
        try {
        int i=1;
        PreparedStatement prepStat = connection.prepareStatement(sqlQuery);
        prepStat.setString(i, colis.getLibelle());
        prepStat.setDouble(i, colis.getPoids());
        prepStat.setBoolean(i, colis.getFragile());
        prepStat.setDouble(i, colis.getHauteur());
        prepStat.setDouble(i, colis.getLargeur());
        prepStat.setDouble(i, colis.getProfondeur());
        prepStat.executeUpdate();
            }
    catch(Exception e){
    throw new ExceptionData("Impossible d'ajouter le colis dans la base de données");
    }
    
    }

public ArrayList<Colis> getAllColis() throws ExceptionData {
		
	ArrayList <Colis> allColis = new ArrayList <Colis>();
                
        String sqlQuery = "SELECT * FROM colis";
        
        try {
            PreparedStatement prepStat = connection.prepareStatement(sqlQuery);
            ResultSet data = prepStat.executeQuery();
            while(data.next()) {
                allColis.add(genColis(data));
            }
        }
        catch(Exception e) {
            throw new ExceptionData("Impossible de récupérer la liste des colis");
        }
        return allColis;
}

public static Colis genColis(ResultSet data) throws SQLException, ExceptionData {
		Colis colis = new Colis();
		colis.setIdnumero(data.getInt("col_numero"));
		colis.setNum_livraison(data.getInt("num_livraison"));
		colis.setLibelle(data.getString("libelle"));
		colis.setFragile(data.getBoolean("fragile"));
		colis.setPoids(data.getFloat("poids"));
		colis.setHauteur(data.getFloat("hauteur"));
		colis.setLargeur(data.getFloat("largeur"));
		colis.setProfondeur(data.getFloat("profondeur"));
		return colis;
	}
}