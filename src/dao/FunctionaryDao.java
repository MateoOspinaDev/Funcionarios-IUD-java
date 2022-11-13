package dao;

import java.util.List;
import model.Functionary;

public interface FunctionaryDao {
    List<Functionary> findAll();
    Functionary findByDocument(String identificationNumber);
    int save(Functionary functionary);
    void update(Functionary functionary, String id);
    void delete(String identificationNumber);
}
