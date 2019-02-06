//package www
//AutoCAD Entity--Point
import java.util.*;

/**
 * @author <a href="mailto:809758521@qq.com"> David Wu</a>
 * @version V0.6
 * Entity Point of AutoCAD DXF file.
 */
public class EntPoint extends EntBase {
	GC_EntPoint gc_EntPoint;

    /**
     * code  10,20,30 -Point location (in WCS).
     */
    public wPoint bPoint;

    //bPoint = new wPoint();  //Should not be here.move to the constructor.

    /**
     * Constructor (empty).
     */
    public EntPoint() {
		this.EntityName = "POINT";
		this.ObjectId = "1F";
		this.ClassLabel = "AcDbEntity";
		this.SubClassLabel = "AcDbPoint";
		
        this.bPoint = new wPoint();
    }

    /**
     * Constructor (x)
     * @param x_value
     */
    public EntPoint(double x_value) {
        this();
		bPoint = new wPoint(x_value);
    }

    /**
     * Constructor (x,y)
     * @param x_value
     * @param y_value
     */
    public EntPoint(double x_value,double y_value) {
        this();
        bPoint = new wPoint(x_value,y_value);
    }

    /**
     * Constructor (x,y,z)
     * @param x_value
     * @param y_value
     * @param z_value
     */
    public EntPoint(double x_value,double y_value,double z_value) {
        this();
        bPoint = new wPoint(x_value,y_value,z_value);
    }

    /**
     * Constructor (P)
     * @param P
     */
    public EntPoint(wPoint2D P) {
        this();
		bPoint = new wPoint(P);
    }

    /**
     * Constructor (P)
     * @param P
     */
    public EntPoint(wPoint P) {
        this();
		bPoint = P;
    }

    /**
     * Constructor (EntPoint)
     * @param P
     */
    public EntPoint(EntPoint P) {
        this();
		bPoint = P.bPoint;

        this.thickness = P.thickness;
        this.xang = P.xang;
        this.xExtrusionDirection = P.xExtrusionDirection;
        this.yExtrusionDirection = P.yExtrusionDirection;
        this.zExtrusionDirection = P.zExtrusionDirection;
    }

    /**
     * getDXF()
     * @return the dxf data of entity point.
     * <pre>Output example:
     * 0
     * POINT
     * 100
     * AcDbEntity
     * 8
     * 0
     * 100
     * AcDbPoint
     * 10
     * 10.0
     * 20
     * 10.0
     * 30
     * 10.0
     * 39
     * 0.0
     * 50
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
		/*
        DXF_STR.add("  0");
        DXF_STR.add(this.EntityName);
		
        DXF_STR.add("  5");
        DXF_STR.add(this.Handle);

        DXF_STR.add("330");
        DXF_STR.add(this.ObjectId);

        DXF_STR.add("  100");
        DXF_STR.add(this.ClassLabel);
		*/
       //DXF_STR.add("8");
        //DXF_STR.add(this.layer);
        //DXF_STR.addAll(super.getDXF());

        //DXF_STR.add("  100");
        //DXF_STR.add(this.SubClassLabel);

        //DXF_STR.addAll(this.bPoint.getDXF());
        /*
        DXF_STR.add("10");
        DXF_STR.add(Double.toString(bPoint.x));
        DXF_STR.add("20");
        DXF_STR.add(Double.toString(bPoint.y));
        DXF_STR.add("30");
        DXF_STR.add(Double.toString(bPoint.z));
        */
        //DXF_STR.add("  39");
        //DXF_STR.add(Double.toString(thickness));
        /*
		DXF_STR.add("  50");
        DXF_STR.add(Double.toString(xang));
        DXF_STR.add("  210");
        DXF_STR.add(Double.toString(xExtrusionDirection));
        DXF_STR.add("  220");
        DXF_STR.add(Double.toString(yExtrusionDirection));
        DXF_STR.add("  230");
        DXF_STR.add(Double.toString(zExtrusionDirection));
		*/
		gc_EntPoint = new GC_EntPoint(this);
		DXF_STR.addAll(gc_EntPoint.getDXF());		
        return DXF_STR;
    }

}