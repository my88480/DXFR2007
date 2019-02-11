//package www
//Point2D
import java.util.*;

/**
 * @author David Wu <809758521@qq.com>
 * @version V0.2
 * Definition of a point,composed by x,y(two coordinate values).
 */
public class wPoint2D {
    /**
     * code  10,20,30 -Point location (in WCS).
     */
    public double x = 0.0;
    public double y = 0.0;

    /**
     * Constructor by none.
     */
    public wPoint2D() {
        x=0.0;
        y=0.0;
    }

    /**
     * Constructor by x_value.
     */
    public wPoint2D(double x_value) {
        x=x_value;
        y=0.0;
    }

    /**
     * Constructor by x_value,y_value.
     */
    public wPoint2D(double x_value,double y_value) {
        x=x_value;
        y=y_value;
    }


    /**
     * Constructor by a object of Class wPoint2D.Or called wPoint2D Copier.
     */
    public wPoint2D(wPoint2D onepoint) {
        this.x=onepoint.x;
        this.y=onepoint.y;
    }

    /**
     * Get the vectorial(from p1 to p2) Radian angle of two 2D points. [0 -- 2*PI]
     */
    public double Angle2P(wPoint2D p) {
        double R_Angle;
        double delta_x,delta_y;

        delta_x = p.x - this.x;
        delta_y = p.y - this.y;
        R_Angle = Math.atan2(delta_y , delta_x);

        if (R_Angle < 0 ) {
            R_Angle = 2 * Math.PI + R_Angle;
        }

        return R_Angle;
    }

    /**
     * Get the vectorial(from p1 to p2) Radian angle of two 2D points. [0 -- 360]
     */
    public double Angle2P_D(wPoint2D p) {
        double R_Angle,D_Angle;

        R_Angle = this.Angle2P(p);

        D_Angle = Math.toDegrees(R_Angle);

        return D_Angle;
    }

    /**
     * Get the vectorial(from p1 to p2) Radian angle of two 2D points. [0 -- 2*PI]
     */
    public double Angle2P(wPoint2D p1,wPoint2D p2) {
        double R_Angle;
        double delta_x,delta_y;

        delta_x = p2.x - p1.x;
        delta_y = p2.y - p1.y;
        R_Angle = Math.atan2(delta_y , delta_x);

        if (R_Angle < 0 ) {
            R_Angle = 2 * Math.PI + R_Angle;
        }

        return R_Angle;
    }

    /**
     * Get the vectorial(from p1 to p2) Radian angle of two 2D points. [0 -- 360]
     */
    public double Angle2P_D(wPoint2D p1,wPoint2D p2) {
        double R_Angle,D_Angle;

        R_Angle = this.Angle2P(p1,p2);

        D_Angle = Math.toDegrees(R_Angle);

        return D_Angle;
    }

    /**
    * getDistance()
    * Get the distance of two points;
    */
    public double getDistance(wPoint2D P) {
        double Distance = 0.0;
        double dx,dy;

        dx = this.x - P.x;
        dy = this.y - P.y;

        Distance = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));

        return Distance;
    }

    /**
    * getDistance()
    * Get the distance of two points;
    */
    public double getDistance(wPoint2D P1,wPoint2D P2) {
        double Distance = 0.0;
        double dx,dy;

        dx = P2.x - P1.x;
        dy = P2.y - P1.y;

        Distance = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));

        return Distance;
    }

    public void printAll() {
        List<String []>  myMap = this.getPairData();
        System.out.println("Entity List's Size: " + myMap.size());
		for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();
    }

    public List<String []> getPairData() {
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

        return DXF_STR;
    }

    public String toString() {

        List<String> DXF_STR = new ArrayList<>();
        String returnString = new String();

        DXF_STR = this.getDXF();

        if (null != DXF_STR && DXF_STR.size() > 0) {
            String[] mListArray = DXF_STR.toArray(new String[DXF_STR.size()]);
            for (int i = 0; i < mListArray.length; i++) {
                if (i < mListArray.length - 1) {
                    returnString += mListArray[i] + "\r\n";
                } else {
                    returnString += mListArray[i];
                }
            }
        }

        return returnString;
    }
}