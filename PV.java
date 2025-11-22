import java.util.Scanner;
import java.util.ArrayList;

public class PV {

    public static int PV(ArrayList<MyObj> arr, int s, int t) {     
        if (s >= t) 
            return s;
        
        boolean startsDown = arr.get(0).greaterThan(arr.get(1));

        int last = arr.size()-1;

        int m = (s + t) / 2;

        if (s == 0 && t == last){
            if (startsDown && arr.get(last-1).greaterThan(arr.get(last))){
                return 0;
            }
        }

        if (startsDown) {

            if (t == s + 1) {
                if (arr.get(s).lessThan(arr.get(t))) {
                    return s;
                } else 
                    return t;
                    }
                

            if (arr.get(m).greaterThan(arr.get(m+1))){
                // As the slope decreases, the valley must be on the RIGHT
                return PV(arr, m, t);
            }
    
            if (arr.get(m).lessThan(arr.get(m+1))){
                // As the slope falls, the valley must be on the LEFT
                return PV(arr, s, m);
            }
        
        
        } else {
            if (t == s + 1) {
                if (arr.get(s).greaterThan(arr.get(t))) {
                    return s;
                } else {
                    return t;
                    }
                }

            if (arr.get(m).greaterThan(arr.get(m+1))){
                // As the slope rises, the peak must be on the LEFT
                return PV(arr, s, m);
            }
    
            if (arr.get(m).lessThan(arr.get(m+1))){
                // As the slope rises, the peak must be on the RIGHT
                return PV(arr, m, t);
            }
        }
        return -1; // This should never be reached
        }
    }