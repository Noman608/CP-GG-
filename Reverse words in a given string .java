import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CP {
    public static void main(String[] args) {
        String array = "i.like.this.program.very.much";
        String[] arr = array.split("\\.");
        List<String> list =Arrays.asList(arr);
        Collections.reverse(list);
        arr = list.toArray(arr);
        StringBuilder aa=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            aa.append(arr[i]);
            if(i<arr.length-1)
                aa.append(".");
        }
    }

}
