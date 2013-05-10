/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageModel;

/**
 *
 * @author Charley
 */
public class Adresse {

    private int idnumero;
    private int societe;
    private int nom;
    private int prenom;
    private int adresse;
    private int mail;
    private int tel;

    public Adresse(int idnumero, int societe, int nom, int prenom, int adresse, int mail, int tel) {
        this.idnumero = idnumero;
        this.societe = societe;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.tel = tel;
    }

    public int getAdresse() {
        return adresse;
    }

    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }

    public int getIdnumero() {
        return idnumero;
    }

    public void setIdnumero(int idnumero) {
        this.idnumero = idnumero;
    }

    public int getMail() {
        return mail;
    }

    public void setMail(int mail) {
        this.mail = mail;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public int getPrenom() {
        return prenom;
    }

    public void setPrenom(int prenom) {
        this.prenom = prenom;
    }

    public int getSociete() {
        return societe;
    }

    public void setSociete(int societe) {
        this.societe = societe;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
