import java.util.*;

public class GC_wPoint extends GroupCode{
	private GroupCode GC_x;
	private GroupCode GC_y;
	private GroupCode GC_z;
	
	public GC_wPoint(){
		GC_x = new GroupCode();
		GC_y = new GroupCode();
		GC_z = new GroupCode();
		
		GC_x.setCode(" 10");
		GC_y.setCode(" 20");
		GC_z.setCode(" 30");
	}

	public GC_wPoint(String xValue,String yValue,String zValue){
		this();
		GC_x.setValue(xValue);
		GC_y.setValue(yValue);
		GC_z.setValue(zValue);
	}	

	public GC_wPoint(String xValue,String yValue){
		this();
		GC_x.setValue(xValue);
		GC_y.setValue(yValue);
		GC_z.setValue("0.0");
	}	

	public GC_wPoint(double x,double y,double z){
		this();
		GC_x.setValue(Double.toString(x));
		GC_y.setValue(Double.toString(y));
		GC_z.setValue(Double.toString(z));
	}
	
	public GC_wPoint(double x,double y){
		this();
		GC_x.setValue(Double.toString(x));
		GC_y.setValue(Double.toString(y));
		GC_z.setValue(Double.toString(0.0));
	}
	
	public GC_wPoint(int x,int y,int z){
		this();
		GC_x.setValue(Integer.toString(x));
		GC_y.setValue(Integer.toString(y));
		GC_z.setValue(Integer.toString(z));
	}
	
	public GC_wPoint(int x,int y){
		this();
		GC_x.setValue(Integer.toString(x));
		GC_y.setValue(Integer.toString(y));
		GC_z.setValue(Integer.toString(0));
	}
	
	public GC_wPoint(wPoint P){
		this();
		GC_x.setValue(Double.toString(P.x));
		GC_y.setValue(Double.toString(P.y));
		GC_z.setValue(Double.toString(P.z));
	}
	
	public GC_wPoint(wPoint2D P){
		this();
		GC_x.setValue(Double.toString(P.x));
		GC_y.setValue(Double.toString(P.y));
		GC_z.setValue(0.0);
	}
	
	public wPoint getwPoint(){
		wPoint P;
		
		P = new wPoint();
		P.x = Double.valueOf(GC_x.getValue());
		P.y = Double.valueOf(GC_y.getValue());
		P.z = Double.valueOf(GC_z.getValue());
		
		return P;
	}
	
	public void setValue(wPoint P){
		GC_x.setValue(Double.toString(P.x));
		GC_y.setValue(Double.toString(P.y));
		GC_z.setValue(Double.toString(P.z));
	}
	
	public void setValue(wPoint2D P){
		GC_x.setValue(Double.toString(P.x));
		GC_y.setValue(Double.toString(P.y));
		GC_z.setValue(Double.toString(0.0));
	}
	
	public void setxValue(double x){
		GC_x.setValue(x);
	}	
	
	public void setyValue(double y){
		GC_y.setValue(y);
	}	
	
	public void setzValue(double z){
		GC_z.setValue(z);
	}	
	
	public void setxValue(int x){
		GC_x.setValue(x);
	}	
	
	public void setyValue(int y){
		GC_y.setValue(y);
	}	
	
	public void setzValue(int z){
		GC_z.setValue(z);
	}	
	
	public List<String> getDXF(){
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.addAll(GC_x.getDXF());
        DXF_STR.addAll(GC_y.getDXF());
        DXF_STR.addAll(GC_z.getDXF());

        return DXF_STR;
	}	
}	