//package www
//This Version support AC1015,the dxf file created can be imported into all the versions of AutoCAD
//AutoCAD DXF File -- Six Sections: Header Classes Tables Blocks Entities Objects
import java.util.*;

import java.util.Date;
import java.text.SimpleDateFormat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;



/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.6
*/
public class FileDXF {
    /**
     * dxf_filename -DXF File name.
     */
    public String dxf_filename;

    /**
     * DXF File overlap? - default value:no.
     * DXF File named loft_output_*** will not be overlapped.
     */
    public boolean DXFFile_Overlap = false;

    /**
     * jpg_filename -JPG File name.
     */
    public String jpg_filename;


    public static String hex_handle = "2500";

    public static int int_handle = Integer.parseInt(hex_handle, 16);

    /**
     * Section Header.
     */
    SecHeader secHeader;

    /**
     * Section Classes.
     */
    SecClasses secClasses;

    /**
     * Section Tables.
     */
    SecTables secTables;

    /**
     * Section Blocks.
     */
    SecBlocks secBlocks;

    /**
     * Section Entities.
     */
    SecEntities secEntities;

    /**
     * Section Objects.
     */
    SecObjects secObjects;

    /**
     * code  0 -DXF File END tag.
     */
    public String DXFFileTail = "EOF";


    /**
     * Constructor (empty).
     */
    public FileDXF() {
        dxf_filename = new String();
        secHeader = new SecHeader();
        secClasses = new SecClasses();
        secTables = new SecTables();
        secBlocks = new SecBlocks();
        secEntities = new SecEntities();
        secObjects = new SecObjects();

    }

    /**
     * Constructor (dxf_file)
     * @param dxf_file -one DXF File;
     */
    public FileDXF(FileDXF dxf_file) {
        this.secHeader = dxf_file.secHeader;
        this.secClasses = dxf_file.secClasses;
        this.secTables = dxf_file.secTables;
        this.secBlocks = dxf_file.secBlocks;
        this.secEntities = dxf_file.secEntities;
        this.secObjects = dxf_file.secObjects;
    }

    public static String applyHandle() {
        String Handle = hex_handle;
		//System.out.println("Before:" + hex_handle);
        setNextHandle();
		//System.out.println("After:" + hex_handle);
		//System.out.println("Get:" + Handle);
        return Handle;
    }

    public static void setNextHandle() {
        int_handle += 1;
        hex_handle = Integer.toHexString(int_handle).toUpperCase();
        if (hex_handle.equals("BD") || hex_handle.equals("105")) {
            int_handle += 1;
            hex_handle = Integer.toHexString(int_handle).toUpperCase();
        }
    }

    /**
     * addPoint(x_value,y_value)
     * <pre>Add one Point into the Entities' Section
     * @param x_value - Axis X;
     * @param y_value - Axis Y;
     *	</pre>
    */
    public void addPoint(double x_value,double y_value) {
        this.secEntities.entities.add(new EntPoint(x_value,y_value));
    }

    /**
     * addPoint(point)
     * <pre>Add one Point into the Entities' Section
     * @param point - 2D point;
     *	</pre>
    */
    public void addPoint(wPoint2D point) {
        this.secEntities.entities.add(point);
    }

    /**
     * addPoint(x_value,y_value,z_value)
     * <pre>Add one Point into the Entities' Section
     * @param x_value - Axis X;
     * @param y_value - Axis Y;
     * @param z_value - Axis Z;
     *	</pre>
    */
    public void addPoint(double x_value,double y_value, double z_value) {
        this.secEntities.entities.add(new EntPoint(x_value,y_value,z_value));
    }

    /**
     * addPoint(point)
     * <pre>Add one Point into the Entities' Section
     * @param point - 3D point;
     *	</pre>
    */
    public void addPoint(wPoint point) {
        this.secEntities.entities.add(point);
    }

    /**
     * addPoint(myPoint)
     * <pre>Add one Point into the Entities' Section
     * @param myPoint - Point Entity;
     *	</pre>
    */
    public void addPoint(EntPoint myPoint) {
        this.secEntities.entities.add(myPoint);
    }

