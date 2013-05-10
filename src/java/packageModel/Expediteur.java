/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageModel;

/**
 *
 * @author Charley
 */
public class Expediteur {

    private int idnumero;
    private int num_compte;
    private int fax;

    public Expediteur(int idnumero, int num_compte, int fax) {
        this.idnumero = idnumero;
        this.num_compte = num_compte;
        this.fax = fax;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public int getIdnumero() {
        return idnumero;
    }

    public void setIdnumero(int idnumero) {
        this.idnumero = idnumero;
    }

    public int getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(int num_compte) {
        this.num_compte = num_compte;
    }
}
