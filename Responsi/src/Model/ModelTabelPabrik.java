package Model;
import java.util.*;
import javax.swing.table.*;
public class ModelTabelPabrik {
    List<ModelPabrik> daftarPabrik;
    String kolom[] = {"ID","Nama Produk","Jumlah Unit","Jam Kerja","Jumlah Tenaga Kerja","Biaya Bahan Baku","Biaya Tenaga Kerja","Efisiensi Produk","Total Biaya Produksi"};
    public ModelTabelPabrik(List<ModelPabrik> daftarPabrik){
        this.daftarPabrik = daftarPabrik;
    }
    
    public int getRowCount(){
        return daftarPabrik.size();
    }
    
    public int getColumnCount(){
        return kolom.length;
    } 
    
    public Object getValueat(int rowIndex, int columnIndex){
        switch (columnIndex) {
            case 0:
                return daftarPabrik.get(rowIndex).getId();
            case 1:
                return daftarPabrik.get(rowIndex).getNama();     
            case 2:
                return daftarPabrik.get(rowIndex).getUnit();     
            case 3:
                return daftarPabrik.get(rowIndex).getJamkerja();
            case 4:
                return daftarPabrik.get(rowIndex).getTenagakerja();     
            case 5:
                return daftarPabrik.get(rowIndex).getBahanbaku();     
            case 6:
                return daftarPabrik.get(rowIndex).getBiaya();
            case 7:
                return daftarPabrik.get(rowIndex).getEfisiensi();     
            case 8:
                return daftarPabrik.get(rowIndex).getTotalproduksi();     
            default:
                return null;
        }
    } 
    
    public String getColumnName(int columnIndex){
        return kolom[columnIndex];
    }
                               
}
