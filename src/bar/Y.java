package bar;

import static foo.X.*;
import foo.X;

public class Y{
    public static void main(String[] args){
    	//int a, b, c; a = b = c = 100;
    	int a, b, c=100;
       X x = new X();
       x.apply(LOGICID);
    }
}