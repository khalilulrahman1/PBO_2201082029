/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package khalilul.dao;
import khalilul.model.Peminjaman;
import java.util.*;
/**
 *
 * @author HP
 */
public interface PeminjamanDao {
    void insert(Peminjaman pinjam);
    void update(int index, Peminjaman pinjam);
    void delete(int index);
    Peminjaman getPeminjaman(int index);
    List<Peminjaman>getAll();
}
