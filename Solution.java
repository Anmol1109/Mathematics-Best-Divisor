import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);
    public static int getDigitSum(int n){
        int s = 0;
        while(n != 0){
            s += n % 10;
            n /= 10;
        }
        return s;
    }
    public static int getBestDivisor(int n){
        int maxSum = 1;
        int bestNumber = 1;
        for(int i = 2;i <= n;i++){
            if(n % i == 0){
                int digitSum = getDigitSum(i);
                if(digitSum > maxSum)
                    {
                        maxSum = digitSum;
                        bestNumber = i;
                    }
            }   
        }
        return bestNumber;
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println(getBestDivisor(n));
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }
}
