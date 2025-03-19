package Recursion1;

public class CountEvenOdd {
    static void countEvenOdd(int num, int even, int odd){
        if(num == 0){
            System.out.println("The number of even are "+ even + " the number of odd are: "+ odd);
            return;
        }
        if(num % 2 ==0){
            even++;
        }
        else{
            odd++;
        }
        countEvenOdd(num-1,even,odd);
    }
    public static void main(String[] args) {
        countEvenOdd(10,0,0);
    }
}
