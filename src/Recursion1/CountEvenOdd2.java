package Recursion1;

public class CountEvenOdd2 {
    static int[] countEvenOdd(int num){
        if(num == 0){
            int result[] = new int[2];
            return result;
        }
        int result[] = countEvenOdd(num-1);
        if(num % 2 ==0){
            result[0] += 1;
        }
        else{
            result[1] += 1;
        }
        return  result;
    }
    public static void main(String[] args) {
        int arr[] = countEvenOdd(10);
        System.out.println(arr[0]+" "+ arr[1]);
    }
}
