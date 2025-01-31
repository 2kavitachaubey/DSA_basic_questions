public class PetersonNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num = 40884;
        int copy = num;
        int sum = 0;
        while(num != 0) {
            int r = num %10;
            int fact = 1;
            while(r>1) {
                fact *= r;
                r--;
            }
            sum += fact;
            num /= 10;
        }
        num = copy;
        if(sum == num) {
            System.out.println("It's a PetersonNumber");
        }
        else {
            System.out.println("Not an PetersonNumber");
        }
    }

}
