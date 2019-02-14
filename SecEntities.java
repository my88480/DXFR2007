//package www
//AutoCAD Section--ENTITIES
import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class SecEntities {

    /**
     * code  0 -Entity section header.
     */
    public String SectionHeader = "SECTION";

    /**
     * code  0 -Entity section name.
     */
    public String SectionName = "ENTITIES";

    /**
     * code  0 -Entity section END.
     */
    public String SectionTail = "ENDSEC";

    /**
     * entities - One List of object may contains the classes such as EntPoint,EntLine,EntArc,EntPolyline and so on.
     */
    //public Object[] entities;
    public List<Object> entities;

    /**
     * Constructor (empty).
     */
    public SecEntities() {
        this.entities = new  ArrayList<Object>();
    }

    /**
     * Constructor (one_entities_section)
     * @param one_entities_section -one object derived from class SecEntities;
     */
    public SecEntities(SecEntities one_entities_section) {
        this();
        this.entities = one_entities_section.entities;
    }

    /**
     * printAll()
     * <pre>Terminal output the description of the Entities Section
     * Output example:
     * </pre>
     */
    public void printAll() {
        List<String []>  myMap = this.getPairData();
        System.out.println("Entity List's Size: " + myMap.size());
for (String [] key : myMap) {
            System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
        }
        System.out.println();
    }

    /**
     * getPairData()
     * @return Map of elements description of Entities Section.
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
     * @return the dxf data of Entities Section.
     * <pre>Output example:
     * </pre>
     */
    public List<String> getDXF() {

        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.add("  0");
        DXF_STR.add(this.SectionHeader);
        DXF_STR.add("  2");
        DXF_STR.add(this.SectionName);

        //The following Codes are working good.
        /*
        for (int i  =  0; i < this.entities.size(); i++) {
            Object myEntity=this.entities.get(i);
            if (myEntity instanceof EntLine) {
                EntLine aEntity= (EntLine) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntLWPolyline) {
                EntLWPolyline aEntity = (EntLWPolyline) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntPolyline) {
                EntPolyline aEntity = (EntPolyline) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntPoint) {
                EntPoint aEntity = (EntPoint) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntCircle) {
                EntCircle aEntity = (EntCircle) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntArc) {
                EntArc aEntity = (EntArc) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntText) {
                EntText aEntity = (EntText) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntVertex) {
                //EntVertex should only appeared in objection Polyline, So bypass it.
                //EntVertex aEntity = (EntVertex) myEntity;
                //DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntEllipse) {
                EntEllipse aEntity = (EntEllipse) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntRay) {
                EntRay aEntity = (EntRay) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else if (myEntity instanceof EntXline) {
                EntXline aEntity = (EntXline) myEntity;
                DXF_STR.addAll(aEntity.getDXF());
            } else {
        		System.out.println("Unkown Entity Type, Please check it. Entity #" + i);
        	}

        	System.out.println(myEntity.getClass());
        	System.out.println(myEntity.getClass().getName());
        }
        */

        //The following Codes are also working fine.
        /*
        for (int i = 0; i < this.entities.size(); i++) {
            Object myEntity=this.entities.get(i);

            try{
        		Method method = myEntity.getClass().getDeclaredMethod("getDXF");

        		List<String> dxf = new ArrayList<>();
        		Object obj;

        		obj = method.invoke(myEntity);

        		dxf = (ArrayList<String>)obj;

        		DXF_STR.addAll(dxf);

        	}
        	catch(Exception e){
        		System.out.printf("Exception occurs!!\r\n");
        		System.out.println(e.getMessage());  //print the root cause
        		System.out.printf("===========================\n");
        		e.printStackTrace(); //print the info of function stuck.
        	}
        }
        */

        for (int i = 0; i < this.entities.size(); i++) {
            Object myEntity=this.entities.get(i);

            String str = myEntity.toString();

            String[] strArray = str.split("\r\n");

            for (int j=0; j < strArray.length; j++) {
                DXF_STR.add(strArray[j]);
            }
        }

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

    public int getEntitiesSize() {
        return this.entities.size();
    }
}

