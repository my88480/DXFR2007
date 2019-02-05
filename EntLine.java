//package www
//AutoCAD Entity--Line
import java.util.*;

/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.6
*/
public class EntLine extends EntBase {

    /**
     * code  10,20,30 -Start Point location (in WCS).
     * code  11,22,31 -End Point location (in WCS).
     */
    wPoint sPoint;
    wPoint ePoint;


    /**
     * Constructor (empty).
     */
    public EntLine() {
		this.EntityName = "LINE";
		this.ObjectId = "1F";
		this.ClassLabel = "AcDbEntity";
		this.SubClassLabel = "AcDbLine";
		
        this.sPoint = new wPoint();
        this.ePoint = new wPoint();
    }

    /**
     * Constructor (xs_value,ys_value,xe_value,ye_value)
     * @param xs_value -x of start point;
     * @param ys_value -y of start point;
     * @param xe_value -x of end point;
     * @param ye_value -y of end point;
     */
    public EntLine(double xs_value,double ys_value,double xe_value,double ye_value) {
        this();
		this.sPoint = new wPoint(xs_value,ys_value);
        this.ePoint = new wPoint(xe_value,ye_value);
    }

    /**
     * Constructor (xs_value,ys_value,xe_value,ye_value)
     * @param xs_value -x of start point;
     * @param ys_value -y of start point;
     * @param zs_value -z of start point;
     * @param xe_value -x of end point;
     * @param ye_value -y of end point;
     * @param ze_value -z of end point;
     */
    public EntLine(double xs_value,double ys_value,double zs_value,double xe_value,double ye_value,double ze_value) {
        this();
        this.sPoint = new wPoint(xs_value,ys_value,zs_value);
        this.ePoint = new wPoint(xe_value,ye_value,ze_value);
    }

    /**
     * Constructor (sPoint,ePoint)
     * @param sPoint -x of start point;
     * @param ePoint -y of start point;
     */
    public EntLine(wPoint2D sPoint,wPoint2D ePoint) {
        this();
        this.sPoint = new wPoint(sPoint.x,sPoint.y,0.0);
        this.ePoint = new wPoint(ePoint.x,ePoint.y,0.0);
    }

    /**
     * Constructor (sPoint,ePoint)
     * @param sPoint -x of start point;
     * @param ePoint -y of start point;
     */
    public EntLine(wPoint sPoint,wPoint ePoint) {
        this();
        this.sPoint = new wPoint(sPoint);
        this.ePoint = new wPoint(ePoint);
    }

    /**
     * Constructor (one_line)
     * @param one_line -one object derived from class EntLine;
     */
    public EntLine(EntLine one_line) {
        this();
        this.sPoint = one_line.sPoint;
        this.ePoint = one_line.ePoint;

        this.thickness = one_line.thickness;
        this.xExtrusionDirection = one_line.xExtrusionDirection;
        this.yExtrusionDirection = one_line.yExtrusionDirection;
        this.zExtrusionDirection = one_line.zExtrusionDirection;
    }

    /**
     * Get the vectorial Radian angle of the line. [0 -- 2*PI]
     */
    public double Angle2D() {
        double R_Angle;
        double delta_x,delta_y;

        delta_x = this.ePoint.x - this.sPoint.x;
        delta_y = this.ePoint.y - this.sPoint.y;
        R_Angle = Math.atan2(delta_y , delta_x);

        if (R_Angle < 0 ) {
            R_Angle = 2 * Math.PI + R_Angle;
        }

        return R_Angle;
    }

    /**
     * Get the vectorial Radian angle of line. [0 -- 360]
     */
    public double Angle2D_D() {
        double R_Angle,D_Angle;

        R_Angle = this.Angle2D();

        D_Angle = Math.toDegrees(R_Angle);

        return D_Angle;
    }

    /**
    * GetLength()
    * Get the length of the line;
    */
    public double GetLength() {
        double Length = 0.0;
        double dx,dy,dz;

        dx = this.ePoint.x - this.sPoint.x;
        dy = this.ePoint.y - this.sPoint.y;
        dz = this.ePoint.z - this.sPoint.z;

        Length = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2) + Math.pow(dz,2));

        return Length;
    }

    /**
     * getDXF()
     * @return the dxf data of entity line.
     * <pre>Output example:
     * 0
     * LINE
     * 100
     * AcDbEntity
     * 5
     * BB
     * 8
     * 0
     * 100
     * AcDbLine
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
		
        DXF_STR.addAll(sPoint.getDXF());

        DXF_STR.add("  11");
        DXF_STR.add(Double.toString(ePoint.x));
        DXF_STR.add("  21");
        DXF_STR.add(Double.toString(ePoint.y));
        DXF_STR.add("  31");
        DXF_STR.add(Double.toString(ePoint.z));

        return DXF_STR;
    }

}