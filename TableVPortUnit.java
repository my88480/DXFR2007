//package www
//AutoCAD Table -- VPort
import java.util.*;

/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.6
*/

public class TableVPortUnit {
    private List<String> GC_TableVPortUnit;

    //Code 0 -- Object type
	private String objectType = "VPORT";
    /**
     * code  5 - Handle.
     */
    public String Handle = "31";

    /**
     * code  330 - Object ID.
     */
    public String ObjectId = "8";

    /**
     * code  100 -Class Label.
     */
	private String classLabel = "AcDbSymbolTableRecord";
	
    /**
     * code  100 -Sub Class Label.
     */
	private String subClassLabel = "AcDbViewportTableRecord";
	
	//Code 2 -- Viewport name
	private String name = "*Active";
	
	//Code 70 -- Standard flag values (bit-coded values)
	private short flags = 0;
	
    //Code 10,20 -- Lower-left corner of viewport
	private wPoint2D lowerLeftCorner = new wPoint2D(0.0,0.0);
	
    //Code 11,21 -- Upper-right corner of viewport
	private wPoint2D upperRightCorner = new wPoint2D(1.0,1.0);
	
    //Code 12,22 -- View center point (in DCS)
	private wPoint2D centerPoint = new wPoint2D(132,-44);
	
    //Code 13,23 -- Snap base point (in DCS)
	private wPoint2D snapBasePoint = new wPoint2D(0,0);
	
	//Code 14,24 -- Snap spacing X and Y
    private wPoint2D snapSpacingPoint = new wPoint2D(10,10);
	
    //Code 15,25 -- Grid spacing X and Y
	private wPoint2D gridSpacingPoint = new wPoint2D(10,10);
	
    //Code 16,26,36 -- View direction from target point (in WCS) 
	private wPoint viewDirectionPoint = new wPoint(0.0,0.0,1.0);
	
    //Code 17,27,37 -- View target point (in WCS)
	private wPoint viewTargetPoint = new wPoint(0.0,0.0,0.0);
	
    //Code 40 -- viewport height
	private double height = 840.0;
	
    //Code none -- calculate: width = height * ratio;
	private double width;
	
    //Code 41 -- ratio = width / height;
	private double ratio = 1.86;
	
	//Code 42 -- Lens length
    private double lensLength = 50.0;
	
    //Code 43 -- Front clipping plane (offset from target point)
	private double frontClippingPlane = 0.0;
	
    //Code 44 -- Back clipping plane (offset from target point)
	private double backClippingPlane = 0.0;
	
    //Code 50 -- Snap rotate angle
	private double snapRotateAngle = 0.0;
	
    //Code 51 -- View twist angle
	private double viewTwistAngle = 0.0;
	
    //Code 71 -- ViewPort mode
	private int viewportMode = 0;
	
	//Code 72 -- Circle zoom percent
	private double circleZoom = 100;
    
	//Code 73 -- Fast zoom setting
	private double fastZoom = 1;
    
	//Code 74 -- UCSICON setting
	private int ucsiconSetting = 3;
    
	//Code 75 -- Snap Status setting ON/OFF
	private boolean snapMode = false;
    
	//Code 76 -- Grid Status setting ON/OFF
	private boolean gridDisplay = false;
    
    //Code 77 -- Snap style. AutoCAD command: SNAPSTYL
	private int snapStyle = 0;
	
	//Code 78 -- AutoCAD command: SNAPISOPAIR
	private int snapIsopair = 0;

	//Code 281 -- Render mode  AutoCAD command: SHADEMODE
	private int renderMode = 0;
	
	//Code 65 -- Value of UCSVP for this viewport. If set to 1, then viewport stores its own UCS which will become the current UCS whenever the viewport is activated. If set to 0, UCS will not change when this viewport is activated
	private int UCSVP = 1;
	
	//Code 110,120,130 -- UCS origin  DXF: X value; APP: 3D point
	private wPoint ucsOriginPoint = new wPoint(0.0,0.0,0.0);
	
	//Code 111,121,131 -- UCS X-axis
	private wPoint ucsXAxis = new wPoint(1.0,0.0,0.0);
	
	//Code 112,122,132 -- UCS Y-axis
	private wPoint ucsYAxis = new wPoint(0.0,1.0,0.0);
	
	//Code 79 -- Orthographic type of UCS, maybe be emun data type in AutoCAD
	private int ucsOrthographicType = 0;
	
	//Code 146 -- Elevation
	private double elevation = 0.0;
	
	//Code 348 -- Hard-pointer ID/handle to visual style object (optional)
	private String hardPointerID = "F5";
	
	//Code 60 -- Grid Mode
	private int gridMode = 3;
	
	//Code 61 -- Major grid lines
	private int majorGridLines = 5;
	
	//Code 292 -- Default Lighting On flag
	private boolean lightingOnFlag = true;
	
	//Code 282 -- Default Lighting type
	private int lightingtype = 1;
	
	//Code 141 -- Brightness
	private double brightness = 0.0;
	
	//Code 142 -- Constrast
	private double constrast = 0.0;
	
	//Code 63 -- Ambient color (only output when non-black)
	private int ambientColorR = 250;
	
	//Code 421 -- Ambient color (only output when non-black)
	private int ambientColorG = 3355443;
	
	//Code 431 -- Ambient color (only output when non-black)
	private int ambientColorB;
	
	//Code  -- 
	private boolean active = true;

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
	 * @return Returns the classLabel.
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
	 * @return Returns the lowerLeftCorner.
	 */
	public wPoint2D getLowerLeftCorner(){
		return this.lowerLeftCorner;
	}

