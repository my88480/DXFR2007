//package www
//AutoCAD Entity--Arc
import java.util.*;

/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.6
*/
public class EntArc extends EntBase {

    /**
     * code  10,20,30 -Center Point location (in WCS).
     */
    wPoint cPoint;

    /**
     * code  40 - Radius.
     */
    public     double       radius          = 0.0;


    /**
     * code  50 - sAngle Degrees.
     */
    public     double       sAngle          = 0.0;

    /**
     * code  51 - eAngle Degrees.
     */
    public     double       eAngle          = 0.0;

    /**
     * Constructor (empty).
     */
    public EntArc() {
		super();
		this.EntityName = "ARC";
		this.ObjectId = "1F";
		this.ClassLabel = "AcDbEntity";
		this.SubClassLabel = "AcDbArc";
		
        this.cPoint = new wPoint();
        this.radius = 0.0;
        this.sAngle = 0.0;
        this.eAngle = 0.0;
    }

    /**
     * Constructor (double x_value,double y_value,double radius_value,double start_angle,double end_angle)
     * @param x_value -x of the arc's center point;
     * @param y_value -y of the arc's center point;
     * @param radius_value -radius of the arc;
     * @param start_angle - start angle of the arc;
     * @param end_angle - end angle of the arc;
     */
    public EntArc(double x_value,double y_value,double radius_value,double start_angle,double end_angle) {
        this();
		
        this.cPoint = new wPoint(x_value,y_value);
        this.radius = radius_value;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
    }

    /**
     * Constructor (wPoint2D cPoint,double radius_value,double start_angle,double end_angle)
     * @param cPoint - center point of the arc;
     * @param radius_value -radius of the arc;
     * @param start_angle - start angle of the arc;
     * @param end_angle - end angle of the arc;
     */
    public EntArc(wPoint2D cPoint,double radius_value,double start_angle,double end_angle) {
        this();
		
        this.cPoint = new wPoint(cPoint);
        this.radius = radius_value;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
    }

    /**
     * Constructor (double x_value,double y_value,double z_value,double radius_value,double start_angle,double end_angle)
     * @param x_value -x of the arc's center point;
     * @param y_value -y of the arc's center point;
     * @param z_value -z of the arc's center point;
     * @param radius_value - radius of the arc;
     * @param start_angle - start angle of the arc;
     * @param end_angle - end angle of the arc;
     */
    public EntArc(double x_value,double y_value,double z_value,double radius_value,double start_angle,double end_angle) {
        this();
		
        this.cPoint = new wPoint(x_value,y_value,z_value);
        this.radius = radius_value;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
    }

    /**
     * Constructor (wPoint cPoint,double radius_value,double start_angle,double end_angle)
     * @param cPoint - center point of the arc;
     * @param radius_value -radius of the arc;
     * @param start_angle - start angle of the arc;
     * @param end_angle - end angle of the arc;
     */
    public EntArc(wPoint cPoint,double radius_value,double start_angle,double end_angle) {
        this();
		
        this.cPoint = cPoint;
        this.radius = radius_value;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
    }

    /**
     * Constructor (Po,Pa,Pb)
     * @param Po - Center point of the Arc;
     * @param Pa - Start point of the Arc;
     * @param Pb - End point of the Arc;
     */
    public EntArc(wPoint2D Po,wPoint2D Pa,wPoint2D Pb) {
        this();
		
        double radis,start_angle,end_angle;
        double rb;

        radius = Math.sqrt(Math.pow(Pa.x-Po.x,2) + Math.pow(Pa.y-Po.y,2));
        rb  = Math.sqrt(Math.pow(Pa.x-Po.x,2) + Math.pow(Pa.y-Po.y,2));

        if (Math.abs(rb-radius) > 0.002) {
            System.out.println("Invalid input. delta radius=" + Math.abs(rb-radius));
        }

        start_angle = Math.toDegrees(Math.atan2((Pa.y - Po.y) , (Pa.x - Po.x)));

        end_angle = Math.toDegrees(Math.atan2((Pb.y - Po.y) , (Pb.x - Po.x)));

        this.cPoint = new wPoint(Po.x,Po.y,0.0);
        this.radius = radius;
        this.sAngle = start_angle;
        this.eAngle = end_angle;
    }

