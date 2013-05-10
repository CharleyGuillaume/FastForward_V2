/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageView;

//import Controller.Controller;
import java.awt.event.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Charley
 */
public class WindowListenerClose extends WindowAdapter{

    public void WindowClosing(WindowEvent e) {
        //Controller controller= new Controller();

        int n = JOptionPane.showConfirmDialog(null, "Etes-vous sur de vouloir quitter l'application?", "Etes-vous sur de vouloir quitter l'application?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == JOptionPane.YES_OPTION) {
            System.out.println("yo yo yo");
            System.exit(0);
            /*try {
                //controller.CloseConnection();
                System.out.println("bonjour");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erreur lors de la fermeture", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
            System.exit(0);*/
        }
    }
}