	/**
	 * @return Returns the upperRightCorner.
	 */
	public wPoint2D getUpperRightCorner(){
		return this.upperRightCorner;
	}

	/**
	 * @return Returns the centerPoint.
	 */
	public wPoint2D getCenterPoint(){
		return this.centerPoint;
	}

	/**
	 * @return Returns the snapBasePoint.
	 */
	public wPoint2D getSnapBasePoint(){
		return this.snapBasePoint;
	}

	/**
	 * @return Returns the snapSpacingPoint.
	 */
	public wPoint2D getSnapSpacingPoint(){
		return this.snapSpacingPoint;
	}

	/**
	 * @return Returns the gridSpacingPoint.
	 */
	public wPoint2D getGridSpacingPoint(){
		return this.gridSpacingPoint;
	}

	/**
	 * @return Returns the viewDirectionPoint.
	 */
	public wPoint getViewDirectionPoint(){
		return this.viewDirectionPoint;
	}

	/**
	 * @return Returns the viewTargetPoint.
	 */
	public wPoint getViewTargetPoint(){
		return this.viewTargetPoint;
	}

	/**
	 * @return Returns the height.
	 */
	public double getHeight(){
		return this.height;
	}

	/**
	 * @return Returns the width.
	 */
	public double getWidth(){
		return this.width;
	}

	/**
	 * @return Returns the ratio.
	 */
	public double getRatio(){
		return this.ratio;
	}

	/**
	 * @return Returns the lensLength.
	 */
	public double getLensLength(){
		return this.lensLength;
	}

	/**
	 * @return Returns the frontClippingPlane.
	 */
	public double getFrontClippingPlane(){
		return this.frontClippingPlane;
	}

	/**
	 * @return Returns the backClippingPlane.
	 */
	public double getBackClippingPlane(){
		return this.backClippingPlane;
	}

	/**
	 * @return Returns the snapRotateAngle.
	 */
	public double getSnapRotateAngle(){
		return this.snapRotateAngle;
	}

	/**
	 * @return Returns the viewTwistAngle.
	 */
	public double getViewTwistAngle(){
		return this.viewTwistAngle;
	}

	/**
	 * @return Returns the viewportMode.
	 */
	public int getViewportMode(){
		return this.viewportMode;
	}

	/**
	 * @return Returns the circleZoom.
	 */
	public double getCircleZoom(){
		return this.circleZoom;
	}

	/**
	 * @return Returns the fastZoom.
	 */
	public double getFastZoom(){
		return this.fastZoom;
	}

	/**
	 * @return Returns the ucsiconSetting.
	 */
	public int getUcsiconSetting(){
		return this.ucsiconSetting;
	}

	/**
	 * @return Returns the snapMode.
	 */
	public boolean getSnapMode(){
		return this.snapMode;
	}

	/**
	 * @return Returns the gridDisplay.
	 */
	public boolean getGridDisplay(){
		return this.gridDisplay;
	}

	/**
	 * @return Returns the snapStyle.
	 */
	public int getSnapStyle(){
		return this.snapStyle;
	}

	/**
	 * @return Returns the snapIsopair.
	 */
	public int getSnapIsopair(){
		return this.snapIsopair;
	}

	/**
	 * @return Returns the renderMode.
	 */
	public int getRenderMode(){
		return this.renderMode;
	}

	/**
	 * @return Returns the UCSVP.
	 */
	public int getUCSVP(){
		return this.UCSVP;
	}

	/**
	 * @return Returns the ucsOriginPoint.
	 */
	public wPoint getUcsOriginPoint(){
		return this.ucsOriginPoint;
	}

	/**
	 * @return Returns the ucsXAxis.
	 */
	public wPoint getUcsXAxis(){
		return this.ucsXAxis;
	}

	/**
	 * @return Returns the ucsYAxis.
	 */
	public wPoint getUcsYAxis(){
		return this.ucsYAxis;
	}

	/**
	 * @return Returns the ucsOrthographicType.
	 */
	public int getUcsOrthographicType(){
		return this.ucsOrthographicType;
	}

	/**
	 * @return Returns the elevation.
	 */
	public double getElevation(){
		return this.elevation;
	}

	/**
	 * @return Returns the hardPointerID.
	 */
	public String getHardPointerID(){
		return this.hardPointerID;
	}

	/**
	 * @return Returns the gridMode.
	 */
	public int getGridMode(){
		return this.gridMode;
	}

	/**
	 * @return Returns the majorGridLines.
	 */
	public int getMajorGridLines(){
		return this.majorGridLines;
	}

	/**
	 * @return Returns the lightingOnFlag.
	 */
	public boolean getLightingOnFlag(){
		return this.lightingOnFlag;
	}

	/**
	 * @return Returns the lightingtype.
	 */
	public int getLightingtype(){
		return this.lightingtype;
	}

	/**
	 * @return Returns the brightness.
	 */
	public double getBrightness(){
		return this.brightness;
	}

	/**
	 * @return Returns the constrast.
	 */
	public double getConstrast(){
		return this.constrast;
	}

	/**
	 * @return Returns the ambientColorR.
	 */
	public int getAmbientColorR(){
		return this.ambientColorR;
	}

	/**
	 * @return Returns the ambientColorG.
	 */
	public int getAmbientColorG(){
		return this.ambientColorG;
	}

	/**
	 * @return Returns the ambientColorB.
	 */
	public int getAmbientColorB(){
		return this.ambientColorB;
	}

	/**
	 * @return Returns the active.
	 */
	public boolean getActive(){
		return this.active;
	}

	/**
	 * @param  objectType to set.
	 */
	public void setObjectType(String var){
		this.objectType = var;
	}

