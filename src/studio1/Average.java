package studio1;

import support.cse131.ArgsProcessor;

public class Average {


    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Value for x?");
        int n2 = ap.nextInt("Value for y?");
        double n3 = (n1 + n2) / 2.0;
        System.out.println("Average of "+n1+" and "+n2+" is "+n3+" ");
    }
}