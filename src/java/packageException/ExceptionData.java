/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageException;

/**
 *
 * @author Charley
 */
public class ExceptionData {
    private String messageErreur;
    
    public ExceptionData (String mE) {
        this.messageErreur=mE;
            }
    
    @Override
    public String toString() {
        return messageErreur;
    }
    
}
