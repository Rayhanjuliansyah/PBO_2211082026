/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehan2026.dao;
import java.sql.SQLException;
import java.util.List;
import rehan2026.model.Anggota;
import rehan2026.model.Peminjaman;

/**
 *
 * @author asus
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(Peminjaman peminjaman) throws SQLException;
    Peminjaman getPeminjaman(String nobp) throws SQLException;
    public List<Peminjaman> getAll() throws SQLException;
}