	/**
	 * @param  Handle to set.
	 */
	public void setHandle(String var){
		this.Handle = var;
	}

	/**
	 * @param  ObjectId to set.
	 */
	public void setObjectId(String var){
		this.ObjectId = var;
	}

	/**
	 * @param  subClassLabel to set.
	 */
	public void setSubClassLabel(String var){
		this.subClassLabel = var;
	}

	/**
	 * @param  name to set.
	 */
	public void setName(String var){
		this.name = var;
	}

	/**
	 * @param  flags to set.
	 */
	public void setFlags(short var){
		this.flags = var;
	}

	/**
	 * @param  lowerLeftCorner to set.
	 */
	public void setLowerLeftCorner(wPoint2D var){
		this.lowerLeftCorner = var;
	}

	/**
	 * @param  upperRightCorner to set.
	 */
	public void setUpperRightCorner(wPoint2D var){
		this.upperRightCorner = var;
	}

	/**
	 * @param  centerPoint to set.
	 */
	public void setCenterPoint(wPoint2D var){
		this.centerPoint = var;
	}

	/**
	 * @param  snapBasePoint to set.
	 */
	public void setSnapBasePoint(wPoint2D var){
		this.snapBasePoint = var;
	}

	/**
	 * @param  snapSpacingPoint to set.
	 */
	public void setSnapSpacingPoint(wPoint2D var){
		this.snapSpacingPoint = var;
	}

	/**
	 * @param  gridSpacingPoint to set.
	 */
	public void setGridSpacingPoint(wPoint2D var){
		this.gridSpacingPoint = var;
	}

	/**
	 * @param  viewDirectionPoint to set.
	 */
	public void setViewDirectionPoint(wPoint var){
		this.viewDirectionPoint = var;
	}

	/**
	 * @param  viewTargetPoint to set.
	 */
	public void setViewTargetPoint(wPoint var){
		this.viewTargetPoint = var;
	}

	/**
	 * @param  height to set.
	 */
	public void setHeight(double var){
		this.height = var;
	}

	/**
	 * @param  width to set.
	 */
	public void setWidth(double var){
		this.width = var;
	}

	/**
	 * @param  ratio to set.
	 */
	public void setRatio(double var){
		this.ratio = var;
	}

	/**
	 * @param  lensLength to set.
	 */
	public void setLensLength(double var){
		this.lensLength = var;
	}

	/**
	 * @param  frontClippingPlane to set.
	 */
	public void setFrontClippingPlane(double var){
		this.frontClippingPlane = var;
	}

	/**
	 * @param  backClippingPlane to set.
	 */
	public void setBackClippingPlane(double var){
		this.backClippingPlane = var;
	}

	/**
	 * @param  snapRotateAngle to set.
	 */
	public void setsnapRotateAngle(double var){
		this.snapRotateAngle = var;
	}

	/**
	 * @param  viewTwistAngle to set.
	 */
	public void setViewTwistAngle(double var){
		this.viewTwistAngle = var;
	}

	/**
	 * @param  viewportMode to set.
	 */
	public void setViewportMode(int var){
		this.viewportMode = var;
	}

	/**
	 * @param  circleZoom to set.
	 */
	public void setCircleZoom(double var){
		this.circleZoom = var;
	}

	/**
	 * @param  fastZoom to set.
	 */
	public void setFastZoom(double var){
		this.fastZoom = var;
	}

	/**
	 * @param  ucsiconSetting to set.
	 */
	public void setUcsiconSetting(int var){
		this.ucsiconSetting = var;
	}

	/**
	 * @param  snapMode to set.
	 */
	public void setSnapMode(boolean var){
		this.snapMode = var;
	}

	/**
	 * @param  gridDisplay to set.
	 */
	public void setGridDisplay(boolean var){
		this.gridDisplay = var;
	}

	/**
	 * @param  snapStyle to set.
	 */
	public void setSnapStyle(int var){
		this.snapStyle = var;
	}

	/**
	 * @param  snapIsopair to set.
	 */
	public void setSnapIsopair(int var){
		this.snapIsopair = var;
	}

	/**
	 * @param  renderMode to set.
	 */
	public void setRenderMode(int var){
		this.renderMode = var;
	}

	/**
	 * @param  UCSVP to set.
	 */
	public void setUCSVP(int var){
		this.UCSVP = var;
	}

	/**
	 * @param  ucsOriginPoint to set.
	 */
	public void setUcsOriginPoint(wPoint var){
		this.ucsOriginPoint = var;
	}

	/**
	 * @param  ucsXAxis to set.
	 */
	public void setUcsXAxis(wPoint var){
		this.ucsXAxis = var;
	}

	/**
	 * @param  ucsYAxis to set.
	 */
	public void setUcsYAxis(wPoint var){
		this.ucsYAxis = var;
	}

	/**
	 * @param  ucsOrthographicType to set.
	 */
	public void setUcsOrthographicType(int var){
		this.ucsOrthographicType = var;
	}

	/**
	 * @param  elevation to set.
	 */
	public void setElevation(double var){
		this.elevation = var;
	}

	/**
	 * @param  hardPointerID to set.
	 */
	public void setHardPointerID(String var){
		this.hardPointerID = var;
	}

	/**
	 * @param  gridMode to set.
	 */
	public void setGridMode(int var){
		this.gridMode = var;
	}

	/**
	 * @param  majorGridLines to set.
	 */
	public void setMajorGridLines(int var){
		this.majorGridLines = var;
	}

	/**
	 * @param  lightingOnFlag to set.
	 */
	public void setLightingOnFlag(boolean var){
		this.lightingOnFlag = var;
	}

