import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {


//        s.stream().filter(stu -> stu.getAge() > 10).map(stu -> System.out.println(stu.getName()));
        int[] arr = {2,9,1,8,6,4,5};
        Arrays.sort(arr);

        //bubble sort
//        for(int i=0 ; i < arr.length; i++){
//            for(int j=0; j < arr.length - i - 1; j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }


//        selection sort {1,9,2,8,6,4,5}
        for(int i=0 ; i <arr.length-1 ; i++){
                    int smallest = i ;
                    for(int j=i+1; j < arr.length ; j++) {
                        if (arr[smallest] > arr[j]) {
                            smallest = j;
                        }
                    }
                        int temp = arr[smallest];
                        arr[smallest] = arr[i];
                        arr[i] = temp;
            Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
            System.out.println();
                }



    }



}