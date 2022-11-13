package dao;

import model.SqlConnection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CivilState;

public class CivilStateDaoImp implements CivilStateDao{
    private SqlConnection Connection;
    private Statement st;
    private ResultSet rs;

    @Override
    public List<CivilState> findAll() {
        List<CivilState> civilStates = new ArrayList<>();
        try {
        String sql = "SELECT * FROM estados_civil";
        Connection = new SqlConnection();    
        st = Connection.getCon().createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            CivilState civilState = new CivilState();
            civilState.setId(rs.getInt("id"));
            civilState.setName(rs.getString("nombre"));
            civilState.setDescription(rs.getString("descripcion"));
            civilStates.add(civilState);
        }
        st.close();
        rs.close();
        Connection.getCon().close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            //TODO metodos graficoa
        }
        return civilStates;
    }
}
