//package www
//AutoCAD Entity -- VERTEX

import java.util.*;

/**
 * @author <a href="mailto:809758521@qq.com"> David Wu</a>
 * @version V0.6<BR>
 * Entity Vertex of AutoCAD DXF file.
 */
public class EntVertex extends EntBase {

    /**
     * code  10,20,30 -Point location (in WCS).
     */
    public wPoint bPoint;

    /**
     * code  40 - Starting width. (optional; default is 0).
     */
    public    double                      begwidth        = 0.0;
    /**
     * Starting width coded - true if code 40 is not just default.
     */
    public    boolean                     begwidth_set    = false;
    /**
     * code  41 - Ending width. (optional; default is 0).
     */
    public    double                      endwidth        = 0.0;
    /**
     *            Ending width coded - true if code 41 is not just default.
     */
    public    boolean                     endwidth_set    = false;

    /**
     * code  42 - Bulge (optional; default is 0). The bulge is the tangent of
     *            one fourth the included angle for an arc segment made
     *            negative if the arc goes clockwise from the start point to
     *            the endpoint.  A bulge of 0 indicates a straight segment,
     *            and a bulge of 1 is a semicircle.
     */
    public    double                      bulge           = 0.0;

    /**
     * code  50 - Curve fit tangent direction.
     */
    public    double                      tandir          = 0.0;

    /**
     * code  70 - Vertex flags.
     * <UL>
     *   <LI>  1 = Extra vertex created by curve-fitting.
     *   <LI>  2 = Curve-fit tangent defined for this vertex.  A curve-fit
     *             tangent direction of 0 may be omitted from DXF output
     *             but is significant if this bit is set.
     *   <LI>  4 = Not used.
     *   <LI>  8 = Spline vertex created by spline-fitting.
     *   <LI> 16 = Spline frame control point.
     *   <LI> 32 = 3D polyline vertex.
     *   <LI> 64 = 3D polygon mesh.
     *   <LI>128 = Polyface mesh vertex.
     * </UL>
     */
    public    int                         flags           = 32;

    /**
     * code  71 - Polyface mesh vertex index.
     *            Optional. Present only if nonzero.
     */
    public    int                         meshidx1        = 0;
    /**
     * code  72 - Polyface mesh vertex index.
     *            Optional. Present only if nonzero.
     */
    public    int                         meshidx2        = 0;
    /**
     * code  73 - Polyface mesh vertex index.
     *            Optional. Present only if nonzero.
     */
    public    int                         meshidx3        = 0;
    /**
     * code  74 - Polyface mesh vertex index.
     *            Optional. Present only if nonzero.
     */
    public    int                         meshidx4        = 0;

    /**
     * Constructor (empty).
     */
    public EntVertex() {
		this.EntityName = "VERTEX";
		this.ObjectId = "1F";
		this.ClassLabel = "AcDbEntity";
		this.SubClassLabel = "AcDbVertex";
		this.SubClassLabel2 = "AcDb2dVertex";  //AcDb2dVertex or AcDb3dPolylineVertex
        this.bPoint = new wPoint();
    }

    /**
     * Constructor (wPoint)
     * @param point
     */
    public EntVertex(wPoint point) {
        this();
		this.bPoint = point;
    }

    /**
     * Constructor (wPoint,objectID)
     * @param point
     */
    public EntVertex(wPoint point,String objectID) {
        this();
		this.bPoint = point;
		this.ObjectId = objectID;
    }

    /**
     * Constructor (x)
     * @param x_value
     */
    public EntVertex(double x_value) {
        this();
		this.bPoint = new wPoint(x_value);
    }

    /**
     * Constructor (x,y)
     * @param x_value
     * @param y_value
     */
    public EntVertex(double x_value,double y_value) {
        this();
		this.bPoint = new wPoint(x_value,y_value);
    }

    /**
     * Constructor (x,y,z)
     * @param x_value
     * @param y_value
     * @param z_value
     */
    public EntVertex(double x_value,double y_value,double z_value) {
        this();
		this.bPoint = new wPoint(x_value,y_value,z_value);
    }

    /**
     * Constructor (x,y,z,objectID)
     * @param x_value
     * @param y_value
     * @param z_value
     */
    public EntVertex(double x_value,double y_value,double z_value,String objectID) {
        this();
		this.bPoint = new wPoint(x_value,y_value,z_value);
		this.ObjectId = objectID;
    }

    /**
     * Constructor (point,objectID)
     * @param point
     * @param objectID
     */
    public EntVertex(wPoint2D point,String objectID) {
        this();
		this.bPoint = new wPoint(point);
		this.ObjectId = objectID;
    }

    /**
     * Constructor (oneVertex)
     * @param oneVertex
     */
    public EntVertex(EntVertex oneVertex) {
        this();
		this.ObjectId = oneVertex.ObjectId;
		this.bPoint = oneVertex.bPoint;
    }

    /**
     * Constructor (oneVertex)
     * @param oneVertex
     */
    public EntVertex(EntVertex oneVertex,String objectID) {
        this();
		this.ObjectId = objectID;
        this.bPoint = oneVertex.bPoint;
    }

    /**
     * GetDXF()
     * @return the dxf data of entity vertex.
     * <pre>Output example:
	 *   0
	 * VERTEX
	 *   5
	 * 234D
	 * 330
	 * 2349
	 * 100
	 * AcDbEntity
	 *   8
	 * 0
	 * 100
	 * AcDbVertex
	 * 100
	 * AcDb3dPolylineVertex
	 *  10
	 * 1338.139033841451
	 *  20
	 * -368.3368082426468
	 *  30
	 * 0.0
	 *  70
	 * 	32
	</pre>
     */
    public List<String> GetDXF() {
        List<String> DXF_STR = new ArrayList<>();
		/*
        DXF_STR.add("  0");
        DXF_STR.add(this.EntityName);

        DXF_STR.add("  5");
        DXF_STR.add(this.Handle);

        DXF_STR.add("  330");
        DXF_STR.add(this.ObjectId);

        DXF_STR.add("  100");
        DXF_STR.add(this.ClassLabel);

        //DXF_STR.add("8");
        //DXF_STR.add(this.layer);

        DXF_STR.add("  100");
        DXF_STR.add(this.SubClassLabel);
        DXF_STR.add("  100");
        DXF_STR.add(this.SubClassLabel2);
		*/
        DXF_STR.addAll(super.GetDXF());

        DXF_STR.addAll(this.bPoint.GetDXF());

        //DXF_STR.add("  39");
        //DXF_STR.add(Double.toString(this.thickness));
		
        DXF_STR.add("  70");
        DXF_STR.add(Integer.toString(this.flags));
		
        return DXF_STR;
    }


}