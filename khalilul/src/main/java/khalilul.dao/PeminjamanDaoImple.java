/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalilul.dao;
import java.util.*;
import khalilul.model.Peminjaman;
/**
 *
 * @author HP
 */
public class PeminjamanDaoImple implements PeminjamanDao {
    private final List<Peminjaman> data1 = new ArrayList<>();

    @Override
    public void insert(Peminjaman pinjam) {
        data1.add(pinjam);
    }
    
    public PeminjamanDaoImple() {
        data1.add(new Peminjaman("A001","B001","30 maret 2023","10 juni 2023"));
    }

    @Override
    public void update(int index, Peminjaman pinjam) {
        data1.set(index, pinjam);
    }

    @Override
    public void delete(int index) {
        data1.remove(index);
    }

    @Override
    public Peminjaman getPeminjaman(int index) {
       return data1.get(index);
    }

    @Override
    public List<Peminjaman> getAll() {
        return data1;
    }

      
}
