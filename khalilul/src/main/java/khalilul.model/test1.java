/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalilul.model;

/**
 *
 * @author HP
 */
//import javax.swing.JOptionPane;

public class test1 {
    public static void main(String[] args){
        try{
            System.out.println(args[0]);
            System.out.println(1/0);
        }
//        catch (ArithmeticException ex){
//            System.out.println("error :"+ex.getMessage());
//        }
//        catch(ArrayIndexOutOfBoundsException ex){
//            System.out.println("error :"+ex.getMessage());
//            
//        }
        catch(Exception ex){
            System.out.println("error : "+ex.getMessage());
//                JOptionPane.showMessageDialog( ex,"error");
        }
    }
}
