//package www
//AutoCAD Entity -- Polyline
import java.util.*;

/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.6
*/
public class EntPolyline extends EntBase {
    /**
     * code  5 - endHandle.
     */
    public String endHandle;

    /**
     * code  10,20,30
     *            A "dummy" point. The X and Y coordinates are always 0,
     *            and the Z coordinate is the polyline's elevation (in OCS
     *            when 2D, WCS when 3D).
     */
    public  wPoint     DummyPoint;

    /**
     * code  10,20,30 -Start Point location (in WCS).
     * code  11,22,31 -End Point location (in WCS).
     */
    public List<EntVertex> vertexs;
    /**
     * code  40 - Starting width (optional; default is 0).
     */
    public    double                      begwidth        = 0.0;
    /**
     *            Starting width coded - true if code 40 is not just default.
     */
    public    boolean                     begwidth_set    = false;
    /**
     * code  41 - Ending width (optional; default is 0).
     */
    public    double                      endwidth        = 0.0;
    /**
     *            Ending width coded - true if code 41 is not just default.
     */
    public    boolean                     endwidth_set    = false;

    /**
     * code  66 - Vertices-follow flag (always 1 for a polyline).
     */
    public    int                         vtxFollow       = 1;

    /**
     * code  70 - Polyline flag (bit-coded); default is 0.
     * <UL>
     *   <LI>  1 = This is a closed polyline (or a polygon mesh closed in
     *             the M directtion).
     *   <LI>  2 = Curve-fit vertices have been added.
     *   <LI>  4 = Spline-fit vertices have been added.
     *   <LI>  8 = This is a 3D polyline.
     *   <LI> 16 = This is a 3D polygon mesh.
     *   <LI> 32 = The polygon mesh is closed in the N direction.
     *   <LI> 64 = The polyline is a polyface mesh.
     *   <LI>128 = The linetype pattern is generated continuously
     *             around the vertices of this polyline.
     * </UL>
     */
    public    int                         TypeFlag           = 8;

    /**
     * code  71 - Polygon mesh M vertex count (optional; default = 0).
     */
    public    int                         meshcntM        = 0;
    /**
     * code  72 - Polygon mesh N vertex count (optional; default = 0).
     */
    public    int                         meshcntN        = 0;

    /**
     * code  73 - Smooth surface M density (optional; default = 0).
     */
    public    int                         smoothM         = 0;
	
    /**
     * code  74 - Smooth surface N density (optional; default = 0).
     */
    public    int                         smoothN         = 0;

    /**
     * code  75 - Curves and smooth surface type (optional; default = 0).
     * <UL>
     *   <LI>0 = No smooth surface fitted.
     *   <LI>5 = Quadratic B-spline surface.
     *   <LI>6 = Cubic B-spline surface.
     *   <LI>8 = Bezier surface.
     * </UL>
     */
    public    int                         surfType        = 0;
    /**
     * Constructor (empty).
     */
    public EntPolyline() {
		this.EntityName = "POLYLINE";
		this.ObjectId = "1F";
		this.ClassLabel = "AcDbEntity";
		this.SubClassLabel = "AcDb3dPolyline";

		this.DummyPoint = new wPoint();
		
        this.vertexs = new ArrayList<>();
    }

    /**
     * Constructor (x_value,y_value)
     * @param x_value -x of start vertex;
     * @param y_value -y of start vertex;
     */
    public EntPolyline(double[] x_value,double[] y_value) {
		this();

        for (int i=0;i < x_value.length;i++){
			this.addVertex(new wPoint(x_value[i],y_value[i]));
		}
    }

    /**
     * Constructor (x_value,y_value,z_value)
     * @param x_value -x of start vertex;
     * @param y_value -y of start vertex;
     * @param z_value -z of start vertex;
     */
    public EntPolyline(double[] x_value,double[] y_value,double[] z_value) {
		this();

        for (int i=0;i < x_value.length;i++){
			this.addVertex(new wPoint(x_value[i],y_value[i],z_value[i]));
		}
    }

    /**
     * Constructor (points)
     * @param points - two dimensions array of double, x - points[i][0], y - points[i][1];
     */
    public EntPolyline(double[][] points) {
		this();

        for (int i=0; i < points.length; i++) {
            if (points[i].length == 2) {
                this.addVertex(new wPoint(points[i][0],points[i][1]));
            } else if (points[i].length == 3) {
                this.addVertex(new wPoint(points[i][0],points[i][1],points[i][2]));
            }
        }
    }