    /**
     * addLine(xs_value,ys_value,xe_value,ye_value)
     * <pre>Add one line into the Entities' Section
     * @param xs_value - Axis X;
     * @param ys_value - Axis Y;
     * @param xe_value - Axis X;
     * @param ye_value - Axis Y;
     *	</pre>
    */
    public void addLine(double xs_value,double ys_value,double xe_value,double ye_value) {
        this.secEntities.entities.add(new EntLine(xs_value,ys_value,xe_value,ye_value));
    }

    /**
     * addLine(xe_value,ye_value)
     * <pre>Add one line into the Entities' Section
     * @param xe_value - Axis X;
     * @param ye_value - Axis Y;
     *	</pre>
    */
    public void addLine(double xe_value,double ye_value) {
        this.addLine(0,0,xe_value,ye_value);
    }

    /**
     * addLine(sPoint,xe_value,ye_value)
     * <pre>Add one line into the Entities' Section
     * @param sPoint - Axis Y;
     * @param xe_value - Axis X;
     * @param ye_value - Axis Y;
     *	</pre>
    */
    public void addLine(wPoint2D sPoint,double xe_value,double ye_value) {
        this.addLine(sPoint.x,sPoint.y,xe_value,ye_value);
    }

    /**
     * addLine(xs_value,ys_value,ePoint)
     * <pre>Add one line into the Entities' Section
     * @param xs_value - Axis X;
     * @param ys_value - Axis Y;
     * @param ePoint - wPoint2D End Point;
     *	</pre>
    */
    public void addLine(double xs_value,double ys_value,wPoint2D ePoint) {
        this.addLine(xs_value,ys_value,ePoint.x,ePoint.y);
    }

    /**
     * addLine(sPoint,ePoint)
     * <pre>Add one line into the Entities' Section
     * @param sPoint - Start point of the line;
     * @param ePoint - End point of the line;
     *	</pre>
    */
    public void addLine(wPoint2D sPoint,wPoint2D ePoint) {
        this.secEntities.entities.add(new EntLine(sPoint,ePoint));
    }

    /**
     * addLine(xs_value,ys_value,zs_value,xe_value,ye_value,ze_value)
     * <pre>Add one line into the Entities' Section
     * @param xs_value - Axis X;
     * @param ys_value - Axis Y;
     * @param zs_value - Axis Z;
     * @param xe_value - Axis X;
     * @param ye_value - Axis Y;
     * @param ze_value - Axis Z;
     *	</pre>
    */
    public void addLine(double xs_value,double ys_value,double zs_value,double xe_value,double ye_value,double ze_value) {
        this.secEntities.entities.add(new EntLine(xs_value,ys_value,zs_value,xe_value,ye_value,ze_value));
    }

    /**
     * addLine(xe_value,ye_value,ze_value)
     * <pre>Add one line into the Entities' Section
     * @param xe_value - Axis X;
     * @param ye_value - Axis Y;
     * @param ze_value - Axis Z;
     *	</pre>
    */
    public void addLine(double xe_value,double ye_value,double ze_value) {
        this.addLine(0,0,0,xe_value,ye_value,ze_value);
    }

    /**
     * addLine(sPoint,ePoint)
     * <pre>Add one line into the Entities' Section
     * @param sPoint - Start point of the line;
     * @param ePoint - End point of the line;
     *	</pre>
    */
    public void addLine(wPoint sPoint,wPoint ePoint) {
        this.secEntities.entities.add(new EntLine(sPoint,ePoint));
    }

    /**
     * addLine(myLine)
     * <pre>Add one line into the Entities' Section
     * @param myLine - Line Entity;
     *	</pre>
    */
    public void addLine(EntLine myLine) {
        this.secEntities.entities.add(new EntLine(myLine));
    }

    /**
    * addCircle(radius)
    * <pre>Add one Circle into the Entities' Section
    * @param radius - radius;
    *	</pre>
        */
    public void addCircle(double radius) {
        wPoint2D cPoint;

        cPoint = new wPoint2D(0,0);
        this.secEntities.entities.add(new EntCircle(cPoint,radius));
    }

