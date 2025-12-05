import java.util.Arrays;
class Solution{
    public static void main(String[] args) {

        int arr [] = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Given : " + Arrays.toString(arr));
      //  pushZerosToEnd_1(arr);
      //  pushZerosToEnd_2(arr);
       pushZerosToEnd_3(arr);

    }
    public static void pushZerosToEnd_1(int[] arr) {

        int i =0;
        int newArr [] = new int[arr.length];
        for(int a : arr){
            if(a != 0){
                newArr[i]=a;
                i++;
            }
        }
        System.out.println("Aproach 1 " + Arrays.toString(newArr));
    }
    public static void pushZerosToEnd_2(int[] arr) {

        // [1, 2, 0, 4, 3, 0, 5, 0]


        int i =0;
        for(int a : arr){
            if(a != 0){
                arr[i]=a;
                i = i+1;
            }
            /*
            i=0 , a = 1
            i=1 , a = 1,2
            [ SKIP ]
            i=2, a = 1,2,4
            i=3 , a = 1,2,4,3
            [ SKIP ]
            i=4, a = 1,2,4,3,5

             */
        }

        for (int k = i; k < arr.length; k++) {
            arr[k] = 0;
        }
        System.out.println("Aproach 2 " +Arrays.toString(arr));
    }

    public static void pushZerosToEnd_3(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, count);
                count++;
            }
        }
        System.out.println("Aproach 3 " + Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
