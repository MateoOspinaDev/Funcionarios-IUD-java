package dao;

import java.util.List;
import model.IdentificationType;

public interface IdentificationTypeDao {
    List<IdentificationType> findAll();
}
