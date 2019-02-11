//package www
//AutoCAD Section--ENTITIES
import java.util.*;

/**
*@author David Wu<809758521@qq.com>
*@version 0.5
*/
public class FileDXF_CompositeTest{

	
	public static void  main(String[] args)  throws Exception{

		FileDXF_Composite myCompositeGraphic = new FileDXF_Composite();
		
		/*
		myCompositeGraphic.addPoint(2,2);
		myCompositeGraphic.addPoint(3,3,0);
		myCompositeGraphic.addLine(0,-80,300,-80);
		myCompositeGraphic.addLine(0,-80,0,300,-80,0);
		myCompositeGraphic.addCircle(0,0,80);
		myCompositeGraphic.addCircle(0,0,0,80);

		Others:
		myCompositeGraphic.addArc(0,0,90,0,90);
		myCompositeGraphic.addArc(0,0,0,90,0,90);
		myCompositeGraphic.addText(0,0,8,"Test");
		myCompositeGraphic.addText(0,0,0,8,"Test");
		
		double[][] mypoints = {{0,0},{5,5},{10,8}};		
		myCompositeGraphic.addPolyline(mypoints);
		
		//Add the combined entities
		
		//myCompositeGraphic.secEntities.entities = new  ArrayList<Object>();

		EntPolyline myPolyline = new EntPolyline();

		myPolyline.addVertex(new EntVertex(90,50));
		myPolyline.addVertex(new EntVertex(80,40));
		myPolyline.addVertex(new EntVertex(120,80));
		myPolyline.addVertex(new EntVertex(150,100));
		myPolyline.addVertex(new EntVertex(180,120));
		myPolyline.addVertex(new EntVertex(200,80));
		
		myCompositeGraphic.secEntities.entities.add(new EntVertex(2,2));
		myCompositeGraphic.secEntities.entities.add(new EntLine(-100,40,0,250,150,0));
		
		myCompositeGraphic.secEntities.entities.add(new EntLine(-250,-200,-250,200));
		myCompositeGraphic.secEntities.entities.add(new EntPoint(10,10,12));
		myCompositeGraphic.secEntities.entities.add(myPolyline);
		myCompositeGraphic.secEntities.entities.add(new EntCircle(180,-25,250));
		myCompositeGraphic.secEntities.entities.add(new EntArc(10,10,180,0,180));
		
		//myCompositeGraphic.secEntities.entities.add(new EntEllipse(0,0,0,100,0,0,0.6,0.0,2*Math.PI));
		
		myCompositeGraphic.secEntities.entities.add(new EntText(0,0,0,8,"This is mine.÷–Œƒ≤‚ ‘\r\nApache Flink 1.7.0 Release Announcement\nMessage from David Wu\nState schema evolution now works out-of-the-box\rthe integration of complex event processing with streaming SQL "));


        System.out.println("Test toString method: ");
        System.out.println(myCompositeGraphic);
        System.out.println();

        System.out.println("List's Size " + myCompositeGraphic.secEntities.entities.size());
		
		
		for (int i = 0;i<myCompositeGraphic.secEntities.entities.size();i++) {
			System.out.println(myCompositeGraphic.secEntities.entities.get(i)); 
		}
		
	   	List<String []>  myMap = myCompositeGraphic.getPairData();
        System.out.println("PairData's Size: "+myMap.size());
		for (String [] key : myMap) {
		   System.out.println("key= "+ key[0] + "\t\t\tvalue= " + key[1]);
		}
		System.out.println();
		
		
		System.out.println("");
		System.out.println("DXF file's Content:");
		
        List<String> dxf_str = myCompositeGraphic.getDXF();
        for (int i  =  0; i < dxf_str.size(); i++) {
            System.out.println(dxf_str.get(i)); 
        }
		
	
		//myCompositeGraphic.addRectangle(200,150);
		//myCompositeGraphic.addSector(new wPoint2D(50,25),50,45,90);
		myCompositeGraphic.addDonut(new wPoint2D(0,0),30,50,30,60);
		myCompositeGraphic.printAll();
		
		//myCompositeGraphic.dxf_filename = "sss.dxf";
		
		wPoint2D Po = new wPoint2D(100,100);
		wPoint2D Pc = new wPoint2D(300,250);
				
		myCompositeGraphic.PointTanCircle(Po,Pc,30,1);
		
		Po.x = 0;
		Po.y = 0;
		Pc.x = -50;
		Pc.y = -70;
		myCompositeGraphic.PointTanCircle(Po,Pc,25,2);
		
		Po.x = 0;
		Po.y = 0;
		Pc.x = -200;
		Pc.y = 100;
		myCompositeGraphic.PointTanCircle(Po,Pc,25,4);

		wPoint2D Po = new wPoint2D(100,100);
		wPoint2D Pc = new wPoint2D(300,250);
				
		myCompositeGraphic.LineTanCircle(Po,30,Pc,50,1);
		*/
		
		wPoint2D PC = new wPoint2D(0,0);
		wPoint2D Pc = new wPoint2D(300,250);
				
		myCompositeGraphic.CircleTanCircle(PC,30,Pc,100,1);
		
		System.out.println(myCompositeGraphic.dxf_filename);
		myCompositeGraphic.DXF_WRITER();
		//myCompositeGraphic.PNG_WRITER();
		
    }

}

 