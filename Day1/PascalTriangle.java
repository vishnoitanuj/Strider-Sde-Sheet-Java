package Day1;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            if(i>0){
                List<Integer> prev = res.get(i-1);
                for(int j=1;j<=i;j++){
                    if(j<prev.size())
                        temp.add((prev.get(j-1)+prev.get(j)));
                    else
                        temp.add(prev.get(j-1));
                }
            }
            res.add(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        PascalTriangle obj = new PascalTriangle();
        obj.generate(5);
    }
}