    /**
      * addCircle(x_value,y_value,radius)
      * <pre>Add one Circle into the Entities' Section
      * @param x_value - Axis X;
      * @param y_value - Axis Y;
      * @param radius - radius;
     *	</pre>
     */
    public void addCircle(double x_value,double y_value,double radius) {
        this.secEntities.entities.add(new EntCircle(x_value,y_value,radius));
    }

    /**
     * addCircle(x_value,y_value,z_value, radius)
     * <pre>Add one Circle into the Entities' Section
     * @param x_value - Axis X;
     * @param y_value - Axis Y;
     * @param z_value - Axis Z;
     * @param radius - radius;
     *	</pre>
    */
    public void addCircle(double x_value,double y_value, double z_value,double radius) {
        this.secEntities.entities.add(new EntCircle(x_value,y_value,z_value,radius));
    }

    /**
     * addCircle(cPoint,radius)
     * <pre>Add one Circle into the Entities' Section
     * @param cPoint - enter point of the circle;
     * @param radius - radius;
     *	</pre>
    */
    public void addCircle(wPoint2D cPoint,double radius) {
        this.secEntities.entities.add(new EntCircle(cPoint,radius));
    }

    /**
     * addCircle(cPoint,radius)
     * <pre>Add one Circle into the Entities' Section
     * @param cPoint - enter point of the circle;
     * @param radius - radius;
     *	</pre>
    */
    public void addCircle(wPoint cPoint,double radius) {
        this.secEntities.entities.add(new EntCircle(cPoint,radius));
    }

    /**
     * addCircle(myCircle)
     * <pre>Add one Circle into the Entities' Section
     * @param myCircle - Circle entity;
     *	</pre>
    */
    public void addCircle(EntCircle myCircle) {
        this.secEntities.entities.add(new EntCircle(myCircle));
    }

    /**
     * addArc(x_value,y_value,radius,start_angle,end_angle)
     * <pre>Add one arc into the Entities' Section
     * @param x_value - Axis X;
     * @param y_value - Axis Y;
     * @param radius - radius;
     * @param start_angle - start_angle;
     * @param end_angle - end_angle;
     *	</pre>
    */
    public void addArc(double x_value,double y_value,double radius,double start_angle,double end_angle) {
        this.secEntities.entities.add(new EntArc(x_value,y_value,radius,start_angle,end_angle));
    }

    /**
     * addArc(cPoint,,radius,start_angle,end_angle)
     * <pre>Add one arc into the Entities' Section
     * @param cPoint - Center point of the arc;
     * @param radius - radius;
     * @param start_angle - start_angle;
     * @param end_angle - end_angle;
     *	</pre>
    */
    public void addArc(wPoint2D cPoint,double radius,double start_angle,double end_angle) {
        this.secEntities.entities.add(new EntArc(cPoint,radius,start_angle,end_angle));
    }

    /**
     * addArc(x_value,y_value,z_value, radius,start_angle,end_angle)
     * <pre>Add one arc into the Entities' Section
     * @param x_value - Axis X;
     * @param y_value - Axis Y;
     * @param z_value - Axis Z;
     * @param radius - radius;
     * @param start_angle - start_angle;
     * @param end_angle - end_angle;
     *	</pre>
    */
    public void addArc(double x_value,double y_value, double z_value,double radius,double start_angle,double end_angle) {
        this.secEntities.entities.add(new EntArc(x_value,y_value,z_value,radius,start_angle,end_angle));
    }

    /**
     * addArc(radius,start_angle,end_angle)
     * <pre>Add one arc into the Entities' Section
     * @param radius - radius;
     * @param start_angle - start_angle;
     * @param end_angle - end_angle;
     *	</pre>
    */
    public void addArc(double radius,double start_angle,double end_angle) {
        this.secEntities.entities.add(new EntArc(0,0,0,radius,start_angle,end_angle));
    }

