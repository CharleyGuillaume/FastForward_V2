package packageModel;

import java.util.GregorianCalendar;

public class Colis {

    private Integer idnumero,num_livraison;
    private String libelle;
    private double poids;
    private boolean fragile;
    private double hauteur;
    private double largeur;
    private double profondeur;
    private GregorianCalendar date_peremption;
    private boolean liv_accepte;
    private String liv_raison_refus;

    public Colis(){
        
    }
    
    public Colis(Integer idnumero,Integer numliv, boolean fragile, String libelle, double poids, double hauteur, double largeur, double profondeur, boolean liv_accepte, String liv_raison_refus) {
        this.idnumero = idnumero;
        this.num_livraison=numliv;
        this.libelle = libelle;
        this.poids = poids;
        this.fragile = fragile;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.profondeur = profondeur;
        this. date_peremption = date_peremption;
        this.liv_accepte = liv_accepte;
        this.liv_raison_refus = liv_raison_refus;
    }

    public Integer getIdnumero() {
        return idnumero;
    }

    public void setIdnumero(Integer idnumero) {
        this.idnumero = idnumero;
    }
    
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
    
    public boolean getFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }
    
    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
    
    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    
    public double getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(double profondeur) {
        this.profondeur = profondeur;
    }
    
    public GregorianCalendar getDate_peremption() {
        return date_peremption;
    }

    public void setDate_peremption(GregorianCalendar date_peremption) {
        this.date_peremption = date_peremption;
    }

    public boolean getLiv_accepte() {
        return liv_accepte;
    }

    public void setLiv_accepte(boolean liv_accepte) {
        this.liv_accepte = liv_accepte;
    }

    public String getLiv_raison_refus() {
        return liv_raison_refus;
    }

    public void setLiv_raison_refus(String liv_raison_refus) {
        this.liv_raison_refus = liv_raison_refus;
    } 
    
    public Integer getNum_livraison() {
        return num_livraison;
    }

    public void setNum_livraison(Integer num_livraison) {
        this.num_livraison = num_livraison;
    }
}
