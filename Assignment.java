import java.util.*;
public class Assignment {
    public static void main(String[] args) {
        int res = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3, 4, 1, 2, 7, 8, 20, 33, -1, -1, -1, -1));
        for(Integer i : arr){
            if(i==-1){
                res = arr.indexOf(i);
                break;
            }
        }
        System.out.println(res);
    }
}
