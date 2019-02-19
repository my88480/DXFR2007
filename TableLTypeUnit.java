//package www
//AutoCAD Table -- LType
import java.util.*;

/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.6
*/

public class TableLTypeUnit {
    private List<String> GC_TableLTypeUnit;

    //Code 0 -- Object type
	private String objectType = "LTYPE";
    /**
     * code  5 - Handle.
     */
    public String Handle = "2F";

    /**
     * code  330 - Object ID.
     */
    public String ObjectId = "5";

    /**
     * code  100 -Class Label.
     */
	private String classLabel = "AcDbSymbolTableRecord";
	
    /**
     * code  100 -Sub Class Label.
     */
	private String subClassLabel = "AcDbLinetypeTableRecord";
	
	//Code 2 -- Linetype name
	private String name = "PHANTOM";
	
	//Code 70 -- Standard flag values (bit-coded values)
	private short flags = 0;
	
	//Code 3 -- Descriptive text for linetype
	private String description = "Phantom ______  __  __  ______  __  __  ______";
	
	//Code 72 -- Alignment code; value is always 65, the ASCII code for A
	private int alignment  = 65;
    
	//Code 73 -- The number of linetype elements
	private int elementCount = 6;
    
    //Code 40 -- Total pattern length
	private double totalPatternLength  = 63.5;
	
	//Code 49 -- Dash, dot or space length (one entry per element)
	private double[] pattern = new double[]{31.75,-6.35,6.35,-6.35,6.35,-6.35};

    //Code 44 -- X = X offset value (optional); multiple entries can exist
	private int[] offsetX = new int[]{};
	
    //Code 45 -- Y = Y offset value (optional); multiple entries can exist
	private int[] offsetY = new int[]{};
	
    //Code 46 -- S = Scale value (optional); multiple entries can exist
	protected double scale = 1.0;
	
    //Code 74 -- Complex linetype element type (one per element). Default is 0 (no embedded shape/text)
	protected int complexElementType = 0;
	
	
	//Code 0 -- Object type
	private GroupCode GC_objectType;
	
    /**
     * code  5 - Handle.
     */
	private GroupCode GC_Handle;
	
    /**
     * code  330 - Object ID.
     */
	private GroupCode GC_ObjectId;
	
    /**
     * code  100 -Class Label.
     */
	private GroupCode GC_ClassLabel;
	
    /**
     * code  100 -Sub Class Label.
     */
	private GroupCode GC_SubClassLabel;
	
	//Code 2 -- Linetype name
	private GroupCode GC_name;
	
	//Code 70 -- Standard flag values (bit-coded values)
	private GroupCode GC_flags;
	
	//Code 3 -- Descriptive text for linetype
	private GroupCode GC_description;
	
	//Code 72 -- Alignment code; value is always 65, the ASCII code for A
	private GroupCode GC_alignment;
	
	//Code 73 -- The number of linetype elements
	private GroupCode GC_elementCount;
	
	//Code 40 -- Total pattern length
	private GroupCode GC_totalPatternLength;
	
	//Code 49 -- Dash, dot or space length (one entry per element);
	private GroupCode[] GC_pattern;
	
	//Code 44 -- X = X offset value (optional); multiple entries can exist
	private GroupCode[] GC_offsetX;
	
	//Code 45 -- Y = Y offset value (optional); multiple entries can exist
	private GroupCode[] GC_offsetY;
	
	//Code 46 -- S = Scale value (optional); multiple entries can exist
	private GroupCode GC_scale;
	
	//Code 74 -- Complex linetype element type (one per element). Default is 0 (no embedded shape/text)
	private GroupCode GC_complexElementType;
	

	/**
	 * @return Returns the objectType.
	 */
	public String getObjectType(){
		return this.objectType;
	}

	/**
	 * @return Returns the Handle.
	 */
	public String getHandle(){
		return this.Handle;
	}

	/**
	 * @return Returns the ObjectId.
	 */
	public String getObjectId(){
		return this.ObjectId;
	}

	/**
	 * @return Returns the ClassLabel.
	 */
	public String getClassLabel(){
		return this.classLabel;
	}