    /**
     * addArc(cPoint,radius,start_angle,end_angle)
     * <pre>Add one arc into the Entities' Section
     * @param cPoint - Center point of the arc;
     * @param radius - radius;
     * @param start_angle - start_angle;
     * @param end_angle - end_angle;
     *	</pre>
    */
    public void addArc(wPoint cPoint,double radius,double start_angle,double end_angle) {
        this.secEntities.entities.add(new EntArc(cPoint,radius,start_angle,end_angle));
    }

    /**
     * addArc(cPoint,sPoint,ePoint)
     * <pre>Add one arc into the Entities' Section
     * @param cPoint - Center point of the arc;
     * @param sPoint - Start point of the arc;
     * @param ePoint - End point of the arc;
     *	</pre>
    */
    public void addArc(wPoint2D cPoint,wPoint2D sPoint,wPoint2D ePoint) {
        this.secEntities.entities.add(new EntArc(cPoint,sPoint,ePoint));
    }

    /**
     * addArc(myArc)
     * <pre>Add one arc into the Entities' Section
     * @param myArc - one Arc Entity;
     *	</pre>
    */
    public void addArc(EntArc myArc) {
        this.secEntities.entities.add(new EntArc(myArc));
    }

    /**
     * addText(x_value,y_value,height_value,str))
     * <pre>Add one Text into the Entities' Section
     * @param x_value - Axis X;
     * @param y_value - Axis Y;
     * @param height_value - font's height;
     * @param str - TEXT's string;
     *	</pre>
    */
    public void addText(double x_value,double y_value ,double height_value,String str) {
        this.secEntities.entities.add(new EntText(x_value,y_value,height_value,str));
    }

    /**
     * addText(bPoint,height_value,str))
     * <pre>Add one Text into the Entities' Section
     * @param bPoint - insert point of the text;
     * @param height_value - font's height;
     * @param str - TEXT's string;
     *	</pre>
    */
    public void addText(wPoint2D bPoint,double height_value,String str) {
        this.secEntities.entities.add(new EntText(bPoint,height_value,str));
    }

    /**
     * addText(x_value,y_value,z_value,height_value,str)
     * <pre>Add one Text into the Entities' Section
     * @param x_value - Axis X;
     * @param y_value - Axis Y;
     * @param z_value - Axis Z;
     * @param height_value - font's height;
     * @param str - TEXT's string;
     *	</pre>
    */
    public void addText(double x_value,double y_value ,double z_value,double height_value,String str) {
        this.secEntities.entities.add(new EntText(x_value,y_value,z_value,height_value,str));
    }

    /**
     * addText(bPoint,height_value,str))
     * <pre>Add one Text into the Entities' Section
     * @param bPoint - insert point of the text;
     * @param height_value - font's height;
     * @param str - TEXT's string;
     *	</pre>
    */
    public void addText(wPoint bPoint,double height_value,String str) {
        this.secEntities.entities.add(new EntText(bPoint,height_value,str));
    }

    /**
     * addText(myText))
     * <pre>Add one Text into the Entities' Section
     * @param myText - Text Entity;
     *	</pre>
    */
    public void addText(EntText myText) {
        this.secEntities.entities.add(new EntText(myText));
    }

    /**
     * Constructor (x_value,y_value)
     * @param x_value -x of start vertex;
     * @param y_value -y of start vertex;
     */
    public void addPolyline(double[] x_value,double[] y_value) {
        this.secEntities.entities.add(new EntPolyline(x_value,y_value));
    }

    /**
     * Constructor (x_value,y_value,z_value)
     * @param x_value -x of start vertex;
     * @param y_value -y of start vertex;
     * @param z_value -z of start vertex;
     */
    public void addPolyline(double[] x_value,double[] y_value,double[] z_value) {
        this.secEntities.entities.add(new EntPolyline(x_value,y_value,z_value));
    }

    /**
     * addPolyline(points)
     * <pre>Add one Polyline into the Entities' Section
     * @param points - two dimensions array of double, x - points[i][0], y - points[i][1];
     *	</pre>
    */
    public void addPolyline(double[][] points) {
        this.secEntities.entities.add(new EntPolyline(points));
    }

