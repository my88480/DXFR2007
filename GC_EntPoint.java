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


	public void setValue(wPoint P){
		GC_Point.setValue(P);
	}
	
	public void setValue(wPoint2D P){
		GC_Point.setValue(P);
	}

	public wPoint getwPoint(){
		wPoint P;
		
		P = new wPoint();
		P = GC_Point.getwPoint();
		
		return P;
	}
	
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