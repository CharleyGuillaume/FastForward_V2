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
public class AdresseDataAccess {

    private Connection connection;

    public AdresseDataAccess() throws ExceptionData {
        connection = ConnexionSingleton.getInstance();
    }

    public ArrayList<Adresse> getAllAdresses() throws ExceptionData {

        ArrayList<Adresse> allAdresses = new ArrayList<Adresse>();

        String sqlQuery = "SELECT * FROM adresse";

        try {
            PreparedStatement prepStat = connection.prepareStatement(sqlQuery);
            ResultSet data = prepStat.executeQuery();
            while (data.next()) {
                allAdresses.add(CreateAdresse(data));
            }
        } catch (Exception e) {
            throw new ExceptionData("Impossible de récupérer la liste des adresses", e);
        }
        return allAdresses;
    }
    
    public static Adresse CreateAdresse(ResultSet data) throws SQLException, ExceptionData {
		Adresse adresse = new Adresse();
		adresse.setIdnumero(data.getInt("adr_numero"));
		adresse.setSociete(data.getString("societe"));
		adresse.setNom(data.getString("nom"));
		adresse.setPrenom(data.getString("prenom"));
		adresse.setAdr_rue(data.getString("adr_rue"));
		adresse.setAdr_num(data.getInt("adr_num"));
		adresse.setAdr_cp(data.getInt("adr_cp"));
		adresse.setAdr_ville(data.getString("adr_ville"));
		adresse.setAdr_pays(data.getString("adr_pays"));
		adresse.setMail(data.getString("mail"));
		adresse.setTel(data.getInt("tel"));
		return adresse;
	}
}
