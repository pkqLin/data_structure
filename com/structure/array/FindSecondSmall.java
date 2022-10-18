package structure.array;

import java.util.Arrays;

public class FindSecondSmall {

    public static void main(String args[]) {
        int arr[] = {12, 13, 1, 10, 34, 1};
        System.out.println(findNotRepeating(arr, 6));
    }


    //   查找数据第二小元素
    //    Input:  arr[] = {12, 13, 1, 10, 34, 1}
    //    Output: The smallest element is 1 and
    //    second Smallest element is 10
    static void findSecondSmall() {
        int arr[] = {12, 13, 1, 10, 34, 1};
        int n = arr.length;

        // sorting the array using
        // in-built sort function
        Arrays.sort(arr);
        // printing the desired element
        System.out.println("smallest element is " + arr[0]);
        System.out.println("second smallest element is " + arr[1]);
    }

    //查找第一个没有重复的元素
    //    Input: {-1, 2, -1, 3, 0}
    //    Output: 2
    //    Explanation: The first number that does not repeat is : 2
    //
    //    Input: {9, 4, 9, 6, 7, 4}
    //    Output: 6
    static int findNotRepeating(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j])
                    break;
                if (j == n) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
