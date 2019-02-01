# DXFR2007
Operate AutoCAD DXF file without AutoCAD environment. compatible with AutoCAD R2007 at least.

Supported ENTITIES:<BR>
----ARC<BR>
----CIRCLE<BR>
----LINE<BR>
----LWPOLYLINE<BR>
----POINT<BR>
----TEXT<BR>
----ELLIPSE<BR>
  
  
  Vesatile Contructors:
  
void	AddEllipse()<BR>
AddEllipse(empty) default Ellipse.

void	AddEllipse(double x_value, double y_value, double ratio_value)<BR>
AddEllipse(x_value,y_value,ratio_value)

void	AddEllipse(double x_value, double y_value, double z_value, double ratio_value)<BR>
AddEllipse(x_value,y_value,z_value,ratio_value)

void	AddEllipse(double xc_value, double yc_value, double xl_value, double yl_value, double ratio_value)<BR>
AddEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value)

void	AddEllipse(double x_value, double y_value, double z_value, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(x_value,y_value,z_value,ratio_value,sAngle_value,eAngle_value)

void	AddEllipse(double xc_value, double yc_value, double xl_value, double yl_value, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)

void	AddEllipse(double xc_value, double yc_value, double zc_value, double xl_value, double yl_value, double zl_value, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(xc_value, yc_value, zc_value, xl_value, yl_value, zl_value, ratio_value, sAngle_value,eAngle_value)

void	AddEllipse(EntEllipse oneEllipse)<BR>
AddEllipse(oneEllipse)

void	AddEllipse(wPoint2D lP, double ratio_value)<BR>
AddEllipse(lP,ratio_value)

void	AddEllipse(wPoint2D cP, double Radius, double radius)<BR>
AddEllipse(cP,Radius,radius)

void	AddEllipse(wPoint2D lP, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(lP,ratio_value,sAngle_value,eAngle_value)

void	AddEllipse(wPoint2D cP, wPoint2D lP, double ratio_value)<BR>
AddEllipse(cP,lP,ratio_value)

void	AddEllipse(wPoint2D cP, wPoint2D lP, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(cP,lP,ratio_value,sAngle_value,eAngle_value)

void	AddEllipse(wPoint2D Pc, wPoint2D Pa, wPoint2D Pb)<BR>
AddEllipse(Pc,Pa,Pb)

void	AddEllipse(wPoint cP, wPoint lP, double ratio_value)<BR>
AddEllipse(cP,lP,ratio_value)

void	AddEllipse(wPoint cP, wPoint lP, double ratio_value, double sAngle_value, double eAngle_value)<BR>
AddEllipse(cP,lP,ratio_value,sAngle_value,eAngle_value)

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
					this.AddLine(Pa,PA);
					this.AddLine(Pb,PB);
					this.AddArc(PC,PA,PB);
					this.AddArc(Pc,Pb,Pa);
					break;
				case 2:
					this.AddLine(Pa,PA);
					this.AddLine(Pb,PB);
					this.AddCircle(Pc,r);
					this.AddCircle(PC,R);
					break;
				case 3:
					this.AddLine(Pa,PA);
					this.AddLine(Pb,PB);
					break;
				case 4:
					this.AddLine(Pa,PA);
					break;
				case 5:
					this.AddLine(Pb,PB);
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
 