    /**
     * addPolyline(myPolyline)
     * <pre>Add one Polyline into the Entities' Section
     * @param myPolyline - Polyline Entity;
     *	</pre>
    */
    public void addPolyline(EntPolyline myPolyline) {
        this.secEntities.entities.add(new EntPolyline(myPolyline));
    }

    /**
     * addLWPolyline(empty).
     */
    public void addLWPolyline() {
        this.secEntities.entities.add(new EntLWPolyline());
    }

    /**
     * addLWPolyline(x_value,y_value)
     * @param x_value -x of start vertex;
     * @param y_value -y of start vertex;
     */
    public void addLWPolyline(double[] x_value,double[] y_value) {
        this.secEntities.entities.add(new EntLWPolyline(x_value,y_value));
    }

    /**
     * addLWPolyline(x_value,y_value,z_value)
     * @param x_value -x of start vertex;
     * @param y_value -y of start vertex;
     * @param z_value -z of start vertex;
     */
    public void addLWPolyline(double[] x_value,double[] y_value,double[] z_value) {
        this.secEntities.entities.add(new EntLWPolyline(x_value,y_value,z_value));
    }

    /**
     * addLWPolyline(points)
     * @param points - two dimensions array of double, x - points[i][0], y - points[i][1];
     */
    public void addLWPolyline(double[][] points) {
        this.secEntities.entities.add(new EntLWPolyline(points));
    }

    /**
     * addVertex(one_point)
     * @param one_point -one vertex to add class EntLWPolyline;
     */
    public void addLWPolylineVertex(EntLWPolyline theLWPolyline,wPoint one_point) {
         theLWPolyline.Vertexs.add(one_point);
    }

    /**
     * addLWPolyline(one_LWPolyline)
     * @param one_LWPolyline -one object derived from class EntLWPolyline;
     */
    public void addLWPolyline(EntLWPolyline one_LWPolyline) {
        this.secEntities.entities.add(new EntLWPolyline(one_LWPolyline));
    }
	
    /**
     * addEllipse(empty)  default Ellipse.
     */
    public void addEllipse() {
        this.addEllipse(new wPoint(0,0,0),new wPoint(10,0,0),0.5,0,2 * Math.PI);
    }

    /**
     * addEllipse(cP,lP,ratio_value,sAngle_value,eAngle_value)
     * @param cP - center point of the Ellipse;
     * @param lP - End point of the Ellipse on the long axis;
     * @param ratio_value - Ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public void addEllipse(wPoint cP,wPoint lP,double ratio_value,double sAngle_value,double eAngle_value) {
        this.secEntities.entities.add(new EntEllipse(cP,lP,ratio_value,sAngle_value,eAngle_value));
    }

    /**
     * addEllipse(cP,lP,ratio_value)
     * @param cP - center point of the Ellipse;
     * @param lP - End point of the Ellipse on the long axis;
     * @param ratio_value - Ratio of the Ellipse;
     */
    public void addEllipse(wPoint cP,wPoint lP,double ratio_value) {
        this.addEllipse(cP,lP,ratio_value,0,2 * Math.PI);
    }

    /**
     * addEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)
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
    public void addEllipse(double xc_value,double yc_value,double zc_value,double xl_value,double yl_value,double zl_value,double ratio_value,double sAngle_value,double eAngle_value) {
        this.addEllipse(new wPoint(xc_value,yc_value,zc_value),new wPoint(xl_value,yl_value,zl_value),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * addEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)
     * @param xc_value - x of the Ellipse's center point;
     * @param yc_value - y of the Ellipse's center point;
     * @param xl_value - x of the Ellipse's long axis point;
     * @param yl_value - y of the Ellipse's long axis point;
     * @param ratio_value - ratio of the Ellipse(short axis / long axis);
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public void addEllipse(double xc_value,double yc_value,double xl_value,double yl_value,double ratio_value,double sAngle_value,double eAngle_value) {
        this.addEllipse(new wPoint(xc_value,yc_value),new wPoint(xl_value,yl_value),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * addEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value)
     * @param xc_value - x of the Ellipse's center point;
     * @param yc_value - y of the Ellipse's center point;
     * @param xl_value - x of the Ellipse's long axis point;
     * @param yl_value - y of the Ellipse's long axis point;
     * @param ratio_value - ratio of the Ellipse(short axis / long axis);
     */
    public void addEllipse(double xc_value,double yc_value,double xl_value,double yl_value,double ratio_value) {
        this.addEllipse(new wPoint(xc_value,yc_value),new wPoint(xl_value,yl_value),ratio_value,0,2 * Math.PI);
    }

