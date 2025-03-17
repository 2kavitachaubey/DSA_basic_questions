package Recursion1;

public class SumOfDigit1 {
    static void sumOfDigit(int num, int sum){
        if(num == 0){
            System.out.println(sum);
            return;
        }
        sum += num%10;
        sumOfDigit(num/10,sum);
    }
    public static void main(String[] args) {
        sumOfDigit(789,0);
    }
}
