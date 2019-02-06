//package www
//This Version support AC1009,the dxf file created can be imported into all the versions of AutoCAD
//AutoCAD DXF File -- Six Sections: Header Classes Tables Blocks Entities Objects
import java.util.*;
/*
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
*/

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class FileDXF_Composite extends FileDXF{
    /**
     * PointTanCircle(Po,Pc,r,type)
     * <pre>Draw tangent graphics
     * @param Po - insert point of the rectangle ;
     * @param Pc - the length of the rectangle ;
     * @param r - the height vertex of the rectangle;
     * @param type - 1:two lines,one arc;
     *               2:two lines,one circle;
     *               3:two lines;
     *               4:one line(small angle);
     *               5:one line(big angle);
 	 *	</pre>
    */
	public void PointTanCircle(wPoint2D Po,wPoint2D Pc,double r,int type){
		double alpha,beita;
		double angleA,angleB;
		double l,l_tan;
		wPoint2D Pa,Pb;
		
		l = Po.GetDistance(Pc);
		if (l > r){
			l_tan = Math.sqrt(Math.pow(l,2)-Math.pow(r,2));
			beita = Math.asin(r/l);
			
			alpha = Po.Angle2P(Pc);
			angleA = alpha - beita;
			angleB = alpha + beita;
			
			Pa = new wPoint2D();
			Pa.x = Po.x + l_tan * Math.cos(angleA);
			Pa.y = Po.y + l_tan * Math.sin(angleA);
			
			Pb = new wPoint2D();
			Pb.x = Po.x + l_tan * Math.cos(angleB);
			Pb.y = Po.y + l_tan * Math.sin(angleB);
			
			switch (type){
				case 1:
					this.addLine(Po,Pa);
					this.addLine(Po,Pb);
					this.addArc(Pc,Pa,Pb);
					break;
				case 2:
					this.addLine(Po,Pa);
					this.addLine(Po,Pb);
					this.addCircle(Pc,r);
					break;
				case 3:
					this.addLine(Po,Pa);
					this.addLine(Po,Pb);
					break;
				case 4:
					this.addLine(Po,Pa);
					break;
				case 5:
					this.addLine(Po,Pb);
					break;
				default:
					break;
			}
		}
	}
	
    /**
     * LineTanCircle(Po,L,Pc,r,type)
     * <pre>Draw tangent graphics
     * @param Po - insert point of the rectangle ;
     * @param L - the length of the rectangle ;
     * @param Pc - the length of the rectangle ;
     * @param r - the height vertex of the rectangle;
     * @param type - 1:three lines,one arc;
     *               2:three lines,one circle;
     *               3:three lines;
     *               4:two lines;
 	 *	</pre>
    */
	public void LineTanCircle(wPoint2D Po,double L,wPoint2D Pc,double r,int type){
		double alpha,beita;
		double angle,angleA,angleB;
		double ll,l,l_tan;
		wPoint2D Pa,Pb,Pd,Pe;
		
		l = Po.GetDistance(Pc);
		if (l > r){
			alpha = Po.Angle2P(Pc);
			beita = alpha - Math.PI / 2;
			Pd = new wPoint2D();
			Pd.x = Po.x + (L / 2) * Math.cos(beita);
			Pd.y = Po.y + (L / 2) * Math.sin(beita);
						
			ll = Math.sqrt(Math.pow(l,2) + Math.pow(L / 2,2));
			l_tan = Math.sqrt(Math.pow(ll,2) - Math.pow(r,2));
			
			alpha = Pd.Angle2P(Pc);
			beita = Math.asin(r/ll);
			
			angleA = alpha - beita;
			
			Pa = new wPoint2D();
			Pa.x = Pd.x + l_tan * Math.cos(angleA);
			Pa.y = Pd.y + l_tan * Math.sin(angleA);
			
			alpha = Po.Angle2P(Pc);
			beita = alpha + Math.PI / 2;
			Pe = new wPoint2D();
			Pe.x = Po.x + (L / 2) * Math.cos(beita);
			Pe.y = Po.y + (L / 2) * Math.sin(beita);
						
			alpha = Pe.Angle2P(Pc);
			beita = Math.asin(r/ll);
			
			angleB = alpha + beita;
			
			Pb = new wPoint2D();
			Pb.x = Pe.x + l_tan * Math.cos(angleB);
			Pb.y = Pe.y + l_tan * Math.sin(angleB);
			
			switch (type){
				case 1:
					this.addLine(Pd,Pe);
					this.addLine(Pd,Pa);
					this.addLine(Pe,Pb);
					this.addArc(Pc,Pa,Pb);
					break;
				case 2:
					this.addLine(Pd,Pe);
					this.addLine(Pd,Pa);
					this.addLine(Pe,Pb);
					this.addCircle(Pc,r);
					break;
				case 3:
					this.addLine(Pd,Pe);
					this.addLine(Pd,Pa);
					this.addLine(Pe,Pb);
					break;
				case 4:
					this.addLine(Pd,Pa);
					this.addLine(Pe,Pb);
					break;
				default:
					break;
			}
		}
	}

    /**
     * CircleTanCircle(PC,Pc,R,r,type)
     * <pre>Draw tangent graphics
     * @param PC - the length of the rectangle ;
     * @param Pc - center point of the Big Circle;
     * @param R - the radius of big Circle;
     * @param r - the radius of small Circle
     * @param type - 1:two lines,one arc;
     *               2:two lines,one circle;
     *               3:two lines;
     *               4:one line(small angle);
     *               5:one line(big angle);
 	 *	</pre>
    */
	public void CircleTanCircle(wPoint2D PC,double R,wPoint2D Pc,double r,int type){
		double alpha,beita;
		double angleA,angleB;
		double l,l_tan;
		wPoint2D PA,PB,Pa,Pb;
		
		l = Pc.GetDistance(PC);
		if (l > (R + r)){
			l_tan = Math.sqrt(Math.pow(l,2)-Math.pow(R-r,2));
			beita = Math.asin((R-r)/l);
			
			alpha = Pc.Angle2P(PC);
			angleA = alpha - beita - Math.PI/2;
			angleB = alpha + beita + Math.PI/2;
			
			Pa = new wPoint2D();
			Pa.x = Pc.x + r * Math.cos(angleA);
			Pa.y = Pc.y + r * Math.sin(angleA);
			
			Pb = new wPoint2D();
			Pb.x = Pc.x + r * Math.cos(angleB);
			Pb.y = Pc.y + r * Math.sin(angleB);
			
			PA = new wPoint2D();
			PA.x = PC.x + R * Math.cos(angleA);
			PA.y = PC.y + R * Math.sin(angleA);
			
			PB = new wPoint2D();
			PB.x = PC.x + R * Math.cos(angleB);
			PB.y = PC.y + R * Math.sin(angleB);
			
			switch (type){
				case 1:
					this.addLine(Pa,PA);
					this.addLine(Pb,PB);
					this.addArc(PC,PA,PB);
					this.addArc(Pc,Pb,Pa);
					break;
				case 2:
					this.addLine(Pa,PA);
					this.addLine(Pb,PB);
					this.addCircle(Pc,r);
					this.addCircle(PC,R);
					break;
				case 3:
					this.addLine(Pa,PA);
					this.addLine(Pb,PB);
					break;
				case 4:
					this.addLine(Pa,PA);
					break;
				case 5:
					this.addLine(Pb,PB);
					break;
				default:
					break;
			}
		}
	}
		

    /**
     * AddRectangle(bPoint,length,height)
     * <pre>Add one rectangle into the Entities' Section
     * @param bPoint - insert point of the rectangle ;
     * @param length - the length of the rectangle ;
     * @param height - the height vertex of the rectangle ;
 	 *	</pre>
    */
    public void AddRectangle(wPoint2D bPoint,double length,double height) {
		wPoint2D p1,p2,p3,p4;
		
		p1 = bPoint;
		p2 = new wPoint2D(bPoint.x + length, bPoint.y);
		p3 = new wPoint2D(bPoint.x + length, bPoint.y + height);
		p4 = new wPoint2D(bPoint.x , bPoint.y + height);
		
        this.secEntities.entities.add(new EntLine(p1,p2));
        this.secEntities.entities.add(new EntLine(p2,p3));
        this.secEntities.entities.add(new EntLine(p3,p4));
        this.secEntities.entities.add(new EntLine(p4,p1));
    }

	/**=====================================================================================**/
	/**Add combined Entities**/

    /**
     * AddRectangle(length,height)
     * <pre>Add one rectangle into the Entities' Section
     * @param length - the length of the rectangle ;
     * @param height - the height vertex of the rectangle ;
 	 *	</pre>
    */
    public void AddRectangle(double length,double height) {
		wPoint2D p1 = new wPoint2D(0,0);
		
		this.AddRectangle(p1,length,height);
    }

    /**
     * AddRectangle(point1,point2)
     * <pre>Add one rectangle into the Entities' Section
     * @param point1 - the vertex of the rectangle ;
     * @param point2 - the other vertex of the rectangle ;
 	 *	</pre>
    */
    public void AddRectangle(wPoint2D point1,wPoint2D point2) {
		wPoint2D p1,p2,p3,p4;
		
		p1 = new wPoint2D(point1);
		p2 = new wPoint2D(point2.x,point1.y);
		p3 = new wPoint2D(point2);
		p4 = new wPoint2D(point1.x,point2.y);
		
        this.addLine(p1,p2);
        this.addLine(p2,p3);
        this.addLine(p3,p4);
        this.addLine(p4,p1);
    }

    /**
     * AddSector(bPoint,radius,sAngle,eAngle)
     * <pre>Add one arc into the Entities' Section
     * @param bPoint - Center point of the arc;
     * @param radius - radius of the arc;
     * @param sAngle - start angle of the arc;
     * @param eAngle - end angle of the arc;
 	 *	</pre>
    */
    public void AddSector(wPoint2D bPoint,double radius,double sAngle,double eAngle) {
		wPoint2D sPoint,ePoint;
		
		sPoint = new wPoint2D(bPoint.x + radius * Math.cos(Math.toRadians(sAngle)),bPoint.y + radius * Math.sin(Math.toRadians(sAngle)));
		ePoint = new wPoint2D(bPoint.x + radius * Math.cos(Math.toRadians(eAngle)),bPoint.y + radius * Math.sin(Math.toRadians(eAngle)));
        this.addArc(bPoint,sPoint,ePoint);
        this.addLine(bPoint,sPoint);
        this.addLine(bPoint,ePoint);
    }
	
 	/**
     * AddSector(radius,sAngle,eAngle)
     * <pre>Add one arc into the Entities' Section
     * @param radius - radius of the arc;
     * @param sAngle - start angle of the arc;
     * @param eAngle - end angle of the arc;
 	 *	</pre>
    */
    public void AddSector(double radius,double sAngle,double eAngle) {
		wPoint2D bPoint;
		wPoint2D sPoint,ePoint;
		
		bPoint = new wPoint2D(0,0);

		this.AddSector(bPoint,radius,sAngle,eAngle);
		}
	
	/**
     * AddSector(radius,Angle)
     * <pre>Add one arc into the Entities' Section
     * @param radius - radius of the arc;
     * @param Angle - the angle of the arc;
 	 *	</pre>
    */
    public void AddSector(double radius,double Angle) {
		wPoint2D bPoint;
		wPoint2D sPoint,ePoint;
		double sAngle = 0;
		double eAngle = Angle;
		
		bPoint = new wPoint2D(0,0);
		this.AddSector(bPoint,radius,sAngle,eAngle);
    }

	/**
     * addCircle(radius)
     * <pre>Add one arc into the Entities' Section
     * @param radius - radius of the arc;
 	 *	</pre>
    */
    public void addCircle(double radius) {
		wPoint2D bPoint;
		
		bPoint = new wPoint2D(0,0);
		this.addCircle(bPoint,radius);
    }

   /**
     * AddDonut(bPoint,r1,r2,sAngle,eAngle)
     * <pre>Add one donut into the Entities' Section
     * @param bPoint - Center point of the donut;
     * @param r1 - small radius of the donut;
     * @param r2 - big radius of the donut;
     * @param sAngle - start angle of the donut;
     * @param eAngle - end angle of the donut;
 	 *	</pre>
    */
    public void AddDonut(wPoint2D bPoint,double r1,double r2,double sAngle,double eAngle) {
		wPoint2D sPoint,ePoint;
		wPoint2D SPoint,EPoint;
		
		sPoint = new wPoint2D(bPoint.x + r1 * Math.cos(Math.toRadians(sAngle)), bPoint.y + r1 * Math.sin(Math.toRadians(sAngle)));
		ePoint = new wPoint2D(bPoint.x + r1 * Math.cos(Math.toRadians(eAngle)), bPoint.y + r1 * Math.sin(Math.toRadians(eAngle)));
        this.addArc(bPoint,r1,sAngle,eAngle);
		
		SPoint = new wPoint2D(bPoint.x + r2 * Math.cos(Math.toRadians(sAngle)), bPoint.y + r2 * Math.sin(Math.toRadians(sAngle)));
		EPoint = new wPoint2D(bPoint.x + r2 * Math.cos(Math.toRadians(eAngle)), bPoint.y + r2 * Math.sin(Math.toRadians(eAngle)));
        this.addArc(new EntArc(bPoint,r2,sAngle,eAngle));
		
        this.addLine(new EntLine(SPoint,sPoint));
        this.addLine(new EntLine(EPoint,ePoint));
    }
	
   /**
     * AddDonut(r1,r2,Angle)
     * <pre>Add one donut into the Entities' Section
     * @param r1 - small radius of the donut;
     * @param r2 - big radius of the donut;
     * @param Angle - angle of the donut (> 0);
 	 *	</pre>
    */
    public void AddDonut(double r1,double r2,double Angle){
		wPoint2D bPoint;
		
		bPoint = new wPoint2D(0,0);
		
		this.AddDonut(bPoint,r1,r2,0.0,Angle);
    }
	

}

 