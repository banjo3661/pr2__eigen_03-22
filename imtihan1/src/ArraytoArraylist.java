import java.util.ArrayList;
import java.util.List;

public class ArraytoArraylist {




    public  List<Integer> convertToArrayList(int[] input) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if(input != null){
            for (int i : input) {
                arrayList.add(i);
            }


        }


        return arrayList;
    }
}
