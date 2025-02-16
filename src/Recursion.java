
public class Recursion {
    public void inputNum(int count, int N){
        if(count > N){
            return ;
        }
        else{
            System.out.print(count + " ");
            inputNum(count + 1, N);
        }
    }

    public void stringprint(String[] words, int index){
        if(index < 0){
            return ;
        }
        else{
            System.out.print(words[index] + " ");
            stringprint(words, index - 1);
        }
    }

    public void numberEO(int n){
        if(n < 0){
            return;
        }
        else if(n % 2 == 0){
            System.out.println(n);
            numberEO(n-2);
        }
        else{
            System.out.println(n);
            numberEO(n-1);
        }
    }

    public void digitSumSequence(int N) {
        //Write Code Here
        System.out.print(N + " ");
        if(N < 10) return;
        int result = 0;
        while(N != 0){
            result += (N%10);
            N /= 10;
        }
        digitSumSequence(result);
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.inputNum(1,5);
        System.out.println();

        String myString = "hello world";
        String[] myWord = myString.split(" ");  // convert string into array
        r.stringprint(myWord, myWord.length-1);

        System.out.println();

        r.numberEO(7);

        System.out.println();

        r.digitSumSequence(9844);
    }
}
