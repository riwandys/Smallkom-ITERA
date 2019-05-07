/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author LAURENSIUS
 */
public class Alat {
    private String id_alat,id_ruangan,id_spesifikasi,kondisi;

    public Alat (String id_alat, String id_ruangan, String id_spesifikasi, String kondisi){
        this.id_alat=id_alat;
        this.id_ruangan=id_ruangan;
        this.id_spesifikasi=id_spesifikasi;
        this.kondisi=kondisi;
    }

    public String getId_alat() {
        return id_alat;
    }

    public String getId_ruangan() {
        return id_ruangan;
    }

    public String getId_spesifikasi() {
        return id_spesifikasi;
    }

    public String getKondisi() {
        return kondisi;
    }
    
    
    
}
