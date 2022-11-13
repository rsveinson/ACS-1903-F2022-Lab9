/**
 * ACS-1903 Lab 9 Q7
 * @author (your name and student number)
 */

import java.util.ArrayList;

public class SwapFirstAndLastKey
{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Dobby");
        names.add("Hedwig");
        names.add("Buckbeak");
        names.add("Fang");

        // enter your code here
        String temp = names.get(3);
        names.set(3, names.get(0));
        names.set(0, temp);

        System.out.println(names);
    }
}
