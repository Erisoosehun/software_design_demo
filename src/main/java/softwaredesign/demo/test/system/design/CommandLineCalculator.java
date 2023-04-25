package softwaredesign.demo.test.system.design;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Eris
 * @Date 2022/12/11 19:42
 */
public class CommandLineCalculator {
    private int accumulatedValue = 0;
    public CommandLineCalculator(){
        super();
    }
    private static String getAnInputFromUser(){
        try {
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            return (b.readLine());
        }catch(IOException e){
            System.out.println(e+"Input taken to be a single blank.");
            return " ";
        }
    }
    public static void main(String[] args){
        System.out.print("Input number A： ");
        String A = getAnInputFromUser();
        System.out.print("Input number B： ");
        String B = getAnInputFromUser();
        int amountAdded = 0;
        while(!A.equals("stop")&!B.equals("stop")){
            try{
                int a = (new Integer(A)).intValue();    // Throw error when it is not an integer
                int b = (new Integer(B)).intValue();    // Throw error when it is not an integer
                int c = a/b;                      //Throw error when b=0
                System.out.println("The result is： "+c);
            }catch(Exception e){
                System.out.println("Sorry -- incorrect entry: Try again.");
            }
            System.out.print("Input number A： ");
            A = getAnInputFromUser();
            System.out.print("Input number B： ");
            B = getAnInputFromUser();
        }
        System.out.println("Application ends.");
    }

}
