package smallkom.Proses;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import smallkom.DataEntity.Laboran;
import smallkom.DataEntity.RuangLab;

public class Data {
    Connection con = JConnection.ConnectDb();
    public TreeSet<RuangLab> dataLab = new TreeSet<>();
    
    
//    public void fetchLabData(){
//        String sql = "SELECT * FROM ruangan";
//        try{
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                String idLab = rs.getString("id_ruangan");
//                String idLaboran = rs.getString("id_laboran");
//                String namaLab = rs.getString("nama_ruangan");
//                
//                con.close();
//            }
//        }catch(HeadlessException | SQLException e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
}