	/**
	 * @param  lightingtype to set.
	 */
	public void setLightingtype(int var){
		this.lightingtype = var;
	}

	/**
	 * @param  brightness to set.
	 */
	public void setBrightness(double var){
		this.brightness = var;
	}

	/**
	 * @param  constrast to set.
	 */
	public void setConstrast(double var){
		this.constrast = var;
	}

	/**
	 * @param  ambientColorR to set.
	 */
	public void setAmbientColorR(int var){
		this.ambientColorR = var;
	}

	/**
	 * @param  ambientColorG to set.
	 */
	public void setAmbientColorG(int var){
		this.ambientColorG = var;
	}

	/**
	 * @param  ambientColorB to set.
	 */
	public void setAmbientColorB(int var){
		this.ambientColorB = var;
	}

	/**
	 * @param  active to set.
	 */
	public void setActive(boolean var){
		this.active = var;
	}

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
	
	//Code 2 -- Viewport name
	private GroupCode GC_name;
	
	//Code 70 -- Standard flag values (bit-coded values)
	private GroupCode GC_flags;
	
	//Code 10,20 -- Lower-left corner of viewport
	private GC_wPoint2D GC_lowerLeftCorner;
	
	//Code 11,21 -- Upper-right corner of viewport
	private GC_wPoint2D GC_upperRightCorner;
	
	//Code 12,22 -- View center point (in DCS)
	private GC_wPoint2D GC_centerPoint;
	
	//Code 13,23 -- Snap base point (in DCS)
	private GC_wPoint2D GC_snapBasePoint;
	
	//Code 14,24 -- Snap spacing X and Y
	private GC_wPoint2D GC_snapSpacingPoint;
	
	//Code 15,25 -- Grid spacing X and Y
	private GC_wPoint2D GC_gridSpacingPoint;
	
	//Code 16,26,36 -- View direction from target point (in WCS)
	private GC_wPoint GC_viewDirectionPoint;
	
	//Code 17,27,37 -- View target point (in WCS)
	private GC_wPoint GC_viewTargetPoint;
	
	//Code 40 -- viewport height
	private GroupCode GC_height;
	
	//Code 41 -- ratio = width / height;
	private GroupCode GC_ratio;
	
	//Code 42 -- Lens length
	private GroupCode GC_lensLength;
	
	//Code 43 -- Front clipping plane (offset from target point)
	private GroupCode GC_frontClippingPlane;
	
	//Code 44 -- Back clipping plane (offset from target point)
	private GroupCode GC_backClippingPlane;
	
	//Code 50 -- Snap rotation angle
	private GroupCode GC_snapRotateAngle;
	
	//Code 51 -- View twist angle
	private GroupCode GC_viewTwistAngle;
	
	//Code 71 -- ViewPort mode
	private GroupCode GC_viewportMode;
	
	//Code 72 -- Circle zoom percent
	private GroupCode GC_circleZoom;
	
	//Code 73 -- Fast zoom setting
	private GroupCode GC_fastZoom;
	
	//Code 74 -- UCSICON setting
	private GroupCode GC_ucsiconSetting;
	
	//Code 75 -- Snap Status setting ON/OFF
	private GroupCode GC_snapMode;
	
	//Code 76 -- Grid Status setting ON/OFF
	private GroupCode GC_gridDisplay;
	
	//Code 77 -- Snap style. AutoCAD command: SNAPSTYL
	private GroupCode GC_snapStyle;
	
	//Code 78 -- AutoCAD command: SNAPISOPAIR
	private GroupCode GC_snapIsopair;
	
	//Code 281 -- Render mode  AutoCAD command: SHADEMODE
	private GroupCode GC_renderMode;
	
	//Code 65 -- Value of UCSVP for this viewport. If set to 1, then viewport stores its own UCS which will become the current UCS whenever the viewport is activated. If set to 0, UCS will not change when this viewport is activated
	private GroupCode GC_UCSVP;
	
	//Code 110,120,130 -- UCS origin  DXF: X value; APP: 3D point
	private GC_wPoint GC_ucsOriginPoint;
	
	//Code 111,121,131 -- UCS X-axis
	private GC_wPoint GC_ucsXAxis;
	
	//Code 112,122,132 -- UCS Y-axis
	private GC_wPoint GC_ucsYAxis;
	
	//Code 79 -- Orthographic type of UCS, maybe be emun data type in AutoCAD
	private GroupCode GC_ucsOrthographicType;
	
	//Code 146 -- Elevation
	private GroupCode GC_elevation;
	
	//Code 348 -- Hard-pointer ID/handle to visual style object (optional)
	private GroupCode GC_hardPointerID;
	
	//Code 60 -- Grid Mode
	private GroupCode GC_gridMode;
	
	//Code 61 -- Major grid lines
	private GroupCode GC_majorGridLines;
	
	//Code 292 -- Default Lighting On flag
	private GroupCode GC_lightingOnFlag;
	
	//Code 282 -- Default Lighting type
	private GroupCode GC_lightingtype;
	
	//Code 141 -- Brightness
	private GroupCode GC_brightness;
	
	//Code 142 -- Constrast
	private GroupCode GC_constrast;
	
	//Code 63 -- Ambient color (only output when non-black)
	private GroupCode GC_ambientColorR;
	
	//Code 421 -- Ambient color (only output when non-black)
	private GroupCode GC_ambientColorG;
	
	//Code 431 -- Ambient color (only output when non-black)
	private GroupCode GC_ambientColorB;
	

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
	 * @return Returns the GC_lowerLeftCorner.
	 */
	public GC_wPoint2D getGC_lowerLeftCorner(){
		return this.GC_lowerLeftCorner;
	}

