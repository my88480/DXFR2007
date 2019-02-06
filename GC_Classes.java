import java.util.*;

public class GC_Classes extends GroupCode{
	List<GC_ClassUnit> Classes ;
	
	public GC_Classes(){
		this.Classes = new ArrayList<>();
	}
	
	public void addClassUnit(GC_ClassUnit classUnit){
		this.Classes.add(classUnit);
	}
	
	public List<String> getDXF(){
        List<String> DXF_STR = new ArrayList<>();

        for (int i=0; i< Classes.size(); i++) {
            DXF_STR.addAll(Classes.get(i).getDXF());
        }

        return DXF_STR;
	}		



	public static void main(String[] args) {
		GC_Classes myGC_Classes = new GC_Classes();
		
		GC_wPoint myGC_point = new GC_wPoint(10,22,55);
		
		GC_ClassUnit myGC_Var = new GC_ClassUnit("INBASE",myGC_point);
		myGC_Classes.addVar(myGC_Var);
		
		System.out.println(myGC_Classes.getDXF());
		System.out.println();
		System.out.println(myGC_Classes);
	}	
}
