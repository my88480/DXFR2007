//package www
//AutoCAD Entity -- Xline

import java.util.*;

/**
*@author David Wu<809758521@qq.com>
*@version 0.6
*/
public class EntXlineTest {

    public static void  main(String[] args) {
		wPoint P1,P2;
		P1 = new wPoint(100,60,0);
		P2 = new wPoint(300,360,50);
		
        EntXline myXline = new EntXline(P1,P2);

        System.out.println("Test toString: ");
        System.out.println(myXline);
        System.out.println();

        myXline.printAll();
        System.out.println();

        List<String []>  myMap = myXline.getPairData();
        System.out.println("List's Size: "+myMap.size());
		for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();

        List<String> dxf_str = myXline.getDXF();
        System.out.println("DXF's Size: "+dxf_str.size());
        for (int i  =  0; i < dxf_str.size(); i++) {
            System.out.println(dxf_str.get(i));
        }
		
		P1 = new wPoint(0,0);
		P2 = new wPoint(100,200);
		
        myXline = new EntXline(P1,P2);

        System.out.println("Test 2D Xline Constructor: ");
        System.out.println(myXline);
        System.out.println();
    }

}