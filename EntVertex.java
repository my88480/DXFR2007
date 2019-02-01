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
     * code  0 -Entity name.
     */
    public String EntityName = "VERTEX";

    /**
     * code  5 - Handle.
     */
    public String Handle;

    /**
     * code  330 - Object ID.
     */
    public String ObjectId ;

    /**
     * code  100 -Class Label.
     */
    public String ClassLabel = "AcDbEntity";

    /**
     * code  100 -Sub Class Label.
     */
    public String SubClassLabel = "AcDbVertex";

    /**
     * code  100 -Sub Class Label.
     * AcDb2dVertex or AcDb3dPolylineVertex
     */
    public String SubClassLabel2 = "AcDb3dPolylineVertex";

    /**
     * code  10,20,30 -Point location (in WCS).
     */
    public wPoint bPoint;

    //bPoint = new wPoint();  //Should not be here.move to the constructor.

    /**
    * code  39 - Thickness (optional; default  =  0).
    */
    public double thickness = 0.0;

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
     * Constructor (wPoint)
     * @param point
     */
    public EntVertex(wPoint point) {
        this.bPoint = point;
        this.Handle = FileDXF.ApplyHandle();
    }

    /**
     * Constructor (wPoint,objectID)
     * @param point
     */
    public EntVertex(wPoint point,String objectID) {
        this(new wPoint(point));
		this.ObjectId = objectID;
    }

    /**
     * Constructor (empty).
     */
    public EntVertex() {
        this(new wPoint());
    }

    /**
     * Constructor (x)
     * @param x_value
     */
    public EntVertex(double x_value) {
        this(new wPoint(x_value));
    }

    /**
     * Constructor (x,y)
     * @param x_value
     * @param y_value
     */
    public EntVertex(double x_value,double y_value) {
        this(new wPoint(x_value,y_value));
    }

    /**
     * Constructor (x,y,z)
     * @param x_value
     * @param y_value
     * @param z_value
     */
    public EntVertex(double x_value,double y_value,double z_value) {
        this(new wPoint(x_value,y_value,z_value));
    }

    /**
     * Constructor (x,y,z,objectID)
     * @param x_value
     * @param y_value
     * @param z_value
     */
    public EntVertex(double x_value,double y_value,double z_value,String objectID) {
        this(new wPoint(x_value,y_value,z_value));
		this.ObjectId = objectID;
    }

    /**
     * Constructor (point,objectID)
     * @param point
     * @param objectID
     */
    public EntVertex(wPoint2D point,String objectID) {
        this(new wPoint(point));
		this.ObjectId = objectID;
    }

    /**
     * Constructor (oneVertex)
     * @param oneVertex
     */
    public EntVertex(EntVertex oneVertex) {
        this.Handle = FileDXF.ApplyHandle();

		this.EntityName = oneVertex.EntityName;
		this.ObjectId = oneVertex.ObjectId;
		this.ClassLabel = oneVertex.ClassLabel;
		this.SubClassLabel = oneVertex.SubClassLabel;
		this.SubClassLabel2 = oneVertex.SubClassLabel2;
        this.bPoint = oneVertex.bPoint;
    }

    /**
     * Constructor (oneVertex)
     * @param oneVertex
     */
    public EntVertex(EntVertex oneVertex,String objectID) {
        this.Handle = FileDXF.ApplyHandle();
		
		this.ObjectId = objectID;
		
		this.EntityName = oneVertex.EntityName;
		this.ObjectId = oneVertex.ObjectId;
		this.ClassLabel = oneVertex.ClassLabel;
		this.SubClassLabel = oneVertex.SubClassLabel;
		this.SubClassLabel2 = oneVertex.SubClassLabel2;
        this.bPoint = oneVertex.bPoint;
    }

    /**
     * Print2D()
     * Terminal output x,y of the vertex.
     */
    public void Print2D() {
        System.out.println("x = " + bPoint.x + "   y = " + bPoint.y);
    }

    /**
     * Print3D()
     * Terminal output x,y,z of the vertex.
     */
    public void Print3D() {
        System.out.println("x = " + bPoint.x+"   y = " + bPoint.y+"   z = " + bPoint.z);
    }

    /**
     * GetDXFData()
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
    public List<String> GetDXFData() {
        List<String> DXF_STR = new ArrayList<>();

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
        DXF_STR.addAll(super.GetDXFData());

        DXF_STR.add("  100");
        DXF_STR.add(this.SubClassLabel);
        DXF_STR.add("  100");
        DXF_STR.add(this.SubClassLabel2);


        DXF_STR.addAll(this.bPoint.GetDXFData());

        //DXF_STR.add("  39");
        //DXF_STR.add(Double.toString(this.thickness));
		
        DXF_STR.add("  70");
        DXF_STR.add(Integer.toString(this.flags));
		
        return DXF_STR;
    }


}