	/**
	 * @return Returns the GC_upperRightCorner.
	 */
	public GC_wPoint2D getGC_upperRightCorner(){
		return this.GC_upperRightCorner;
	}

	/**
	 * @return Returns the GC_centerPoint.
	 */
	public GC_wPoint2D getGC_centerPoint(){
		return this.GC_centerPoint;
	}

	/**
	 * @return Returns the GC_snapBasePoint.
	 */
	public GC_wPoint2D getGC_snapBasePoint(){
		return this.GC_snapBasePoint;
	}

	/**
	 * @return Returns the GC_snapSpacingPoint.
	 */
	public GC_wPoint2D getGC_snapSpacingPoint(){
		return this.GC_snapSpacingPoint;
	}

	/**
	 * @return Returns the GC_gridSpacingPoint.
	 */
	public GC_wPoint2D getGC_gridSpacingPoint(){
		return this.GC_gridSpacingPoint;
	}

	/**
	 * @return Returns the GC_viewDirectionPoint.
	 */
	public GC_wPoint getGC_viewDirectionPoint(){
		return this.GC_viewDirectionPoint;
	}

	/**
	 * @return Returns the GC_viewTargetPoint.
	 */
	public GC_wPoint getGC_viewTargetPoint(){
		return this.GC_viewTargetPoint;
	}

	/**
	 * @return Returns the GC_height.
	 */
	public GroupCode getGC_height(){
		return this.GC_height;
	}

	/**
	 * @return Returns the GC_ratio.
	 */
	public GroupCode getGC_ratio(){
		return this.GC_ratio;
	}

	/**
	 * @return Returns the GC_lensLength.
	 */
	public GroupCode getGC_lensLength(){
		return this.GC_lensLength;
	}

	/**
	 * @return Returns the GC_frontClippingPlane.
	 */
	public GroupCode getGC_frontClippingPlane(){
		return this.GC_frontClippingPlane;
	}

	/**
	 * @return Returns the GC_backClippingPlane.
	 */
	public GroupCode getGC_backClippingPlane(){
		return this.GC_backClippingPlane;
	}

	/**
	 * @return Returns the GC_snapRotateAngle.
	 */
	public GroupCode getGC_snapRotateAngle(){
		return this.GC_snapRotateAngle;
	}

	/**
	 * @return Returns the GC_viewTwistAngle.
	 */
	public GroupCode getGC_viewTwistAngle(){
		return this.GC_viewTwistAngle;
	}

	/**
	 * @return Returns the GC_viewportMode.
	 */
	public GroupCode getGC_viewportMode(){
		return this.GC_viewportMode;
	}

	/**
	 * @return Returns the GC_circleZoom.
	 */
	public GroupCode getGC_circleZoom(){
		return this.GC_circleZoom;
	}

	/**
	 * @return Returns the GC_fastZoom.
	 */
	public GroupCode getGC_fastZoom(){
		return this.GC_fastZoom;
	}

	/**
	 * @return Returns the GC_ucsiconSetting.
	 */
	public GroupCode getGC_ucsiconSetting(){
		return this.GC_ucsiconSetting;
	}

	/**
	 * @return Returns the GC_snapMode.
	 */
	public GroupCode getGC_snapMode(){
		return this.GC_snapMode;
	}

	/**
	 * @return Returns the GC_gridDisplay.
	 */
	public GroupCode getGC_gridDisplay(){
		return this.GC_gridDisplay;
	}

	/**
	 * @return Returns the GC_snapStyle.
	 */
	public GroupCode getGC_snapStyle(){
		return this.GC_snapStyle;
	}

	/**
	 * @return Returns the GC_snapIsopair.
	 */
	public GroupCode getGC_snapIsopair(){
		return this.GC_snapIsopair;
	}

	/**
	 * @return Returns the GC_renderMode.
	 */
	public GroupCode getGC_renderMode(){
		return this.GC_renderMode;
	}

	/**
	 * @return Returns the GC_UCSVP.
	 */
	public GroupCode getGC_UCSVP(){
		return this.GC_UCSVP;
	}

	/**
	 * @return Returns the GC_ucsOriginPoint.
	 */
	public GC_wPoint getGC_ucsOriginPoint(){
		return this.GC_ucsOriginPoint;
	}

	/**
	 * @return Returns the GC_ucsXAxis.
	 */
	public GC_wPoint getGC_ucsXAxis(){
		return this.GC_ucsXAxis;
	}

	/**
	 * @return Returns the GC_ucsYAxis.
	 */
	public GC_wPoint getGC_ucsYAxis(){
		return this.GC_ucsYAxis;
	}

	/**
	 * @return Returns the GC_ucsOrthographicType.
	 */
	public GroupCode getGC_ucsOrthographicType(){
		return this.GC_ucsOrthographicType;
	}

	/**
	 * @return Returns the GC_elevation.
	 */
	public GroupCode getGC_elevation(){
		return this.GC_elevation;
	}

	/**
	 * @return Returns the GC_hardPointerID.
	 */
	public GroupCode getGC_hardPointerID(){
		return this.GC_hardPointerID;
	}

	/**
	 * @return Returns the GC_gridMode.
	 */
	public GroupCode getGC_gridMode(){
		return this.GC_gridMode;
	}

	/**
	 * @return Returns the GC_majorGridLines.
	 */
	public GroupCode getGC_majorGridLines(){
		return this.GC_majorGridLines;
	}

	/**
	 * @return Returns the GC_lightingOnFlag.
	 */
	public GroupCode getGC_lightingOnFlag(){
		return this.GC_lightingOnFlag;
	}

