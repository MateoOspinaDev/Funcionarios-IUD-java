package iudigitalrecursoshumanos;

import controller.FunctionaryController;
import dao.CivilStateDaoImp;
import dao.FunctionaryDao;
import dao.FunctionaryDaoImp;
import dao.IdentificationTypeDaoImp;
import model.SqlConnection;

public class IUDigitalRecursosHumanos {

    public static void main(String[] args) {
        SqlConnection connection = new SqlConnection();
        connection.getCon();
        FunctionaryController functionaryDao = new FunctionaryController(new FunctionaryDaoImp());
        System.out.println(functionaryDao.listarPorDocumento("1").getBornDate()); 
    }
    
}
