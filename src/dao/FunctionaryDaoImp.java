package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Functionary;
import model.SqlConnection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import model.CivilState;
import model.IdentificationType;
import utils.Messages;

public class FunctionaryDaoImp implements FunctionaryDao{

    private SqlConnection connection;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pSt;
    
    
    @Override
    public List<Functionary> findAll() {
        List<Functionary> functionaries = new ArrayList<>();
        try {
        String sql = "SELECT * FROM funcionarios";
        connection = new SqlConnection();    
        st = connection.getCon().createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            Functionary functionary = new Functionary();
            functionary.setId(rs.getInt("id"));
            functionary.setName(rs.getString("nombres"));
            functionary.setLastName(rs.getString("apellidos"));
            functionary.setIdentificationNumber(rs.getString(String.valueOf("numero_identificacion")));
            functionary.setAdress(rs.getString("direccion"));
            functionary.setPhoneNumber(rs.getString("telefono"));
            functionary.setBornDate(LocalDate.parse(rs.getString("fecha_nacimiento")));
            functionaries.add(functionary);
        }
        st.close();
        rs.close();
        connection.getCon().close();
        } catch (SQLException var5) {
            Messages.ErrorMessage("Error de BBDD", var5.getMessage());
        }
        return functionaries;
    }

    @Override
    public Functionary findByDocument(String identificationNumber) {
        Functionary functionary = new Functionary();
        String sql = "SELECT * FROM funcionarios WHERE numero_identificacion=?";
        this.connection = new SqlConnection();

        try {
            this.pSt = this.connection.getCon().prepareStatement(sql);
            this.pSt.setString(1, identificationNumber);
            this.rs = this.pSt.executeQuery();
            if (this.rs.first()) {
                functionary.setId(this.rs.getInt("id"));
                functionary.setIdentificationNumber(this.rs.getString("numero_identificacion"));
                functionary.setName(this.rs.getString("nombres"));
                functionary.setLastName(this.rs.getString("apellidos"));
                functionary.setAdress(this.rs.getString("direccion"));
                functionary.setPhoneNumber(this.rs.getString("telefono"));
                functionary.setBornDate(LocalDate.parse(this.rs.getString("fecha_nacimiento")));
                functionary.setSex(this.rs.getString("sexo").charAt(0));
                int civilStateId = this.rs.getInt("estados_civil_id");
                CivilState civilState = new CivilState(civilStateId);
                int identificationTypeId = this.rs.getInt("tipos_identificacion_id");
                IdentificationType identificationType = new IdentificationType(identificationTypeId);
                functionary.setCivilState(civilState);
                functionary.setIdentificationType(identificationType);
            }

            this.pSt.close();
            this.rs.close();
            this.connection.getCon().close();
        } catch (SQLException var5) {
            Messages.ErrorMessage("Error de BBDD", var5.getMessage());
        }

        return functionary;
    }

    @Override
    public int save(Functionary functionary) {
        int resultado = 0;
        String sql = "INSERT INTO funcionarios(    numero_identificacion,    nombres,    apellidos,    sexo,    direccion,    telefono,    fecha_nacimiento,    tipos_identificacion_id,    estados_civil_id)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        this.connection = new SqlConnection();

        try {
            this.pSt = this.connection.getCon().prepareStatement(sql);
            this.pSt.setString(1, functionary.getIdentificationNumber());
            this.pSt.setString(2, functionary.getName());
            this.pSt.setString(3, functionary.getLastName());
            this.pSt.setString(4, String.valueOf(functionary.getSex()));
            this.pSt.setString(5, functionary.getAdress());
            this.pSt.setString(6, functionary.getPhoneNumber());
            this.pSt.setString(7, functionary.getBornDate().toString());
            this.pSt.setInt(8, functionary.getIdentificationType().getId());
            this.pSt.setInt(9, functionary.getCivilState().getId());
            resultado = this.pSt.executeUpdate();
            this.pSt.close();
            this.connection.getCon().close();
        } catch (SQLException var5) {
            Messages.ErrorMessage("Error de BBDD", var5.getMessage());
        }

        return resultado;
    }

    @Override
    public void update(Functionary functionary, String id) {
        this.connection = new SqlConnection();
        String sql = "update funcionarios set nombres=?,    apellidos=?,    sexo=?,    direccion=?,    telefono=?,    fecha_nacimiento=?,    tipos_identificacion_id=?,    estados_civil_id=? WHERE numero_identificacion=?";
        try {
            this.pSt = this.connection.getCon().prepareStatement(sql);
            this.pSt.setString(1, functionary.getName());
            this.pSt.setString(2, functionary.getLastName());
            this.pSt.setString(3, String.valueOf(functionary.getSex()));
            this.pSt.setString(4, functionary.getAdress());
            this.pSt.setString(5, functionary.getPhoneNumber());
            this.pSt.setString(6, functionary.getBornDate().toString());
            this.pSt.setInt(7, functionary.getIdentificationType().getId());
            this.pSt.setInt(8, functionary.getCivilState().getId());
            this.pSt.setString(9, id);
            this.pSt.executeUpdate();
            this.pSt.close();
            this.connection.getCon().close();
        } catch (SQLException var5) {
            Messages.ErrorMessage("Error de BBDD", var5.getMessage());
        }
    }

    @Override
    public void delete(String identificationNumber) {
        String sql = "DELETE FROM funcionarios WHERE numero_identificacion=?";
        this.connection = new SqlConnection();
        try {
            this.pSt = this.connection.getCon().prepareStatement(sql);
            this.pSt.setString(1, identificationNumber);
            this.pSt.executeUpdate();
            this.connection.getCon().close();
        } catch (SQLException var4) {
            Messages.ErrorMessage("Error de BBDD", var4.getMessage());
        }
    }
}
