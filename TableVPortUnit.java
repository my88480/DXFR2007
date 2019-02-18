//package www
//AutoCAD Table -- VPort
import java.util.*;

/**
*@author <a href="mailto:809758521@qq.com"> David Wu</a>
*@version 0.6
*/

public class TableVPortUnit {
    //Code 0 -- Object type
	private String objectType = "VPORT";
    /**
     * code  5 - Handle.
     */
    public String Handle;

    /**
     * code  330 - Object ID.
     */
    public String ObjectId = "8";

    /**
     * code  100 -Class Label.
     */
	private String classLabe = "AcDbSymbolTableRecord";
	
    /**
     * code  100 -Sub Class Label.
     */
	private String subClassLabel = "AcDbViewportTableRecord";
	
	//Code 2 -- Viewport name
	private String name = "";
	
	//Code 70 -- Standard flag values (bit-coded values)
	private short standardMarker;
	
    //Code 20,20 -- Lower-left corner of viewport
	private wPoint2D lowerLeftCorner = new wPoint2D();
	
    //Code 11,21 -- Upper-right corner of viewport
	private wPoint2D upperRightCorner = new wPoint2D();
	
    //Code 12,22 -- View center point (in DCS)
	private wPoint2D centerPoint = new wPoint2D();
	
    //Code 13,23 -- Snap base point (in DCS)
	private wPoint2D snapBasePoint = new wPoint2D();
	
	//Code 14,24 -- Snap spacing X and Y
    private wPoint2D snapSpacingPoint = new wPoint2D();
	
    //Code 15,25 -- Grid spacing X and Y
	private wPoint2D gridSpacingPoint = new wPoint2D();
	
    //Code 16,26,36 -- View direction from target point (in WCS) 
	private wPoint viewDirectionPoint = new wPoint();
	
    //Code 17,27,37 -- View target point (in WCS)
	private wPoint viewTargetPoint = new wPoint();
	
    //Code 40 -- viewport height
	private double height;
	
    //Code none -- calculate: width = height * ratio;
	private double width;
	
    //Code 41 -- ratio = width / height;
	private double ratio;
	
	//Code 42 -- Lens length
    private double lensLength;
	
    //Code 43 -- Front clipping plane (offset from target point)
	private double frontClippingPlane;
	
    //Code 44 -- Back clipping plane (offset from target point)
	private double backClippingPlane;
	
    //Code 50 -- Snap rotation angle
	private double rotationAngle;
	
    //Code 51 -- View twist angle
	private double viewTwistAngle;
	
    //Code 71 -- ViewPort mode
	private int viewportMode;
	
	//Code 72 -- Circle zoom percent
	private double circleZoom;
    
	//Code 73 -- Fast zoom setting
	private double fastZoom;
    
	//Code 74 -- UCSICON setting
	private int ucsiconSetting = 3;
    
	//Code 75 -- Snap Status setting ON/OFF
	private boolean snapMode;
    
	//Code 76 -- Grid Status setting ON/OFF
	private boolean gridDisplay;
    
    //Code 77 -- Snap style. AutoCAD command: SNAPSTYL
	private int snapStyle = 0;
	
	//Code 78 -- AutoCAD command: SNAPISOPAIR
	private int snapIsopair = 0;

	//Code 281 -- Render mode  AutoCAD command: SHADEMODE
	private int renderMode;
	
	//Code 65 -- Value of UCSVP for this viewport. If set to 1, then viewport stores its own UCS which will become the current UCS whenever the viewport is activated. If set to 0, UCS will not change when this viewport is activated
	private int UCSVP = 1;
	
	//Code 110,120,130 -- UCS origin  DXF: X value; APP: 3D point
	private wPoint ucsOriginPoint;
	
	//Code 111,121,131 -- UCS X-axis
	private wPoint ucsXAxis;
	
	//Code 112,122,132 -- UCS Y-axis
	private wPoint ucsYAxis;
	
	//Code 79 -- Orthographic type of UCS, maybe be emun data type in AutoCAD
	private int ucsOrthographicType;
	
	//Code 146 -- Elevation
	private double elevation;
	
	//Code 348 -- Hard-pointer ID/handle to visual style object (optional)
	private String hardPointerID;
	
	//Code 60 -- Grid Mode
	private int gridMode;
	
	//Code 61 -- Major grid lines
	private int majorGridLines = 5;
	
	//Code 292 -- Default Lighting On flag
	private boolean lightingOnFlag;
	
	//Code 282 -- Default Lighting type
	private int lightingtype;
	
	//Code 141 -- Brightness
	private double brightness;
	
	//Code 142 -- Constrast
	private double constrast;
	
	//Code 63 -- Ambient color (only output when non-black)
	private int ambientColorR;
	
	//Code 421 -- Ambient color (only output when non-black)
	private int ambientColorG = 3355443;
	
	//Code 431 -- Ambient color (only output when non-black)
	private int ambientColorB;
	
	//Code  -- 
	private boolean active = false;



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
	 * @return Returns the standardMarker.
	 */
	public short getStandardMarker(){
		return this.standardMarker;
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
	 * @return Returns the rotationAngle.
	 */
	public double getRotationAngle(){
		return this.rotationAngle;
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
	 * @param  standardMarker to set.
	 */
	public void setStandardMarker(short var){
		this.standardMarker = var;
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
	 * @param  rotationAngle to set.
	 */
	public void setRotationAngle(double var){
		this.rotationAngle = var;
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


}