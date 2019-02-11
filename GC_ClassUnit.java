import java.util.*;

public class GC_ClassUnit extends GroupCode{
	private GroupCode GC_Class;
	private GroupCode GC_RecordName;
	private GroupCode GC_ClassName;
	private GroupCode GC_AppName;
	private GroupCode GC_ProxyFlag;
	private GroupCode GC_InstanceCount;
	private GroupCode GC_WasAProxyFlag;
	private GroupCode GC_EntityFlag;
	
	public GC_ClassUnit(){
		GC_Class = new GroupCode();
		GC_Class.setCode("  0");
		GC_Class.setValue("CLASS");
		
		GC_RecordName = new GroupCode();
		GC_RecordName.setCode("  1");
		
		GC_ClassName = new GroupCode();
		GC_ClassName.setCode("  2");
		
		GC_AppName = new GroupCode();
		GC_AppName.setCode("  3");
		
		GC_ProxyFlag = new GroupCode();
		GC_ProxyFlag.setCode(" 90");
		
		GC_InstanceCount = new GroupCode();
		GC_InstanceCount.setCode(" 91");
		
		GC_WasAProxyFlag = new GroupCode();
		GC_WasAProxyFlag.setCode("280");
		
		GC_EntityFlag = new GroupCode();
		GC_EntityFlag.setCode("281");
	}
	
	public GC_ClassUnit(ClassUnit unit){
		this();
		GC_RecordName.setValue(unit.RecordName);
		GC_ClassName.setValue(unit.ClassName);
		GC_AppName.setValue(unit.AppName);
		GC_ProxyFlag.setValue(unit.ProxyFlag);
		GC_InstanceCount.setValue(unit.InstanceCount);
		GC_WasAProxyFlag.setValue(unit.WasAProxyFlag);
		GC_EntityFlag.setValue(unit.EntityFlag);
	}
	
	public void setRecordName(String recordName){
		GC_RecordName.setValue(recordName);
	}
	
	public void setClassName(String className){
		GC_ClassName.setValue(className);
	}
	
	public void setAppName(String appName){
		GC_AppName.setValue(appName);
	}
	
	public void setProxyFlag(String proxyFlag){
		GC_ProxyFlag.setValue(proxyFlag);
	}
	
	public void setInstanceCount(String instanceCount){
		GC_InstanceCount.setValue(instanceCount);
	}
	
	public void setWasAProxyFlag(String wasAProxyFlag){
		GC_WasAProxyFlag.setValue(wasAProxyFlag);
	}
	
	public void setEntityFlag(String entityFlag){
		GC_EntityFlag.setValue(entityFlag);
	}
	
	public List<String> getDXF(){
        List<String> DXF_STR = new ArrayList<>();

		DXF_STR.addAll(GC_Class.getDXF());
		DXF_STR.addAll(GC_RecordName.getDXF());
		DXF_STR.addAll(GC_ClassName.getDXF());
		DXF_STR.addAll(GC_AppName.getDXF());
		DXF_STR.addAll(GC_ProxyFlag.getDXF());
		DXF_STR.addAll(GC_InstanceCount.getDXF());
		DXF_STR.addAll(GC_WasAProxyFlag.getDXF());
		DXF_STR.addAll(GC_EntityFlag.getDXF());

        return DXF_STR;
	}		



	public static void main(String[] args) {
		GC_ClassUnit myGC_classUnit;
		ClassUnit myclassUnit = new ClassUnit("ACDBDICTIONARYWDFLT","AcDbDictionaryWithDefault","ObjectDBX Classes",0,1,(short)0,(short)0);
		myGC_classUnit = new GC_ClassUnit(myclassUnit);
		
		System.out.println(myGC_classUnit.getDXF());
		System.out.println();
		System.out.println(myGC_classUnit);
	}	
}
