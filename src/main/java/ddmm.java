import java.util.HashMap;
import java.util.Map;

public class ddmm {

    public static void main(String[] args) {
        String s = "ashish";
        int[] arr = {2,3,2,5,7,8};
        char[] c = s.toCharArray();
        String rev = new String();

        for(int i= c.length-1; i>=0 ; i--){
            rev += c[i];
        }
        System.out.println(rev);

        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        map.forEach((k,v) -> System.out.println("\""+k+"\" occurs : "+v+" time"));
    }
}
