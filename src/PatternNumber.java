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


        System.out.println("Pattern 4");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(row==col && (row+col)==num+1){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 5");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if((row+col)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 6");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(col == (num/2 + 1) || row == (num/2 +1)){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 7");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(col==row || (col+row)==num+1){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 8");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if((row==1  || row ==num) && (col>1 && col<num)){
                    System.out.print("1 ");
                }
                else if((col==1  || col ==num) && (row>1 && row<num)){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 9");
        for(int row = 1; row <= num; row++){
            for(int col = row; col <= num+row-1; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 10");
        int n = 1;
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++) {
                if(n<10){
                    System.out.print(n + "  ");
                }
                else {
                    System.out.print(n + " ");
                }
                n++;
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 11");
        for(int row = 1; row <= num; row++){
            for(int col = num; col > num-row; col--) {
                System.out.print(col);
            }
            for(int col = 1; col<=num-row; col++){
                System.out.print(num-row+1);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern 12");
        for(int row = 1; row <= num; row++){
            for(int col = row; col< num; col++) {
                System.out.print(col);
            }
            for(int col = num; col > num-row; col--){
                System.out.print(num);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 13");
        for(int row = 1; row <= num; row++){
            for(int col = row; col>1; col--) {
                System.out.print(col);
            }
            for(int col = 1; col <= num-row+1; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 14");
        for(int row = 1; row <= num; row++){
            for(int col = num; col>=num-row+1; col--) {
                System.out.print(col);
            }
            for(int col = 1; col<=num-row ; col++){
                System.out.print(num-row+1);
            }
            for(int col = 1; col<=num-row-1 ; col++){
                System.out.print(num-row+1);
            }
            for(int col = Math.max(2, num - row + 1); col<=num; col++) {
                System.out.print(col);
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