    /**
     * addEllipse(x_value,y_value,z_value,ratio_value,sAngle_value,eAngle_value)
     * @param x_value -x of the Ellipse's long axis point;
     * @param y_value -y of the Ellipse's long axis point;
     * @param z_value -z of the Ellipse's long axis point;
     * @param ratio_value - ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public void addEllipse(double x_value,double y_value,double z_value,double ratio_value,double sAngle_value,double eAngle_value) {
        this.addEllipse(new wPoint(0,0,0),new wPoint(x_value,y_value,z_value),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * addEllipse(x_value,y_value,z_value,ratio_value)
     * @param x_value -x of the Ellipse's long axis point;
     * @param y_value -y of the Ellipse's long axis point;
     * @param z_value -z of the Ellipse's long axis point;
     * @param ratio_value - ratio of the Ellipse;
     */
    public void addEllipse(double x_value,double y_value,double z_value,double ratio_value) {
        this.addEllipse(new wPoint(0,0,0),new wPoint(x_value,y_value,z_value),ratio_value,0,2 * Math.PI);
    }

    /**
     * addEllipse(x_value,y_value,ratio_value)
     * @param x_value -x of the Ellipse's long axis point;
     * @param y_value -y of the Ellipse's long axis point;
     * @param ratio_value -ratio of the Ellipse;
     */
    public void addEllipse(double x_value,double y_value,double ratio_value) {
        this.addEllipse(new wPoint(0,0,0),new wPoint(x_value,y_value,0),ratio_value,0,2 * Math.PI);
    }

    /**
     * addEllipse(cP,Radius,radius)
     * @param cP - long axis point of the Ellipse;
     * @param Radius - Radius(Long Axis) of the Ellipse;
     * @param radius - radius(Short Axis) of the Ellipse;
     */
    public void addEllipse(wPoint2D cP,double Radius,double radius) {
        this.addEllipse(new wPoint(cP),new wPoint(cP.x + Radius,cP.y,0),radius / Radius,0,2 * Math.PI);
    }

    /**
     * addEllipse(lP,ratio_value,sAngle_value,eAngle_value)
     * @param lP - long axis point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public void addEllipse(wPoint2D lP,double ratio_value,double sAngle_value,double eAngle_value) {
        this.addEllipse(new wPoint(0,0,0),new wPoint(lP),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * addEllipse(lP,ratio_value)
     * @param lP - long axis point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     */
    public void addEllipse(wPoint2D lP,double ratio_value) {
        this.addEllipse(new wPoint(0,0,0),new wPoint(lP),ratio_value,0,2 * Math.PI);
    }

    /**
     * addEllipse(cP,lP,ratio_value,sAngle_value,eAngle_value)
     * @param cP - center point of the Ellipse;
     * @param lP - long axis point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     * @param sAngle_value - start angle of the Ellipse;
     * @param eAngle_value - end angle of the Ellipse;
     */
    public void addEllipse(wPoint2D cP,wPoint2D lP,double ratio_value,double sAngle_value,double eAngle_value) {
        this.addEllipse(new wPoint(cP),new wPoint(lP),ratio_value,sAngle_value,eAngle_value);
    }

    /**
     * addEllipse(cP,lP,ratio_value)
     * @param cP - center point of the Ellipse;
     * @param lP - long axis point of the Ellipse;
     * @param ratio_value -ratio of the Ellipse;
     */
    public void addEllipse(wPoint2D cP,wPoint2D lP,double ratio_value) {
        this.addEllipse(new wPoint(cP),new wPoint(lP),ratio_value,0,2 * Math.PI);
    }

