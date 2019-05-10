package smallkom.Proses;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import smallkom.Data.Laboran;

public class Proses {
    Connection con = JConnection.ConnectDb();
    
    public Laboran logIn (String username, String password){
        String sql = "select * from laboran where id_laboran = ? and password = ?";
        Laboran user;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String nama = rs.getString("nama");
                String kontak = rs.getString("kontak");
                String ruangan = rs.getString("id_ruangan");
                user = new Laboran(username, password, nama, kontak, ruangan);
                con.close();
                return user;
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
