package softwaredesign.demo.test.system.design;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Eris
 * @Date 2022/12/11 19:36
 */
public class Calculator {

    public int calculate(int num){
        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }


    public void combine(String some[]){
        for (int i = 0; i < some.length; i++){
            for (int j = 0; j < some.length; j++){
                System.out.println(some[i] + some[j]);
            }
        }
    }


    public void test() throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number A： ");
        String A = b.readLine();       //How about input error？
        System.out.print("Input number B： ");
        String B = b.readLine();
        int C = (new Integer(A).intValue())/(new Integer(B)).intValue();
        //How about B=0？
        System.out.println("Result is： "+C);
    }

    public static void main(String[] args) {
        String some[] = {"Hello", "sehun", "love"};
        Calculator calculator = new Calculator();
        calculator.combine(some);
    }

}
