package controller;

import dao.FunctionaryDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Functionary;

public class FunctionaryController {
    private final FunctionaryDao functionaryDao;

    public FunctionaryController(FunctionaryDao functionaryDao) {
        this.functionaryDao = functionaryDao;
    }
    
    public DefaultTableModel fillTable(){
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Id");
        model.addColumn("Numero doc");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Fecha Nac");
        List<Functionary> funtionaries = functionaryDao.findAll();
        String[] registros = new String[5];
        for(Functionary f:funtionaries){
            registros[0] = String.valueOf(f.getId());
            registros[1] = f.getIdentificationNumber();
            registros[2] = f.getName();
            registros[3] = f.getLastName();
            registros[4] = f.getBornDate().toString();
            model.addRow(registros);
        }
        return model;
    }
    
    public Functionary listarPorDocumento(String IdentificationNumber) {
        return this.functionaryDao.findByDocument(IdentificationNumber);
    }

    public int guardar(Functionary functionary) {
        return this.functionaryDao.save(functionary);
    }
    
    public void editar(Functionary functionary, String id) {
        this.functionaryDao.update(functionary, id);
    }
    
    public void eliminar(String IdentificationNumber) {
        this.functionaryDao.delete(IdentificationNumber);
    }
}
