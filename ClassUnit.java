import java.util.*;

public class ClassUnit{
	GC_ClassUnit gc_ClassUnit;
	String RecordName;
	String ClassName;
	String AppName;
	int ProxyFlag;
	int InstanceCount;
	short WasAProxyFlag;
	short EntityFlag;
	
	public ClassUnit(String RecName,String ClsName,String appName,int proxyFlag,int instanceCount,short wasAProxyFlag,short entityFlag){
		this.RecordName = RecName;
		this.ClassName = ClsName;
		this.AppName = appName;
		this.ProxyFlag = proxyFlag;
		this.InstanceCount = instanceCount;
		this.WasAProxyFlag = wasAProxyFlag;
		this.EntityFlag = entityFlag;
		
		this.gc_ClassUnit = new GC_ClassUnit(this);
	}

	public List<String> getDXF(){
        List<String> DXF_STR = new ArrayList<>();

		gc_ClassUnit = new GC_ClassUnit(this);
		DXF_STR.addAll(gc_ClassUnit.getDXF());		

        return DXF_STR;
	}		



	public static void main(String[] args) {
		ClassUnit  myUnit;
		
		myUnit = new ClassUnit("ACDBDICTIONARYWDFLT","AcDbDictionaryWithDefault","ObjectDBX Classes",0,1,(short)0,(short)0);
		
		//System.out.println(myUnit.getDXF());
		System.out.println(myUnit.gc_ClassUnit);
		
	}	
}
