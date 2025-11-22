import java.util.Scanner;
import java.util.ArrayList;


public class Prog3_Test {
    
    public static void main(String[] args) {
	ArrayList<MyObj> v = new ArrayList<MyObj>();
	int x = 1, y = 1, z = 1;

        for (int i = 0; i < 6; i++)
		{
		    MyObj a = new MyObj(x++, y++, z++);
		    v.add(a); 
		}
        
	x = x-2;
        for (int i = 0; i < 4; i++)
		{
		    MyObj a = new MyObj(x--, y--, z--);
		    v.add(a); 
		}
	for (int i = 0; i < 10; i++)
		v.get(i).print();
	System.out.println(" ");
	System.out.println(PV.PV(v, 0, 9));
    }
}

