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
public class AdresseModel extends AbstractTableModel {

    private ArrayList<String> columnNames = new ArrayList<String>();
    private ArrayList<Adresse> contents = new ArrayList<Adresse>();

    public AdresseModel(ArrayList<Adresse> adresse) {
        this.contents = adresse;
        this.columnNames.add("Numéro");
        this.columnNames.add("Société");
        this.columnNames.add("Nom");
        this.columnNames.add("Prénom");
        this.columnNames.add("Adresse");
        this.columnNames.add("Mail");
        this.columnNames.add("Téléphone");
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
        Adresse adr = contents.get(row);
        Controller controller = new Controller();
        try {
            switch (col) {
                case 0:
                    return adr;
                case 1:
                    return adr;
                case 2:
                    return adr;
                case 3:
                    return adr;
                case 4:
                    return adr;
                case 5:
                    return adr;
                case 6:
                    return adr;
                default:
                    return null;
            }
        } catch (ExceptionData x) {
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
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return Integer.class;
            default:
                return String.class;
        }
    }
}
