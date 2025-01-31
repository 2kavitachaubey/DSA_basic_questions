public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 9474;
        int count = 0;
        int copy =num;
        int sum = 0;
        while(num!=0) {
            num /= 10 ;
            count++;
        }
        num = copy;
        while(num!=0) {
            int r = num%10;
            sum += (int)Math.pow(r, count);
            num /= 10;
        }
        num = copy;
        if(sum == num) {
            System.out.println("armstrong");
        }
        else {
            System.out.println("not an armstrong");
        }
    }

}
