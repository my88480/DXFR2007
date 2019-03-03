//package www
//AutoCAD Entity--Circle
import java.util.*;
//import java.util.HashMap;

/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.6
*/
public class EntCircle extends EntBase {

    /**
     * code  10,20,30 -Start Point location (in WCS).
     * code  11,22,31 -End Point location (in WCS).
     */
    wPoint cPoint;

    /**
     * code  40 - Radius.
     */
    public     double       radius          = 0.0;

    /**
     * Constructor (empty).
     */
    public EntCircle() {
		this.EntityName = "CIRCLE";
		this.ObjectId = "1F";
		this.ClassLabel = "AcDbEntity";
		this.SubClassLabel = "AcDbCircle";

        this.cPoint = new wPoint();
        this.radius = 0.0;
    }

    /**
     * Constructor (double x_value,double y_value,double radius_value)
     * @param x_value -x of the circle's center point;
     * @param y_value -y of the circle's center point;
     * @param radius_value -radius of the circle;
     */
    public EntCircle(double x_value,double y_value,double radius_value) {
		this();
		
        this.cPoint = new wPoint(x_value,y_value);
        this.radius = radius_value;
    }

    /**
     * Constructor (double x_value,double y_value,double z_value,double radius_value)
     * @param x_value -x of the circle's center point;
     * @param y_value -y of the circle's center point;
     * @param z_value -z of the circle's center point;
     * @param radius_value -radius of the circle;
     */
    public EntCircle(double x_value,double y_value,double z_value,double radius_value) {
		this();
		
        this.cPoint = new wPoint(x_value,y_value,z_value);
        this.radius = radius_value;
    }

    /**
     * Constructor (wPoint2D cPoint,double radius_value)
     * @param cPoint -  center point of the circle;
    * @param radius_value -radius of the circle;
     */
    public EntCircle(wPoint2D cPoint,double radius_value) {
		this();
		
        this.cPoint = new wPoint(cPoint.x,cPoint.y);
        this.radius = radius_value;
    }

    /**
    * Constructor (wPoint cPoint,double radius_value)
    * @param cPoint -  center point of the circle;
        * @param radius_value -radius of the circle;
    */
    public EntCircle(wPoint cPoint,double radius_value) {
		this();
		
        this.cPoint = cPoint;
        this.radius = radius_value;
    }

    /**
     * Constructor (one_circle)
     * @param one_circle -one object derived from class EntCircle;
     */
    public EntCircle(EntCircle one_circle) {
		this();
		
        this.Layer = one_circle.Layer;
		this.cPoint = one_circle.cPoint;
        this.radius = one_circle.radius;
        this.thickness = one_circle.thickness;
        this.xExtrusionDirection = one_circle.xExtrusionDirection;
        this.yExtrusionDirection = one_circle.yExtrusionDirection;
        this.zExtrusionDirection = one_circle.zExtrusionDirection;
    }

    /**Perimeter
     * getPerimeter()
     * Get the area of the circle
     */
    public double getPerimeter() {
        double thePerimeter;

        thePerimeter = 2 * Math.PI * radius;

        return thePerimeter;
    }

    /**
     * getArea()
     * Get the area of the circle
     */
    public double getArea() {
        double theArea;

        theArea = Math.PI * Math.pow(radius,2);

        return theArea;
    }

    /**
     * getDXF()
     * @return the dxf data of entity circle.
     * <pre>Output example:
     * 0
     * CIRCLE
	 *   5
	 * 2511
	 * 330
	 * 1F
     * 100
     * AcDbEntity
     * 8
     * 0
     * 100
     * AcDbCircle
     * 10
     * 10.0
     * 20
     * 10.0
     * 30
     * 10.0
     * 11
     * 50.2314
     * 21
     * 30.12546
     * 31
     * 80.01234567890124
     * 39
     * 0.0
     * 210
     * 0.0
     * 220
     * 0.0
     * 230
     * 1.0</pre>
     */
    public List<String> getDXF() {
        List<String> DXF_STR = new ArrayList<>();
		
        DXF_STR.addAll(super.getDXF());
		
        DXF_STR.addAll(cPoint.getDXF());

        DXF_STR.add("  40");
        DXF_STR.add(Double.toString(this.radius));

        return DXF_STR;
    }

}