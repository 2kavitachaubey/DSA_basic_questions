public class PatternNumber2 {
    public static void pattern(int num){
        System.out.println("Pattern 1");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col<row*2; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 2");
        for(int row = 1; row <= num; row++){
            if(row % 2 !=0) {
                for(int col = 1; col<=row; col++){
                    System.out.print(col*2-1);
                }
            }
            else{
                for(int col = 1; col<=row; col++){
                    System.out.print(col*2);
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 3");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col*2-1);
            }
            for(int col = (row-1)*2-1; col>=1; col -= 2){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        pattern(5);
    }
}
