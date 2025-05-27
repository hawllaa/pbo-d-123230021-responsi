/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import View.TabelPabrik;
import java.util.*;
import javax.swing.*;
public class ControllerPabrik {
    TabelPabrik halamanPabrik;
    PabrikDAO daoPabrik;
    List<ModelPabrik> daftarPabrik;
    
    public ControllerPabrik(TabelPabrik halamanPabrik){
        this.halamanPabrik = halamanPabrik;
        daoPabrik = new PabrikDAO();    
    }
    
    public void showAllPabrik(){
        daftarPabrik = daoPabrik.getAll();
        ModelTabelPabrik table = new ModelTabelPabrik(daftarPabrik);
        halamanPabrik.getTablePabrik().setModel(table);
    }
    
    public void insertPabrik(){
        try {
            ModelPabrik pabrikBaru = new ModelPabrik();
            String produk = halamanPabrik.getLblProduk();
            float unit = halamanPabrik.getLblUnit();
            float jam = halamanPabrik.getLblJam();
            float tenaga = halamanPabrik.getLblTenaga();
            float bahan = halamanPabrik.getLblBiaya();
            float biaya = jam * tenaga * 15000;
            float efisiensi = (unit / (jam*tenaga)) * 100;
            float totalproduksi = biaya + efisiensi;
            
            pabrikBaru.setNama(produk);
            pabrikBaru.setUnit(unit);
            pabrikBaru.setJamkerja(jam);
            pabrikBaru.setTenagakerja(tenaga);
            pabrikBaru.setBahanbaku(bahan);
            pabrikBaru.setBiaya(biaya);
            pabrikBaru.setEfisiensi(efisiensi);
            pabrikBaru.setTotalproduksi(totalproduksi);
            
            new TabelPabrik();
            
        } catch (Exception e) {
        }
    }
    
}
