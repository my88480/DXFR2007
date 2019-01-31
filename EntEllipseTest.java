//package www
//AutoCAD Entity--Arc
import java.util.*;
//import java.util.HashMap;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class EntEllipseTest {

    public static void  main(String[] args) {
        EntEllipse myEllipse = new EntEllipse(new wPoint(0,0,0),new wPoint(0,200,0),0.5,0,2*Math.PI);

        System.out.println("Test toString: ");
        System.out.println(myEllipse);
        System.out.println();

        myEllipse.Print2D();
        myEllipse.Print3D();
        myEllipse.PrintAll();
        System.out.println();

        List<String []>  myMap = myEllipse.GetPairData();
        System.out.println("List's Size: "+myMap.size());

		for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();

        List<String> dxf_str = myEllipse.GetDXFData();
        System.out.println("DXF's Size: "+dxf_str.size());
        for (int i  =  0; i < dxf_str.size(); i++) {
            System.out.println(dxf_str.get(i));
        }
        /*
        wPoint2D	Po = new wPoint2D(0.0,0.0);
        wPoint2D	Pa = new wPoint2D(263.36975126607098,2.3957480654137759);
        wPoint2D	Pb = new wPoint2D(2.1626945149204699,263.37176812099699);

        EntEllipse myEllipse2 = new EntEllipse(Po,Pa,Pb);
        myarc2.PrintAll();
        */
    }

}