	/**
	 * @return Returns the GC_lightingtype.
	 */
	public GroupCode getGC_lightingtype(){
		return this.GC_lightingtype;
	}

	/**
	 * @return Returns the GC_brightness.
	 */
	public GroupCode getGC_brightness(){
		return this.GC_brightness;
	}

	/**
	 * @return Returns the GC_constrast.
	 */
	public GroupCode getGC_constrast(){
		return this.GC_constrast;
	}

	/**
	 * @return Returns the GC_ambientColorR.
	 */
	public GroupCode getGC_ambientColorR(){
		return this.GC_ambientColorR;
	}

	/**
	 * @return Returns the GC_ambientColorG.
	 */
	public GroupCode getGC_ambientColorG(){
		return this.GC_ambientColorG;
	}

	/**
	 * @return Returns the GC_ambientColorB.
	 */
	public GroupCode getGC_ambientColorB(){
		return this.GC_ambientColorB;
	}

	/**
	 * @param  GC_objectType to set.
	 */
	public void setGC_objectType(GroupCode var){
		this.GC_objectType = var;
	}

	/**
	 * @param  GC_Handle to set.
	 */
	public void setGC_Handle(GroupCode var){
		this.GC_Handle = var;
	}

	/**
	 * @param  GC_ObjectId to set.
	 */
	public void setGC_ObjectId(GroupCode var){
		this.GC_ObjectId = var;
	}

	/**
	 * @param  GC_ClassLabel to set.
	 */
	public void setGC_ClassLabel(GroupCode var){
		this.GC_ClassLabel = var;
	}

	/**
	 * @param  GC_SubClassLabel to set.
	 */
	public void setGC_SubClassLabel(GroupCode var){
		this.GC_SubClassLabel = var;
	}

	/**
	 * @param  GC_name to set.
	 */
	public void setGC_name(GroupCode var){
		this.GC_name = var;
	}

	/**
	 * @param  GC_flags to set.
	 */
	public void setGC_flags(GroupCode var){
		this.GC_flags = var;
	}

	/**
	 * @param  GC_lowerLeftCorner to set.
	 */
	public void setGC_lowerLeftCorner(GC_wPoint2D var){
		this.GC_lowerLeftCorner = var;
	}

	/**
	 * @param  GC_upperRightCorner to set.
	 */
	public void setGC_upperRightCorner(GC_wPoint2D var){
		this.GC_upperRightCorner = var;
	}

	/**
	 * @param  GC_centerPoint to set.
	 */
	public void setGC_centerPoint(GC_wPoint2D var){
		this.GC_centerPoint = var;
	}

	/**
	 * @param  GC_snapBasePoint to set.
	 */
	public void setGC_snapBasePoint(GC_wPoint2D var){
		this.GC_snapBasePoint = var;
	}

	/**
	 * @param  GC_snapSpacingPoint to set.
	 */
	public void setGC_snapSpacingPoint(GC_wPoint2D var){
		this.GC_snapSpacingPoint = var;
	}

	/**
	 * @param  GC_gridSpacingPoint to set.
	 */
	public void setGC_gridSpacingPoint(GC_wPoint2D var){
		this.GC_gridSpacingPoint = var;
	}

	/**
	 * @param  GC_viewDirectionPoint to set.
	 */
	public void setGC_viewDirectionPoint(GC_wPoint var){
		this.GC_viewDirectionPoint = var;
	}

	/**
	 * @param  GC_viewTargetPoint to set.
	 */
	public void setGC_viewTargetPoint(GC_wPoint var){
		this.GC_viewTargetPoint = var;
	}

	/**
	 * @param  GC_height to set.
	 */
	public void setGC_height(GroupCode var){
		this.GC_height = var;
	}

	/**
	 * @param  GC_ratio to set.
	 */
	public void setGC_ratio(GroupCode var){
		this.GC_ratio = var;
	}

	/**
	 * @param  GC_lensLength to set.
	 */
	public void setGC_lensLength(GroupCode var){
		this.GC_lensLength = var;
	}

	/**
	 * @param  GC_frontClippingPlane to set.
	 */
	public void setGC_frontClippingPlane(GroupCode var){
		this.GC_frontClippingPlane = var;
	}

	/**
	 * @param  GC_backClippingPlane to set.
	 */
	public void setGC_backClippingPlane(GroupCode var){
		this.GC_backClippingPlane = var;
	}

	/**
	 * @param  GC_snapRotateAngle to set.
	 */
	public void setGC_snapRotateAngle(GroupCode var){
		this.GC_snapRotateAngle = var;
	}

	/**
	 * @param  GC_viewTwistAngle to set.
	 */
	public void setGC_viewTwistAngle(GroupCode var){
		this.GC_viewTwistAngle = var;
	}

	/**
	 * @param  GC_viewportMode to set.
	 */
	public void setGC_viewportMode(GroupCode var){
		this.GC_viewportMode = var;
	}

	/**
	 * @param  GC_circleZoom to set.
	 */
	public void setGC_circleZoom(GroupCode var){
		this.GC_circleZoom = var;
	}

	/**
	 * @param  GC_fastZoom to set.
	 */
	public void setGC_fastZoom(GroupCode var){
		this.GC_fastZoom = var;
	}

	/**
	 * @param  GC_ucsiconSetting to set.
	 */
	public void setGC_ucsiconSetting(GroupCode var){
		this.GC_ucsiconSetting = var;
	}

	/**
	 * @param  GC_snapMode to set.
	 */
	public void setGC_snapMode(GroupCode var){
		this.GC_snapMode = var;
	}

