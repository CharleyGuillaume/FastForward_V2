package packageModel;

public class Adresse {
// Pr�voir des variables d'instance de type r�f�rence et non de type primitif, afin de g�rer les attributs/colocnnes facultatifs
// int -> Integer
    private Integer idnumero;
    private String societe;
    private String nom;
    private String prenom;
    private String adr_rue;
    private Integer adr_num;
    private Integer adr_cp;
    private String adr_ville;
    private String adr_pays;
    private String mail;
    private Integer tel;

    public Adresse(){
        
    }
    
    public Adresse(Integer idnumero, String societe, String nom, String prenom, String adr_rue, Integer adr_num, Integer adr_cp, String adr_ville, String adr_pays, String mail, Integer tel) {
        this.idnumero = idnumero;
        this.societe = societe;
        this.nom = nom;
        this.prenom = prenom;
        this.adr_rue = adr_rue;
        this.adr_num = adr_num;
        this.adr_cp = adr_cp;
        this.adr_ville = adr_ville;
        this.adr_pays = adr_pays;
        this.mail = mail;
        this.tel = tel;
    }

    public Integer getIdnumero() {
        return idnumero;
    }

    public void setIdnumero(Integer idnumero) {
        this.idnumero = idnumero;
    }
    
        public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getAdr_rue() {
        return adr_rue;
    }

    public void setAdr_rue(String adr_rue) {
        this.adr_rue = adr_rue;
    }
    
     public Integer getAdr_num() {
        return adr_num;
    }

    public void setAdr_num(Integer adr_num) {
        this.adr_num = adr_num;
    }

    public Integer getAdr_cp() {
        return adr_cp;
    }

    public void setAdr_cp(Integer adr_cp) {
        this.adr_cp = adr_cp;
    }
    
    public String getAdr_ville() {
        return adr_ville;
    }

    public void setAdr_ville(String adr_ville) {
        this.adr_ville = adr_ville;
    }
    
    public String getAdr_pays() {
        return adr_pays;
    }

    public void setAdr_pays(String adr_pays) {
        this.adr_pays = adr_pays;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }
}
