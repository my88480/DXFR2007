//package www
//AutoCAD Entity -- Ellipse
import java.util.*;

/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.5
*/
public class EntEllipse extends EntBase {

    /**
    * code  10,20,30 -Center Point location (in WCS).
    */
    wPoint cPoint;

    /**
     * code  11,21,31 -Long axis Point location (in WCS).
     */
    wPoint lPoint;

    /**
     * code  40 - ratio.
     */
    public     double       ratio          = 0.0;

    /**
     * code  41 - sAngle Degrees.
     */
    public     double       sAngle          = 0.0;

    /**
     * code  42 - eAngle Degrees.
     */
    public     double       eAngle          = 0.0;

    /**
     * Constructor (empty)  default Ellipse.
     */
    public EntEllipse() {
        this(new wPoint(0,0,0),new wPoint(10,0,0),0.5,0,2 * Math.PI);
    }

    /**
     * Constructor (cP,lP,ratio_value,sAngle_value,eAngle_value)
     * @param cP - center point of the Ellipse;
     * @param lP - End point of the Ellipse on the long axis;
     * @param ratio_value - Ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(wPoint cP,wPoint lP,double ratio_value,double sAngle_value,double eAngle_value) {
		this.EntityName = "ELLIPSE";
		this.ObjectId = "1F";
		this.ClassLabel = "AcDbEntity";
		this.SubClassLabel = "AcDbEllipse";
		
        this.cPoint = cP;
        this.lPoint = lP;
        this.ratio = ratio_value;
        this.sAngle = sAngle_value;
        this.eAngle = eAngle_value;
    }

    /**
     * Constructor (cP,lP,ratio_value)
     * @param cP - center point of the Ellipse;
     * @param lP - End point of the Ellipse on the long axis;
     * @param ratio_value - Ratio of the Ellipse;
     */
    public EntEllipse(wPoint cP,wPoint lP,double ratio_value) {
        this(cP,lP,ratio_value,0,2 * Math.PI);
    }

    /**
     * Constructor (xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)
     * @param xc_value - x of the Ellipse's center point;
     * @param yc_value - y of the Ellipse's center point;
     * @param zc_value - z of the Ellipse's center point;
     * @param xl_value - x of the Ellipse's long axis point;
     * @param yl_value - y of the Ellipse's long axis point;
     * @param zl_value - z of the Ellipse's long axis point;
     * @param ratio_value - ratio of the Ellipse(short axis / long axis);
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(double xc_value,double yc_value,double zc_value,double xl_value,double yl_value,double zl_value,double ratio_value,double sAngle_value,double eAngle_value) {
        this(new wPoint(xc_value,yc_value,zc_value),new wPoint(xl_value,yl_value,zl_value),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * Constructor (xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)
     * @param xc_value - x of the Ellipse's center point;
     * @param yc_value - y of the Ellipse's center point;
     * @param xl_value - x of the Ellipse's long axis point;
     * @param yl_value - y of the Ellipse's long axis point;
     * @param ratio_value - ratio of the Ellipse(short axis / long axis);
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(double xc_value,double yc_value,double xl_value,double yl_value,double ratio_value,double sAngle_value,double eAngle_value) {
        this(new wPoint(xc_value,yc_value),new wPoint(xl_value,yl_value),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * Constructor (xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value)
     * @param xc_value - x of the Ellipse's center point;
     * @param yc_value - y of the Ellipse's center point;
     * @param xl_value - x of the Ellipse's long axis point;
     * @param yl_value - y of the Ellipse's long axis point;
     * @param ratio_value - ratio of the Ellipse(short axis / long axis);
     */
    public EntEllipse(double xc_value,double yc_value,double xl_value,double yl_value,double ratio_value) {
        this(new wPoint(xc_value,yc_value),new wPoint(xl_value,yl_value),ratio_value,0,2 * Math.PI);
    }

    /**
     * Constructor (x_value,y_value,z_value,ratio_value,sAngle_value,eAngle_value)
     * @param x_value -x of the Ellipse's long axis point;
     * @param y_value -y of the Ellipse's long axis point;
     * @param z_value -z of the Ellipse's long axis point;
     * @param ratio_value - ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(double x_value,double y_value,double z_value,double ratio_value,double sAngle_value,double eAngle_value) {
        this(new wPoint(0,0,0),new wPoint(x_value,y_value,z_value),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * Constructor (x_value,y_value,z_value,ratio_value)
     * @param x_value -x of the Ellipse's long axis point;
     * @param y_value -y of the Ellipse's long axis point;
     * @param z_value -z of the Ellipse's long axis point;
     * @param ratio_value - ratio of the Ellipse;
     */
    public EntEllipse(double x_value,double y_value,double z_value,double ratio_value) {
        this(new wPoint(0,0,0),new wPoint(x_value,y_value,z_value),ratio_value,0,2 * Math.PI);
    }

    /**
     * Constructor (x_value,y_value,ratio_value)
     * @param x_value -x of the Ellipse's long axis point;
     * @param y_value -y of the Ellipse's long axis point;
     * @param ratio_value -ratio of the Ellipse;
     */
    public EntEllipse(double x_value,double y_value,double ratio_value) {
        this(new wPoint(0,0,0),new wPoint(x_value,y_value,0),ratio_value,0,2 * Math.PI);
    }

    /**
     * Constructor (cP,Radius,radius)
     * @param cP - long axis point of the Ellipse;
     * @param Radius - Radius(Long Axis) of the Ellipse;
     * @param radius - radius(Short Axis) of the Ellipse;
     */
    public EntEllipse(wPoint2D cP,double Radius,double radius) {
        this(new wPoint(cP),new wPoint(cP.x + Radius,cP.y,0),radius / Radius,0,2 * Math.PI);
    }

