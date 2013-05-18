/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageView;

import packageController.Controller;
import packageException.ExceptionData;
import packageModel.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Charley
 */
public class LivraisonModel extends AbstractTableModel{
    private ArrayList<String> columnNames = new ArrayList<String>();
    private ArrayList<Livraison> contents = new ArrayList<Livraison>();
    
    public LivraisonModel(ArrayList<Livraison> livraison){
        this.contents = livraison;
        this.columnNames.add("Numéro");
        this.columnNames.add("Numero de compte");
        this.columnNames.add("Fax");
    }
    @Override
    public int getColumnCount() {
        return columnNames.size();
    }
    
     @Override
    public int getRowCount() {
        return contents.size();
    }

    @Override
    public String getColumnName(int index) {
        return columnNames.get(index);
    }
    
    @Override
    public Object getValueAt(int row, int col) {
        Livraison liv = contents.get(row);
        Controller controller = new Controller();
        try {
            switch (col) {
                case 0:
                    return liv;
                case 1:
                    return liv;
                case 2:
                    return liv;
                case 3:
                    return liv;
                case 4:
                    return liv;
                case 5:
                    return liv;
                case 6:
                    return liv;
                case 7:
                    return liv;
                case 8:
                    return liv;
                case 9:
                    return liv;
                case 10:
                    return liv;
                case 11:
                    return liv;
                case 12:
                    return liv;
                default:
                    return null;
                        }
            }
         catch (ExceptionData x) {
            JOptionPane.showMessageDialog(null, x.toString(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 0:
                    return Integer.class;
                case 1:
                    return GregorianCalendar.class;
                case 2:
                    return GregorianCalendar.class;
                case 3:
                    return GregorianCalendar.class;
                case 4:
                    return Double.class;
                case 5:
                    return Boolean.class;
                case 6:
                    return GregorianCalendar.class;
                case 7:
                    return Double.class;
                case 8:
                    return Boolean.class;
                case 9:
                    return GregorianCalendar.class;
                case 10:
                    return Boolean.class;
                case 11:
                    return GregorianCalendar.class;
                case 12:
                    return String.class;
            default:
                return String.class;
        }
    }
}
