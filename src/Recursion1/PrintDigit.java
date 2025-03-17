package Recursion1;
// 12345
public class PrintDigit {
    static void printDigit(int num){
        if(num < 1){
            return;
        }
        printDigit(num/10);
        System.out.println(num%10);
    }
    public static void main(String[] args) {
        printDigit(12345);
    }
}
