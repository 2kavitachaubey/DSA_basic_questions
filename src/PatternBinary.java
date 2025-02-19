public class PatternBinary {
    public static void pattern(int num){

        System.out.println("Pattern 1");
        for(int row = 1; row<=5; row++){
            for(int col=1;col<=row;col++){
                if(col%2 !=0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 2");
        for(int row = 1; row<=5; row++){
            for(int col=1;col<=row;col++){
                if(row%2 !=0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 3");
        int i = 1;
        for(int row = 1; row<=5; row++){
            for(int col=1;col<=row;col++){
                if(i == 1) {
                    System.out.print(i);
                    i = 0;
                }
                else{
                    System.out.print(i);
                    i = 1;
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 4");
        for(int row = 1; row<=5; row++){
            for(int col=1;col<=row;col++){
                if(row==num || row==col || col==1) {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] agrs){
        pattern(5);
    }
}
