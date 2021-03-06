//package www
//AutoCAD Entity--Line
import java.util.*;
//import java.util.HashMap;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class EntLWPolylineTest {

    public static void  main(String[] args) {
        EntLWPolyline myLWPolyline = new EntLWPolyline();

        myLWPolyline.addVertex(new wPoint(2,2));
        myLWPolyline.addVertex(new wPoint(6,8));
        myLWPolyline.addVertex(new wPoint(10,10));
        myLWPolyline.addVertex(new wPoint(15,8));
        myLWPolyline.addVertex(new wPoint(10,5));
        myLWPolyline.addVertex(new wPoint(8,0));

        System.out.println( myLWPolyline);
        System.out.println();

        System.out.println("The length of the LWPolyline: " + myLWPolyline.getLength());
        System.out.println();

        System.out.println("The size of the LWPolyline: " + myLWPolyline.getSize());
        System.out.println();

        System.out.println("List's Size: " + myLWPolyline.Vertexs.size());

        for (int i  =  0; i < myLWPolyline.Vertexs.size(); i++) {
            System.out.println("NO. " + i);
            System.out.println(myLWPolyline.Vertexs.get(i));
            System.out.println(myLWPolyline.Vertexs.get(i).x);
            myLWPolyline.Vertexs.get(i).printAll();
            System.out.println();
        }

        List<String []>  myMap = myLWPolyline.getPairData();
        System.out.println("List's Size: "+myMap.size());

        int no = 1;
		for (String [] key : myMap) {
            System.out.println("no." + no + ":   key= "+ key[0] + "\t\t\tvalue= " + key[1]);
            no++;
        }
        System.out.println();

        List<String> dxf_str = myLWPolyline.getDXF();
        for (int i  =  0; i < dxf_str.size(); i++) {
            System.out.println(dxf_str.get(i));
        }

        double[][] points= {{20,20,20},{25,30},{30,35}};
        EntLWPolyline myLWPolyline2 = new EntLWPolyline(points);
        System.out.println("The second LWPolyline: ");
        System.out.println(myLWPolyline2);
    }
}