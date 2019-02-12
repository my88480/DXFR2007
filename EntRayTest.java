//package www
//AutoCAD Entity -- Ray

import java.util.*;

/**
*@author David Wu<809758521@qq.com>
*@version 0.6
*/
public class EntRayTest {

    public static void  main(String[] args) {
		wPoint P1,P2;
		P1 = new wPoint(100,60,0);
		P2 = new wPoint(300,360,50);
		
        EntRay myRay = new EntRay(P1,P2);

        System.out.println("Test toString: ");
        System.out.println(myRay);
        System.out.println();

        myRay.printAll();
        System.out.println();

        List<String []>  myMap = myRay.getPairData();
        System.out.println("List's Size: "+myMap.size());
		for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();

        List<String> dxf_str = myRay.getDXF();
        System.out.println("DXF's Size: "+dxf_str.size());
        for (int i  =  0; i < dxf_str.size(); i++) {
            System.out.println(dxf_str.get(i));
        }
		
		P1 = new wPoint(0,0);
		P2 = new wPoint(100,200);
		
        myRay = new EntRay(P1,P2);

        System.out.println("Test 2D Ray Constructor: ");
        System.out.println(myRay);
        System.out.println();
    }

}