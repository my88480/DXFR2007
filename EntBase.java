//package www
//AutoCAD Entity base class
import java.util.*;


/**
 * @author David Wu <809758521@qq.com>
 * @version V0.2
 * Base Entity's Class Definition of layer,so far.
 */
public class EntBase {
    /**
     * code  0 -Entity name.
     */
    public String EntityName;

    /**
     * code  5 - Handle.
     */
    public String Handle;

    /**
     * code  330 - Object ID.
     */
    public String ObjectId;

    /**
     * code  100 -Class Label.
     */
    public String ClassLabel;

    /**
     * code  100 -Sub Class Label.
     */
    public String SubClassLabel ;

    /**
     * code  100 -Sub Class Label.
     * AcDb2dVertex or AcDb3dPolylineVertex
     */
    public String SubClassLabel2 ;

    /**
     * code  8 -Layer.Default layer ----  "0"
     */
    public String Layer = "0";

    /**
    * code  39 - Thickness (optional; default  =  0).
    */
    public double thickness = 0.0;

    /**
     * code  50 - Angle of the X axis for the UCS in effect when the point
     *            was drawn (optional, default  =  0). Used when PDMODE
     *            is nonzero.
     */
    public     double        xang   =  0.0;

    /**
     * code 210,220,230 -
     *            Extrusion direction. Present if the extrusion direction is
     *            not parallel to the world Z axis.
     */
    public double   xExtrusionDirection = 0;
    public double   yExtrusionDirection = 0;
    public double   zExtrusionDirection = 1;

    public EntBase() {
		Handle = FileDXF.ApplyHandle();
    }

    public EntBase(String layer_value) {
        Layer = layer_value;
    }

    public void PrintAll() {
        List<String []>  myMap = this.GetPairData();
        System.out.println("Entity List's Size: "+myMap.size());
		for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();
    }

    public List<String []> GetPairData() {
        List<String []> params=new ArrayList<>();

        List<String > DXFStr=this.getDXF();

        for (int i=0; i< DXFStr.size() / 2; i= i + 2) {
            params.add(new String[] {DXFStr.get(i),DXFStr.get(i+1)});
        }

        return params;
    }

    public List<String> getDXF() {
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.add("  0");
        DXF_STR.add(this.EntityName);
		
        DXF_STR.add("  5");
        DXF_STR.add(this.Handle);

        DXF_STR.add("330");
        DXF_STR.add(this.ObjectId);

        DXF_STR.add("  100");
        DXF_STR.add(this.ClassLabel);

        DXF_STR.add("  8");
        DXF_STR.add(this.Layer);
		
        DXF_STR.add("  100");
        DXF_STR.add(this.SubClassLabel);
		
		if (this.SubClassLabel2 != null){
			if( this.SubClassLabel2.length() > 0){
				DXF_STR.add("  100");
				DXF_STR.add(this.SubClassLabel2);
			}
		}	
			
        return DXF_STR;
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
}