    /**
     * addEllipse(Pc,Pa,Pb)
     * @param Pc - Center point of the Ellipse;
     * @param Pa - Long axis point of the Ellipse;
     * @param Pb - Short axis point of the Ellipse;
     */
    public void addEllipse(wPoint2D Pc,wPoint2D Pa,wPoint2D Pb) {
        this.addEllipse(new wPoint(Pc),new wPoint(Pa),Pc.getDistance(Pb) / Pc.getDistance(Pa),0,2 * Math.PI);
    }

    /**
     * addEllipse(oneEllipse)
     * @param oneEllipse -one object derived from class EntEllipse;
     */
    public void addEllipse(EntEllipse oneEllipse) {
        this.addEllipse(oneEllipse.cPoint,oneEllipse.lPoint,oneEllipse.ratio,oneEllipse.sAngle,oneEllipse.eAngle);
    }

    /**
     * printAll()
     * <pre>Terminal output the description of DXF file
     * Output example:
     *	</pre>
    public void printAll() {
        this.secHeader.printAll();
        this.secClasses.printAll();
        this.secTables.printAll();
        this.secBlocks.printAll();
        this.secEntities.printAll();
        this.secObjects.printAll();
    }
    */

    /**
     * getPairData()
     * @return Map of elements description of DXF file.
     * <pre>Output example:
     *	</pre>
    public List<String []> getPairData() {
        List<String []> params=new ArrayList<>();

        params.addAll(this.secHeader.getPairData());
        params.addAll(this.secClasses.getPairData());
        params.addAll(this.secTables.getPairData());
        params.addAll(this.secBlocks.getPairData());
        params.addAll(this.secEntities.getPairData());
        params.addAll(this.secObjects.getPairData());

        params.add(new String[] {"  0",this.DXFFileTail});

        return params;
    }
     */

    public void printAll() {
        List<String []>  myMap = this.getPairData();
        System.out.println("Entity List's Size: " + myMap.size());
		for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();
    }

    public List<String []> getPairData() {
        List<String []> params =new ArrayList<>();

        List<String > DXFStr = new ArrayList<>();
		
		DXFStr = this.getDXF();
		
        for (int i = 0; i< DXFStr.size(); i = i + 2) {
            params.add(new String[] {DXFStr.get(i),DXFStr.get(i + 1)});
        }

        return params;
    }

    /**
     * getDXF()
     * @return the dxf data of the DXF file.
     * <pre>Output example:
     *	</pre>
     */
    public List<String> getDXF() {

        List<String> DXF_STR = new ArrayList<>();
        List<String> DXF_STR_Header = new ArrayList<>();
        List<String> DXF_STR_Classes = new ArrayList<>();
        List<String> DXF_STR_Tables = new ArrayList<>();
        List<String> DXF_STR_Blocks = new ArrayList<>();
        List<String> DXF_STR_Entities = new ArrayList<>();
        List<String> DXF_STR_Objects = new ArrayList<>();
		
        DXF_STR_Classes = this.secClasses.getDXF();
        DXF_STR_Tables = this.secTables.getDXF();
        DXF_STR_Blocks = this.secBlocks.getDXF();
        DXF_STR_Entities = this.secEntities.getDXF();
        DXF_STR_Objects = this.secObjects.getDXF();
        //put to the last,for Handle
		DXF_STR_Header = this.secHeader.getDXF();

        DXF_STR.addAll(DXF_STR_Header);
        DXF_STR.addAll(DXF_STR_Classes);
        DXF_STR.addAll(DXF_STR_Tables);
        DXF_STR.addAll(DXF_STR_Blocks);
        DXF_STR.addAll(DXF_STR_Entities);
        DXF_STR.addAll(DXF_STR_Objects);

        DXF_STR.add("  0");
        DXF_STR.add(this.DXFFileTail);

        return DXF_STR;
    }

