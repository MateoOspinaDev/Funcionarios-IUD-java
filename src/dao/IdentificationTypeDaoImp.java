package dao;

import java.util.ArrayList;
import java.util.List;
import model.IdentificationType;
import model.SqlConnection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdentificationTypeDaoImp implements IdentificationTypeDao{
    
    private SqlConnection Connection;
    private Statement st;
    private ResultSet rs;

    @Override
    public List<IdentificationType> findAll() {
        List<IdentificationType> idTypes = new ArrayList<>();
        try {
        String sql = "SELECT * FROM tipos_identificacion";
        Connection = new SqlConnection();    
        st = Connection.getCon().createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            IdentificationType identificationType = new IdentificationType();
            identificationType.setId(rs.getInt("id"));
            identificationType.setName(rs.getString("nombre"));
            identificationType.setDescription(rs.getString("descripcion"));
            idTypes.add(identificationType);
        }
        st.close();
        rs.close();
        Connection.getCon().close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            //TODO metodos graficoa
        }
        return idTypes;
    }
}
