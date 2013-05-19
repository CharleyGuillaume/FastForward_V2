package packageModel;

public class Depot {

    private Integer idnumero;
    private String libelle;
    private boolean dispatch;
    private String infos_pratiques;

    public Depot(){
        
    }
    
    public Depot(Integer idnumero, String libelle, boolean dispatch, String infos_pratiques) {
        this.idnumero = idnumero;
        this.libelle = libelle;
        this.dispatch = dispatch;
        this.infos_pratiques = infos_pratiques;
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

    public boolean getDispatch() {
        return dispatch;
    }

    public void setDispatch(boolean dispatch) {
        this.dispatch = dispatch;
    }

    public String getInfos_pratiques() {
        return infos_pratiques;
    }

    public void setInfos_pratiques(String infos_pratiques) {
        this.infos_pratiques = infos_pratiques;
    }
}
