//package www
//AutoCAD Entity -- Xline
import java.util.*;

/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.6
*/
public class EntXline extends EntBase {

    /**
     * code  10,20,30 -Start Point location (in WCS).
     * code  11,22,31 -End Point location (in WCS).
     */
    wPoint sPoint;
    wPoint ePoint;


    /**
     * Constructor (empty).
     */
    public EntXline() {
		this.EntityName = "XLINE";
		this.ObjectId = "1F";
		this.ClassLabel = "AcDbEntity";
		this.SubClassLabel = "AcDbXline";
		
        this.sPoint = new wPoint();
        this.ePoint = new wPoint();
    }

    /**
     * Constructor (sPoint,ePoint)
     * @param sPoint -x of start point;
     * @param ePoint -y of start point;
     */
    public EntXline(wPoint sPoint,wPoint ePoint) {
        this();
		
		this.sPoint = new wPoint(sPoint);
        
		wPoint P;
		
		P = new wPoint();
		
		P.x = (ePoint.x - sPoint.x) / Math.sqrt(Math.pow(ePoint.x - sPoint.x,2) + Math.pow(ePoint.y - sPoint.y,2) + Math.pow(ePoint.z - sPoint.z,2));
		P.y = (ePoint.y - sPoint.y) / Math.sqrt(Math.pow(ePoint.x - sPoint.x,2) + Math.pow(ePoint.y - sPoint.y,2) + Math.pow(ePoint.z - sPoint.z,2));
		P.z = (ePoint.z - sPoint.z) / Math.sqrt(Math.pow(ePoint.x - sPoint.x,2) + Math.pow(ePoint.y - sPoint.y,2) + Math.pow(ePoint.z - sPoint.z,2));
		
        this.ePoint = new wPoint(P);
    }

    /**
     * Constructor (xs_value,ys_value,xe_value,ye_value)
     * @param xs_value -x of start point;
     * @param ys_value -y of start point;
     * @param xe_value -x of end point;
     * @param ye_value -y of end point;
     */
    public EntXline(double xs_value,double ys_value,double xe_value,double ye_value) {
        this(new wPoint(xs_value,ys_value),new wPoint(xe_value,ye_value));
    }

     /**
     * Constructor (xs_value,ys_value,xe_value,ye_value)
     * @param xs_value -x of start point;
     * @param ys_value -y of start point;
     * @param xe_value -x of end point;
     * @param ye_value -y of end point;
     */
    //public EntXline(double xs_value,double ys_value,double xe_value,double ye_value) {
    //    this();
	//	this.sPoint = new wPoint(xs_value,ys_value);
    //    this.ePoint = new wPoint(xe_value,ye_value);
    //}

   /**
     * Constructor (xs_value,ys_value,zs_value,xe_value,ye_value,ze_value)
     * @param xs_value -x of start point;
     * @param ys_value -y of start point;
     * @param zs_value -z of start point;
     * @param xe_value -x of end point;
     * @param ye_value -y of end point;
     * @param ze_value -z of end point;
     */
    public EntXline(double xs_value,double ys_value,double zs_value,double xe_value,double ye_value,double ze_value) {
        this(new wPoint(xs_value,ys_value,zs_value),new wPoint(xe_value,ye_value,ze_value));
    }

    /**
     * Constructor (sPoint,ePoint)
     * @param sPoint -x of start point;
     * @param ePoint -y of start point;
     */
    public EntXline(wPoint2D sPoint,wPoint2D ePoint) {
        this(new wPoint(sPoint),new wPoint(ePoint));
    }

    /**
     * Constructor (aXline)
     * @param aXline -one object derived from class EntXline;
     */
    public EntXline(EntXline aXline) {
        this(aXline.sPoint,aXline.ePoint);

        this.thickness = aXline.thickness;
        this.xExtrusionDirection = aXline.xExtrusionDirection;
        this.yExtrusionDirection = aXline.yExtrusionDirection;
        this.zExtrusionDirection = aXline.zExtrusionDirection;
    }

    /**
     * Get the vectorial Radian angle of the xline. [0 -- 2*PI]
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
     * Get the vectorial Radian angle of xline. [0 -- 360]
     */
    public double Angle2D_D() {
        double R_Angle,D_Angle;

        R_Angle = this.Angle2D();

        D_Angle = Math.toDegrees(R_Angle);

        return D_Angle;
    }

    /**
     * getDXF()
     * @return the dxf data of entity xline.
     * <pre>Output example:
	 *   0
	 * XLINE
	 *   5
	 * 1B8
	 * 330
	 * 1F
	 * 100
	 * AcDbEntity
	 *   8
	 * 0
	 * 100
	 * AcDbXline
	 *  10
	 * 0.0
	 *  20
	 * 0.0
	 *  30
	 * 0.0
	 *  11
	 * -0.485071250072666
	 *  21
	 * -0.7276068751089989
	 *  31
	 * -0.485071250072666</pre>
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