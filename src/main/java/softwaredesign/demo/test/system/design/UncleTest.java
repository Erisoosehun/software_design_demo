package softwaredesign.demo.test.system.design;

import java.util.Arrays;

/**
 * @author Eris
 * @Date 2023/3/18 20:16
 */
public class UncleTest {
    public int changeMoney(int[] coins, int amount){
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return -1;
        }
        if(coins == null){
            return 0;
        }

        int len = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 1; i < len; i++){
            for(int j = 0; j < coins.length; j++){
                //还需要硬币填入
                if(i - coins[j] >= 0){
                    //在组成i的数值上增加1（当前硬币占一个）
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    System.out.println(dp[i]);
                }
            }
        }
        return dp[amount] >= amount + 1 ? -1: dp[amount];
    }

    public static void main(String[] args) {
        UncleTest uncleTest = new UncleTest();
        int[] coins = {1, 2, 5};
        int result;
        result = uncleTest.changeMoney(coins, 11);
        System.out.println(result);
    }
}
