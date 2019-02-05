import java.util.*;

public class GC_Variable extends GroupCode{
	private GroupCode vVariable;
	//private String vType;
	private Object vObject;
	
	public GC_Variable(){
		vVariable = new GroupCode();
		vVariable.setCode("  9");
	}
	
	public GC_Variable(String v_value,Object obj){
		this();
		vVariable.setValue(v_value);
		//this.vType = type;
		this.vObject = obj;
	}
	
	/*
	public GC_Variable(Object obj){
		this();
		this.vObject = obj;
	}
	public GC_Variable(wPoint P){
		this();
		//this.vType = "wPoint";
		this.vObject = P;
	}
	public String getvType(){
		return this.vType;
	}	
	*/

	public GroupCode getvVariable(){
		return this.vVariable;
	}	

	public Object getvObject(){
		return this.vObject;
	}	

	public List<String> getDXF(){
        List<String> DXF_STR = new ArrayList<>();
		
		DXF_STR.addAll(this.vVariable.getDXF());
		
		if (this.vObject instanceof GroupCode) {
			DXF_STR.addAll(((GroupCode)this.vObject).getDXF());
		} else if (this.vObject instanceof GC_wPoint) {
			DXF_STR.addAll(((GC_wPoint)this.vObject).getDXF());
		} else if (this.vObject instanceof GC_wPoint2D) {
			DXF_STR.addAll(((GC_wPoint2D)this.vObject).getDXF());
		}else {
			System.out.println("Unacquainted Variable type!");
		}	
		
		/*
		switch (this.vType){
			case "GroupCode":
				DXF_STR.addAll(((GroupCode)this.vObject).getDXF());
				break;
			case "wPoint":
				DXF_STR.addAll(((GC_wPoint)this.vObject).getDXF());
				break;
			case "wPoint2D":
				//DXF_STR.addAll(((GC_wPoint2D)this.vObject).getDXF());
				break;
			case "GC_String":
				break;
			case "GC_Double":
				break;
			case "GC_Float":
				break;
			case "GC_Long":
				break;
			case "GC_Integer":
				break;
			case "GC_Boolean":
				break;
			default:
				System.out.println("Unacquainted Variable type!");
				break;	
		}	
		*/
        return DXF_STR;
	}		


	public static void main(String[] args) {
		List<String> DXF_STR = new ArrayList<>();
		
		GC_wPoint myGC_point = new GC_wPoint(10,22,55);
		
		GC_Variable myGC_Var = new GC_Variable("INBASE",myGC_point);
		
		DXF_STR = myGC_Var.getDXF();
		
		System.out.println(DXF_STR);
		System.out.println();
		System.out.println(myGC_Var);

	}	
}
