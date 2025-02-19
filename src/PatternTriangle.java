public class PatternTriangle {
    public static void patterns(int num){

        System.out.println("Pattern 1");
        for(int row = 1 ; row<=num; row++){
            for(int col = num; col >row ; col--){
                System.out.print(" ");
            }
            for(int col = 1; col<=row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 2");
        for(int row = 1 ; row<=num; row++){
            for(int col = num; col >=row ; col--){
                System.out.print(num-row+1);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 3");
        for(int row = 1 ; row<=num; row++){
            for(int col = num; col >=row ; col--){
                System.out.print(row);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 4");
        for(int row = 1 ; row<=num; row++){
            for(int col = 1; col <=row ; col++){
                System.out.print(num-row+1);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 5");
        for(int row = 1 ; row<=num; row++){
            for(int col = 1; col <=row ; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 6");
        for(int row = 1 ; row<=num; row++){
            for(int col = 1; col <= num-row+1 ; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 7");
        for(int row = 1 ; row<=num; row++){
            for(int col = row; col >=1 ; col--){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 8");
        for(int row = 1 ; row<=num; row++){
            for(int col = num-row+1; col >=1 ; col--){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 9");
        for(int row = 1 ; row<=num; row++){
            for(int col = num; col >=num-row+1 ; col--){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 10");
        for(int row = 1 ; row<=num; row++){
            for(int col = num; col >=row; col--){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 11");
        for(int row = 1 ; row<=num; row++){
            for(int col = num-row+1; col <= num; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 12");
        for(int row = 1 ; row<=num; row++){
            for(int col = row; col <= num; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 13");
        for(int row = 1 ; row<=num; row++){
            for(int col = row; col <= row*2-1; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 14");
        for(int row = 1 ; row<=num; row++){
            for(int col = row; col <= num; col++){
                System.out.print(col*2-1);
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args){
        patterns(5);
    }
}
