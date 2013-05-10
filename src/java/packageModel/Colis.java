/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageModel;

/**
 *
 * @author Charley
 */
public class Colis {

    private int idnumero;
    private boolean fragile;
    private int libelle;
    private int poids;
    private int dimensions;
    private int enl_accepte;
    private int enl_raison_refus;
    private int liv_accepte;
    private int liv_raison_refus;

    public Colis(int idnumero, boolean fragile, int libelle, int poids, int dimensions, int enl_accepte, int enl_raison_refus, int liv_accepte, int liv_raison_refus) {
        this.idnumero = idnumero;
        this.fragile = fragile;
        this.libelle = libelle;
        this.poids = poids;
        this.dimensions = dimensions;
        this.enl_accepte = enl_accepte;
        this.enl_raison_refus = enl_raison_refus;
        this.liv_accepte = liv_accepte;
        this.liv_raison_refus = liv_raison_refus;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public int getEnl_accepte() {
        return enl_accepte;
    }

    public void setEnl_accepte(int enl_accepte) {
        this.enl_accepte = enl_accepte;
    }

    public int getEnl_raison_refus() {
        return enl_raison_refus;
    }

    public void setEnl_raison_refus(int enl_raison_refus) {
        this.enl_raison_refus = enl_raison_refus;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public int getIdnumero() {
        return idnumero;
    }

    public void setIdnumero(int idnumero) {
        this.idnumero = idnumero;
    }

    public int getLibelle() {
        return libelle;
    }

    public void setLibelle(int libelle) {
        this.libelle = libelle;
    }

    public int getLiv_accepte() {
        return liv_accepte;
    }

    public void setLiv_accepte(int liv_accepte) {
        this.liv_accepte = liv_accepte;
    }

    public int getLiv_raison_refus() {
        return liv_raison_refus;
    }

    public void setLiv_raison_refus(int liv_raison_refus) {
        this.liv_raison_refus = liv_raison_refus;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
}
