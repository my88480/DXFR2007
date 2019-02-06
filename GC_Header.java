import java.util.*;

public class GC_Header extends GroupCode{
	List<GC_Variable> Vars ;
	
	public GC_Header(){
		this.Vars = new ArrayList<>();
	}
	
	public void addVar(GC_Variable var){
		this.Vars.add(var);
	}
	
	public List<String> getDXF(){
        List<String> DXF_STR = new ArrayList<>();

        for (int i=0; i< Vars.size(); i++) {
            DXF_STR.addAll(Vars.get(i).getDXF());
        }

        return DXF_STR;
	}		



	public static void main(String[] args) {
		GC_Header myGC_Header = new GC_Header();
		//myGC_Header.Vars = new ArrayList<>();
		
		GC_wPoint myGC_point = new GC_wPoint(10,22,55);
		
		GC_Variable myGC_Var = new GC_Variable("INBASE",myGC_point);
		myGC_Header.addVar(myGC_Var);
		
		System.out.println(myGC_Header.getDXF());
		System.out.println();
		System.out.println(myGC_Header);
        
		//DXF_STR.add(this.Code);
        //DXF_STR.add(this.Value);
		//System.out.println(this.vVariable.getDXF());
		//DXF_STR.addAll(this.vVariable.getDXF());
		//DXF_STR.addAll(((GC_wPoint)this.vObject).getDXF());
		
	}	
}
