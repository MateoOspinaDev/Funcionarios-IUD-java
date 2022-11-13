/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CivilStateDao;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.CivilState;

public class CivilStateController {
    private final CivilStateDao civilStateDao;

    public CivilStateController(CivilStateDao civilStateDao) {
        this.civilStateDao = civilStateDao;
    }
    
    public DefaultComboBoxModel fillCombo(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        List<CivilState> civilsStates = civilStateDao.findAll();
        for(CivilState t:civilsStates){
            model.addElement(t.getDescription());
        }
        return model;
    }
}
