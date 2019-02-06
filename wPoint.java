//package www
//Point
import java.util.*;
//import java.util.HashMap;
/**
 * @author David Wu <809758521@qq.com>
 * @version V0.2
 * Definition of a point,composed by x,y,z(three coordinate values).
 */
public class wPoint {
    /**
     * code  10,20,30 -Point location (in WCS).
     */
    public double x = 0.0;
    public double y = 0.0;
    public double z = 0.0;


    public wPoint() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    public wPoint(double x_value) {
        x = x_value;
        y = 0.0;
        z = 0.0;
    }

    public wPoint(double x_value,double y_value) {
        x = x_value;
        y = y_value;
        z = 0.0;
    }

    public wPoint(double x_value,double y_value,double z_value) {
        x = x_value;
        y = y_value;
        z = z_value;
    }

    public wPoint(wPoint2D point) {
        x = point.x;
        y = point.y;
    }

    /**
     * Constructor by a object of Class wPoint.Or called wPoint Copier.
     */
    public wPoint(wPoint onepoint) {
        this.x = onepoint.x;
        this.y = onepoint.y;
        this.z = onepoint.z;
    }

    /**
    * GetDistance(P)
    * Get the distance of two points;
    */
    public double GetDistance(wPoint P) {
        double distance = 0.0;
        double dx,dy,dz;

        dx = P.x - this.x;
        dy = P.y - this.y;
        dz = P.z - this.z;

        distance = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2) + Math.pow(dz,2));

        return distance;
    }

    /**
    * GetDistance(P1,P2)
    * Get the distance of two points;
    */
    public double GetDistance(wPoint P1,wPoint P2) {
        double distance = 0.0;
        double dx,dy,dz;

        dx = P2.x - P1.x;
        dy = P2.y - P1.y;
        dz = P2.z - P1.z;

        distance = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2) + Math.pow(dz,2));

        return distance;
    }

    public void printAll() {
        List<String []>  myMap = this.GetPairData();
        System.out.println("Entity List's Size: " + myMap.size());
		for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();
    }

    public List<String []> GetPairData() {
        List<String []> params =new ArrayList<>();

        List<String > DXFStr = new ArrayList<>();
		
		DXFStr = this.getDXF();
		
        for (int i = 0; i< DXFStr.size(); i = i + 2) {
            params.add(new String[] {DXFStr.get(i),DXFStr.get(i + 1)});
        }

        return params;
    }

    public List<String> getDXF() {
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.add("  10");
        DXF_STR.add(Double.toString(this.x));
        DXF_STR.add("  20");
        DXF_STR.add(Double.toString(this.y));
        DXF_STR.add("  30");
        DXF_STR.add(Double.toString(this.z));

        return DXF_STR;
    }

    public String toString() {

        List<String> DXF_STR = new ArrayList<>();
        String str = new String();

        DXF_STR = this.getDXF();

        if (null != DXF_STR && DXF_STR.size() > 0) {
            String[] mListArray = DXF_STR.toArray(new String[DXF_STR.size()]);
            for (int i = 0; i < mListArray.length; i++) {
                if (i < mListArray.length - 1) {
                    str += mListArray[i] + "\r\n";
                } else {
                    str += mListArray[i];
                }
            }
        }

        return str;
    }
}