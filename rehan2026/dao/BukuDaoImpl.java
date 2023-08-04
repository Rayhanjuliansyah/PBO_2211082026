/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehan2026.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import rehan2026.model.Anggota;
import rehan2026.model.Buku;

/**
 *
 * @author asus
 */
public class BukuDaoImpl implements BukuDao{
    Connection connection;
    
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    }

    public BukuDaoImpl() {
        
    }

    @Override
    public void insert(Buku buku) throws SQLException {
        String sql = "insert into buku values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4,buku.getPenerbit());
        ps.executeUpdate();
    }

    @Override
    public void update(Buku buku) throws SQLException {
      String sql = "update buku set judulbuku=?, pengarang=?, penerbit=? where kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getJudulBuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3,buku.getPenerbit());
        ps.setString(4, buku.getKodeBuku());
        ps.executeUpdate();
    }

    @Override
    public void delete(String kodeBuku) throws SQLException {
      String sql = "delete from buku where  kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeBuku);
        ps.executeUpdate();   
    }

    @Override
    public Buku getBuku(String kodeBuku) throws SQLException {
      String sql = "select * from buku where kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeBuku);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
        }
        return buku;
    }

    @Override
    public List<Buku> getAll() throws SQLException {
       String sql = "select * from buku";
        PreparedStatement ps = connection.prepareStatement(sql);
        Buku buku = null;
        ResultSet rs = ps.executeQuery();
        List<Buku> list = new ArrayList<>();
        while(rs.next()){
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            list.add(buku);
        }
        return list;
    }

    @Override
    public void insert(Buku buku) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Buku buku) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
