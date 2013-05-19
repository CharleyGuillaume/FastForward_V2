package packageModel;

import java.util.GregorianCalendar;

public class Livraison {

    private Integer idnumero;
    private GregorianCalendar date_demande;
    private GregorianCalendar date_depot;
    private GregorianCalendar date_enlevement;
    private double prix_livraison;
    private boolean livraison_payee;
    private GregorianCalendar date_paiement_livraison;
    private double montant_contreremb;
    private boolean contreremb_dest_paye;
    private GregorianCalendar date_paiement_contreremb_dest;
    private boolean contreremb_exp_paye;
    private GregorianCalendar date_paiement_contreremb_exp;
    private String etat;

    public Livraison(Integer idnumero, GregorianCalendar date_demande, GregorianCalendar date_depot, GregorianCalendar date_enlevement, double prix_livraison, boolean livraison_payee, GregorianCalendar date_paiement_livraison, double montant_contreremb, boolean contreremb_dest_paye, GregorianCalendar date_paiement_contreremb_dest, boolean contreremb_exp_paye, GregorianCalendar date_paiement_contreremb_exp, String etat) {
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

    public Integer getIdnumero() {
        return idnumero;
    }

    public void setIdnumero(Integer idnumero) {
        this.idnumero = idnumero;
    }

    public GregorianCalendar getDate_demande() {
        return date_demande;
    }

    public void setDate_demande(GregorianCalendar date_demande) {
        this.date_demande = date_demande;
    }

    public GregorianCalendar getDate_depot() {
        return date_depot;
    }

    public void setDate_depot(GregorianCalendar date_depot) {
        this.date_depot = date_depot;
    }

    public GregorianCalendar getDate_enlevement() {
        return date_enlevement;
    }

    public void setDate_enlevement(GregorianCalendar date_enlevement) {
        this.date_enlevement = date_enlevement;
    }

    public double getPrix_livraison() {
        return prix_livraison;
    }

    public void setPrix_livraison(double prix_livraison) {
        this.prix_livraison = prix_livraison;
    }

    public boolean getLivraison_payee() {
        return livraison_payee;
    }

    public void setLivraison_payee(boolean livraison_payee) {
        this.livraison_payee = livraison_payee;
    }

    public GregorianCalendar getDate_paiement_livraison() {
        return date_paiement_livraison;
    }

    public void setDate_paiement_livraison(GregorianCalendar date_paiement_livraison) {
        this.date_paiement_livraison = date_paiement_livraison;
    }

    public double getMontant_contreremb() {
        return montant_contreremb;
    }

    public void setMontant_contreremb(double montant_contreremb) {
        this.montant_contreremb = montant_contreremb;
    }

    public boolean getContreremb_dest_paye() {
        return contreremb_dest_paye;
    }

    public void setContreremb_dest_paye(boolean contreremb_dest_paye) {
        this.contreremb_dest_paye = contreremb_dest_paye;
    }

    public GregorianCalendar getDate_paiement_contreremb_dest() {
        return date_paiement_contreremb_dest;
    }

    public void setDate_paiement_contreremb_dest(GregorianCalendar date_paiement_contreremb_dest) {
        this.date_paiement_contreremb_dest = date_paiement_contreremb_dest;
    }

    public boolean getContreremb_exp_paye() {
        return contreremb_exp_paye;
    }

    public void setContreremb_exp_paye(boolean contreremb_exp_paye) {
        this.contreremb_exp_paye = contreremb_exp_paye;
    }

    public GregorianCalendar getDate_paiement_contreremb_exp() {
        return date_paiement_contreremb_exp;
    }

    public void setDate_paiement_contreremb_exp(GregorianCalendar date_paiement_contreremb_exp) {
        this.date_paiement_contreremb_exp = date_paiement_contreremb_exp;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}