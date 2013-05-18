/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageView;

import packageController.Controller;
import packageException.ExceptionData;
import packageModel.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Charley
 */
public class ExpediteurModel extends AbstractTableModel{
    private ArrayList<String> columnNames = new ArrayList<String>();
    private ArrayList<Expediteur> contents = new ArrayList<Expediteur>();
    
    public ExpediteurModel(ArrayList<Expediteur> expediteur){
        this.contents = expediteur;
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
        Expediteur exp = contents.get(row);
        Controller controller = new Controller();
        try {
            switch (col) {
                case 0:
                    return exp;
                case 1:
                    return exp;
                case 2:
                    return exp;
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
                return Integer.class;
            case 2:
                return Integer.class;
            default:
                return String.class;
        }
    }
}
