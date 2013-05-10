/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageModel;

/**
 *
 * @author Charley
 */
public class Depot {

    private int idnumero;
    private int libelle;
    private int dispatch;
    private int infos_pratiques;

    public Depot(int idnumero, int libelle, int dispatch, int infos_pratiques) {
        this.idnumero = idnumero;
        this.libelle = libelle;
        this.dispatch = dispatch;
        this.infos_pratiques = infos_pratiques;
    }

    public int getDispatch() {
        return dispatch;
    }

    public void setDispatch(int dispatch) {
        this.dispatch = dispatch;
    }

    public int getIdnumero() {
        return idnumero;
    }

    public void setIdnumero(int idnumero) {
        this.idnumero = idnumero;
    }

    public int getInfos_pratiques() {
        return infos_pratiques;
    }

    public void setInfos_pratiques(int infos_pratiques) {
        this.infos_pratiques = infos_pratiques;
    }

    public int getLibelle() {
        return libelle;
    }

    public void setLibelle(int libelle) {
        this.libelle = libelle;
    }
}
