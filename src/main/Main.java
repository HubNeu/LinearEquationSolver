package main;

public class Main{

    public static void main(String[] args){

    }
}
/*---------------Version 1 was lost, version 2 (from chapter 2)----------------------------------
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----Linear Equation Solver----");
        System.out.println("Enter the equations in form of numbers like this:");
        System.out.println("a b c");
        System.out.println("d e f");
        System.out.println("To calculate ax+by=c and dx+ey=f");
        Scanner scanner = new Scanner(System.in);
        String[] input = {"",""};
        input[0] = scanner.nextLine();
        input[1] = scanner.nextLine();
        String[] tmp = input[0].split(" ");
        Double[] abc={0d,0d,0d};
        for (int i =0;i<tmp.length;i++){
            abc[i]=Double.parseDouble(tmp[i]);
        }
        tmp = input[1].split(" ");
        Double[] def={0d,0d,0d};
        for (int i =0;i<tmp.length;i++){
            def[i]=Double.parseDouble(tmp[i]);
        }
        //Solving for y=(f-c*d/a)/(e-b*d/a)
        double y = (def[2]-abc[2]*def[0]/abc[0])/(def[1]-abc[1]*def[0]/abc[0]);
        //solving for x=(c-y*b)/a
        double x = (abc[2]-y*abc[1])/abc[0];
        System.out.println(x+" "+y);
    }
}
 */