public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr= new int[]{12,34,45,56,67};
        int target = 14;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                System.out.println(mid);
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(low);
    }
}
