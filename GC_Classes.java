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
		GC_ClassUnit myGC_classUnit;
		ClassUnit myclassUnit = new ClassUnit("ACDBDICTIONARYWDFLT","AcDbDictionaryWithDefault","ObjectDBX Classes",0,1,(short)0,(short)0);
		myGC_classUnit = new GC_ClassUnit(myclassUnit);
		myGC_Classes.addClassUnit(myGC_classUnit);
		
		System.out.println(myGC_Classes.getDXF());
		System.out.println();
		System.out.println(myGC_Classes);
	}	
}
