/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.ArrayList;
/**
 *
 * @author yuche6130
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
      public static void insertSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
          int temp = list.get(i);
          int j;
          for (j = i; j > 0; j--) {
            if (temp >= list.get(j - 1)) {
              break;
            }
        list.add(j - 1, list.remove(j));
        }
      }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> black = new ArrayList<Integer>();
        black.add(114);
        black.add(514);
        black.add(191);
        black.add(981);
        System.out.println(black);
        insertSort(black);
        System.out.println(black);
    }
    
}
