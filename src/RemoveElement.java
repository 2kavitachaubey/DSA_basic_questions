import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,6};
        int count = 0;
        int end = 1;
        int val = 1;
        int len = arr.length;
        for(int i = 0 ;i< len;i++){
            if(arr[i]!= val){
                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
