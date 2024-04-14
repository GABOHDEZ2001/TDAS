
package VectoresDinamicos;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
    
        ArrayList<Integer> Vec = new ArrayList<Integer>();
        
        Vec.add(20);
        Vec.add(30);
        Vec.add(40);
        
        System.out.println("Vector");
        
        for (int i = 0; i < Vec.size(); i++) {
            System.out.println(Vec.get(i) + "");
        }
        
        Vec.set(1, 80);
        
        Vec.remove(Vec.size() - 1);
        
        for (int i = 0; i < Vec.size(); i++) {
            System.out.println(Vec.get(i) + "");
        }
        
        
        for (int i : Vec) {
            System.out.println("El vector es: " + i);
        } 
        
    }
}