	/**
	 * @param  GC_gridDisplay to set.
	 */
	public void setGC_gridDisplay(GroupCode var){
		this.GC_gridDisplay = var;
	}

	/**
	 * @param  GC_snapStyle to set.
	 */
	public void setGC_snapStyle(GroupCode var){
		this.GC_snapStyle = var;
	}

	/**
	 * @param  GC_snapIsopair to set.
	 */
	public void setGC_snapIsopair(GroupCode var){
		this.GC_snapIsopair = var;
	}

	/**
	 * @param  GC_renderMode to set.
	 */
	public void setGC_renderMode(GroupCode var){
		this.GC_renderMode = var;
	}

	/**
	 * @param  GC_UCSVP to set.
	 */
	public void setGC_UCSVP(GroupCode var){
		this.GC_UCSVP = var;
	}

	/**
	 * @param  GC_ucsOriginPoint to set.
	 */
	public void setGC_ucsOriginPoint(GC_wPoint var){
		this.GC_ucsOriginPoint = var;
	}

	/**
	 * @param  GC_ucsXAxis to set.
	 */
	public void setGC_ucsXAxis(GC_wPoint var){
		this.GC_ucsXAxis = var;
	}

	/**
	 * @param  GC_ucsYAxis to set.
	 */
	public void setGC_ucsYAxis(GC_wPoint var){
		this.GC_ucsYAxis = var;
	}

	/**
	 * @param  GC_ucsOrthographicType to set.
	 */
	public void setGC_ucsOrthographicType(GroupCode var){
		this.GC_ucsOrthographicType = var;
	}

	/**
	 * @param  GC_elevation to set.
	 */
	public void setGC_elevation(GroupCode var){
		this.GC_elevation = var;
	}

	/**
	 * @param  GC_hardPointerID to set.
	 */
	public void setGC_hardPointerID(GroupCode var){
		this.GC_hardPointerID = var;
	}

	/**
	 * @param  GC_gridMode to set.
	 */
	public void setGC_gridMode(GroupCode var){
		this.GC_gridMode = var;
	}

	/**
	 * @param  GC_majorGridLines to set.
	 */
	public void setGC_majorGridLines(GroupCode var){
		this.GC_majorGridLines = var;
	}

	/**
	 * @param  GC_lightingOnFlag to set.
	 */
	public void setGC_lightingOnFlag(GroupCode var){
		this.GC_lightingOnFlag = var;
	}

	/**
	 * @param  GC_lightingtype to set.
	 */
	public void setGC_lightingtype(GroupCode var){
		this.GC_lightingtype = var;
	}

	/**
	 * @param  GC_brightness to set.
	 */
	public void setGC_brightness(GroupCode var){
		this.GC_brightness = var;
	}

	/**
	 * @param  GC_constrast to set.
	 */
	public void setGC_constrast(GroupCode var){
		this.GC_constrast = var;
	}

	/**
	 * @param  GC_ambientColorR to set.
	 */
	public void setGC_ambientColorR(GroupCode var){
		this.GC_ambientColorR = var;
	}

	/**
	 * @param  GC_ambientColorG to set.
	 */
	public void setGC_ambientColorG(GroupCode var){
		this.GC_ambientColorG = var;
	}

	/**
	 * @param  GC_ambientColorB to set.
	 */
	public void setGC_ambientColorB(GroupCode var){
		this.GC_ambientColorB = var;
	}

