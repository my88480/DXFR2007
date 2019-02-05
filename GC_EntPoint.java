import java.util.*;

public class GC_EntPoint extends GroupCode{
	private GroupCode GC_Name;
	private GroupCode GC_Handle;
	private GroupCode GC_ObjectId;
	private GroupCode GC_ClassLabel;
	private GroupCode GC_Layer;
	private GroupCode GC_SubClassLabel;
	private GC_wPoint GC_Point;
	
	public GC_EntPoint(){
	}

	public GC_EntPoint(EntPoint Point){
		this();
		GC_Name = new GroupCode("  0",Point.EntityName);
		GC_Handle = new GroupCode("  5",Point.Handle);
		GC_ObjectId = new GroupCode("330",Point.ObjectId);
		GC_ClassLabel = new GroupCode("100",Point.ClassLabel);
		GC_Layer = new GroupCode("  8",Point.Layer);
		GC_SubClassLabel = new GroupCode("100",Point.SubClassLabel);
		GC_Point = new GC_wPoint(Point.bPoint);
	}	

	/*
	public GC_EntPoint(String xValue,String yValue){
		this();
		GC_x.setValue(xValue);
		GC_y.setValue(yValue);
		GC_z.setValue("0.0");
	}	

	public GC_EntPoint(double x,double y,double z){
		this();
		GC_x.setValue(Double.toString(x));
		GC_y.setValue(Double.toString(y));
		GC_z.setValue(Double.toString(z));
	}
	
	public GC_EntPoint(double x,double y){
		this();
		GC_x.setValue(Double.toString(x));
		GC_y.setValue(Double.toString(y));
		GC_z.setValue(Double.toString(0.0));
	}
	
	public GC_EntPoint(int x,int y,int z){
		this();
		GC_x.setValue(Integer.toString(x));
		GC_y.setValue(Integer.toString(y));
		GC_z.setValue(Integer.toString(z));
	}
	
	public GC_EntPoint(int x,int y){
		this();
		GC_x.setValue(Integer.toString(x));
		GC_y.setValue(Integer.toString(y));
		GC_z.setValue(Integer.toString(0));
	}
	
	public GC_EntPoint(wPoint P){
		this();
		GC_x.setValue(Double.toString(P.x));
		GC_y.setValue(Double.toString(P.y));
		GC_z.setValue(Double.toString(P.z));
	}
	
	public GC_EntPoint(wPoint2D P){
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
	*/
	
	public List<String> getDXF(){
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.addAll(GC_Name.getDXF());
        DXF_STR.addAll(GC_Handle.getDXF());
        DXF_STR.addAll(GC_ObjectId.getDXF());
        DXF_STR.addAll(GC_ClassLabel.getDXF());
        DXF_STR.addAll(GC_Layer.getDXF());
        DXF_STR.addAll(GC_SubClassLabel.getDXF());
        DXF_STR.addAll(GC_Point.getDXF());

        return DXF_STR;
	}	
}	