
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

    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.inputNum(1,5);
        System.out.println();

        String myString = "hello world";
        String[] myWord = myString.split(" ");  // convert string into array
        r.stringprint(myWord, myWord.length-1);
    }
}
