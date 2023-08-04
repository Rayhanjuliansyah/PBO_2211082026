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

/**
 *
 * @author asus
 */
public class AnggotaDaoImpl implements AnggotaDao {
    Connection connection;
    
    public AnggotaDaoImpl(Connection connection){
        this.connection = connection;
    }

    public AnggotaDaoImpl() {
        
    }

    @Override
    public void insert(Anggota anggota) throws SQLException {
        String sql = "insert into anggota values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anggota.getNobp());
        ps.setString(2, anggota.getNama());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4,anggota.getJenisKelamin());
        ps.executeUpdate();
    }

    @Override
    public void update(Anggota anggota) throws SQLException {
        String sql = "update anggota set nama=?, alamat=?, jenis_kelamin=? where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anggota.getNama());
        ps.setString(2, anggota.getAlamat());
        ps.setString(3,anggota.getJenisKelamin());
        ps.setString(4, anggota.getNobp());
        ps.executeUpdate();
    }

    @Override
    public void delete(String nobp) throws SQLException {
        String sql = "delete from anggota where  nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.executeUpdate();   
    }

    @Override
    public Anggota getAnggota(String nobp) throws SQLException  {
        String sql = "select * from anggota where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        if(rs.next()){
            anggota = new Anggota();
            anggota.setNobp(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJenisKelamin(rs.getString(4));
        }
        return anggota;
    }

    @Override
    public List<Anggota> getAll() throws SQLException {
        String sql = "select * from anggota";
        PreparedStatement ps = connection.prepareStatement(sql);
        Anggota anggota = null;
        ResultSet rs = ps.executeQuery();
        List<Anggota> list = new ArrayList<>();
        while(rs.next()){
            anggota = new Anggota();
            anggota.setNobp(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJenisKelamin(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }
}
