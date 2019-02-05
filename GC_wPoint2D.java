import java.util.*;

public class GC_wPoint2D extends GroupCode{
	private GroupCode GC_x;
	private GroupCode GC_y;
	
	public GC_wPoint2D(){
		GC_x = new GroupCode();
		GC_y = new GroupCode();
		
		GC_x.setCode(" 10");
		GC_y.setCode(" 20");
	}


	public GC_wPoint2D(String xValue,String yValue){
		this();
		GC_x.setValue(xValue);
		GC_y.setValue(yValue);
	}	

	public GC_wPoint2D(double x,double y){
		this();
		GC_x.setValue(Double.toString(x));
		GC_y.setValue(Double.toString(y));
	}
	
	public GC_wPoint2D(int x,int y){
		this();
		GC_x.setValue(Integer.toString(x));
		GC_y.setValue(Integer.toString(y));
	}
	
	public GC_wPoint2D(wPoint2D P){
		this();
		GC_x.setValue(Double.toString(P.x));
		GC_y.setValue(Double.toString(P.y));
	}
	
	public wPoint2D getwPoint(){
		wPoint2D P;
		
		P = new wPoint2D();
		P.x = Double.valueOf(GC_x.getValue());
		P.y = Double.valueOf(GC_y.getValue());
		
		return P;
	}
	
	public void setxValue(double x){
		GC_x.setValue(x);
	}	
	
	public void setyValue(double y){
		GC_y.setValue(y);
	}	
	
	public void setxValue(int x){
		GC_x.setValue(x);
	}	
	
	public void setyValue(int y){
		GC_y.setValue(y);
	}	
	
	public List<String> getDXF(){
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.addAll(GC_x.getDXF());
        DXF_STR.addAll(GC_y.getDXF());

        return DXF_STR;
	}	
}	