    /**
     * Constructor (one_polyline)
     * @param one_polyline -one object derived from class EntPolyline;
     */
    public EntPolyline(EntPolyline one_polyline) {
		this();
     
		this.DummyPoint = new wPoint(one_polyline.DummyPoint);

        //this works ok.
        //this.vertexs.addAll(one_polyline.vertexs);
        for(int i=0; i<one_polyline.vertexs.size(); i++) {
            this.vertexs.add(one_polyline.vertexs.get(i));
        }

        this.thickness = one_polyline.thickness;
        this.begwidth = one_polyline.begwidth;
        this.begwidth_set = one_polyline.begwidth_set;
        this.endwidth = one_polyline.endwidth;
        this.endwidth_set = one_polyline.endwidth_set;
        this.vtxFollow = one_polyline.vtxFollow;
        this.TypeFlag = one_polyline.TypeFlag;
        this.meshcntM = one_polyline.meshcntM;
        this.meshcntN = one_polyline.meshcntN;
        this.smoothM = one_polyline.smoothM;
        this.smoothN = one_polyline.smoothN;
        this.surfType = one_polyline.surfType;
        this.xExtrusionDirection = one_polyline.xExtrusionDirection;
        this.yExtrusionDirection = one_polyline.yExtrusionDirection;
        this.zExtrusionDirection = one_polyline.zExtrusionDirection;

    }

    /**
     * addVertex(point)
     * @param point -one vertex to add class EntPolyline;
     */
    public void addVertex(wPoint2D point) {
		this.addVertex(new wPoint(point));
    }

    /**
     * addVertex(point)
     * @param point -one vertex to add class EntPolyline;
     */
    public void addVertex(wPoint point) {
		EntVertex myVertex;
		
		myVertex = new EntVertex(point);
		myVertex.ObjectId = this.Handle;
		myVertex.SubClassLabel2 = "AcDb3dPolylineVertex";
		myVertex.flags = 32;
		
        this.vertexs.add(myVertex);
    }

    /**
     * addVertex(one_vertex)
     * @param one_vertex -one vertex to add class EntPolyline;
     */
    //Abandon this method to avoid the vertex's ObjectId is null
	//public void addVertex(EntVertex one_vertex) {
    //    this.vertexs.add(new EntVertex(one_vertex,this.Handle));
    //}

    /**
    * getSize()
    * Get the number of the vertexs of the polyline;
    */
    public int getSize() {
        return this.vertexs.size();
    }

    /**
    * getLength()
    * Get the total length of the polyline;
    */
    public double getLength() {
        double Length = 0.0;

        for (int i = 1; i < this.vertexs.size(); i++) {
            //Length = Math.pow(vertexs.get(i).bPoint.x-vertexs.get(i-1).bPoint.x);
            //Length = Math.sqrt(Math.pow(vertexs.get(i).bPoint.x-vertexs.get(i-1).bPoint.x));
            double dx,dy,dz;

            dx = this.vertexs.get(i).bPoint.x - this.vertexs.get(i-1).bPoint.x;
            dy = this.vertexs.get(i).bPoint.y - this.vertexs.get(i-1).bPoint.y;
            dz = this.vertexs.get(i).bPoint.z - this.vertexs.get(i-1).bPoint.z;

            Length = Length + Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2) + Math.pow(dz,2) );
        }
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
		
		//Maybe endHandle is handled when the polyline is created,modified etc.
		this.endHandle = FileDXF.applyHandle();

		
		DXF_STR.addAll(super.getDXF());
		
        DXF_STR.add("  66");
        DXF_STR.add(Integer.toString(this.vtxFollow));
		
        DXF_STR.addAll(DummyPoint.getDXF());

        DXF_STR.add("  70");
        DXF_STR.add(Integer.toString(this.TypeFlag));

        for (int i  =  0; i < this.vertexs.size(); i++) {
            DXF_STR.addAll(this.vertexs.get(i).getDXF());
        }

        DXF_STR.add("  0");
        DXF_STR.add("SEQEND");

        DXF_STR.add("  5");
        DXF_STR.add(this.endHandle);

        DXF_STR.add("330");
        DXF_STR.add(this.Handle);

        DXF_STR.add("100");
        DXF_STR.add(this.ClassLabel);

        DXF_STR.add("  8");
        DXF_STR.add(this.Layer);

        return DXF_STR;
    }

}