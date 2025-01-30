public class Pattern {
    public static void main(String[] args){

//        //Pattern 1
//        System.out.println("Pattern 1");
//        for(int i =0;i<5;i++){
//            for(int j=0;j<5;j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//
//        //Pattern 2
//        System.out.println("Pattern 2");
//        for(int i =0;i<5;i++){
//            for(int j=i;j<5;j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//
//        //Pattern 3
//        System.out.println("Pattern 3");
//        for(int i =0;i<5;i++){
//            for(int j=i;j>=0;j--){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//
//        //Pattern 4
//        System.out.println("Pattern 4");
//        for(int i =0;i<5;i++){
//            for(int j=i;j>=0;j--){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

        //Pattern 5
        System.out.println("Pattern 4");
        for(int i =0;i<5;i++){
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k < (i*2)+1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0;i<4;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int k=8 ; k>(i*2)+1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
