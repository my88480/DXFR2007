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
     * printAll()
     * <pre>Terminal output the description of start_point and end_point.(serveral lines)
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
     * @return Map of elements description of Entity LINE.
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