	/**
	 * @return Returns the subClassLabel.
	 */
	public String getSubClassLabel(){
		return this.subClassLabel;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * @return Returns the flags.
	 */
	public short getFlags(){
		return this.flags;
	}

	/**
	 * @return Returns the description.
	 */
	public String getDescription(){
		return this.description;
	}

	/**
	 * @return Returns the alignment.
	 */
	public int getAlignment(){
		return this.alignment;
	}

	/**
	 * @return Returns the elementCount.
	 */
	public int getElementCount(){
		return this.elementCount;
	}

	/**
	 * @return Returns the totalPatternLength.
	 */
	public double getTotalPatternLength(){
		return this.totalPatternLength;
	}

	/**
	 * @return Returns the pattern.
	 */
	public double[] getPattern(){
		return this.pattern;
	}

	/**
	 * @return Returns the offsetX.
	 */
	public int[] getOffsetX(){
		return this.offsetX;
	}

	/**
	 * @return Returns the offsetY.
	 */
	public int[] getOffsetY(){
		return this.offsetY;
	}

	/**
	 * @return Returns the scale.
	 */
	public double getScale(){
		return this.scale;
	}

	/**
	 * @return Returns the complexElementType.
	 */
	public double getComplexElementType(){
		return this.complexElementType;
	}

	/**
	 * @return Returns the GC_objectType.
	 */
	public GroupCode getGC_objectType(){
		return this.GC_objectType;
	}

	/**
	 * @return Returns the GC_Handle.
	 */
	public GroupCode getGC_Handle(){
		return this.GC_Handle;
	}

	/**
	 * @return Returns the GC_ObjectId.
	 */
	public GroupCode getGC_ObjectId(){
		return this.GC_ObjectId;
	}

	/**
	 * @return Returns the GC_ClassLabel.
	 */
	public GroupCode getGC_ClassLabel(){
		return this.GC_ClassLabel;
	}

	/**
	 * @return Returns the GC_SubClassLabel.
	 */
	public GroupCode getGC_SubClassLabel(){
		return this.GC_SubClassLabel;
	}

	/**
	 * @return Returns the GC_name.
	 */
	public GroupCode getGC_name(){
		return this.GC_name;
	}

	/**
	 * @return Returns the GC_flags.
	 */
	public GroupCode getGC_flags(){
		return this.GC_flags;
	}

	/**
	 * @return Returns the GC_description.
	 */
	public GroupCode getGC_description(){
		return this.GC_description;
	}

	/**
	 * @return Returns the GC_alignment.
	 */
	public GroupCode getGC_alignment(){
		return this.GC_alignment;
	}

	/**
	 * @return Returns the GC_elementCount.
	 */
	public GroupCode getGC_elementCount(){
		return this.GC_elementCount;
	}

	/**
	 * @return Returns the GC_totalPatternLength.
	 */
	public GroupCode getGC_totalPatternLength(){
		return this.GC_totalPatternLength;
	}

	/**
	 * @return Returns the GC_pattern.
	 */
	public GroupCode[] getGC_pattern(){
		return this.GC_pattern;
	}

	/**
	 * @return Returns the GC_offsetX.
	 */
	public GroupCode[] getGC_offsetX(){
		return this.GC_offsetX;
	}

	/**
	 * @return Returns the GC_offsetY.
	 */
	public GroupCode[] getGC_offsetY(){
		return this.GC_offsetY;
	}

	/**
	 * @return Returns the GC_scale.
	 */
	public GroupCode getGC_scale(){
		return this.GC_scale;
	}
	
	/**
	 * @return Returns the GC_complexElementType.
	 */
	public GroupCode getGC_complexElementType(){
		return this.GC_complexElementType;
	}

	/**
	 * @param var  objectType to set.
	 */
	public void setObjectType(String var){
		this.objectType = var;
	}

	/**
	 * @param var  Handle to set.
	 */
	public void setHandle(String var){
		this.Handle = var;
	}

	/**
	 * @param var  ObjectId to set.
	 */
	public void setObjectId(String var){
		this.ObjectId = var;
	}

	/**
	 * @param var  subClassLabel to set.
	 */
	public void setSubClassLabel(String var){
		this.subClassLabel = var;
	}

	/**
	 * @param var  ClassLabel to set.
	 */
	public void setClassLabel(String var){
		this.classLabel = var;
	}

	/**
	 * @param var  name to set.
	 */
	public void setName(String var){
		this.name = var;
	}

	/**
	 * @param var  flags to set.
	 */
	public void setFlags(short var){
		this.flags = var;
	}

	/**
	 * @param var  description to set.
	 */
	public void setDescription(String var){
		this.description = var;
	}

	/**
	 * @param var  alignment to set.
	 */
	public void setAlignment(int var){
		this.alignment = var;
	}

	/**
	 * @param var  elementCount to set.
	 */
	public void setElementCount(int var){
		this.elementCount = var;
	}

	/**
	 * @param var  totalPatternLength to set.
	 */
	public void setTotalPatternLength(double var){
		this.totalPatternLength = var;
	}

	/**
	 * @param var  pattern to set.
	 */
	public void setPattern(double[] var){
		this.pattern = var;
	}

	/**
	 * @param var  offsetX to set.
	 */
	public void setOffsetX(int[] var){
		this.offsetX = var;
	}

	/**
	 * @param var  offsetY to set.
	 */
	public void setOffsetY(int[] var){
		this.offsetY = var;
	}

	/**
	 * @param var  scale to set.
	 */
	public void setScale(double var){
		this.scale = var;
	}

	/**
	 * @param var  complexElementType to set.
	 */
	public void setComplexElementType(int var){
		this.complexElementType = var;
	}

	/**
	 * @param var  GC_objectType to set.
	 */
	public void setGC_objectType(GroupCode var){
		this.GC_objectType = var;
	}

	/**
	 * @param var  GC_Handle to set.
	 */
	public void setGC_Handle(GroupCode var){
		this.GC_Handle = var;
	}

	/**
	 * @param var  GC_ObjectId to set.
	 */
	public void setGC_ObjectId(GroupCode var){
		this.GC_ObjectId = var;
	}

	/**
	 * @param var  GC_ClassLabel to set.
	 */
	public void setGC_ClassLabel(GroupCode var){
		this.GC_ClassLabel = var;
	}

	/**
	 * @param var  GC_SubClassLabel to set.
	 */
	public void setGC_SubClassLabel(GroupCode var){
		this.GC_SubClassLabel = var;
	}

	/**
	 * @param var  GC_name to set.
	 */
	public void setGC_name(GroupCode var){
		this.GC_name = var;
	}

	/**
	 * @param var  GC_flags to set.
	 */
	public void setGC_flags(GroupCode var){
		this.GC_flags = var;
	}

	/**
	 * @param var  GC_description to set.
	 */
	public void setGC_description(GroupCode var){
		this.GC_description = var;
	}

	/**
	 * @param var  GC_alignment to set.
	 */
	public void setGC_alignment(GroupCode var){
		this.GC_alignment = var;
	}

	/**
	 * @param var  GC_elementCount to set.
	 */
	public void setGC_elementCount(GroupCode var){
		this.GC_elementCount = var;
	}

	/**
	 * @param var  GC_totalPatternLength to set.
	 */
	public void setGC_totalPatternLength(GroupCode var){
		this.GC_totalPatternLength = var;
	}

	/**
	 * @param var  GC_pattern to set.
	 */
	public void setGC_pattern(GroupCode[] var){
		this.GC_pattern = var;
	}

	/**
	 * @param var  GC_offsetX to set.
	 */
	public void setGC_offsetX(GroupCode[] var){
		this.GC_offsetX = var;
	}

	/**
	 * @param var  GC_offsetY to set.
	 */
	public void setGC_offsetY(GroupCode[] var){
		this.GC_offsetY = var;
	}

	/**
	 * @param var  GC_scale to set.
	 */
	public void setGC_scale(GroupCode var){
		this.GC_scale = var;
	}

	/**
	 * @param var  GC_complexElementType to set.
	 */
	public void setGC_complexElementType(GroupCode var){
		this.GC_complexElementType = var;
	}



	public void assembleDXF(){
		GC_TableLTypeUnit = new ArrayList<>();
		
		GC_objectType = new GroupCode("  0",this.objectType);
		GC_Handle = new GroupCode("  5",this.Handle);
		GC_ObjectId = new GroupCode("330",this.ObjectId);
		GC_ClassLabel = new GroupCode("100",this.classLabel);
		GC_SubClassLabel = new GroupCode("100",this.subClassLabel);
		GC_name = new GroupCode("  2",this.name);
		GC_flags = new GroupCode(" 70",this.flags);
		GC_description = new GroupCode("  3",this.description);
		GC_alignment = new GroupCode(" 72",this.alignment);
		GC_elementCount = new GroupCode(" 73",this.elementCount);
		GC_totalPatternLength = new GroupCode(" 40",this.totalPatternLength);
		
		GC_pattern = new GroupCode[pattern.length];
		for (int i = 0;i < pattern.length;i++){
			GC_pattern[i] = new GroupCode(" 49",this.pattern[i]);
		}
		for (int i = 0;i < offsetX.length;i++){
			GC_offsetX[i] = new GroupCode(" 44",this.offsetX[i]);
		}
		for (int i = 0;i < offsetY.length;i++){
			GC_offsetY[i] = new GroupCode(" 45",this.offsetY[i]);
		}
		GC_scale = new GroupCode(" 46",this.scale);
		GC_complexElementType = new GroupCode(" 74",this.complexElementType);
		
	
		GC_TableLTypeUnit.addAll(GC_objectType.getDXF());
		GC_TableLTypeUnit.addAll(GC_Handle.getDXF());
		GC_TableLTypeUnit.addAll(GC_ObjectId.getDXF());
		GC_TableLTypeUnit.addAll(GC_ClassLabel.getDXF());
		GC_TableLTypeUnit.addAll(GC_SubClassLabel.getDXF());
		GC_TableLTypeUnit.addAll(GC_name.getDXF());
		GC_TableLTypeUnit.addAll(GC_flags.getDXF());
		GC_TableLTypeUnit.addAll(GC_description.getDXF());
		GC_TableLTypeUnit.addAll(GC_alignment.getDXF());
		GC_TableLTypeUnit.addAll(GC_elementCount.getDXF());
		GC_TableLTypeUnit.addAll(GC_totalPatternLength.getDXF());
		for (int i = 0;i < pattern.length;i++){
			GC_TableLTypeUnit.addAll(GC_pattern[i].getDXF());
			GC_TableLTypeUnit.addAll(GC_complexElementType.getDXF());
		}
		for (int i = 0;i < offsetX.length;i++){
			GC_TableLTypeUnit.addAll(GC_offsetX[i].getDXF());
		}
		for (int i = 0;i < offsetY.length;i++){
			GC_TableLTypeUnit.addAll(GC_offsetY[i].getDXF());
		}
		GC_TableLTypeUnit.addAll(GC_scale.getDXF());
	}
	
	public TableLTypeUnit(){
		this.assembleDXF();
	}	

    public void printAll() {
        List<String []>  myMap = this.getPairData();
        System.out.println("Entity List's Size: " + myMap.size());
		for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();
    }

    public List<String []> getPairData() {
        List<String []> params =new ArrayList<>();

        List<String > DXFStr = new ArrayList<>();
		
		DXFStr = this.getDXF();
		
        for (int i = 0; i< DXFStr.size(); i = i + 2) {
            params.add(new String[] {DXFStr.get(i),DXFStr.get(i + 1)});
        }

        return params;
    }

    public List<String> getDXF() {

		this.assembleDXF();

		return GC_TableLTypeUnit;
    }

    public String toString() {

        List<String> DXF_STR = new ArrayList<>();
        String str = new String();
		String lineSeparator = System.lineSeparator();

        DXF_STR = this.getDXF();

        if (null != DXF_STR && DXF_STR.size() > 0) {
            String[] mListArray = DXF_STR.toArray(new String[DXF_STR.size()]);
            for (int i = 0; i < mListArray.length; i++) {
                if (i < mListArray.length - 1) {
                    str += mListArray[i] + lineSeparator;
                } else {
                    str += mListArray[i];
                }
            }
        }
		return str;
	}
	
	public static void  main(String[] args){
		TableLTypeUnit unit = new TableLTypeUnit();
		
		System.out.println(unit);
	}	
}