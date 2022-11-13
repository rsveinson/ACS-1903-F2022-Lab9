/**
 * ACS-1903 Lab 9 Q8
 * @author (your name and student number)
 */
import java.util.Scanner;

public class FindLargestKey{
    public static void main(String[] args){
        String prompt = "enter a numuber.";
        int n;                              // number read from keyboard        
        int largest = Integer.MIN_VALUE;    // largetst number read        
        Scanner scanner = new Scanner(System.in);
        
        // enter your code here
        for(int i = 0; i < 5; i++){
            System.out.println(prompt);
            n = scanner.nextInt();
            
            largest = Math.max(largest, n);
        }// end for
        
        System.out.println(largest);
    }// end main
}// end class