	public void assembleDXF(){
		GC_TableVPortUnit = new ArrayList<>();
		
		GC_objectType = new GroupCode("  0",this.objectType);
		GC_Handle = new GroupCode("  5",this.Handle);
		GC_ObjectId = new GroupCode("330",this.ObjectId);
		GC_ClassLabel = new GroupCode("100",this.classLabel);
		GC_SubClassLabel = new GroupCode("100",this.subClassLabel);
		GC_name = new GroupCode("  2",this.name);
		GC_flags = new GroupCode(" 70",this.flags);
		GC_lowerLeftCorner = new GC_wPoint2D(this.lowerLeftCorner);
		GC_upperRightCorner = new GC_wPoint2D(11,this.upperRightCorner);
		GC_centerPoint = new GC_wPoint2D(12,this.centerPoint);
		GC_snapBasePoint = new GC_wPoint2D(13,this.snapBasePoint);
		GC_snapSpacingPoint = new GC_wPoint2D(14,this.snapSpacingPoint);
		GC_gridSpacingPoint = new GC_wPoint2D(15,this.gridSpacingPoint);
		GC_viewDirectionPoint = new GC_wPoint(16,this.viewDirectionPoint);
		GC_viewTargetPoint = new GC_wPoint(17,this.viewTargetPoint);
		GC_height = new GroupCode(" 40",this.height);
		GC_ratio = new GroupCode(" 41",this.ratio);
		GC_lensLength = new GroupCode(" 42",this.lensLength);
		GC_frontClippingPlane = new GroupCode(" 43",this.frontClippingPlane);
		GC_backClippingPlane = new GroupCode(" 44",this.backClippingPlane);
		GC_snapRotateAngle = new GroupCode(" 50",this.snapRotateAngle);
		GC_viewTwistAngle = new GroupCode(" 51",this.viewTwistAngle);
		GC_viewportMode = new GroupCode(" 71",this.viewportMode);
		GC_circleZoom = new GroupCode(" 72",this.circleZoom);
		GC_fastZoom = new GroupCode(" 73",this.fastZoom);
		GC_ucsiconSetting = new GroupCode(" 74",this.ucsiconSetting);
		GC_snapMode = new GroupCode(" 75",this.snapMode);
		GC_gridDisplay = new GroupCode(" 76",this.gridDisplay);
		GC_snapStyle = new GroupCode(" 77",this.snapStyle);
		GC_snapIsopair = new GroupCode(" 78",this.snapIsopair);
		GC_renderMode = new GroupCode("281",this.renderMode);
		GC_UCSVP = new GroupCode(" 65",this.UCSVP);
		GC_ucsOriginPoint = new GC_wPoint(110,this.ucsOriginPoint);
		GC_ucsXAxis = new GC_wPoint(111,this.ucsXAxis);
		GC_ucsYAxis = new GC_wPoint(112,this.ucsYAxis);
		GC_ucsOrthographicType = new GroupCode(" 79",this.ucsOrthographicType);
		GC_elevation = new GroupCode("146",this.elevation);
		GC_hardPointerID = new GroupCode("348",this.hardPointerID);
		GC_gridMode = new GroupCode(" 60",this.gridMode);
		GC_majorGridLines = new GroupCode(" 61",this.majorGridLines);
		GC_lightingOnFlag = new GroupCode("292",this.lightingOnFlag);
		GC_lightingtype = new GroupCode("282",this.lightingtype);
		GC_brightness = new GroupCode("141",this.brightness);
		GC_constrast = new GroupCode("142",this.constrast);
		GC_ambientColorR = new GroupCode(" 63",this.ambientColorR);
		GC_ambientColorG = new GroupCode("421",this.ambientColorG);
		
	
		GC_TableVPortUnit.addAll(GC_objectType.getDXF());
		GC_TableVPortUnit.addAll(GC_Handle.getDXF());
		GC_TableVPortUnit.addAll(GC_ObjectId.getDXF());
		GC_TableVPortUnit.addAll(GC_ClassLabel.getDXF());
		GC_TableVPortUnit.addAll(GC_SubClassLabel.getDXF());
		GC_TableVPortUnit.addAll(GC_name.getDXF());
		GC_TableVPortUnit.addAll(GC_flags.getDXF());
		GC_TableVPortUnit.addAll(GC_lowerLeftCorner.getDXF());
		GC_TableVPortUnit.addAll(GC_upperRightCorner.getDXF());
		GC_TableVPortUnit.addAll(GC_centerPoint.getDXF());
		GC_TableVPortUnit.addAll(GC_snapBasePoint.getDXF());
		GC_TableVPortUnit.addAll(GC_snapSpacingPoint.getDXF());
		GC_TableVPortUnit.addAll(GC_gridSpacingPoint.getDXF());
		GC_TableVPortUnit.addAll(GC_viewDirectionPoint.getDXF());
		GC_TableVPortUnit.addAll(GC_viewTargetPoint.getDXF());
		GC_TableVPortUnit.addAll(GC_height.getDXF());
		GC_TableVPortUnit.addAll(GC_ratio.getDXF());
		GC_TableVPortUnit.addAll(GC_lensLength.getDXF());
		GC_TableVPortUnit.addAll(GC_frontClippingPlane.getDXF());
		GC_TableVPortUnit.addAll(GC_backClippingPlane.getDXF());
		GC_TableVPortUnit.addAll(GC_snapRotateAngle.getDXF());
		GC_TableVPortUnit.addAll(GC_viewTwistAngle.getDXF());
		GC_TableVPortUnit.addAll(GC_viewportMode.getDXF());
		GC_TableVPortUnit.addAll(GC_circleZoom.getDXF());
		GC_TableVPortUnit.addAll(GC_fastZoom.getDXF());
		GC_TableVPortUnit.addAll(GC_ucsiconSetting.getDXF());
		GC_TableVPortUnit.addAll(GC_snapMode.getDXF());
		GC_TableVPortUnit.addAll(GC_gridDisplay.getDXF());
		GC_TableVPortUnit.addAll(GC_snapStyle.getDXF());
		GC_TableVPortUnit.addAll(GC_snapIsopair.getDXF());
		GC_TableVPortUnit.addAll(GC_renderMode.getDXF());
		GC_TableVPortUnit.addAll(GC_UCSVP.getDXF());
		GC_TableVPortUnit.addAll(GC_ucsOriginPoint.getDXF());
		GC_TableVPortUnit.addAll(GC_ucsXAxis.getDXF());
		GC_TableVPortUnit.addAll(GC_ucsYAxis.getDXF());
		GC_TableVPortUnit.addAll(GC_ucsOrthographicType.getDXF());
		GC_TableVPortUnit.addAll(GC_elevation.getDXF());
		GC_TableVPortUnit.addAll(GC_hardPointerID.getDXF());
		GC_TableVPortUnit.addAll(GC_gridMode.getDXF());
		GC_TableVPortUnit.addAll(GC_majorGridLines.getDXF());
		GC_TableVPortUnit.addAll(GC_lightingOnFlag.getDXF());
		GC_TableVPortUnit.addAll(GC_lightingtype.getDXF());
		GC_TableVPortUnit.addAll(GC_brightness.getDXF());
		GC_TableVPortUnit.addAll(GC_constrast.getDXF());
		GC_TableVPortUnit.addAll(GC_ambientColorR.getDXF());
		GC_TableVPortUnit.addAll(GC_ambientColorG.getDXF());
		
	}
	
	public TableVPortUnit(){
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
        //List<String> DXF_STR = new ArrayList<>();

		this.assembleDXF();
		//DXF_STR.addAll(GC_TableVPortUnit);
			
        //return DXF_STR;
        return GC_TableVPortUnit;
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
		TableVPortUnit unit = new TableVPortUnit();
		
		System.out.println(unit);
	}	
}