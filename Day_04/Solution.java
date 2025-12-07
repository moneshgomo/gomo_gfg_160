import java.util.*;
class Solution{
    public static void main(String[] args) {

    int arr [] ={1, 2, 3, 4, 5};
    int  d = 2;

    int length = arr.length;

    d = d % length;
    reverse(arr,0,d-1);
    reverse(arr,d,length-1);
    reverse(arr,0,length-1);


        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}