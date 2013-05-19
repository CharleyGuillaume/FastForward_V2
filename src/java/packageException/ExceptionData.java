/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageException;

/**
 *
 * @author Charley
 */
public class ExceptionData extends Exception{
    private String messageErreur;
    
    public ExceptionData (String mE) {
        this.messageErreur=mE;
            }

    public ExceptionData(String a, Exception e) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    @Override
    public String toString() {
        return messageErreur;
    }
    
}
