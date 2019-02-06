import java.util.*;

public class GC_EntPoint extends GroupCode{
	private GroupCode GC_EntityName;
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
		GC_EntityName = new GroupCode("  0",Point.EntityName);
		GC_Handle = new GroupCode("  5",Point.Handle);
		GC_ObjectId = new GroupCode("330",Point.ObjectId);
		GC_ClassLabel = new GroupCode("100",Point.ClassLabel);
		GC_Layer = new GroupCode("  8",Point.Layer);
		GC_SubClassLabel = new GroupCode("100",Point.SubClassLabel);
		GC_Point = new GC_wPoint(Point.bPoint);
	}	

	public void setEntityName(String EntityName){
		GC_EntityName.setValue(EntityName);
	}
	
	public void setHandle(String Handle){
		GC_Handle.setValue(Handle);
	}
	
	public void setObjectId(String ObjectId){
		GC_ObjectId.setValue(ObjectId);
	}
	
	public void setClassLabel(String ClassLabel){
		GC_ClassLabel.setValue(ClassLabel);
	}
	
	public void setLayer(String Layer){
		GC_Layer.setValue(Layer);
	}
	
	public void setSubClassLabel(String SubClassLabel){
		GC_SubClassLabel.setValue(SubClassLabel);
	}
	
	public void setPoint(wPoint P){
		GC_Point.setValue(P);
	}
	
	public void setPoint(wPoint2D P){
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

        DXF_STR.addAll(GC_EntityName.getDXF());
        DXF_STR.addAll(GC_Handle.getDXF());
        DXF_STR.addAll(GC_ObjectId.getDXF());
        DXF_STR.addAll(GC_ClassLabel.getDXF());
        DXF_STR.addAll(GC_Layer.getDXF());
        DXF_STR.addAll(GC_SubClassLabel.getDXF());
        DXF_STR.addAll(GC_Point.getDXF());

        return DXF_STR;
	}	
}	