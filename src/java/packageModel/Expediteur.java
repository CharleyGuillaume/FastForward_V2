package packageModel;

public class Expediteur {

    private Integer idnumero;
    private Integer num_compte;
    private Integer fax;

    public Expediteur (){
        
    }
    
    public Expediteur(Integer idnumero, Integer num_compte, Integer fax) {
        this.idnumero = idnumero;
        this.num_compte = num_compte;
        this.fax = fax;
    }
 
    public Integer getIdnumero() {
        return idnumero;
    }

    public void setIdnumero(Integer idnumero) {
        this.idnumero = idnumero;
    }

    public Integer getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(Integer num_compte) {
        this.num_compte = num_compte;
    }
    public Integer getFax() {
        return fax;
    }

    public void setFax(Integer fax) {
        this.fax = fax;
    }
}