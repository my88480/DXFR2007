//package www
//AutoCAD Entity -- Ellipse
import java.util.*;
//import java.util.HashMap;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class EntEllipse extends EntBase {
    /**
     * code  0 -Entity name.
     */
    public String EntityName = "ELLIPSE";

    /**
     * code  5 - Handle.
     */
    public String Handle;

    /**
     * code  100 -Class Label.
     */
    public String ClassLabel = "AcDbEntity";

    /**
     * code  100 -Sub Class Label.
     */
    public String SubClassLabel = "AcDbEllipse";

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
    * code  39 - Thickness (optional; default  =  0).
    */
    public double thickness = 0.0;

    /**
     * code 210,220,230 -
     *            Extrusion direction. Present if the extrusion direction is
     *            not parallel to the world Z axis.
     */
    public double   xExtrusionDirection = 0;
    public double   yExtrusionDirection = 0;
    public double   zExtrusionDirection = 1;

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
        this.cPoint = cP;
        this.lPoint = lP;
        this.ratio = ratio_value;
        this.sAngle = sAngle_value;
        this.eAngle = eAngle_value;
        this.Handle = FileDXF.ApplyHandle();
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
        this(new wPoint(Pc),new wPoint(Pa),Pc.GetDistance(Pb) / Pc.GetDistance(Pa),0,2 * Math.PI);
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
     * Print2D()
     * Terminal output x,y of cPoint and lPoint.(one Ellipse)
     */
    public void Print2D() {
        System.out.println("Center point:  " + "x = " + this.cPoint.x+"   y = " + this.cPoint.y);
        System.out.println("Long axis point:  " + "x = " + this.lPoint.x+"   y = " + this.lPoint.y);
        System.out.println("ratio:  "+"x = " + this.ratio);
        System.out.println("Start angle=  " + this.sAngle+"   End angle= " + this.eAngle);
    }

    /**
     * Print3D()
     * Terminal output x,y,z of cPoint and lPoint.(one Ellipse)
     */
    public void Print3D() {
        System.out.println("Center point:  " + "x = " + this.cPoint.x+"   y = " + this.cPoint.y + "   z = " + this.cPoint.z);
        System.out.println("Long axis point:  " + "x = " + this.lPoint.x+"   y = " + this.lPoint.y + "   z = " + this.lPoint.z);
        System.out.println("ratio:  "+"x = " + this.ratio);
        System.out.println("Start angle=  " + this.sAngle+"   End angle= " + this.eAngle);
    }

    /**
     * GetRadius()
     * Get the Radius of the Ellipse
     */
    public double GetRadius() {
        double Radius;

        Radius = this.cPoint.GetDistance(lPoint);

        return Radius;
    }

    /**
     * Getradius()
     * Get the radius of the Ellipse
     */
    public double Getradius() {
        double Radius,radius;

        Radius = this.cPoint.GetDistance(lPoint);
        radius = Radius * this.ratio;

        return radius;
    }

    /**
     * GetAngle()
     * Get the angle of the Ellipse
     */
    public double GetAngle() {
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

        Radius = this.cPoint.GetDistance(lPoint);
        radius = Radius * this.ratio;

        parimeter = 2 * Math.PI * radius + 4 * (Radius - radius);

        return parimeter;
    }

    /**
     * GetArea()
     * Get the area of the Ellipse
     */
    public double GetArea() {
        double Radius,radius;
        double area;

        Radius = this.cPoint.GetDistance(lPoint);
        radius = Radius * this.ratio;

        area = Math.PI * Radius * radius;

        return area;
    }

    /**
     * GetDXFData()
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
    public List<String> GetDXFData() {
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.add("  0");
        DXF_STR.add(this.EntityName);

        DXF_STR.add("  5");
        DXF_STR.add(this.Handle);

        DXF_STR.add("330");
        DXF_STR.add("1F");

        DXF_STR.add("100");
        DXF_STR.add(this.ClassLabel);

        //DXF_STR.add("8");
        //DXF_STR.add(this.layer);
        DXF_STR.addAll(super.GetDXFData());

        DXF_STR.add("100");
        DXF_STR.add(this.SubClassLabel);

        DXF_STR.addAll(cPoint.GetDXFData());

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