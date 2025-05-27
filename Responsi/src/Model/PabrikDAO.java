package Model;
import java.sql.*;
import java.util.*;
public class PabrikDAO {
    public void insert(ModelPabrik pabrik){
        try {
            String query = "INSERT INTO pabrik(nama, unit, jamkerja, tenagakerja, bahanbaku, biaya, efisiensi, totalproduksi) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, pabrik.getNama());
            statement.setFloat(2, pabrik.getUnit());
            statement.setFloat(3, pabrik.getJamkerja());
            statement.setFloat(4, pabrik.getTenagakerja());
            statement.setFloat(5, pabrik.getBahanbaku());
            statement.setFloat(6, pabrik.getBiaya());
            statement.setFloat(7, pabrik.getEfisiensi());
            statement.setFloat(8, pabrik.getTotalproduksi());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Input Failed:" + e.getLocalizedMessage());
        }
    }
    
    public void update(ModelPabrik pabrik){
        try {
            String query = "UPDATE pabrik SET nama=?, unit=?, jamkerja=?, tenagakerja=?, bahanbaku=?, biaya=?, efisiensi=?, totalproduksi=? WHERE id=?;";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, pabrik.getNama());
            statement.setFloat(2, pabrik.getUnit());
            statement.setFloat(3, pabrik.getJamkerja());
            statement.setFloat(4, pabrik.getTenagakerja());
            statement.setFloat(5, pabrik.getBahanbaku());
            statement.setFloat(6, pabrik.getJamkerja());
            statement.setFloat(7, pabrik.getTenagakerja());
            statement.setFloat(8, pabrik.getBahanbaku());
            statement.setInt(9, pabrik.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Update Failed:" + e.getLocalizedMessage());
        }
    }
    
    public void delete(int id){
        try {
            String query = "DELETE FROM pabrik WHERE id=?;";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Deleted Failed:" + e.getLocalizedMessage());
        }
    }
    
    public List<ModelPabrik> getAll(){
        List<ModelPabrik> listPabrik = null;
        try {
            listPabrik = new ArrayList<>();
            Statement statement = Connector.Connect().createStatement();
            String query = "Select * FROM pabrik";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {                
                ModelPabrik pb = new ModelPabrik();
                pb.setId(resultSet.getInt("id"));
                pb.setNama(resultSet.getString("nama"));
                pb.setUnit(resultSet.getFloat("unit"));
                pb.setJamkerja(resultSet.getFloat("jamkerja"));
                pb.setTenagakerja(resultSet.getFloat("tenagakerja"));
                pb.setBahanbaku(resultSet.getFloat("bahanbaku"));
                pb.setBiaya(resultSet.getFloat("biaya"));
                pb.setEfisiensi(resultSet.getFloat("efisiensi"));
                pb.setTotalproduksi(resultSet.getFloat("totalproduksi"));
                listPabrik.add(pb);
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getLocalizedMessage());
        }
       return listPabrik;
    }
}
