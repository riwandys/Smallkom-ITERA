/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author PORTAL
 */
public class laboran {
    private String id_laboran;
    private String password, id_ruangan, nama, kontak;
    
    public laboran(String id_laboran, String password, String id_ruangan, String nama, String kontak){
        this.id_laboran=id_laboran;
        this.password=password;
        this.id_ruangan=id_ruangan;
        this.nama=nama;
        this.kontak=kontak;
    }

    public String getId_laboran() {
        return id_laboran;
    }

    public String getPassword() {
        return password;
    }

    public String getId_ruangan() {
        return id_ruangan;
    }

    public String getNama() {
        return nama;
    }

    public String getKontak() {
        return kontak;
    }
}
