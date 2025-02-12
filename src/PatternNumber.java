public class PatternNumber {
    public void patterns(int num){
        System.out.println("Pattern 1");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(row%2 == 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 2");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(col%2 == 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 3");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(col==1 || col==num || row==1 || row==num){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 3");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(col==1 || col==num || row==1 || row==num){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 3");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(row==col && (row+col)==num-1){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PatternNumber p = new PatternNumber();
        p.patterns(5);
    }
}
