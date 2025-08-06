public class Pattern {
    public void patterns(int num){
        //Pattern 1
        System.out.println("Pattern 1");
        for(int row =0;row<num;row++){
            for(int col=0;col<num;col++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Pattern 2
        System.out.println("Pattern 2");
        for(int row =0;row<num;row++){
            for(int col=row;col<num;col++){
                System.out.print('*');
            }
            System.out.println();
        }

        //Pattern 3
        System.out.println("Pattern 3");
        for(int row =0;row<num;row++){
            for(int col=row;col>=0;col--){
                System.out.print('*');
            }
            System.out.println();
        }

        //Pattern 4
        System.out.println("Pattern 4");
        for(int row =0;row<num;row++){
            for (int col = num-row; col > 0; col--){
                System.out.print(" ");
            }
            for(int col=row ;col>=0;col--){
                System.out.print('*');
            }
            System.out.println();
        }

        //Pattern 5
        System.out.println("Pattern 4");
        for(int row =0; row<num; row++){
            for(int col=num-1 ; col>row; col--){
                System.out.print(" ");
            }
            for(int star=0; star<(row*2)+1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row =0;row<num-1;row++){
            for(int col=0; col<row+1; col++){
                System.out.print(" ");
            }
            for(int star=8 ; star>(row*2)+1; star--){
                System.out.print("*");
            }
            System.out.println();
        }

        //Patter 6
        System.out.println("Pattern 6");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(col==1 || col==num || row==1 || row==num){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Pattern 7
        System.out.println("Pattern 7");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(col==1 || col==num || row==1 || row==num || row==col || (row+col)==(num+1) ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Pattern 8
        System.out.println("Pattern 8");
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(row==col || (row+col)==(num+1) ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern p = new Pattern();
        p.patterns(5);
    }
}