    /**
     * Constructor (lP,ratio_value,sAngle_value,eAngle_value)
     * @param lP - long axis point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(wPoint2D lP,double ratio_value,double sAngle_value,double eAngle_value) {
        this(new wPoint(0,0,0),new wPoint(lP),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * Constructor (lP,ratio_value)
     * @param lP - long axis point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     */
    public EntEllipse(wPoint2D lP,double ratio_value) {
        this(new wPoint(0,0,0),new wPoint(lP),ratio_value,0,2 * Math.PI);
    }

    /**
     * Constructor (cP,lP,ratio_value,sAngle_value,eAngle_value)
     * @param cP - center point of the Ellipse;
     * @param lP - long axis point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public EntEllipse(wPoint2D cP,wPoint2D lP,double ratio_value,double sAngle_value,double eAngle_value) {
        this(new wPoint(cP),new wPoint(lP),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * Constructor (cP,lP,ratio_value)
     * @param cP - center point of the Ellipse;
     * @param lP - long axis point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     */
    public EntEllipse(wPoint2D cP,wPoint2D lP,double ratio_value) {
        this(new wPoint(cP),new wPoint(lP),ratio_value,0,2 * Math.PI);
    }

    /**
     * Constructor (Pc,Pa,Pb)
     * @param Pc - Center point of the Ellipse;
     * @param Pa - Long axis point of the Ellipse;
     * @param Pb - Short axis point of the Ellipse;
     */
    public EntEllipse(wPoint2D Pc,wPoint2D Pa,wPoint2D Pb) {
        this(new wPoint(Pc),new wPoint(Pa),Pc.getDistance(Pb) / Pc.getDistance(Pa),0,2 * Math.PI);
    }

    /**
     * Constructor (oneEllipse)
     * @param oneEllipse -one object derived from class EntEllipse;
     */
    public EntEllipse(EntEllipse oneEllipse) {
        this(oneEllipse.cPoint,oneEllipse.lPoint,oneEllipse.ratio,oneEllipse.sAngle,oneEllipse.eAngle);
    }

    /**
     * MakesAngleSmaller (oneEllipse)
     * @param oneEllipse - One Ellipse to make the sAngle smaller than the eAngle;
    */
    public void MakeSAngleSmaller(EntEllipse oneEllipse) {
        if (oneEllipse.sAngle > oneEllipse.eAngle) {
            double angle;
            angle = oneEllipse.sAngle;
            oneEllipse.sAngle = oneEllipse.eAngle;
            oneEllipse.eAngle = angle;
        }
    }

    /**
     * GetRadius()
     * Get the Radius of the Ellipse
     */
    public double GetRadius() {
        double Radius;

        Radius = this.cPoint.getDistance(lPoint);

        return Radius;
    }

    /**
     * getRadius()
     * Get the radius of the Ellipse
     */
    public double getRadius() {
        double Radius,radius;

        Radius = this.cPoint.getDistance(lPoint);
        radius = Radius * this.ratio;

        return radius;
    }

    /**
     * getAngle()
     * Get the angle of the Ellipse
     */
    public double getAngle() {
        double angle;

        angle = this.eAngle - this.sAngle;

        return angle;
    }

    /**
     * GetParimeter()
     * Get the Ellipse length of the Ellipse
     */
    public double GetParimeter() {
        double Radius,radius;
        double parimeter;

        Radius = this.cPoint.getDistance(lPoint);
        radius = Radius * this.ratio;

        parimeter = 2 * Math.PI * radius + 4 * (Radius - radius);

        return parimeter;
    }

    /**
     * getArea()
     * Get the area of the Ellipse
     */
    public double getArea() {
        double Radius,radius;
        double area;

        Radius = this.cPoint.getDistance(lPoint);
        radius = Radius * this.ratio;

        area = Math.PI * Radius * radius;

        return area;
    }

    /**
     * getDXF()
     * @return the dxf data of entity Ellipse.
     * <pre>Output example:
     *   0
     * ELLIPSE
     *   5
     * 1B8
     * 330
     * 1F
     * 100
     * AcDbEntity
     *   8
     * 0
     * 100
     * AcDbEllipse
     *  10
     * 0.0
     *  20
     * 0.0
     *  30
     * 0.0
     *  11
     * 0.0
     *  21
     * -100.0
     *  31
     * 0.0
     * 210
     * 0.0
     * 220
     * 0.0
     * 230
     * 1.0
     * 40
     * 0.5
      * 41
     * 0.0
     *  42
     * 6.283185307179585</pre>
     */
    public List<String> getDXF() {
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.addAll(super.getDXF());

        DXF_STR.addAll(cPoint.getDXF());

        DXF_STR.add("  11");
        DXF_STR.add(Double.toString(this.lPoint.x));
        DXF_STR.add("  21");
        DXF_STR.add(Double.toString(this.lPoint.y));
        DXF_STR.add("  31");
        DXF_STR.add(Double.toString(this.lPoint.z));

        DXF_STR.add("  210");
        DXF_STR.add(Double.toString(this.xExtrusionDirection));
        DXF_STR.add("  220");
        DXF_STR.add(Double.toString(this.yExtrusionDirection));
        DXF_STR.add("  230");
        DXF_STR.add(Double.toString(this.zExtrusionDirection));

        DXF_STR.add("  40");
        DXF_STR.add(Double.toString(this.ratio));

        DXF_STR.add("  41");
        DXF_STR.add(Double.toString(this.sAngle));
        DXF_STR.add("  42");
        DXF_STR.add(Double.toString(this.eAngle));

        DXF_STR.add("  39");
        DXF_STR.add(Double.toString(this.thickness));

        return DXF_STR;
    }

}