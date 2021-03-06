//package www
//AutoCAD Entity--Line
import java.util.*;
//import java.util.HashMap;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class EntPolylineTest {

    public static void  main(String[] args) {
        EntPolyline myPolyline = new EntPolyline();

        myPolyline.addVertex(new wPoint(2,2));
        myPolyline.addVertex(new wPoint(6,8));
        myPolyline.addVertex(new wPoint(10,10));
        myPolyline.addVertex(new wPoint(15,8));
        myPolyline.addVertex(new wPoint(10,5));
        myPolyline.addVertex(new wPoint(8,0));

        System.out.println( myPolyline);
        System.out.println();

        System.out.println("The length of the polyline: " + myPolyline.getLength());
        System.out.println();

        System.out.println("The size of the polyline: " + myPolyline.getSize());
        System.out.println();

        System.out.println("List's Size: " + myPolyline.vertexs.size());

        for (int i  =  0; i < myPolyline.vertexs.size(); i++) {
            System.out.println("NO. " + i);
            System.out.println(myPolyline.vertexs.get(i));
            System.out.println(myPolyline.vertexs.get(i).bPoint.x);
            myPolyline.vertexs.get(i).printAll();
            System.out.println();
        }

        List<String []>  myMap = myPolyline.getPairData();
        System.out.println("List's Size: "+myMap.size());

        int no = 1;
		for (String [] key : myMap) {
            System.out.println("no." + no + ":   key= "+ key[0] + "\t\t\tvalue= " + key[1]);
            no++;
        }
        System.out.println();

        List<String> dxf_str = myPolyline.getDXF();
        for (int i  =  0; i < dxf_str.size(); i++) {
            System.out.println(dxf_str.get(i));
        }

        double[][] points= {{20,20,20},{25,30},{30,35}};
        EntPolyline myPolyline2 = new EntPolyline(points);
        System.out.println("The second Polyline: ");
        System.out.println(myPolyline2);
    }
}