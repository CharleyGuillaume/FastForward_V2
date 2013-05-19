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
public class DepotDataAccess {
        private Connection connection;
        private String sqlQuery;
        
        public DepotDataAccess() throws ExceptionData{
            connection= ConnexionSingleton.getInstance();
        }
        public ArrayList<Depot> getAllDepots() throws ExceptionData {
		ArrayList <Depot> allDepots = new ArrayList <Depot>();
        		
        sqlQuery = "SELECT * FROM depot d INNER JOIN adresse a ON d.num_adresse = a.adr_numero";
        
        try {
            PreparedStatement prepStat = connection.prepareStatement(sqlQuery);
            ResultSet data = prepStat.executeQuery();
            while(data.next()) {
                allDepots.add(CreateDepot(data));
            }
        }
        catch(Exception e) {
            throw new ExceptionData("Impossible de récupérer la liste des dépôts");
        }
        return allDepots;
    }
        public Depot CreateDepot(ResultSet data) throws SQLException, ExceptionData {
		Depot depot = new Depot();
		depot.setIdnumero(data.getInt("dep_numero"));
		depot.setDispatch(data.getBoolean("dispatch"));
		depot.setLibelle(data.getString("libelle"));
		depot.setInfos_pratiques(data.getString("infos_pratiques"));
		depot.setAdresse(AdresseDataAccess.CreateAdresse(data));
		return depot;
	}
}
