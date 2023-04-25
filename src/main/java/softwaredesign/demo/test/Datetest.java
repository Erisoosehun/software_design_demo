package softwaredesign.demo.test;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Eris
 * @Date 2022/10/01
 */

//用Java实现输入年份月份，输出月的最大天数，年月不合法要重新输入
@Data
@NoArgsConstructor
public class Datetest {

    public static void main(String[] args) {

        report(2022, 10);
        report(2004, 2);
    }

    public static void report(int year, int month) {
        int dayNum;
        System.out.println("请输入年份和月份");
        if (month <= 0 && month > 12) {
            System.out.println("输入月份不正确，请重新输入");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (month == 2) {
                    dayNum = 29;
                    System.out.println(dayNum);
                } else if ((month <= 7 && month %2 == 1) || (month >= 8 && month % 2 == 0)) {
                    dayNum = 31;
                    System.out.println(dayNum);
                } else{
                    dayNum = 30;
                    System.out.println(dayNum);
                }
            } else {
                if (month == 2) {
                    dayNum = 28;
                    System.out.println(dayNum);
                } else if ((month <= 7 && month %2 == 1) || (month >= 8 && month % 2 == 0)) {
                    dayNum = 31;
                    System.out.println(dayNum);
                } else {
                    dayNum = 30;
                    System.out.println(dayNum);
                }
            }
        }
    }
}
