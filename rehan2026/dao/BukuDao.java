/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehan2026.dao;
import rehan2026.model.Buku;
import java.sql.SQLException;
import java.util.List;
import rehan2026.model.Anggota;

/**
 *
 * @author asus
 */
public interface BukuDao {
    void insert(Buku buku) throws SQLException;
    void update(Buku buku) throws SQLException;
    void delete(String kodeBuku) throws SQLException;
    Buku getBuku(String kodeBuku) throws SQLException;
    public List<Buku> getAll() throws SQLException;
}
