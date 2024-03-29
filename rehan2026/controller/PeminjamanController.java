/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehan2026.controller;

/**
 *
 * @author asus
 */
public class PeminjamanController {
    FormPeminjaman formPeminjaman;
    Peminjaman peminjmana;
    PeminjamanDao peminjamandao;
    AnggotaDao anggotadao;
    

    public PeminjamanController(FormPeminjaman formPeminjaman) throws SQLException {
        this.formPeminjaman = formPeminjaman;
        try {
            peminjamandao = new PeminjamanDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    public void clearForm() {
        formPeminjaman.getCboNobp().setText("");
        formPeminjaman.getTxtKodeBuku().setText("");
        formPeminjaman.getTxtAlamat().setText("");
        formPeminjaman.getCboJenisKelamin().removeAllItems();
        formPeminjaman.getCboJenisKelamin().addItem("L");
        formAnggota.getCboJenisKelamin().addItem("P");
    }
    public void insert(){
        try {
            anggota = new Anggota();
            anggota.setNobp(formAnggota.getTxtNobp().getText());
            anggota.setNama(formAnggota.getTxtNama().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
            dao.insert(anggota);
            JOptionPane.showMessageDialog(formAnggota, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formAnggota, ex.getMessage());
        }
    }
    public void tampilTabel(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) formAnggota.getTblAnggota().getModel();
            tabelModel.setRowCount(0);
            List<Anggota> list = dao.getAll();
            for (Anggota anggota1 : list){
                Object [] row = {
                    anggota1.getNobp(),
                    anggota1.getNama(),
                    anggota1.getAlamat(),
                    anggota1.getJenisKelamin(),
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getAnggota(){
        try {
            String nobp = formAnggota.getTblAnggota().getValueAt(formAnggota.getTblAnggota()
                    .getSelectedRow(),0).toString();
            anggota = dao.getAnggota(nobp);
            if(anggota != null){
                formAnggota.getTxtNobp().setText(anggota.getNobp());
                formAnggota.getTxtNama().setText(anggota.getNama());
                formAnggota.getTxtAlamat().setText(anggota.getAlamat());
                formAnggota.getCboJenisKelamin().setSelectedItem(anggota.getJenisKelamin());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(){
        try {
            anggota.setNobp(formAnggota.getTxtNobp().getText());
            anggota.setNama(formAnggota.getTxtNama().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
            dao.update(anggota);
            JOptionPane.showMessageDialog(formAnggota, "Update Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formAnggota, ex.getMessage());
        }
    }
    public void delete(){
        try {
            String nobp = formAnggota.getTxtNobp().getText();
            dao.delete(nobp);
            JOptionPane.showMessageDialog(formAnggota, "Delete Ok");
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
