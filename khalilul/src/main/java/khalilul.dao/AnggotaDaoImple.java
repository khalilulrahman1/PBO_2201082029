/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalilul.dao;
import java.util.List;
import khalilul.model.Anggota;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AnggotaDaoImple implements AnggotaDao{
    private final List<Anggota> data = new ArrayList<>();
    @Override
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    
    public AnggotaDaoImple(){
        data.add(new Anggota("A001","Ali", "Padang", "L"));
        data.add(new Anggota("A002", "Budi", "Padang","L"));
    }
    
    @Override
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    @Override
    public void delete(int index){
        data.remove(index);
    }
    @Override
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    @Override
    public List<Anggota>getAll(){
        return data;
    }
    
}
