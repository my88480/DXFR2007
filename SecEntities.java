//package www
//AutoCAD Section--ENTITIES
import java.util.*;

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
        this.entities = new  ArrayList<Object>();
        /*
        this.start_point = one_entities_section.start_point;
        this.end_point = one_entities_section.end_point;

        this.thickness = one_entities_section.thickness;
        this.xExtrusionDirection = one_entities_section.xExtrusionDirection;
        this.yExtrusionDirection = one_entities_section.yExtrusionDirection;
        this.zExtrusionDirection = one_entities_section.zExtrusionDirection;
        */
    }

    /**
     * printAll()
     * <pre>Terminal output the description of start_point and end_point.(serveral lines)
     * Output example:
     * </pre>
     */
    public void printAll() {
        for (int i  =  0; i < this.entities.size(); i++) {
            Object myEntity=this.entities.get(i);
            if (myEntity instanceof EntLine) {
                EntLine myLine= (EntLine) myEntity;
                myLine.printAll();
            } else if (myEntity instanceof EntLWPolyline) {
                EntLWPolyline myLWPolyline = (EntLWPolyline) myEntity;
                myLWPolyline.printAll();
            } else if (myEntity instanceof EntPolyline) {
                EntPolyline myPolyline = (EntPolyline) myEntity;
                myPolyline.printAll();
            } else if (myEntity instanceof EntPoint) {
                EntPoint myPoint = (EntPoint) myEntity;
                myPoint.printAll();
            } else if (myEntity instanceof EntCircle) {
                EntCircle myCircle = (EntCircle) myEntity;
                myCircle.printAll();
            } else if (myEntity instanceof EntArc) {
                EntArc myArc = (EntArc) myEntity;
                myArc.printAll();
            } else if (myEntity instanceof EntText) {
                EntText myText = (EntText) myEntity;
                myText.printAll();
            } else if (myEntity instanceof EntVertex) {
                EntVertex myVertex = (EntVertex) myEntity;
                myVertex.printAll();
            }else {
				System.out.println("Unacquainted Entity type!");
			}	
        }
    }

    /**
     * getPairData()
     * @return Map of elements description of Entity LINE.
     * <pre>Output example:
     * </pre>
     */
    public List<String []> getPairData() {
        List<String []> params=new ArrayList<>();

        params.add(new String[] {"  0",this.SectionHeader});
        params.add(new String[] {"  2",this.SectionName});

        for (int i  =  0; i < this.entities.size(); i++) {
            Object myEntity=this.entities.get(i);
            if (myEntity instanceof EntLine) {
                EntLine myLine= (EntLine) myEntity;
                params.addAll(myLine.getPairData());
            } else if (myEntity instanceof EntPolyline) {
                EntPolyline myPolyline = (EntPolyline) myEntity;
                params.addAll(myPolyline.getPairData());
            } else if (myEntity instanceof EntPoint) {
                EntPoint myPoint = (EntPoint) myEntity;
                params.addAll(myPoint.getPairData());
            } else if (myEntity instanceof EntCircle) {
                EntCircle myCircle = (EntCircle) myEntity;
                params.addAll(myCircle.getPairData());
            } else if (myEntity instanceof EntArc) {
                EntArc myArc = (EntArc) myEntity;
                params.addAll(myArc.getPairData());
            } else if (myEntity instanceof EntText) {
                EntText myText = (EntText) myEntity;
                params.addAll(myText.getPairData());
            } else if (myEntity instanceof EntVertex) {
            }
        }

        params.add(new String[] {"  0",this.SectionTail});

        return params;
    }

    /**
     * getDXF()
     * @return the dxf data of entity line.
     * <pre>Output example:
     * </pre>
     */
    public List<String> getDXF() {

        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.add("  0");
        DXF_STR.add(this.SectionHeader);
        DXF_STR.add("  2");
        DXF_STR.add(this.SectionName);

        for (int i  =  0; i < this.entities.size(); i++) {
            Object myEntity=this.entities.get(i);
            if (myEntity instanceof EntLine) {
                EntLine myLine= (EntLine) myEntity;
                DXF_STR.addAll(myLine.getDXF());
            } else if (myEntity instanceof EntLWPolyline) {
                EntLWPolyline myLWPolyline = (EntLWPolyline) myEntity;
                DXF_STR.addAll(myLWPolyline.getDXF());
            } else if (myEntity instanceof EntPolyline) {
                EntPolyline myPolyline = (EntPolyline) myEntity;
                DXF_STR.addAll(myPolyline.getDXF());
            } else if (myEntity instanceof EntPoint) {
                EntPoint myPoint = (EntPoint) myEntity;
                DXF_STR.addAll(myPoint.getDXF());
            } else if (myEntity instanceof EntCircle) {
                EntCircle myCircle = (EntCircle) myEntity;
                DXF_STR.addAll(myCircle.getDXF());
            } else if (myEntity instanceof EntArc) {
                EntArc myArc = (EntArc) myEntity;
                DXF_STR.addAll(myArc.getDXF());
            } else if (myEntity instanceof EntText) {
                EntText myText = (EntText) myEntity;
                DXF_STR.addAll(myText.getDXF());
            } else if (myEntity instanceof EntVertex) {
                //EntVertex should only appeared in objection Polyline, So bypass it.
                //EntVertex myvertex = (EntVertex) myEntity;
                //DXF_STR.addAll(myvertex.getDXF());
            } else if (myEntity instanceof EntEllipse) {
                EntEllipse myEllipse = (EntEllipse) myEntity;
                DXF_STR.addAll(myEllipse.getDXF());
            }

            //this.entities.get(i).getDXF();

            //Method method = this.entities.get(i).getClass().getDeclaredMethod("GetDXF");
            //method.invoke(this.entities.get(i));
            //System.out.println(this.entities.get(i).printAll());
            //DXF_STR.addAll(this.entities.get(i).getDXF());
        }

        DXF_STR.add("  0");
        DXF_STR.add(this.SectionTail);

        return DXF_STR;
    }

    public String toString() {
        /* require the jar file --- common-lang3
        List<String> DXF_STR = new ArrayList<>();
        String returnString = new String();

        DXF_STR = this.getDXF();
        returnString = String.join(",",DXF_STR);
        */

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

