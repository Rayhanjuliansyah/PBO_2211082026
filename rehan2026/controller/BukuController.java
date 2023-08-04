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
public class BukuController {
    FormBuku formBuku;
    Buku buku;
    BukuDao dao;
    public BukuController(FormBuku formBuku) throws SQLException {
        this.formBuku = formBuku;
        try {
            dao = new BukuDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE,null,ex);
        
    }
    }
    public void clearForm() {
      formBuku.getTxtKodeBuku().setText("");
      formBuku.getTxtJudulBuku().setText("");
      formBuku.getTxtPengarang().setText("");
      formBuku.getTxtPenerbit().setText("");
    }
    public void insert(){
        try {
            buku = new Buku();
            buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
            buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
            buku.setPengarang(formBuku.getTxtPengarang().getText());
            buku.setPenerbit(formBuku.getTxtPenerbit().getText());
            dao.insert(buku);
            JOptionPane.showMessageDialog(formBuku, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formBuku, ex.getMessage());
        
    }
    }
    public void tampilTabel(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) formBuku.getTabelBuku().getModel();
            tabelModel.setRowCount(0);
            List<Buku> list = dao.getAll();
            for (Buku buku1 : list){
                Object [] row = {
                    buku1.getKodeBuku(),
                    buku1.getJudulBuku(),
                    buku1.getPengarang(),
                    buku1.getPenerbit(),
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void getBuku(){
        try {
            String kodeBuku = formBuku.getTabelBuku().getValueAt(formBuku.getTabelBuku()
                    .getSelectedRow(),0).toString();
            buku = dao.getBuku(kodeBuku);
            if(buku != null){
                formBuku.getTxtKodeBuku().setText(buku.getKodeBuku());
                formBuku.getTxtJudulBuku().setText(buku.getJudulBuku());
                formBuku.getTxtPengarang().setText(buku.getPengarang());
                formBuku.getTxtPenerbit().setText(buku.getPenerbit());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void update(){
        try {
            buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
            buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
            buku.setPengarang(formBuku.getTxtPengarang().getText());
            buku.setPenerbit(formBuku.getTxtPenerbit().getText());
            dao.update(buku);
            JOptionPane.showMessageDialog(formBuku, "Update Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formBuku, ex.getMessage());
        }
    }
      public void delete(){
        try {
            String kodeBuku = formBuku.getTxtKodeBuku().getText();
            dao.delete(kodeBuku);
            JOptionPane.showMessageDialog(formBuku, "Delete Ok");
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}