    /**
     * Constructor (one_arc)
     * @param one_arc -one object derived from class EntArc;
     */
    public EntArc(EntArc one_arc) {
        this();
		
		this.Layer = one_arc.Layer;
        this.cPoint = one_arc.cPoint;
        this.radius = one_arc.radius;
        this.sAngle = one_arc.sAngle;
        this.eAngle = one_arc.eAngle;
        this.thickness = one_arc.thickness;
        this.xExtrusionDirection = one_arc.xExtrusionDirection;
        this.yExtrusionDirection = one_arc.yExtrusionDirection;
        this.zExtrusionDirection = one_arc.zExtrusionDirection;
    }

    /**
     * MakesAngleSmaller (theArc)
     * @param theArc - One Arc to make the sAngle smaller than the end_angle;
    */
    public void MakeSAngleSmaller(EntArc theArc) {
        if (theArc.sAngle > theArc.eAngle) {
            double angle;
            angle = theArc.sAngle;
            theArc.sAngle = theArc.eAngle;
            theArc.eAngle = angle;
        }
    }

    /**
     * getAngle()
     * Get the angle of the arc
     */
    public double getAngle() {
        double angle;

        angle = this.eAngle - this.sAngle;

        return angle;
    }

    /**
     * getArcLength()
     * Get the arc length of the arc
     */
    public double getArcLength() {
        double arclength;

        arclength = 2 * Math.PI * this.radius * (this.eAngle - this.sAngle) / 360.0;

        return arclength;
    }

    /**
     * getArea()
     * Get the area of the arc
     */
    public double getArea() {
        double area;

        area = Math.PI * Math.pow(this.radius,2) * (this.eAngle - this.sAngle) / 360.0;

        return area;
    }

    /**
     * getDXF()
     * @return the dxf data of entity arc.
     * <pre>Output example:
     *   0
     * ARC
     *   5
     * 25F
     *   100
     * AcDbEntity
     *   8
     * 0
     *   100
     * AcDbCircle
     *   10
     * 132.54153503527186
     *   20
     * 253.8
      *  30
     * 0.0
     *   40
     * 21.0
     *   210
     * 0.0
      *  220
     * 0.0
     *   230
     * 1.0
     *   100
     * AcDbArc
     *   50
     * 90.0
      *  51
     * 163.8153602092225
     *   39
     * 0.0</pre>
     */
    public List<String> getDXF() {
        List<String> DXF_STR = new ArrayList<>();
		/*
        DXF_STR.add("  0");
        DXF_STR.add(this.EntityName);

        DXF_STR.add("  5");
        DXF_STR.add(this.Handle);

        DXF_STR.add("330");
        DXF_STR.add(this.ObjectId);

        DXF_STR.add("100");
        DXF_STR.add(this.ClassLabel);

        DXF_STR.add("8");
        DXF_STR.add(this.Layer);

        DXF_STR.add("100");
        DXF_STR.add("AcDbCircle");
		*/
		
		this.SubClassLabel = "AcDbCircle";
        DXF_STR.addAll(super.getDXF());
		this.SubClassLabel = "AcDbArc";
		
        DXF_STR.addAll(cPoint.getDXF());

        DXF_STR.add("  40");
        DXF_STR.add(Double.toString(this.radius));

        DXF_STR.add("100");
        DXF_STR.add(this.SubClassLabel);

        DXF_STR.add("  50");
        DXF_STR.add(Double.toString(this.sAngle));
        DXF_STR.add("  51");
        DXF_STR.add(Double.toString(this.eAngle));
        //DXF_STR.add("  39");
        //DXF_STR.add(Double.toString(this.thickness));
        return DXF_STR;
    }

}