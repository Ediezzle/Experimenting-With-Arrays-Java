/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experimentwitharrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dev Ops
 */
public class ExperimentWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        Scanner s = new Scanner(System.in);
	System.out.println("Enter 1st array value");
	int first = s.nextInt();
	System.out.println("Enter 2nd array value");
	int second = s.nextInt();
	System.out.println("Enter 3rd array value");
	int third = s.nextInt();
        int[] array = new int[3];
        array[0]=first;
        array[1]=second;
        array[2]=third;
        System.out.println(Arrays.toString(array));
        
        System.out.println("Enter string of digits");
        String digits = s.next();
        System.out.println(digits);
    }
    
}