    /**
     * toString()
     * Override the toString method of FileDXF Class.
     * <pre>Output example:
     *	</pre>
     */
    public String toString() {
        /* require the jar file --- common-lang3
        List<String> DXF_STR = new ArrayList<>();
        String str = new String();

        DXF_STR = this.getDXF();
        str = String.join(",",DXF_STR);
        */

        List<String> DXF_STR = new ArrayList<>();
        String str = new String();

        DXF_STR = this.getDXF();

        if (null != DXF_STR && DXF_STR.size() > 0) {
            String[] mListArray = DXF_STR.toArray(new String[DXF_STR.size()]);
            for (int i = 0; i < mListArray.length; i++) {
                if (i < mListArray.length - 1) {
                    str += mListArray[i] + "\r\n";
                } else {
                    str += mListArray[i];
                }
            }
        }

        return str;
    }

    /**
     * DXF_WRITER()
     * Write dxf data into a file.
     * <pre>Output : one file which extension name is dxf
     *	</pre>
     */
    public void DXF_WRITER() throws Exception {

        SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        String extension_filename = ".dxf";

        if (this.dxf_filename == null || this.dxf_filename.length() < 1) {
            this.dxf_filename = "loft_output_" + df.format(new Date()) + "_0" + extension_filename;
        }

        File file = new File(this.dxf_filename);

        //If output dxf file has already existed, then create another DXF file.
        if (this.dxf_filename.indexOf("loft_output_") != -1 ) {
            for (int i=1; file.exists(); i++) {
                file = new File("loft_output_" + df.format(new Date()) + "_" + i + extension_filename);
            }
        }

        Writer out = new FileWriter(file);
        List<String> dxf_str = this.getDXF();
        for (int i  =  0; i < dxf_str.size(); i++) {
            out.write(dxf_str.get(i) + System.getProperty("line.separator"));
        }
        out.flush();
        out.close();
    }

    /**
     * DXF_WRITER(filename)
     * Write dxf data into a file.
     * @param filename - a filename named one DXF file;
     * <pre>Output : one file which extension name is dxf
     *	</pre>
     */
    public void DXF_WRITER(String filename) throws Exception {

        this.dxf_filename = filename;

        //File file = new File(this.dxf_filename);

        this.DXF_WRITER();

        /*
        Writer out = new FileWriter(file);
        List<String> dxf_str = this.getDXF();
        for (int i  =  0; i < dxf_str.size(); i++) {
            out.write(dxf_str.get(i) + System.getProperty("line.separator"));
        }
        out.flush();
        out.close();
        */
    }

	//The following function is complicate, Need to create one class FileImage
    /**
     * PNG_WRITER()
     * Try to create one image for DXF entities.
     * <pre>Output : one file which extension name is png
     *	</pre>
     */
    public void PNG_WRITER() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        this.jpg_filename = "cylinder_" + df.format(new Date()) + ".png";

        String s="÷–Œƒ≤‚ ‘Apache Flink 1.7.0 Release Announcement";
        Font font = new Font("SimSong", Font.BOLD, 25);
        BufferedImage bi = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_RGB);
        //Graphics2D g2 = (Graphics2D) bi.getGraphics();
        Graphics2D g2 = bi.createGraphics();
        //bi = g2.getDeviceConfiguration().createCompatibleImage(1200, 800, Transparency.TRANSLUCENT);

        //g2.setBackground(Color.WHITE);
        //g2.clearRect(0, 0, 1200, 800);
        g2.setPaint(Color.BLUE);
        g2.setFont(font);

        g2.drawString(s, (int) 400, (int) 400);
        g2.drawLine(0, 0, 800, 600);

        FileOutputStream fos = null;
        fos = new FileOutputStream(new File(this.jpg_filename));
        ImageIO.write(bi, "png", fos);
        fos.close();
        g2.dispose();
        /*
        File file = new File(this.dxf_filename);

        Writer out = new FileWriter(file);
        List<String> dxf_str = this.getDXF();
        for (int i  =  0; i < dxf_str.size(); i++) {
            out.write(dxf_str.get(i) + System.getProperty("line.separator"));
        }
        out.flush();
        out.close();
        */
    }


}

