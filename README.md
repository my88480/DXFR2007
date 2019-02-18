# DXFR2007
Create AutoCAD DXF file without AutoCAD environment. compatible with AutoCAD R2007 and above.

Implement ENTITIES:<BR>
----ARC<BR>
----CIRCLE<BR>
----LINE<BR>
----LWPOLYLINE<BR>
----POINT<BR>
----TEXT<BR>
----ELLIPSE<BR>
----VERTEX<BR>
----POLYLINE<BR>
 ----Ray<BR>
 ----Xline<BR>
  
Parts file<br>
<img src="examples/R2K_Parts.png" alt="parts" style="max-width:100%;">


  Vesatile Contructors:
  
void	addEllipse()<BR>
addEllipse(empty) default Ellipse.

void	addEllipse(double x_value, double y_value, double ratio_value)<BR>
addEllipse(x_value,y_value,ratio_value)

void	addEllipse(double x_value, double y_value, double z_value, double ratio_value)<BR>
addEllipse(x_value,y_value,z_value,ratio_value)

void	addEllipse(double xc_value, double yc_value, double xl_value, double yl_value, double ratio_value)<BR>
addEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value)

void	addEllipse(double x_value, double y_value, double z_value, double ratio_value, double sAngle_value, double eAngle_value)<BR>
addEllipse(x_value,y_value,z_value,ratio_value,sAngle_value,eAngle_value)

void	addEllipse(double xc_value, double yc_value, double xl_value, double yl_value, double ratio_value, double sAngle_value, double eAngle_value)<BR>
addEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)

void	addEllipse(double xc_value, double yc_value, double zc_value, double xl_value, double yl_value, double zl_value, double ratio_value, double sAngle_value, double eAngle_value)<BR>
addEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)

void	addEllipse(EntEllipse oneEllipse)<BR>
addEllipse(oneEllipse)

void	addEllipse(wPoint2D lP, double ratio_value)<BR>
addEllipse(lP,ratio_value)

void	addEllipse(wPoint2D cP, double Radius, double radius)<BR>
addEllipse(cP,Radius,radius)

void	addEllipse(wPoint2D lP, double ratio_value, double sAngle_value, double eAngle_value)<BR>
addEllipse(lP,ratio_value,sAngle_value,eAngle_value)

void	addEllipse(wPoint2D cP, wPoint2D lP, double ratio_value)<BR>
addEllipse(cP,lP,ratio_value)

void	addEllipse(wPoint2D cP, wPoint2D lP, double ratio_value, double sAngle_value, double eAngle_value)<BR>
addEllipse(cP,lP,ratio_value,sAngle_value,eAngle_value)

void	addEllipse(wPoint2D Pc, wPoint2D Pa, wPoint2D Pb)<BR>
addEllipse(Pc,Pa,Pb)

void	addEllipse(wPoint cP, wPoint lP, double ratio_value)<BR>
addEllipse(cP,lP,ratio_value)

void	addEllipse(wPoint cP, wPoint lP, double ratio_value, double sAngle_value, double eAngle_value)<BR>
addEllipse(cP,lP,ratio_value,sAngle_value,eAngle_value)

Example one:

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
					this.addCircle(PC,PA,PB);
					this.addCircle(Pc,Pb,Pa);
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
		

Now, this project supports chinese character set(use system truetype font Arial.ttf). Thanks to JadeChong https://github.com/JadeChong <BR>
Unicode convert：
  This is mine.\U+4e2d\U+6587\U+6d4b\U+8bd5
  
  This project supports 180W+ Entities.
 
Our Goal: Elegant structure, Less codes, More powerful functions.

Change logs:

2019/02/04 add GroupCode Class.

2019/02/10 add two entities: XLine and Ray.

2019/02/14 change the codes of SecEntities.java.

2019/02/15  restruct two sections: Header,Classes(SecHeader.java SecClasses.java).

2019/02/18  change the static description of the Section Header and Classes to variable definitions. <BR>
	    add TableVPort.java<BR>
	    fix the reference to hex_handle <BR>


