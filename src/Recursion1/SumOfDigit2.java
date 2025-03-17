package Recursion1;

public class SumOfDigit2 {
    static int sumOfDigit(int num){
        if(num == 0){
            return 0;
        }
        int sum = sumOfDigit(num/10);
        int digit = num%10;
        sum += digit;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(7658));
    }
}
