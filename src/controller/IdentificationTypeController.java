package controller;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.IdentificationType;
import dao.IdentificationTypeDao;

public class IdentificationTypeController {
    
    private final IdentificationTypeDao identificationTypeDao;

    public IdentificationTypeController(IdentificationTypeDao identificationTypeDao) {
        this.identificationTypeDao = identificationTypeDao;
    }
    
    public DefaultComboBoxModel fillCombo(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        List<IdentificationType> idsType = identificationTypeDao.findAll();
        for(IdentificationType t:idsType){
            model.addElement(t.getDescription());
        }
        return model;
    }
}
