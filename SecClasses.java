//package www
//AutoCAD Section -- Classes
import java.util.*;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class SecClasses {

    /**
     * code  0 -Entity section header.
     */
    public String SectionHeader = "SECTION";

    /**
     * code  0 -Entity section name.
     */
    public String SectionName = "CLASSES";

    /**
     * code  0 -Entity section END.
     */
    public String SectionTail = "ENDSEC";

	GC_Classes this_GC_Classes = new GC_Classes();

	public static ClassUnit ACDBDICTIONARYWDFLT = new ClassUnit("ACDBDICTIONARYWDFLT","AcDbDictionaryWithDefault","ObjectDBX Classes",0,1,(short)0,(short)0);

	public static ClassUnit MATERIAL = new ClassUnit("MATERIAL","AcDbMaterial","ObjectDBX Classes",1153,3,(short)0,(short)0);

	public static ClassUnit VISUALSTYLE = new ClassUnit("VISUALSTYLE","AcDbVisualStyle","ObjectDBX Classes",4095,16,(short)0,(short)0);

	public static ClassUnit TABLESTYLE = new ClassUnit("TABLESTYLE","AcDbTableStyle","ObjectDBX Classes",4095,1,(short)0,(short)0);

	public static ClassUnit SCALE = new ClassUnit("SCALE","AcDbScale","ObjectDBX Classes",1153,33,(short)0,(short)0);

	public static ClassUnit MLEADERSTYLE = new ClassUnit("MLEADERSTYLE","AcDbMLeaderStyle","ACDB_MLEADERSTYLE_CLASS",4095,1,(short)0,(short)0);

	public static ClassUnit SORTENTSTABLE = new ClassUnit("SORTENTSTABLE","AcDbSortentsTable","ObjectDBX Classes",0,0,(short)0,(short)0);

	public static ClassUnit MULTILEADER = new ClassUnit("MULTILEADER","AcDbMLeader","ACDB_MLEADER_CLASS",1025,0,(short)0,(short)1);

	public static ClassUnit ACAD_TABLE = new ClassUnit("ACAD_TABLE","AcDbTable","ObjectDBX Classes",1025,0,(short)0,(short)1);

	public static ClassUnit ACDB_BLKREFOBJECTCONTEXTDATA_CLASS = new ClassUnit("ACDB_BLKREFOBJECTCONTEXTDATA_CLASS","AcDbBlkRefObjectContextData","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit ACAD_EVALUATION_GRAPH = new ClassUnit("ACAD_EVALUATION_GRAPH","AcDbEvalGraph","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKLINEARPARAMETER = new ClassUnit("BLOCKLINEARPARAMETER","AcDbBlockLinearParameter","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKLINEARGRIP = new ClassUnit("BLOCKLINEARGRIP","AcDbBlockLinearGrip","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKGRIPLOCATIONCOMPONENT = new ClassUnit("BLOCKGRIPLOCATIONCOMPONENT","AcDbBlockGripExpr","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKLOOKUPPARAMETER = new ClassUnit("BLOCKLOOKUPPARAMETER","AcDbBlockLookupParameter","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKLOOKUPGRIP = new ClassUnit("BLOCKLOOKUPGRIP","AcDbBlockLookupGrip","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKMOVEACTION = new ClassUnit("BLOCKMOVEACTION","AcDbBlockMoveAction","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKSTRETCHACTION = new ClassUnit("BLOCKSTRETCHACTION","AcDbBlockStretchAction","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKLOOKUPACTION = new ClassUnit("BLOCKLOOKUPACTION","AcDbBlockLookupAction","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit ACDB_DYNAMICBLOCKPURGEPREVENTER_VERSION = new ClassUnit("ACDB_DYNAMICBLOCKPURGEPREVENTER_VERSION","AcDbDynamicBlockPurgePreventer","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit ACDB_BLOCKREPRESENTATION_DATA = new ClassUnit("ACDB_BLOCKREPRESENTATION_DATA","AcDbBlockRepresentationData","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKVISIBILITYPARAMETER = new ClassUnit("BLOCKVISIBILITYPARAMETER","AcDbBlockVisibilityParameter","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKVISIBILITYGRIP = new ClassUnit("BLOCKVISIBILITYGRIP","AcDbBlockVisibilityGrip","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKROTATIONPARAMETER = new ClassUnit("BLOCKROTATIONPARAMETER","AcDbBlockRotationParameter","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKROTATIONGRIP = new ClassUnit("BLOCKROTATIONGRIP","AcDbBlockRotationGrip","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKFLIPPARAMETER = new ClassUnit("BLOCKFLIPPARAMETER","AcDbBlockFlipParameter","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKFLIPGRIP = new ClassUnit("BLOCKFLIPGRIP","AcDbBlockFlipGrip","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKROTATEACTION = new ClassUnit("BLOCKROTATEACTION","AcDbBlockRotateAction","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKFLIPACTION = new ClassUnit("BLOCKFLIPACTION","AcDbBlockFlipAction","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit ACDB_MTEXTATTRIBUTEOBJECTCONTEXTDATA_CLASS = new ClassUnit("ACDB_MTEXTATTRIBUTEOBJECTCONTEXTDATA_CLASS","AcDbMTextAttributeObjectContextData","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKALIGNMENTPARAMETER = new ClassUnit("BLOCKALIGNMENTPARAMETER","AcDbBlockAlignmentParameter","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKALIGNMENTGRIP = new ClassUnit("BLOCKALIGNMENTGRIP","AcDbBlockAlignmentGrip","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKSCALEACTION = new ClassUnit("BLOCKSCALEACTION","AcDbBlockScaleAction","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKBASEPOINTPARAMETER = new ClassUnit("BLOCKBASEPOINTPARAMETER","AcDbBlockBasepointParameter","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKARRAYACTION = new ClassUnit("BLOCKARRAYACTION","AcDbBlockArrayAction","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKPOINTPARAMETER = new ClassUnit("BLOCKPOINTPARAMETER","AcDbBlockPointParameter","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit BLOCKXYGRIP = new ClassUnit("BLOCKXYGRIP","AcDbBlockXYGrip","ObjectDBX Classes",1153,0,(short)0,(short)0);

	public static ClassUnit CELLSTYLEMAP = new ClassUnit("CELLSTYLEMAP","AcDbCellStyleMap","ObjectDBX Classes",1152,2,(short)0,(short)0);

	public static ClassUnit DICTIONARYVAR = new ClassUnit("DICTIONARYVAR","AcDbDictionaryVar","ObjectDBX Classes",0,5,(short)0,(short)0);

	public void assembleClassesDXF(){
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.ACDBDICTIONARYWDFLT));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.MATERIAL));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.VISUALSTYLE));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.TABLESTYLE));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.SCALE));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.MLEADERSTYLE));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.SORTENTSTABLE));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.MULTILEADER));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.ACAD_TABLE));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.ACDB_BLKREFOBJECTCONTEXTDATA_CLASS));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.ACAD_EVALUATION_GRAPH));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKLINEARPARAMETER));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKLINEARGRIP));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKGRIPLOCATIONCOMPONENT));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKLOOKUPPARAMETER));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKLOOKUPGRIP));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKMOVEACTION));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKSTRETCHACTION));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKLOOKUPACTION));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.ACDB_DYNAMICBLOCKPURGEPREVENTER_VERSION));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.ACDB_BLOCKREPRESENTATION_DATA));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKVISIBILITYPARAMETER));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKVISIBILITYGRIP));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKROTATIONPARAMETER));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKROTATIONGRIP));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKFLIPPARAMETER));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKFLIPGRIP));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKROTATEACTION));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKFLIPACTION));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.ACDB_MTEXTATTRIBUTEOBJECTCONTEXTDATA_CLASS));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKALIGNMENTPARAMETER));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKALIGNMENTGRIP));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKSCALEACTION));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKBASEPOINTPARAMETER));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKARRAYACTION));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKPOINTPARAMETER));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.BLOCKXYGRIP));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.CELLSTYLEMAP));
		this_GC_Classes.addClassUnit(new GC_ClassUnit(this.DICTIONARYVAR));

	}
	
    /**
     * Constructor (empty).
     */
    public SecClasses() {
		this.assembleClassesDXF();
    }

	/**
	 * @return Returns the SectionHeader.
	 */
	public String getSectionHeader(){
		return this.SectionHeader;
	}

	/**
	 * @return Returns the SectionName.
	 */
	public String getSectionName(){
		return this.SectionName;
	}

	/**
	 * @return Returns the SectionTail.
	 */
	public String getSectionTail(){
		return this.SectionTail;
	}

	/**
	 * @return Returns the ACDBDICTIONARYWDFLT.
	 */
	public ClassUnit getACDBDICTIONARYWDFLT(){
		return this.ACDBDICTIONARYWDFLT;
	}

	/**
	 * @return Returns the MATERIAL.
	 */
	public ClassUnit getMATERIAL(){
		return this.MATERIAL;
	}

	/**
	 * @return Returns the VISUALSTYLE.
	 */
	public ClassUnit getVISUALSTYLE(){
		return this.VISUALSTYLE;
	}

	/**
	 * @return Returns the TABLESTYLE.
	 */
	public ClassUnit getTABLESTYLE(){
		return this.TABLESTYLE;
	}

	/**
	 * @return Returns the SCALE.
	 */
	public ClassUnit getSCALE(){
		return this.SCALE;
	}

	/**
	 * @return Returns the MLEADERSTYLE.
	 */
	public ClassUnit getMLEADERSTYLE(){
		return this.MLEADERSTYLE;
	}

	/**
	 * @return Returns the SORTENTSTABLE.
	 */
	public ClassUnit getSORTENTSTABLE(){
		return this.SORTENTSTABLE;
	}

	/**
	 * @return Returns the MULTILEADER.
	 */
	public ClassUnit getMULTILEADER(){
		return this.MULTILEADER;
	}

	/**
	 * @return Returns the ACAD_TABLE.
	 */
	public ClassUnit getACAD_TABLE(){
		return this.ACAD_TABLE;
	}

	/**
	 * @return Returns the ACDB_BLKREFOBJECTCONTEXTDATA_CLASS.
	 */
	public ClassUnit getACDB_BLKREFOBJECTCONTEXTDATA_CLASS(){
		return this.ACDB_BLKREFOBJECTCONTEXTDATA_CLASS;
	}

	/**
	 * @return Returns the ACAD_EVALUATION_GRAPH.
	 */
	public ClassUnit getACAD_EVALUATION_GRAPH(){
		return this.ACAD_EVALUATION_GRAPH;
	}

	/**
	 * @return Returns the BLOCKLINEARPARAMETER.
	 */
	public ClassUnit getBLOCKLINEARPARAMETER(){
		return this.BLOCKLINEARPARAMETER;
	}

	/**
	 * @return Returns the BLOCKLINEARGRIP.
	 */
	public ClassUnit getBLOCKLINEARGRIP(){
		return this.BLOCKLINEARGRIP;
	}

	/**
	 * @return Returns the BLOCKGRIPLOCATIONCOMPONENT.
	 */
	public ClassUnit getBLOCKGRIPLOCATIONCOMPONENT(){
		return this.BLOCKGRIPLOCATIONCOMPONENT;
	}

	/**
	 * @return Returns the BLOCKLOOKUPPARAMETER.
	 */
	public ClassUnit getBLOCKLOOKUPPARAMETER(){
		return this.BLOCKLOOKUPPARAMETER;
	}

	/**
	 * @return Returns the BLOCKLOOKUPGRIP.
	 */
	public ClassUnit getBLOCKLOOKUPGRIP(){
		return this.BLOCKLOOKUPGRIP;
	}

	/**
	 * @return Returns the BLOCKMOVEACTION.
	 */
	public ClassUnit getBLOCKMOVEACTION(){
		return this.BLOCKMOVEACTION;
	}

	/**
	 * @return Returns the BLOCKSTRETCHACTION.
	 */
	public ClassUnit getBLOCKSTRETCHACTION(){
		return this.BLOCKSTRETCHACTION;
	}

	/**
	 * @return Returns the BLOCKLOOKUPACTION.
	 */
	public ClassUnit getBLOCKLOOKUPACTION(){
		return this.BLOCKLOOKUPACTION;
	}

	/**
	 * @return Returns the ACDB_DYNAMICBLOCKPURGEPREVENTER_VERSION.
	 */
	public ClassUnit getACDB_DYNAMICBLOCKPURGEPREVENTER_VERSION(){
		return this.ACDB_DYNAMICBLOCKPURGEPREVENTER_VERSION;
	}

	/**
	 * @return Returns the ACDB_BLOCKREPRESENTATION_DATA.
	 */
	public ClassUnit getACDB_BLOCKREPRESENTATION_DATA(){
		return this.ACDB_BLOCKREPRESENTATION_DATA;
	}

	/**
	 * @return Returns the BLOCKVISIBILITYPARAMETER.
	 */
	public ClassUnit getBLOCKVISIBILITYPARAMETER(){
		return this.BLOCKVISIBILITYPARAMETER;
	}

	/**
	 * @return Returns the BLOCKVISIBILITYGRIP.
	 */
	public ClassUnit getBLOCKVISIBILITYGRIP(){
		return this.BLOCKVISIBILITYGRIP;
	}

	/**
	 * @return Returns the BLOCKROTATIONPARAMETER.
	 */
	public ClassUnit getBLOCKROTATIONPARAMETER(){
		return this.BLOCKROTATIONPARAMETER;
	}

	/**
	 * @return Returns the BLOCKROTATIONGRIP.
	 */
	public ClassUnit getBLOCKROTATIONGRIP(){
		return this.BLOCKROTATIONGRIP;
	}

	/**
	 * @return Returns the BLOCKFLIPPARAMETER.
	 */
	public ClassUnit getBLOCKFLIPPARAMETER(){
		return this.BLOCKFLIPPARAMETER;
	}

	/**
	 * @return Returns the BLOCKFLIPGRIP.
	 */
	public ClassUnit getBLOCKFLIPGRIP(){
		return this.BLOCKFLIPGRIP;
	}

	/**
	 * @return Returns the BLOCKROTATEACTION.
	 */
	public ClassUnit getBLOCKROTATEACTION(){
		return this.BLOCKROTATEACTION;
	}

	/**
	 * @return Returns the BLOCKFLIPACTION.
	 */
	public ClassUnit getBLOCKFLIPACTION(){
		return this.BLOCKFLIPACTION;
	}

	/**
	 * @return Returns the ACDB_MTEXTATTRIBUTEOBJECTCONTEXTDATA_CLASS.
	 */
	public ClassUnit getACDB_MTEXTATTRIBUTEOBJECTCONTEXTDATA_CLASS(){
		return this.ACDB_MTEXTATTRIBUTEOBJECTCONTEXTDATA_CLASS;
	}

	/**
	 * @return Returns the BLOCKALIGNMENTPARAMETER.
	 */
	public ClassUnit getBLOCKALIGNMENTPARAMETER(){
		return this.BLOCKALIGNMENTPARAMETER;
	}

	/**
	 * @return Returns the BLOCKALIGNMENTGRIP.
	 */
	public ClassUnit getBLOCKALIGNMENTGRIP(){
		return this.BLOCKALIGNMENTGRIP;
	}

	/**
	 * @return Returns the BLOCKSCALEACTION.
	 */
	public ClassUnit getBLOCKSCALEACTION(){
		return this.BLOCKSCALEACTION;
	}

	/**
	 * @return Returns the BLOCKBASEPOINTPARAMETER.
	 */
	public ClassUnit getBLOCKBASEPOINTPARAMETER(){
		return this.BLOCKBASEPOINTPARAMETER;
	}

	/**
	 * @return Returns the BLOCKARRAYACTION.
	 */
	public ClassUnit getBLOCKARRAYACTION(){
		return this.BLOCKARRAYACTION;
	}

	/**
	 * @return Returns the BLOCKPOINTPARAMETER.
	 */
	public ClassUnit getBLOCKPOINTPARAMETER(){
		return this.BLOCKPOINTPARAMETER;
	}

	/**
	 * @return Returns the BLOCKXYGRIP.
	 */
	public ClassUnit getBLOCKXYGRIP(){
		return this.BLOCKXYGRIP;
	}

	/**
	 * @return Returns the CELLSTYLEMAP.
	 */
	public ClassUnit getCELLSTYLEMAP(){
		return this.CELLSTYLEMAP;
	}

	/**
	 * @return Returns the DICTIONARYVAR.
	 */
	public ClassUnit getDICTIONARYVAR(){
		return this.DICTIONARYVAR;
	}

	/**
	 * @param  SectionHeader to set.
	 */
	public void setSectionHeader(String var){
		this.SectionHeader = var;
	}

	/**
	 * @param  SectionName to set.
	 */
	public void setSectionName(String var){
		this.SectionName = var;
	}

	/**
	 * @param  SectionTail to set.
	 */
	public void setSectionTail(String var){
		this.SectionTail = var;
	}

	/**
	 * @param  ACDBDICTIONARYWDFLT to set.
	 */
	public void setACDBDICTIONARYWDFLT(ClassUnit var){
		this.ACDBDICTIONARYWDFLT = var;
	}

	/**
	 * @param  MATERIAL to set.
	 */
	public void setMATERIAL(ClassUnit var){
		this.MATERIAL = var;
	}

	/**
	 * @param  VISUALSTYLE to set.
	 */
	public void setVISUALSTYLE(ClassUnit var){
		this.VISUALSTYLE = var;
	}

	/**
	 * @param  TABLESTYLE to set.
	 */
	public void setTABLESTYLE(ClassUnit var){
		this.TABLESTYLE = var;
	}

	/**
	 * @param  SCALE to set.
	 */
	public void setSCALE(ClassUnit var){
		this.SCALE = var;
	}

	/**
	 * @param  MLEADERSTYLE to set.
	 */
	public void setMLEADERSTYLE(ClassUnit var){
		this.MLEADERSTYLE = var;
	}

	/**
	 * @param  SORTENTSTABLE to set.
	 */
	public void setSORTENTSTABLE(ClassUnit var){
		this.SORTENTSTABLE = var;
	}

	/**
	 * @param  MULTILEADER to set.
	 */
	public void setMULTILEADER(ClassUnit var){
		this.MULTILEADER = var;
	}

	/**
	 * @param  ACAD_TABLE to set.
	 */
	public void setACAD_TABLE(ClassUnit var){
		this.ACAD_TABLE = var;
	}

	/**
	 * @param  ACDB_BLKREFOBJECTCONTEXTDATA_CLASS to set.
	 */
	public void setACDB_BLKREFOBJECTCONTEXTDATA_CLASS(ClassUnit var){
		this.ACDB_BLKREFOBJECTCONTEXTDATA_CLASS = var;
	}

	/**
	 * @param  ACAD_EVALUATION_GRAPH to set.
	 */
	public void setACAD_EVALUATION_GRAPH(ClassUnit var){
		this.ACAD_EVALUATION_GRAPH = var;
	}

	/**
	 * @param  BLOCKLINEARPARAMETER to set.
	 */
	public void setBLOCKLINEARPARAMETER(ClassUnit var){
		this.BLOCKLINEARPARAMETER = var;
	}

	/**
	 * @param  BLOCKLINEARGRIP to set.
	 */
	public void setBLOCKLINEARGRIP(ClassUnit var){
		this.BLOCKLINEARGRIP = var;
	}

	/**
	 * @param  BLOCKGRIPLOCATIONCOMPONENT to set.
	 */
	public void setBLOCKGRIPLOCATIONCOMPONENT(ClassUnit var){
		this.BLOCKGRIPLOCATIONCOMPONENT = var;
	}

	/**
	 * @param  BLOCKLOOKUPPARAMETER to set.
	 */
	public void setBLOCKLOOKUPPARAMETER(ClassUnit var){
		this.BLOCKLOOKUPPARAMETER = var;
	}

	/**
	 * @param  BLOCKLOOKUPGRIP to set.
	 */
	public void setBLOCKLOOKUPGRIP(ClassUnit var){
		this.BLOCKLOOKUPGRIP = var;
	}

	/**
	 * @param  BLOCKMOVEACTION to set.
	 */
	public void setBLOCKMOVEACTION(ClassUnit var){
		this.BLOCKMOVEACTION = var;
	}

	/**
	 * @param  BLOCKSTRETCHACTION to set.
	 */
	public void setBLOCKSTRETCHACTION(ClassUnit var){
		this.BLOCKSTRETCHACTION = var;
	}

	/**
	 * @param  BLOCKLOOKUPACTION to set.
	 */
	public void setBLOCKLOOKUPACTION(ClassUnit var){
		this.BLOCKLOOKUPACTION = var;
	}

	/**
	 * @param  ACDB_DYNAMICBLOCKPURGEPREVENTER_VERSION to set.
	 */
	public void setACDB_DYNAMICBLOCKPURGEPREVENTER_VERSION(ClassUnit var){
		this.ACDB_DYNAMICBLOCKPURGEPREVENTER_VERSION = var;
	}

	/**
	 * @param  ACDB_BLOCKREPRESENTATION_DATA to set.
	 */
	public void setACDB_BLOCKREPRESENTATION_DATA(ClassUnit var){
		this.ACDB_BLOCKREPRESENTATION_DATA = var;
	}

	/**
	 * @param  BLOCKVISIBILITYPARAMETER to set.
	 */
	public void setBLOCKVISIBILITYPARAMETER(ClassUnit var){
		this.BLOCKVISIBILITYPARAMETER = var;
	}

	/**
	 * @param  BLOCKVISIBILITYGRIP to set.
	 */
	public void setBLOCKVISIBILITYGRIP(ClassUnit var){
		this.BLOCKVISIBILITYGRIP = var;
	}

	/**
	 * @param  BLOCKROTATIONPARAMETER to set.
	 */
	public void setBLOCKROTATIONPARAMETER(ClassUnit var){
		this.BLOCKROTATIONPARAMETER = var;
	}

	/**
	 * @param  BLOCKROTATIONGRIP to set.
	 */
	public void setBLOCKROTATIONGRIP(ClassUnit var){
		this.BLOCKROTATIONGRIP = var;
	}

	/**
	 * @param  BLOCKFLIPPARAMETER to set.
	 */
	public void setBLOCKFLIPPARAMETER(ClassUnit var){
		this.BLOCKFLIPPARAMETER = var;
	}

	/**
	 * @param  BLOCKFLIPGRIP to set.
	 */
	public void setBLOCKFLIPGRIP(ClassUnit var){
		this.BLOCKFLIPGRIP = var;
	}

	/**
	 * @param  BLOCKROTATEACTION to set.
	 */
	public void setBLOCKROTATEACTION(ClassUnit var){
		this.BLOCKROTATEACTION = var;
	}

	/**
	 * @param  BLOCKFLIPACTION to set.
	 */
	public void setBLOCKFLIPACTION(ClassUnit var){
		this.BLOCKFLIPACTION = var;
	}

	/**
	 * @param  ACDB_MTEXTATTRIBUTEOBJECTCONTEXTDATA_CLASS to set.
	 */
	public void setACDB_MTEXTATTRIBUTEOBJECTCONTEXTDATA_CLASS(ClassUnit var){
		this.ACDB_MTEXTATTRIBUTEOBJECTCONTEXTDATA_CLASS = var;
	}

	/**
	 * @param  BLOCKALIGNMENTPARAMETER to set.
	 */
	public void setBLOCKALIGNMENTPARAMETER(ClassUnit var){
		this.BLOCKALIGNMENTPARAMETER = var;
	}

	/**
	 * @param  BLOCKALIGNMENTGRIP to set.
	 */
	public void setBLOCKALIGNMENTGRIP(ClassUnit var){
		this.BLOCKALIGNMENTGRIP = var;
	}

	/**
	 * @param  BLOCKSCALEACTION to set.
	 */
	public void setBLOCKSCALEACTION(ClassUnit var){
		this.BLOCKSCALEACTION = var;
	}

	/**
	 * @param  BLOCKBASEPOINTPARAMETER to set.
	 */
	public void setBLOCKBASEPOINTPARAMETER(ClassUnit var){
		this.BLOCKBASEPOINTPARAMETER = var;
	}

	/**
	 * @param  BLOCKARRAYACTION to set.
	 */
	public void setBLOCKARRAYACTION(ClassUnit var){
		this.BLOCKARRAYACTION = var;
	}

	/**
	 * @param  BLOCKPOINTPARAMETER to set.
	 */
	public void setBLOCKPOINTPARAMETER(ClassUnit var){
		this.BLOCKPOINTPARAMETER = var;
	}

	/**
	 * @param  BLOCKXYGRIP to set.
	 */
	public void setBLOCKXYGRIP(ClassUnit var){
		this.BLOCKXYGRIP = var;
	}

	/**
	 * @param  CELLSTYLEMAP to set.
	 */
	public void setCELLSTYLEMAP(ClassUnit var){
		this.CELLSTYLEMAP = var;
	}

	/**
	 * @param  DICTIONARYVAR to set.
	 */
	public void setDICTIONARYVAR(ClassUnit var){
		this.DICTIONARYVAR = var;
	}
	
    /**
     * printAll()
     * <pre>Terminal output the description of Section Classes
     * Output example:
     * </pre>
     */
    public void printAll() {
        List<String []>  myMap = this.getPairData();
        System.out.println("Entity List's Size: "+myMap.size());
		for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();
    }

    /**
     * getPairData()
     * @return Map of elements description of Section Classes.
     * <pre>Output example:
     * </pre>
     */
    public List<String []> getPairData() {
        List<String []> params =new ArrayList<>();

        List<String > DXFStr = new ArrayList<>();

        DXFStr = this.getDXF();

        for (int i = 0; i< DXFStr.size(); i = i + 2) {
            params.add(new String[] {DXFStr.get(i),DXFStr.get(i + 1)});
        }

        return params;
    }

    /**
     * getDXF()
     * @return the dxf data of entity line.
     * <pre>Output example:
     * 1.0</pre>
     */
    public List<String> getDXF() {

        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.add("  0");
        DXF_STR.add(this.SectionHeader);
        DXF_STR.add("  2");
        DXF_STR.add(this.SectionName);

        this_GC_Classes = new GC_Classes();
        this.assembleClassesDXF();
        DXF_STR.addAll(this_GC_Classes.getDXF());

        DXF_STR.add("  0");
        DXF_STR.add(this.SectionTail);

        return DXF_STR;
    }

    public String toString() {

        List<String> DXF_STR = new ArrayList<>();
        String returnString = new String();

        DXF_STR = this.getDXF();

        if (null != DXF_STR && DXF_STR.size() > 0) {
            String[] mListArray = DXF_STR.toArray(new String[DXF_STR.size()]);
            for (int i = 0; i < mListArray.length; i++) {
                if (i < mListArray.length - 1) {
                    returnString += mListArray[i] + "\r\n";
                } else {
                    returnString += mListArray[i];
                }
            }
        }

        return returnString;
    }


}

