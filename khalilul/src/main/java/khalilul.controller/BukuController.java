/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalilul.controller;

import khalilul.model.*;
import khalilul.view.*;
import khalilul.dao.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author HP
 */
public class BukuController {
    
    //buat objek dari ketiga kelas
    FormBuku view1;
    Buku buku;
    BukuDao dao1;
    
    //buat constructor
    public BukuController(FormBuku view){
        this.view1 = view;
        dao1 = new BukuDaoImple();
    }
    
    // buat clear form
    public void clearForm(){
        view1.getTxtKodeBuku().setText("");
        view1.getTxtJudul().setText("");
        view1.getTxtPengarang().setText("");
        view1.getTxtPenerbit().setText("");
    }
    
    // buat tampil
    public void tampil(){
        DefaultTableModel tabelModel1 = (DefaultTableModel) view1.getTableBuku().getModel();
        tabelModel1.setRowCount(0);
        List<Buku> list1 = dao1.getAll();
        for(Buku b : list1){
            Object[] row1 = {
                b.getKodeBuku(),
                b.getJudul(),
                b.getPengarang(),
                b.getPenerbit()
            
            };
            tabelModel1.addRow(row1);
        }
    }
    
    // insert
    public void insert(){
        buku = new Buku();
        buku.setKodeBuku(view1.getTxtKodeBuku().getText());
        buku.setJudul(view1.getTxtJudul().getText());
        buku.setPengarang(view1.getTxtPengarang().getText());
        buku.setPenerbit(view1.getTxtPenerbit().getText());
        dao1.insert(buku);
        JOptionPane.showMessageDialog(view1, "apakah data yang dimasukan sudah benar?");
    }
    
    // update
    public void update(){
        int index = view1.getTableBuku().getSelectedRow();
        buku.setKodeBuku(view1.getTxtKodeBuku().getText());
        buku.setJudul(view1.getTxtJudul().getText());
        buku.setPengarang(view1.getTxtPengarang().getText());
        buku.setPenerbit(view1.getTxtPenerbit().getText());
        dao1.update(index, buku);
        JOptionPane.showMessageDialog(view1, "apakah anda yakin ingin melakukan update data?");
    }
    
    // delete 
    public void delete(){
        int index = view1.getTableBuku().getSelectedRow();
        dao1.delete(index);
        JOptionPane.showMessageDialog(view1, "anda yakin ingin menghapus data?");
    }
    
    //getbuku alias mendapatkan data buku
    public void getBuku(){
        int index = view1.getTableBuku().getSelectedRow();
        buku = dao1.getBuku(index);
        view1.getTxtKodeBuku().setText(buku.getKodeBuku());
        view1.getTxtJudul().setText(buku.getJudul());
        view1.getTxtPengarang().setText(buku.getPengarang());
        view1.getTxtPenerbit().setText(buku.getPenerbit());
    }
    
}
