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
public class ColisModel extends AbstractTableModel{
    private ArrayList<String> columnNames = new ArrayList<String>();
    private ArrayList<Colis> contents = new ArrayList<Colis>();
    
    public ColisModel(ArrayList<Colis> colis){
        this.contents = colis;
        this.columnNames.add("Numéro");
        this.columnNames.add("Libellé");
        this.columnNames.add("Poids");
        this.columnNames.add("Fragile");
        this.columnNames.add("Dimensions");
        this.columnNames.add("Enlèvement accepté");
        this.columnNames.add("Raison refus enlèvement");
        this.columnNames.add("livraison acceptée");
        this.columnNames.add("raison refus livraison");
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
        Colis colis = contents.get(row);
        Controller controller = new Controller();
        try {
            switch (col) {
                case 0:
                    return colis;
                case 1:
                    return colis;
                case 2:
                    return colis;
                case 3:
                    return colis;
                case 4:
                    return colis;
                case 5:
                    return colis;
                case 6:
                    return colis;
                case 7:
                    return colis;
                case 8:
                    return colis;
                case 9:
                    return colis;
                case 10:
                    return colis;
                case 11:
                    return colis;
                case 12:
                    return colis;
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
