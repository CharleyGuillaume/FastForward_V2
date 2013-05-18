/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageModel;
/**
 *
 * @author Charley
 */
public class Livraison {

    private int idnumero;
    private int date_demande;
    private int date_depot;
    private int date_enlevement;
    private int prix_livraison;
    private int livraison_payee;
    private int date_paiement_livraison;
    private int montant_contreremb;
    private int contreremb_dest_paye;
    private int date_paiement_contreremb_dest;
    private int contreremb_exp_paye;
    private int date_paiement_contreremb_exp;
    private int etat;

    public Livraison(int idnumero, int date_demande, int date_depot, int date_enlevement, int prix_livraison, int livraison_payee, int date_paiement_livraison, int montant_contreremb, int contreremb_dest_paye, int date_paiement_contreremb_dest, int contreremb_exp_paye, int date_paiement_contreremb_exp, int etat) {
        this.idnumero = idnumero;
        this.date_demande = date_demande;
        this.date_depot = date_depot;
        this.date_enlevement = date_enlevement;
        this.prix_livraison = prix_livraison;
        this.livraison_payee = livraison_payee;
        this.date_paiement_livraison = date_paiement_livraison;
        this.montant_contreremb = montant_contreremb;
        this.contreremb_dest_paye = contreremb_dest_paye;
        this.date_paiement_contreremb_dest = date_paiement_contreremb_dest;
        this.contreremb_exp_paye = contreremb_exp_paye;
        this.date_paiement_contreremb_exp = date_paiement_contreremb_exp;
        this.etat = etat;
    }

    public int getContreremb_dest_paye() {
        return contreremb_dest_paye;
    }

    public void setContreremb_dest_paye(int contreremb_dest_paye) {
        this.contreremb_dest_paye = contreremb_dest_paye;
    }

    public int getContreremb_exp_paye() {
        return contreremb_exp_paye;
    }

    public void setContreremb_exp_paye(int contreremb_exp_paye) {
        this.contreremb_exp_paye = contreremb_exp_paye;
    }

    public int getDate_demande() {
        return date_demande;
    }

    public void setDate_demande(int date_demande) {
        this.date_demande = date_demande;
    }

    public int getDate_depot() {
        return date_depot;
    }

    public void setDate_depot(int date_depot) {
        this.date_depot = date_depot;
    }

    public int getDate_enlevement() {
        return date_enlevement;
    }

    public void setDate_enlevement(int date_enlevement) {
        this.date_enlevement = date_enlevement;
    }

    public int getDate_paiement_contreremb_dest() {
        return date_paiement_contreremb_dest;
    }

    public void setDate_paiement_contreremb_dest(int date_paiement_contreremb_dest) {
        this.date_paiement_contreremb_dest = date_paiement_contreremb_dest;
    }

    public int getDate_paiement_contreremb_exp() {
        return date_paiement_contreremb_exp;
    }

    public void setDate_paiement_contreremb_exp(int date_paiement_contreremb_exp) {
        this.date_paiement_contreremb_exp = date_paiement_contreremb_exp;
    }

    public int getDate_paiement_livraison() {
        return date_paiement_livraison;
    }

    public void setDate_paiement_livraison(int date_paiement_livraison) {
        this.date_paiement_livraison = date_paiement_livraison;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public int getIdnumero() {
        return idnumero;
    }

    public void setIdnumero(int idnumero) {
        this.idnumero = idnumero;
    }

    public int getLivraison_payee() {
        return livraison_payee;
    }

    public void setLivraison_payee(int livraison_payee) {
        this.livraison_payee = livraison_payee;
    }

    public int getMontant_contreremb() {
        return montant_contreremb;
    }

    public void setMontant_contreremb(int montant_contreremb) {
        this.montant_contreremb = montant_contreremb;
    }

    public int getPrix_livraison() {
        return prix_livraison;
    }

    public void setPrix_livraison(int prix_livraison) {
        this.prix_livraison = prix_livraison;
    }
}
