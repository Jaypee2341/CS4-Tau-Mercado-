/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1.mercado;

/**
 *
 * @author TAU
 */
public class Q1Ex1Mercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] students = {"John Paul Mercado", "Kendrik Adorna", "Gian Ong"};
        int[] age = {15, 16, 16};
        String[] sections = {"Tau", "Tau", "Tau"};
        int totalAge = age[0] + age[1] + age[2];
        boolean classmates = (sections[0] == sections[1] && sections[1] == sections[2]);
        for(int i=1; i<4; i++){
            System.out.println("Student " + i);
            System.out.println("Name:" + students[i-1]);
            System.out.println("Age:" + age[i-1] + " years old");
            System.out.println("Section:" + sections[i-1]);
            System.out.println("");
        }
        System.out.println("The total age of the 3 students: " + totalAge + " // (operation: sum)");
        System.out.println("The 3 students are from the same section: " + classmates + " // (operation: comparison)");
    }
    
}
