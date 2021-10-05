public class recursive {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,0,6,8));
    }
    public static int binarySearch(int[] arr,int left,int right,int value){
        if (right >= left) {
            int middle = (left+right)/ 2;
            if (arr[middle] == value)
                return middle;
            if(arr[middle] > value)
                return binarySearch(arr, left, middle-1,  value);
            if(arr[middle]<value) {
                return binarySearch(arr, middle + 1, right, value);
            }
        }
        return -1;
    }
}
