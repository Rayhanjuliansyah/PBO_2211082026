/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehan2026.dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import rehan2026.model.Anggota;
import rehan2026.model.Peminjaman;

/**
 *
 * @author asus
 */
public class Peminjamandaoimpl {
    

    public void insert(Peminjaman peminjaman) throws SQLException {
        String sql = "insert into peminjaman values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4,peminjaman.getTglKembali());
        ps.executeUpdate();
    }

    public void update(Peminjaman peminjaman) throws SQLException {
      String sql = "update peminjaman set tglKembali=?"+ "  where nobp=? and kodeBuku=? and tglPinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4,peminjaman.getTglKembali());
        ps.executeUpdate();
    }

    public void delete(Peminjaman peminjaman) throws SQLException {
      String sql = "delete peminjaman set tglKembali=?"+ "  where nobp=? and kodeBuku=? and tglPinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4,peminjaman.getTglKembali());
        ps.executeUpdate();

    }

    @Override
    public Peminjaman getPeminjaman(String kodeBuku) throws SQLException {
      String sql = "select * from peminjaman where kodebuku=?"+ "  where nobp=? and tglkembali=? and tglPinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeBuku);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return peminjaman;
    }

    @Override
    public List<Peminjaman> getAll() throws SQLException {
       String sql = "select * from peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        Peminjaman peminjaman = null;
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> list = new ArrayList<>();
        while(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }
    
}
