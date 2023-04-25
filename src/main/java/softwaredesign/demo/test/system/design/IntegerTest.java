package softwaredesign.demo.test.system.design;

/**
 * @author Eris
 * @Date 2022/12/11 20:38
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer num1 = 128;
        Integer num2 =128;
        System.out.println(num1 == num2);
        //false

        Integer num3 = 9;
        Integer num4 = 9;
        System.out.println(num3 == num4);
        //true
    }
}
