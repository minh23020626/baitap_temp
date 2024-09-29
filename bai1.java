import java.util.Scanner;

public class bai1{
    static class Solution{
        public static boolean isPrime(int n) {
            if (n < 2) {
                return false;
            }

            if (n == 2) {
                return true;
            }

            for(int i = 2; i < Math.sqrt(n); i++){
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    };
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Solution sl = new Solution();
        
    }
}