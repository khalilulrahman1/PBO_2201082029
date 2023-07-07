/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalilul.controller;
import khalilul.model.*;
import khalilul.dao.*;
import khalilul.view.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman peminjaman;
    PeminjamanDao dao;
    BukuDao bukuDao;
    AnggotaDao anggotaDao;

    public PeminjamanController(FormPeminjaman view) {
        this.view = view;
        dao = new PeminjamanDaoImple();
        anggotaDao = new AnggotaDaoImple();
        bukuDao = new BukuDaoImple();
    }
    
    //buat clearForm
    public void clearForm(){
//        view.getKodeAnggota().setText("");
//        view.getKodeBuku().setText("");
        view.getTglPinjam().setText("");
        view.getTglKembali().setText("");
    }
    
    
    //mengambil nilai dari sesuatu yang telah ada
    public void isiCombo(){  
        // mengisi kombo anggota 
        view.getCboAnggota().removeAllItems();
        List<Anggota> listAnggota = anggotaDao.getAll();
        for(Anggota anggota : listAnggota){
            view.getCboAnggota().addItem(anggota.getKodeAnggota());
        }
        
        // mengisi  kombo buku
        view.getCboBuku().removeAllItems();
        List<Buku> listBuku= bukuDao.getAll();
        for(Buku buku : listBuku){
            view.getCboBuku().addItem(buku.getKodeBuku());
        }
    }
    
    //buat tampilan
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel)view.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = dao.getAll();
        for(Peminjaman c : list){
           Object[] row = {
               c.getKodeAnggota(),
               c.getKodeBuku(),
               c.getTglPinjam(),
               c.getTglKembali(),
               c.getSelisih()
           };
           tabelModel.addRow(row);
        }
    }
    
    //aktif buton insert
    public void insert(){
        peminjaman = new Peminjaman();
        peminjaman.setKodeAnggota(view.getCboAnggota().getSelectedItem().toString());
        peminjaman.setKodeBuku(view.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglPinjam(view.getTglPinjam().getText());  // perlakuan ke tipe selain string beda
        peminjaman.setTglKembali(view.getTglKembali().getText());
        dao.insert(peminjaman);
        JOptionPane.showMessageDialog(view, "Data Insert OK!");
    }
    
    // aktif buton update
    public void update(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman.setKodeAnggota(view.getCboAnggota().getSelectedItem().toString());
        peminjaman.setKodeBuku(view.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglPinjam(view.getTglPinjam().getText());
        peminjaman.setTglKembali(view.getTglKembali().getText());
        dao.update(index, peminjaman);
        JOptionPane.showMessageDialog(view, "Data Update OK!");
    }
    
    // buton delete
    public void delete(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Data Delete OK!");
    }
    
    // data gel All
    public void getPeminjaman(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman = dao.getPeminjaman(index);
        view.getCboAnggota().setSelectedItem(peminjaman.getKodeAnggota());
        view.getCboBuku().setSelectedItem(peminjaman.getKodeBuku());
        view.getTglPinjam().setText(peminjaman.getTglPinjam());
        view.getTglKembali().setText(peminjaman.getTglPinjam());
        
    }
    
    
    
    
    
}
