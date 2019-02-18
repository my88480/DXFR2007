//This Version support AC1009,the dxf file created can be imported into all the versions of AutoCAD

import java.util.*;

/**
 * HEADER section.
 * @author David wu - Sunpower Corp.
 * thanks to  Ed Karlo - Y Systems, LLC for the variables definition
 */
public class SecHeader {
    /**
    * code  0 -Entity section header.
    */
    public String SectionHeader = "SECTION";

    /**
     * code  0 -Entity section name.
     */
    public String SectionName = "HEADER";

    /**
     * code  0 -Entity section END.
     */
    public String SectionTail = "ENDSEC";


    //The following variables' number of the standard dxf file of AutoCAD R2007 is 251.
    public static GC_Header this_GC_Header = new GC_Header();

    /**
      * The AutoCAD drawing database version number.
      * <UL>
      *   <LI>MC0.0 - DWG from Rel. 1.1
      *   <LI>AC1.2 - DWG from Rel. 1.2
      *   <LI>AC1.4 - DWG from Rel. 1.4
      *   <LI>AC1.50 - DWG from Rel. 2.0
      *   <LI>AC2.10 - DWG from Rel. 2.10
      *   <LI>AC1002 - DWG from Rel. 2.5
      *   <LI>AC1003 - DWG from Rel. 2.6
      *   <LI>AC1004 - DWG from Rel.9
      *   <LI>AC1006 = R10
      *   <LI>AC1009 = R11 and R12
      *   <LI>AC1011 = R13
      *   <LI>AC1006 - DWG from Rel.10
      *   <LI>AC1009 - DWG from Rel.11/12 (or LT R1/R2)
      *   <LI>AC1012 - DWG from Rel.13 (or LT95)
      *   <LI>AC1014 - DWG from Rel.14, 14.01 (or LT97/LT98)
      *   <LI>AC1015 - DWG from AutoCAD 2000/2001/2002 (or LT, Map or relative Desktop version)
      *   <LI>AC1018 - DWG from AutoCAD 2004/2005/2006 (or other product in the "2004", "2005" or "2006" family)
      *   <LI>AC1021 - DWG from AutoCAD 2007/2008/2009 (or other product of the "2007", "2008" and "2009" families)
      *   <LI>AC1024 - DWG from AutoCAD 2010 (or other product of the "2010" family)
      *   <LI>AC1027 - CAD2013 2014 2015 2016 2017 version.
      * </UL>
      */
    public static String $ACADVER = "AC1021";

    public static short $ACADMAINTVER =  25;

    public static String $DWGCODEPAGE = "ANSI_936";

    public static String $LASTSAVEDBY = "wusanqiang";

    public static wPoint $INSBASE = new wPoint(0.0,0.0,0.0);

    public static wPoint $EXTMIN = new wPoint(-250.0,-275.0,0.0);

    public static wPoint $EXTMAX = new wPoint(430.0,400.0,12.0);

    public static wPoint2D $LIMMIN = new wPoint2D(0.0,0.0);

    public static wPoint2D $LIMMAX = new wPoint2D(1600.0,1200.0);

    public static short $ORTHOMODE =  0;

    public static short $REGENMODE =  1;

    public static short $FILLMODE =  1;

    public static short $QTEXTMODE =  0;

    public static short $MIRRTEXT =  0;

    public static double $LTSCALE =  1.0;

    public static short $ATTMODE =  1;

    public static double $TEXTSIZE =  2.5;

    public static double $TRACEWID =  1.0;

    public static String $TEXTSTYLE = "Standard";

    public static String $CLAYER = "0";

    public static String $CELTYPE = "ByLayer";

    public static short $CECOLOR =  256;

    public static double $CELTSCALE =  1.0;

    public static short $DISPSILH =  0;

    public static double $DIMSCALE =  0.05;

    public static double $DIMASZ =  200.0;

    public static double $DIMEXO =  2.0;

    public static double $DIMDLI =  100.0;

    public static double $DIMRND =  0.0;

    public static double $DIMDLE =  0.0;

    public static double $DIMEXE =  200.0;

    public static double $DIMTP =  0.0;

    public static double $DIMTM =  0.0;

    public static double $DIMTXT =  350.0;

    public static double $DIMCEN =  2.5;

    public static double $DIMTSZ =  0.0;

    public static short $DIMTOL =  0;

    public static short $DIMLIM =  0;

    public static short $DIMTIH =  0;

    public static short $DIMTOH =  0;

    public static short $DIMSE1 =  0;

    public static short $DIMSE2 =  0;

    public static short $DIMTAD =  1;

    public static short $DIMZIN =  8;

    public static String $DIMBLK = "";

    public static short $DIMASO =  1;

    public static short $DIMSHO =  1;

    public static String $DIMPOST = "";

    public static String $DIMAPOST = "";

    public static short $DIMALT =  0;

    public static short $DIMALTD =  3;

    public static double $DIMALTF =  0.03937007874016;

    public static double $DIMLFAC =  1.0;

    public static short $DIMTOFL =  1;

    public static double $DIMTVP =  0.0;

    public static short $DIMTIX =  0;

    public static short $DIMSOXD =  0;

    public static short $DIMSAH =  0;

    public static String $DIMBLK1 = "";

    public static String $DIMBLK2 = "";

    public static String $DIMSTYLE = "ISO-25";

    public static short $DIMCLRD =  6;

    public static short $DIMCLRE =  6;

    public static short $DIMCLRT =  3;

    public static double $DIMTFAC =  1.0;

    public static double $DIMGAP =  100.0;

    public static short $DIMJUST =  0;

    public static short $DIMSD1 =  0;

    public static short $DIMSD2 =  0;

    public static short $DIMTOLJ =  0;

    public static short $DIMTZIN =  8;

    public static short $DIMALTZ =  0;

    public static short $DIMALTTZ =  0;

    public static short $DIMUPT =  0;

    public static short $DIMDEC =  1;

    public static short $DIMTDEC =  1;

    public static short $DIMALTU =  2;

    public static short $DIMALTTD =  3;

    public static String $DIMTXSTY = "Standard";

    public static short $DIMAUNIT =  0;

    public static short $DIMADEC =  0;

    public static double $DIMALTRND =  0.0;

    public static short $DIMAZIN =  0;

    public static short $DIMDSEP =  46;

    public static short $DIMATFIT =  3;

    public static short $DIMFRAC =  0;

    public static String $DIMLDRBLK = "";

    public static short $DIMLUNIT =  2;

    public static short $DIMLWD =  -2;

    public static short $DIMLWE =  -2;

    public static short $DIMTMOVE =  0;

    public static double $DIMFXL =  1.0;

    public static short $DIMFXLON =  0;

    public static double $DIMJOGANG =  0.7853981633974483;

    public static short $DIMTFILL =  0;

    public static short $DIMTFILLCLR =  0;

    public static short $DIMARCSYM =  0;

    public static String $DIMLTYPE = "";

    public static String $DIMLTEX1 = "";

    public static String $DIMLTEX2 = "";

    public static short $LUNITS =  2;

    public static short $LUPREC =  3;

    public static double $SKETCHINC =  1.0;

    public static double $FILLETRAD =  10.0;

    public static short $AUNITS =  0;

    public static short $AUPREC =  0;

    public static String $MENU = ".";

    public static double $ELEVATION =  0.0;

    public static double $PELEVATION =  0.0;

    public static double $THICKNESS =  0.0;

    public static short $LIMCHECK =  0;

    public static double $CHAMFERA =  10.0;

    public static double $CHAMFERB =  10.0;

    public static double $CHAMFERC =  20.0;

    public static double $CHAMFERD =  0.0;

    public static short $SKPOLY =  0;

    public static double $TDCREATE =  2455022.970692847;

    public static double $TDUCREATE =  2455022.637359514;

    public static double $TDUPDATE =  2458518.356494503;

    public static double $TDUUPDATE =  2458518.023161169;

    public static double $TDINDWG =  0.0102706829;

    public static double $TDUSRTIMER =  2456833.531150197;

    public static short $USRTIMER =  1;

    public static double $ANGBASE =  0.0;

    public static short $ANGDIR =  0;

    public static short $PDMODE =  0;

    public static double $PDSIZE =  0.0;

    public static double $PLINEWID =  0.0;

    public static short $SPLFRAME =  0;

    public static short $SPLINETYPE =  6;

    public static short $SPLINESEGS =  8;

    public static String $HANDSEED = "2521";

    public static short $SURFTAB1 =  6;

    public static short $SURFTAB2 =  6;

    public static short $SURFTYPE =  6;

    public static short $SURFU =  6;

    public static short $SURFV =  6;

    public static String $UCSBASE = "";

    public static String $UCSNAME = "";

    public static wPoint $UCSORG = new wPoint(0.0,0.0,0.0);

    public static wPoint $UCSXDIR = new wPoint(1.0,0.0,0.0);

    public static wPoint $UCSYDIR = new wPoint(0.0,1.0,0.0);

    public static String $UCSORTHOREF = "";

    public static short $UCSORTHOVIEW =  0;

    public static wPoint $UCSORGTOP = new wPoint(0.0,0.0,0.0);

    public static wPoint $UCSORGBOTTOM = new wPoint(0.0,0.0,0.0);

    public static wPoint $UCSORGLEFT = new wPoint(0.0,0.0,0.0);

    public static wPoint $UCSORGRIGHT = new wPoint(0.0,0.0,0.0);

    public static wPoint $UCSORGFRONT = new wPoint(0.0,0.0,0.0);

    public static wPoint $UCSORGBACK = new wPoint(0.0,0.0,0.0);

    public static String $PUCSBASE = "";

    public static String $PUCSNAME = "";

    public static wPoint $PUCSORG = new wPoint(0.0,0.0,0.0);

    public static wPoint $PUCSXDIR = new wPoint(1.0,0.0,0.0);

    public static wPoint $PUCSYDIR = new wPoint(0.0,1.0,0.0);

    public static String $PUCSORTHOREF = "";

    public static short $PUCSORTHOVIEW =  0;

    public static wPoint $PUCSORGTOP = new wPoint(0.0,0.0,0.0);

    public static wPoint $PUCSORGBOTTOM = new wPoint(0.0,0.0,0.0);

    public static wPoint $PUCSORGLEFT = new wPoint(0.0,0.0,0.0);

    public static wPoint $PUCSORGRIGHT = new wPoint(0.0,0.0,0.0);

    public static wPoint $PUCSORGFRONT = new wPoint(0.0,0.0,0.0);

    public static wPoint $PUCSORGBACK = new wPoint(0.0,0.0,0.0);

    public static short $USERI1 =  0;

    public static short $USERI2 =  0;

    public static short $USERI3 =  0;

    public static short $USERI4 =  0;

    public static short $USERI5 =  0;

    public static double $USERR1 =  0.0;

    public static double $USERR2 =  0.0;

    public static double $USERR3 =  0.0;

    public static double $USERR4 =  0.0;

    public static double $USERR5 =  0.0;

    public static short $WORLDVIEW =  1;

    public static short $SHADEDGE =  3;

    public static short $SHADEDIF =  70;

    public static short $TILEMODE =  1;

    public static short $MAXACTVP =  64;

    public static wPoint $PINSBASE = new wPoint(0.0,0.0,0.0);

    public static short $PLIMCHECK =  0;

    public static wPoint $PEXTMIN = new wPoint(1.000000000000000E+20,1.000000000000000E+20,1.000000000000000E+20);

    public static wPoint $PEXTMAX = new wPoint(-1.000000000000000E+20,-1.000000000000000E+20,-1.000000000000000E+20);

    public static wPoint2D $PLIMMIN = new wPoint2D(0.0,0.0);

    public static wPoint2D $PLIMMAX = new wPoint2D(0.0,0.0);

    public static short $UNITMODE =  0;

    public static short $VISRETAIN =  1;

    public static short $PLINEGEN =  0;

    public static short $PSLTSCALE =  1;

    public static short $TREEDEPTH =  3020;

    public static String $CMLSTYLE = "Standard";

    public static short $CMLJUST =  0;

    public static double $CMLSCALE =  20.0;

    public static short $PROXYGRAPHICS =  1;

    public static short $MEASUREMENT =  1;

    public static short $CELWEIGHT =  -1;

    public static short $ENDCAPS =  0;

    public static short $JOINSTYLE =  0;

    public static boolean $LWDISPLAY =  false;

    public static short $INSUNITS =  4;

    public static String $HYPERLINKBASE = "";

    public static String $STYLESHEET = "";

    public static boolean $XEDIT =  false;

    public static short $CEPSNTYPE =  0;

    public static boolean $PSTYLEMODE =  false;

    public static String $FINGERPRINTGUID = "{EC6BB858-51AA-46EC-B484-6C9CC7AB3E2E}";

    public static String $VERSIONGUID = "{23B1F04D-C0DA-4E0E-BE9E-C1E169E74BE0}";

    public static boolean $EXTNAMES =  false;

    public static double $PSVPSCALE =  0.0;

    public static boolean $OLESTARTUP =  false;

    public static short $SORTENTS =  127;

    public static short $INDEXCTL =  0;

    public static short $HIDETEXT =  0;

    public static boolean $XCLIPFRAME =  false;

    public static short $HALOGAP =  0;

    public static short $OBSCOLOR =  257;

    public static short $OBSLTYPE =  0;

    public static short $INTERSECTIONDISPLAY =  0;

    public static short $INTERSECTIONCOLOR =  257;

    public static short $DIMASSOC =  1;

    public static String $PROJECTNAME = "";

    public static boolean $CAMERADISPLAY =  false;

    public static double $LENSLENGTH =  50.0;

    public static double $CAMERAHEIGHT =  0.0;

    public static double $STEPSPERSEC =  2.0;

    public static double $STEPSIZE =  6.0;

    public static double $3DDWFPREC =  2.0;

    public static double $PSOLWIDTH =  0.25;

    public static double $PSOLHEIGHT =  4.0;

    public static double $LOFTANG1 =  1.570796326794896;

    public static double $LOFTANG2 =  1.570796326794896;

    public static double $LOFTMAG1 =  0.0;

    public static double $LOFTMAG2 =  0.0;

    public static short $LOFTPARAM =  7;

    public static short $LOFTNORMALS =  1;

    public static double $LATITUDE =  37.795;

    public static double $LONGITUDE =  -122.394;

    public static double $NORTHDIRECTION =  0.0;

    public static short $TIMEZONE =  -8000;

    public static short $LIGHTGLYPHDISPLAY =  1;

    public static short $TILEMODELIGHTSYNCH =  1;

    public static String $CMATERIAL = "D7";

    public static short $SOLIDHIST =  1;

    public static short $SHOWHIST =  1;

    public static short $DWFFRAME =  2;

    public static short $DGNFRAME =  0;

    public static boolean $REALWORLDSCALE =  false;

    public static short $INTERFERECOLOR =  1;

    public static String $INTERFEREOBJVS = "F9";

    public static String $INTERFEREVPVS = "F6";

    public static short $CSHADOW =  0;

    public static double $SHADOWPLANELOCATION =  0.0;

    public void assembleHeaderDXF() {
        this_GC_Header.addVar(new GC_Variable("$ACADVER",new GroupCode("  1",$ACADVER)));
        this_GC_Header.addVar(new GC_Variable("$ACADMAINTVER",new GroupCode(" 70",$ACADMAINTVER)));
        this_GC_Header.addVar(new GC_Variable("$DWGCODEPAGE",new GroupCode("  3",$DWGCODEPAGE)));
        this_GC_Header.addVar(new GC_Variable("$LASTSAVEDBY",new GroupCode("  1",$LASTSAVEDBY)));
        this_GC_Header.addVar(new GC_Variable("$INSBASE",new GC_wPoint($INSBASE)));
        this_GC_Header.addVar(new GC_Variable("$EXTMIN",new GC_wPoint($EXTMIN)));
        this_GC_Header.addVar(new GC_Variable("$EXTMAX",new GC_wPoint($EXTMAX)));
        this_GC_Header.addVar(new GC_Variable("$LIMMIN",new GC_wPoint2D($LIMMIN)));
        this_GC_Header.addVar(new GC_Variable("$LIMMAX",new GC_wPoint2D($LIMMAX)));
        this_GC_Header.addVar(new GC_Variable("$ORTHOMODE",new GroupCode(" 70",$ORTHOMODE)));
        this_GC_Header.addVar(new GC_Variable("$REGENMODE",new GroupCode(" 70",$REGENMODE)));
        this_GC_Header.addVar(new GC_Variable("$FILLMODE",new GroupCode(" 70",$FILLMODE)));
        this_GC_Header.addVar(new GC_Variable("$QTEXTMODE",new GroupCode(" 70",$QTEXTMODE)));
        this_GC_Header.addVar(new GC_Variable("$MIRRTEXT",new GroupCode(" 70",$MIRRTEXT)));
        this_GC_Header.addVar(new GC_Variable("$LTSCALE",new GroupCode(" 40",$LTSCALE)));
        this_GC_Header.addVar(new GC_Variable("$ATTMODE",new GroupCode(" 70",$ATTMODE)));
        this_GC_Header.addVar(new GC_Variable("$TEXTSIZE",new GroupCode(" 40",$TEXTSIZE)));
        this_GC_Header.addVar(new GC_Variable("$TRACEWID",new GroupCode(" 40",$TRACEWID)));
        this_GC_Header.addVar(new GC_Variable("$TEXTSTYLE",new GroupCode("  7",$TEXTSTYLE)));
        this_GC_Header.addVar(new GC_Variable("$CLAYER",new GroupCode("  8",$CLAYER)));
        this_GC_Header.addVar(new GC_Variable("$CELTYPE",new GroupCode("  6",$CELTYPE)));
        this_GC_Header.addVar(new GC_Variable("$CECOLOR",new GroupCode(" 62",$CECOLOR)));
        this_GC_Header.addVar(new GC_Variable("$CELTSCALE",new GroupCode(" 40",$CELTSCALE)));
        this_GC_Header.addVar(new GC_Variable("$DISPSILH",new GroupCode(" 70",$DISPSILH)));
        this_GC_Header.addVar(new GC_Variable("$DIMSCALE",new GroupCode(" 40",$DIMSCALE)));
        this_GC_Header.addVar(new GC_Variable("$DIMASZ",new GroupCode(" 40",$DIMASZ)));
        this_GC_Header.addVar(new GC_Variable("$DIMEXO",new GroupCode(" 40",$DIMEXO)));
        this_GC_Header.addVar(new GC_Variable("$DIMDLI",new GroupCode(" 40",$DIMDLI)));
        this_GC_Header.addVar(new GC_Variable("$DIMRND",new GroupCode(" 40",$DIMRND)));
        this_GC_Header.addVar(new GC_Variable("$DIMDLE",new GroupCode(" 40",$DIMDLE)));
        this_GC_Header.addVar(new GC_Variable("$DIMEXE",new GroupCode(" 40",$DIMEXE)));
        this_GC_Header.addVar(new GC_Variable("$DIMTP",new GroupCode(" 40",$DIMTP)));
        this_GC_Header.addVar(new GC_Variable("$DIMTM",new GroupCode(" 40",$DIMTM)));
        this_GC_Header.addVar(new GC_Variable("$DIMTXT",new GroupCode(" 40",$DIMTXT)));
        this_GC_Header.addVar(new GC_Variable("$DIMCEN",new GroupCode(" 40",$DIMCEN)));
        this_GC_Header.addVar(new GC_Variable("$DIMTSZ",new GroupCode(" 40",$DIMTSZ)));
        this_GC_Header.addVar(new GC_Variable("$DIMTOL",new GroupCode(" 70",$DIMTOL)));
        this_GC_Header.addVar(new GC_Variable("$DIMLIM",new GroupCode(" 70",$DIMLIM)));
        this_GC_Header.addVar(new GC_Variable("$DIMTIH",new GroupCode(" 70",$DIMTIH)));
        this_GC_Header.addVar(new GC_Variable("$DIMTOH",new GroupCode(" 70",$DIMTOH)));
        this_GC_Header.addVar(new GC_Variable("$DIMSE1",new GroupCode(" 70",$DIMSE1)));
        this_GC_Header.addVar(new GC_Variable("$DIMSE2",new GroupCode(" 70",$DIMSE2)));
        this_GC_Header.addVar(new GC_Variable("$DIMTAD",new GroupCode(" 70",$DIMTAD)));
        this_GC_Header.addVar(new GC_Variable("$DIMZIN",new GroupCode(" 70",$DIMZIN)));
        this_GC_Header.addVar(new GC_Variable("$DIMBLK",new GroupCode("  1",$DIMBLK)));
        this_GC_Header.addVar(new GC_Variable("$DIMASO",new GroupCode(" 70",$DIMASO)));
        this_GC_Header.addVar(new GC_Variable("$DIMSHO",new GroupCode(" 70",$DIMSHO)));
        this_GC_Header.addVar(new GC_Variable("$DIMPOST",new GroupCode("  1",$DIMPOST)));
        this_GC_Header.addVar(new GC_Variable("$DIMAPOST",new GroupCode("  1",$DIMAPOST)));
        this_GC_Header.addVar(new GC_Variable("$DIMALT",new GroupCode(" 70",$DIMALT)));
        this_GC_Header.addVar(new GC_Variable("$DIMALTD",new GroupCode(" 70",$DIMALTD)));
        this_GC_Header.addVar(new GC_Variable("$DIMALTF",new GroupCode(" 40",$DIMALTF)));
        this_GC_Header.addVar(new GC_Variable("$DIMLFAC",new GroupCode(" 40",$DIMLFAC)));
        this_GC_Header.addVar(new GC_Variable("$DIMTOFL",new GroupCode(" 70",$DIMTOFL)));
        this_GC_Header.addVar(new GC_Variable("$DIMTVP",new GroupCode(" 40",$DIMTVP)));
        this_GC_Header.addVar(new GC_Variable("$DIMTIX",new GroupCode(" 70",$DIMTIX)));
        this_GC_Header.addVar(new GC_Variable("$DIMSOXD",new GroupCode(" 70",$DIMSOXD)));
        this_GC_Header.addVar(new GC_Variable("$DIMSAH",new GroupCode(" 70",$DIMSAH)));
        this_GC_Header.addVar(new GC_Variable("$DIMBLK1",new GroupCode("  1",$DIMBLK1)));
        this_GC_Header.addVar(new GC_Variable("$DIMBLK2",new GroupCode("  1",$DIMBLK2)));
        this_GC_Header.addVar(new GC_Variable("$DIMSTYLE",new GroupCode("  2",$DIMSTYLE)));
        this_GC_Header.addVar(new GC_Variable("$DIMCLRD",new GroupCode(" 70",$DIMCLRD)));
        this_GC_Header.addVar(new GC_Variable("$DIMCLRE",new GroupCode(" 70",$DIMCLRE)));
        this_GC_Header.addVar(new GC_Variable("$DIMCLRT",new GroupCode(" 70",$DIMCLRT)));
        this_GC_Header.addVar(new GC_Variable("$DIMTFAC",new GroupCode(" 40",$DIMTFAC)));
        this_GC_Header.addVar(new GC_Variable("$DIMGAP",new GroupCode(" 40",$DIMGAP)));
        this_GC_Header.addVar(new GC_Variable("$DIMJUST",new GroupCode(" 70",$DIMJUST)));
        this_GC_Header.addVar(new GC_Variable("$DIMSD1",new GroupCode(" 70",$DIMSD1)));
        this_GC_Header.addVar(new GC_Variable("$DIMSD2",new GroupCode(" 70",$DIMSD2)));
        this_GC_Header.addVar(new GC_Variable("$DIMTOLJ",new GroupCode(" 70",$DIMTOLJ)));
        this_GC_Header.addVar(new GC_Variable("$DIMTZIN",new GroupCode(" 70",$DIMTZIN)));
        this_GC_Header.addVar(new GC_Variable("$DIMALTZ",new GroupCode(" 70",$DIMALTZ)));
        this_GC_Header.addVar(new GC_Variable("$DIMALTTZ",new GroupCode(" 70",$DIMALTTZ)));
        this_GC_Header.addVar(new GC_Variable("$DIMUPT",new GroupCode(" 70",$DIMUPT)));
        this_GC_Header.addVar(new GC_Variable("$DIMDEC",new GroupCode(" 70",$DIMDEC)));
        this_GC_Header.addVar(new GC_Variable("$DIMTDEC",new GroupCode(" 70",$DIMTDEC)));
        this_GC_Header.addVar(new GC_Variable("$DIMALTU",new GroupCode(" 70",$DIMALTU)));
        this_GC_Header.addVar(new GC_Variable("$DIMALTTD",new GroupCode(" 70",$DIMALTTD)));
        this_GC_Header.addVar(new GC_Variable("$DIMTXSTY",new GroupCode("  7",$DIMTXSTY)));
        this_GC_Header.addVar(new GC_Variable("$DIMAUNIT",new GroupCode(" 70",$DIMAUNIT)));
        this_GC_Header.addVar(new GC_Variable("$DIMADEC",new GroupCode(" 70",$DIMADEC)));
        this_GC_Header.addVar(new GC_Variable("$DIMALTRND",new GroupCode(" 40",$DIMALTRND)));
        this_GC_Header.addVar(new GC_Variable("$DIMAZIN",new GroupCode(" 70",$DIMAZIN)));
        this_GC_Header.addVar(new GC_Variable("$DIMDSEP",new GroupCode(" 70",$DIMDSEP)));
        this_GC_Header.addVar(new GC_Variable("$DIMATFIT",new GroupCode(" 70",$DIMATFIT)));
        this_GC_Header.addVar(new GC_Variable("$DIMFRAC",new GroupCode(" 70",$DIMFRAC)));
        this_GC_Header.addVar(new GC_Variable("$DIMLDRBLK",new GroupCode("  1",$DIMLDRBLK)));
        this_GC_Header.addVar(new GC_Variable("$DIMLUNIT",new GroupCode(" 70",$DIMLUNIT)));
        this_GC_Header.addVar(new GC_Variable("$DIMLWD",new GroupCode(" 70",$DIMLWD)));
        this_GC_Header.addVar(new GC_Variable("$DIMLWE",new GroupCode(" 70",$DIMLWE)));
        this_GC_Header.addVar(new GC_Variable("$DIMTMOVE",new GroupCode(" 70",$DIMTMOVE)));
        this_GC_Header.addVar(new GC_Variable("$DIMFXL",new GroupCode(" 40",$DIMFXL)));
        this_GC_Header.addVar(new GC_Variable("$DIMFXLON",new GroupCode(" 70",$DIMFXLON)));
        this_GC_Header.addVar(new GC_Variable("$DIMJOGANG",new GroupCode(" 40",$DIMJOGANG)));
        this_GC_Header.addVar(new GC_Variable("$DIMTFILL",new GroupCode(" 70",$DIMTFILL)));
        this_GC_Header.addVar(new GC_Variable("$DIMTFILLCLR",new GroupCode(" 70",$DIMTFILLCLR)));
        this_GC_Header.addVar(new GC_Variable("$DIMARCSYM",new GroupCode(" 70",$DIMARCSYM)));
        this_GC_Header.addVar(new GC_Variable("$DIMLTYPE",new GroupCode("  6",$DIMLTYPE)));
        this_GC_Header.addVar(new GC_Variable("$DIMLTEX1",new GroupCode("  6",$DIMLTEX1)));
        this_GC_Header.addVar(new GC_Variable("$DIMLTEX2",new GroupCode("  6",$DIMLTEX2)));
        this_GC_Header.addVar(new GC_Variable("$LUNITS",new GroupCode(" 70",$LUNITS)));
        this_GC_Header.addVar(new GC_Variable("$LUPREC",new GroupCode(" 70",$LUPREC)));
        this_GC_Header.addVar(new GC_Variable("$SKETCHINC",new GroupCode(" 40",$SKETCHINC)));
        this_GC_Header.addVar(new GC_Variable("$FILLETRAD",new GroupCode(" 40",$FILLETRAD)));
        this_GC_Header.addVar(new GC_Variable("$AUNITS",new GroupCode(" 70",$AUNITS)));
        this_GC_Header.addVar(new GC_Variable("$AUPREC",new GroupCode(" 70",$AUPREC)));
        this_GC_Header.addVar(new GC_Variable("$MENU",new GroupCode("  1",$MENU)));
        this_GC_Header.addVar(new GC_Variable("$ELEVATION",new GroupCode(" 40",$ELEVATION)));
        this_GC_Header.addVar(new GC_Variable("$PELEVATION",new GroupCode(" 40",$PELEVATION)));
        this_GC_Header.addVar(new GC_Variable("$THICKNESS",new GroupCode(" 40",$THICKNESS)));
        this_GC_Header.addVar(new GC_Variable("$LIMCHECK",new GroupCode(" 70",$LIMCHECK)));
        this_GC_Header.addVar(new GC_Variable("$CHAMFERA",new GroupCode(" 40",$CHAMFERA)));
        this_GC_Header.addVar(new GC_Variable("$CHAMFERB",new GroupCode(" 40",$CHAMFERB)));
        this_GC_Header.addVar(new GC_Variable("$CHAMFERC",new GroupCode(" 40",$CHAMFERC)));
        this_GC_Header.addVar(new GC_Variable("$CHAMFERD",new GroupCode(" 40",$CHAMFERD)));
        this_GC_Header.addVar(new GC_Variable("$SKPOLY",new GroupCode(" 70",$SKPOLY)));
        this_GC_Header.addVar(new GC_Variable("$TDCREATE",new GroupCode(" 40",$TDCREATE)));
        this_GC_Header.addVar(new GC_Variable("$TDUCREATE",new GroupCode(" 40",$TDUCREATE)));
        this_GC_Header.addVar(new GC_Variable("$TDUPDATE",new GroupCode(" 40",$TDUPDATE)));
        this_GC_Header.addVar(new GC_Variable("$TDUUPDATE",new GroupCode(" 40",$TDUUPDATE)));
        this_GC_Header.addVar(new GC_Variable("$TDINDWG",new GroupCode(" 40",$TDINDWG)));
        this_GC_Header.addVar(new GC_Variable("$TDUSRTIMER",new GroupCode(" 40",$TDUSRTIMER)));
        this_GC_Header.addVar(new GC_Variable("$USRTIMER",new GroupCode(" 70",$USRTIMER)));
        this_GC_Header.addVar(new GC_Variable("$ANGBASE",new GroupCode(" 50",$ANGBASE)));
        this_GC_Header.addVar(new GC_Variable("$ANGDIR",new GroupCode(" 70",$ANGDIR)));
        this_GC_Header.addVar(new GC_Variable("$PDMODE",new GroupCode(" 70",$PDMODE)));
        this_GC_Header.addVar(new GC_Variable("$PDSIZE",new GroupCode(" 40",$PDSIZE)));
        this_GC_Header.addVar(new GC_Variable("$PLINEWID",new GroupCode(" 40",$PLINEWID)));
        this_GC_Header.addVar(new GC_Variable("$SPLFRAME",new GroupCode(" 70",$SPLFRAME)));
        this_GC_Header.addVar(new GC_Variable("$SPLINETYPE",new GroupCode(" 70",$SPLINETYPE)));
        this_GC_Header.addVar(new GC_Variable("$SPLINESEGS",new GroupCode(" 70",$SPLINESEGS)));
        this_GC_Header.addVar(new GC_Variable("$HANDSEED",new GroupCode("  5",$HANDSEED)));
        this_GC_Header.addVar(new GC_Variable("$SURFTAB1",new GroupCode(" 70",$SURFTAB1)));
        this_GC_Header.addVar(new GC_Variable("$SURFTAB2",new GroupCode(" 70",$SURFTAB2)));
        this_GC_Header.addVar(new GC_Variable("$SURFTYPE",new GroupCode(" 70",$SURFTYPE)));
        this_GC_Header.addVar(new GC_Variable("$SURFU",new GroupCode(" 70",$SURFU)));
        this_GC_Header.addVar(new GC_Variable("$SURFV",new GroupCode(" 70",$SURFV)));
        this_GC_Header.addVar(new GC_Variable("$UCSBASE",new GroupCode("  2",$UCSBASE)));
        this_GC_Header.addVar(new GC_Variable("$UCSNAME",new GroupCode("  2",$UCSNAME)));
        this_GC_Header.addVar(new GC_Variable("$UCSORG",new GC_wPoint($UCSORG)));
        this_GC_Header.addVar(new GC_Variable("$UCSXDIR",new GC_wPoint($UCSXDIR)));
        this_GC_Header.addVar(new GC_Variable("$UCSYDIR",new GC_wPoint($UCSYDIR)));
        this_GC_Header.addVar(new GC_Variable("$UCSORTHOREF",new GroupCode("  2",$UCSORTHOREF)));
        this_GC_Header.addVar(new GC_Variable("$UCSORTHOVIEW",new GroupCode(" 70",$UCSORTHOVIEW)));
        this_GC_Header.addVar(new GC_Variable("$UCSORGTOP",new GC_wPoint($UCSORGTOP)));
        this_GC_Header.addVar(new GC_Variable("$UCSORGBOTTOM",new GC_wPoint($UCSORGBOTTOM)));
        this_GC_Header.addVar(new GC_Variable("$UCSORGLEFT",new GC_wPoint($UCSORGLEFT)));
        this_GC_Header.addVar(new GC_Variable("$UCSORGRIGHT",new GC_wPoint($UCSORGRIGHT)));
        this_GC_Header.addVar(new GC_Variable("$UCSORGFRONT",new GC_wPoint($UCSORGFRONT)));
        this_GC_Header.addVar(new GC_Variable("$UCSORGBACK",new GC_wPoint($UCSORGBACK)));
        this_GC_Header.addVar(new GC_Variable("$PUCSBASE",new GroupCode("  2",$PUCSBASE)));
        this_GC_Header.addVar(new GC_Variable("$PUCSNAME",new GroupCode("  2",$PUCSNAME)));
        this_GC_Header.addVar(new GC_Variable("$PUCSORG",new GC_wPoint($PUCSORG)));
        this_GC_Header.addVar(new GC_Variable("$PUCSXDIR",new GC_wPoint($PUCSXDIR)));
        this_GC_Header.addVar(new GC_Variable("$PUCSYDIR",new GC_wPoint($PUCSYDIR)));
        this_GC_Header.addVar(new GC_Variable("$PUCSORTHOREF",new GroupCode("  2",$PUCSORTHOREF)));
        this_GC_Header.addVar(new GC_Variable("$PUCSORTHOVIEW",new GroupCode(" 70",$PUCSORTHOVIEW)));
        this_GC_Header.addVar(new GC_Variable("$PUCSORGTOP",new GC_wPoint($PUCSORGTOP)));
        this_GC_Header.addVar(new GC_Variable("$PUCSORGBOTTOM",new GC_wPoint($PUCSORGBOTTOM)));
        this_GC_Header.addVar(new GC_Variable("$PUCSORGLEFT",new GC_wPoint($PUCSORGLEFT)));
        this_GC_Header.addVar(new GC_Variable("$PUCSORGRIGHT",new GC_wPoint($PUCSORGRIGHT)));
        this_GC_Header.addVar(new GC_Variable("$PUCSORGFRONT",new GC_wPoint($PUCSORGFRONT)));
        this_GC_Header.addVar(new GC_Variable("$PUCSORGBACK",new GC_wPoint($PUCSORGBACK)));
        this_GC_Header.addVar(new GC_Variable("$USERI1",new GroupCode(" 70",$USERI1)));
        this_GC_Header.addVar(new GC_Variable("$USERI2",new GroupCode(" 70",$USERI2)));
        this_GC_Header.addVar(new GC_Variable("$USERI3",new GroupCode(" 70",$USERI3)));
        this_GC_Header.addVar(new GC_Variable("$USERI4",new GroupCode(" 70",$USERI4)));
        this_GC_Header.addVar(new GC_Variable("$USERI5",new GroupCode(" 70",$USERI5)));
        this_GC_Header.addVar(new GC_Variable("$USERR1",new GroupCode(" 40",$USERR1)));
        this_GC_Header.addVar(new GC_Variable("$USERR2",new GroupCode(" 40",$USERR2)));
        this_GC_Header.addVar(new GC_Variable("$USERR3",new GroupCode(" 40",$USERR3)));
        this_GC_Header.addVar(new GC_Variable("$USERR4",new GroupCode(" 40",$USERR4)));
        this_GC_Header.addVar(new GC_Variable("$USERR5",new GroupCode(" 40",$USERR5)));
        this_GC_Header.addVar(new GC_Variable("$WORLDVIEW",new GroupCode(" 70",$WORLDVIEW)));
        this_GC_Header.addVar(new GC_Variable("$SHADEDGE",new GroupCode(" 70",$SHADEDGE)));
        this_GC_Header.addVar(new GC_Variable("$SHADEDIF",new GroupCode(" 70",$SHADEDIF)));
        this_GC_Header.addVar(new GC_Variable("$TILEMODE",new GroupCode(" 70",$TILEMODE)));
        this_GC_Header.addVar(new GC_Variable("$MAXACTVP",new GroupCode(" 70",$MAXACTVP)));
        this_GC_Header.addVar(new GC_Variable("$PINSBASE",new GC_wPoint($PINSBASE)));
        this_GC_Header.addVar(new GC_Variable("$PLIMCHECK",new GroupCode(" 70",$PLIMCHECK)));
        this_GC_Header.addVar(new GC_Variable("$PEXTMIN",new GC_wPoint($PEXTMIN)));
        this_GC_Header.addVar(new GC_Variable("$PEXTMAX",new GC_wPoint($PEXTMAX)));
        this_GC_Header.addVar(new GC_Variable("$PLIMMIN",new GC_wPoint2D($PLIMMIN)));
        this_GC_Header.addVar(new GC_Variable("$PLIMMAX",new GC_wPoint2D($PLIMMAX)));
        this_GC_Header.addVar(new GC_Variable("$UNITMODE",new GroupCode(" 70",$UNITMODE)));
        this_GC_Header.addVar(new GC_Variable("$VISRETAIN",new GroupCode(" 70",$VISRETAIN)));
        this_GC_Header.addVar(new GC_Variable("$PLINEGEN",new GroupCode(" 70",$PLINEGEN)));
        this_GC_Header.addVar(new GC_Variable("$PSLTSCALE",new GroupCode(" 70",$PSLTSCALE)));
        this_GC_Header.addVar(new GC_Variable("$TREEDEPTH",new GroupCode(" 70",$TREEDEPTH)));
        this_GC_Header.addVar(new GC_Variable("$CMLSTYLE",new GroupCode("  2",$CMLSTYLE)));
        this_GC_Header.addVar(new GC_Variable("$CMLJUST",new GroupCode(" 70",$CMLJUST)));
        this_GC_Header.addVar(new GC_Variable("$CMLSCALE",new GroupCode(" 40",$CMLSCALE)));
        this_GC_Header.addVar(new GC_Variable("$PROXYGRAPHICS",new GroupCode(" 70",$PROXYGRAPHICS)));
        this_GC_Header.addVar(new GC_Variable("$MEASUREMENT",new GroupCode(" 70",$MEASUREMENT)));
        this_GC_Header.addVar(new GC_Variable("$CELWEIGHT",new GroupCode("370",$CELWEIGHT)));
        this_GC_Header.addVar(new GC_Variable("$ENDCAPS",new GroupCode("280",$ENDCAPS)));
        this_GC_Header.addVar(new GC_Variable("$JOINSTYLE",new GroupCode("280",$JOINSTYLE)));
        this_GC_Header.addVar(new GC_Variable("$LWDISPLAY",new GroupCode("290",$LWDISPLAY)));
        this_GC_Header.addVar(new GC_Variable("$INSUNITS",new GroupCode(" 70",$INSUNITS)));
        this_GC_Header.addVar(new GC_Variable("$HYPERLINKBASE",new GroupCode("  1",$HYPERLINKBASE)));
        this_GC_Header.addVar(new GC_Variable("$STYLESHEET",new GroupCode("  1",$STYLESHEET)));
        this_GC_Header.addVar(new GC_Variable("$XEDIT",new GroupCode("290",$XEDIT)));
        this_GC_Header.addVar(new GC_Variable("$CEPSNTYPE",new GroupCode("380",$CEPSNTYPE)));
        this_GC_Header.addVar(new GC_Variable("$PSTYLEMODE",new GroupCode("290",$PSTYLEMODE)));
        this_GC_Header.addVar(new GC_Variable("$FINGERPRINTGUID",new GroupCode("  2",$FINGERPRINTGUID)));
        this_GC_Header.addVar(new GC_Variable("$VERSIONGUID",new GroupCode("  2",$VERSIONGUID)));
        this_GC_Header.addVar(new GC_Variable("$EXTNAMES",new GroupCode("290",$EXTNAMES)));
        this_GC_Header.addVar(new GC_Variable("$PSVPSCALE",new GroupCode(" 40",$PSVPSCALE)));
        this_GC_Header.addVar(new GC_Variable("$OLESTARTUP",new GroupCode("290",$OLESTARTUP)));
        this_GC_Header.addVar(new GC_Variable("$SORTENTS",new GroupCode("280",$SORTENTS)));
        this_GC_Header.addVar(new GC_Variable("$INDEXCTL",new GroupCode("280",$INDEXCTL)));
        this_GC_Header.addVar(new GC_Variable("$HIDETEXT",new GroupCode("280",$HIDETEXT)));
        this_GC_Header.addVar(new GC_Variable("$XCLIPFRAME",new GroupCode("290",$XCLIPFRAME)));
        this_GC_Header.addVar(new GC_Variable("$HALOGAP",new GroupCode("280",$HALOGAP)));
        this_GC_Header.addVar(new GC_Variable("$OBSCOLOR",new GroupCode(" 70",$OBSCOLOR)));
        this_GC_Header.addVar(new GC_Variable("$OBSLTYPE",new GroupCode("280",$OBSLTYPE)));
        this_GC_Header.addVar(new GC_Variable("$INTERSECTIONDISPLAY",new GroupCode("280",$INTERSECTIONDISPLAY)));
        this_GC_Header.addVar(new GC_Variable("$INTERSECTIONCOLOR",new GroupCode(" 70",$INTERSECTIONCOLOR)));
        this_GC_Header.addVar(new GC_Variable("$DIMASSOC",new GroupCode("280",$DIMASSOC)));
        this_GC_Header.addVar(new GC_Variable("$PROJECTNAME",new GroupCode("  1",$PROJECTNAME)));
        this_GC_Header.addVar(new GC_Variable("$CAMERADISPLAY",new GroupCode("290",$CAMERADISPLAY)));
        this_GC_Header.addVar(new GC_Variable("$LENSLENGTH",new GroupCode(" 40",$LENSLENGTH)));
        this_GC_Header.addVar(new GC_Variable("$CAMERAHEIGHT",new GroupCode(" 40",$CAMERAHEIGHT)));
        this_GC_Header.addVar(new GC_Variable("$STEPSPERSEC",new GroupCode(" 40",$STEPSPERSEC)));
        this_GC_Header.addVar(new GC_Variable("$STEPSIZE",new GroupCode(" 40",$STEPSIZE)));
        this_GC_Header.addVar(new GC_Variable("$3DDWFPREC",new GroupCode(" 40",$3DDWFPREC)));
        this_GC_Header.addVar(new GC_Variable("$PSOLWIDTH",new GroupCode(" 40",$PSOLWIDTH)));
        this_GC_Header.addVar(new GC_Variable("$PSOLHEIGHT",new GroupCode(" 40",$PSOLHEIGHT)));
        this_GC_Header.addVar(new GC_Variable("$LOFTANG1",new GroupCode(" 40",$LOFTANG1)));
        this_GC_Header.addVar(new GC_Variable("$LOFTANG2",new GroupCode(" 40",$LOFTANG2)));
        this_GC_Header.addVar(new GC_Variable("$LOFTMAG1",new GroupCode(" 40",$LOFTMAG1)));
        this_GC_Header.addVar(new GC_Variable("$LOFTMAG2",new GroupCode(" 40",$LOFTMAG2)));
        this_GC_Header.addVar(new GC_Variable("$LOFTPARAM",new GroupCode(" 70",$LOFTPARAM)));
        this_GC_Header.addVar(new GC_Variable("$LOFTNORMALS",new GroupCode("280",$LOFTNORMALS)));
        this_GC_Header.addVar(new GC_Variable("$LATITUDE",new GroupCode(" 40",$LATITUDE)));
        this_GC_Header.addVar(new GC_Variable("$LONGITUDE",new GroupCode(" 40",$LONGITUDE)));
        this_GC_Header.addVar(new GC_Variable("$NORTHDIRECTION",new GroupCode(" 40",$NORTHDIRECTION)));
        this_GC_Header.addVar(new GC_Variable("$TIMEZONE",new GroupCode(" 70",$TIMEZONE)));
        this_GC_Header.addVar(new GC_Variable("$LIGHTGLYPHDISPLAY",new GroupCode("280",$LIGHTGLYPHDISPLAY)));
        this_GC_Header.addVar(new GC_Variable("$TILEMODELIGHTSYNCH",new GroupCode("280",$TILEMODELIGHTSYNCH)));
        this_GC_Header.addVar(new GC_Variable("$CMATERIAL",new GroupCode("347",$CMATERIAL)));
        this_GC_Header.addVar(new GC_Variable("$SOLIDHIST",new GroupCode("280",$SOLIDHIST)));
        this_GC_Header.addVar(new GC_Variable("$SHOWHIST",new GroupCode("280",$SHOWHIST)));
        this_GC_Header.addVar(new GC_Variable("$DWFFRAME",new GroupCode("280",$DWFFRAME)));
        this_GC_Header.addVar(new GC_Variable("$DGNFRAME",new GroupCode("280",$DGNFRAME)));
        this_GC_Header.addVar(new GC_Variable("$REALWORLDSCALE",new GroupCode("290",$REALWORLDSCALE)));
        this_GC_Header.addVar(new GC_Variable("$INTERFERECOLOR",new GroupCode(" 62",$INTERFERECOLOR)));
        this_GC_Header.addVar(new GC_Variable("$INTERFEREOBJVS",new GroupCode("345",$INTERFEREOBJVS)));
        this_GC_Header.addVar(new GC_Variable("$INTERFEREVPVS",new GroupCode("346",$INTERFEREVPVS)));
        this_GC_Header.addVar(new GC_Variable("$CSHADOW",new GroupCode("280",$CSHADOW)));
        this_GC_Header.addVar(new GC_Variable("$SHADOWPLANELOCATION",new GroupCode(" 40",$SHADOWPLANELOCATION)));
    }

    /**
     * Constructor (empty)
     */
    public   SecHeader() {

        this.assembleHeaderDXF();

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
	 * @return Returns the this_GC_Header.
	 */
	public GC_Header getThis_GC_Header(){
		return this.this_GC_Header;
	}

	/**
	 * @return Returns the $ACADVER.
	 */
	public String get$ACADVER(){
		return this.$ACADVER;
	}

	/**
	 * @return Returns the $ACADMAINTVER.
	 */
	public short get$ACADMAINTVER(){
		return this.$ACADMAINTVER;
	}

	/**
	 * @return Returns the $DWGCODEPAGE.
	 */
	public String get$DWGCODEPAGE(){
		return this.$DWGCODEPAGE;
	}

	/**
	 * @return Returns the $LASTSAVEDBY.
	 */
	public String get$LASTSAVEDBY(){
		return this.$LASTSAVEDBY;
	}

	/**
	 * @return Returns the $INSBASE.
	 */
	public wPoint get$INSBASE(){
		return this.$INSBASE;
	}

	/**
	 * @return Returns the $EXTMIN.
	 */
	public wPoint get$EXTMIN(){
		return this.$EXTMIN;
	}

	/**
	 * @return Returns the $EXTMAX.
	 */
	public wPoint get$EXTMAX(){
		return this.$EXTMAX;
	}

	/**
	 * @return Returns the $LIMMIN.
	 */
	public wPoint2D get$LIMMIN(){
		return this.$LIMMIN;
	}

	/**
	 * @return Returns the $LIMMAX.
	 */
	public wPoint2D get$LIMMAX(){
		return this.$LIMMAX;
	}

	/**
	 * @return Returns the $ORTHOMODE.
	 */
	public short get$ORTHOMODE(){
		return this.$ORTHOMODE;
	}

	/**
	 * @return Returns the $REGENMODE.
	 */
	public short get$REGENMODE(){
		return this.$REGENMODE;
	}

	/**
	 * @return Returns the $FILLMODE.
	 */
	public short get$FILLMODE(){
		return this.$FILLMODE;
	}

	/**
	 * @return Returns the $QTEXTMODE.
	 */
	public short get$QTEXTMODE(){
		return this.$QTEXTMODE;
	}

	/**
	 * @return Returns the $MIRRTEXT.
	 */
	public short get$MIRRTEXT(){
		return this.$MIRRTEXT;
	}

	/**
	 * @return Returns the $LTSCALE.
	 */
	public double get$LTSCALE(){
		return this.$LTSCALE;
	}

	/**
	 * @return Returns the $ATTMODE.
	 */
	public short get$ATTMODE(){
		return this.$ATTMODE;
	}

	/**
	 * @return Returns the $TEXTSIZE.
	 */
	public double get$TEXTSIZE(){
		return this.$TEXTSIZE;
	}

	/**
	 * @return Returns the $TRACEWID.
	 */
	public double get$TRACEWID(){
		return this.$TRACEWID;
	}

	/**
	 * @return Returns the $TEXTSTYLE.
	 */
	public String get$TEXTSTYLE(){
		return this.$TEXTSTYLE;
	}

	/**
	 * @return Returns the $CLAYER.
	 */
	public String get$CLAYER(){
		return this.$CLAYER;
	}

	/**
	 * @return Returns the $CELTYPE.
	 */
	public String get$CELTYPE(){
		return this.$CELTYPE;
	}

	/**
	 * @return Returns the $CECOLOR.
	 */
	public short get$CECOLOR(){
		return this.$CECOLOR;
	}

	/**
	 * @return Returns the $CELTSCALE.
	 */
	public double get$CELTSCALE(){
		return this.$CELTSCALE;
	}

	/**
	 * @return Returns the $DISPSILH.
	 */
	public short get$DISPSILH(){
		return this.$DISPSILH;
	}

	/**
	 * @return Returns the $DIMSCALE.
	 */
	public double get$DIMSCALE(){
		return this.$DIMSCALE;
	}

	/**
	 * @return Returns the $DIMASZ.
	 */
	public double get$DIMASZ(){
		return this.$DIMASZ;
	}

	/**
	 * @return Returns the $DIMEXO.
	 */
	public double get$DIMEXO(){
		return this.$DIMEXO;
	}

	/**
	 * @return Returns the $DIMDLI.
	 */
	public double get$DIMDLI(){
		return this.$DIMDLI;
	}

	/**
	 * @return Returns the $DIMRND.
	 */
	public double get$DIMRND(){
		return this.$DIMRND;
	}

	/**
	 * @return Returns the $DIMDLE.
	 */
	public double get$DIMDLE(){
		return this.$DIMDLE;
	}

	/**
	 * @return Returns the $DIMEXE.
	 */
	public double get$DIMEXE(){
		return this.$DIMEXE;
	}

	/**
	 * @return Returns the $DIMTP.
	 */
	public double get$DIMTP(){
		return this.$DIMTP;
	}

	/**
	 * @return Returns the $DIMTM.
	 */
	public double get$DIMTM(){
		return this.$DIMTM;
	}

	/**
	 * @return Returns the $DIMTXT.
	 */
	public double get$DIMTXT(){
		return this.$DIMTXT;
	}

	/**
	 * @return Returns the $DIMCEN.
	 */
	public double get$DIMCEN(){
		return this.$DIMCEN;
	}

	/**
	 * @return Returns the $DIMTSZ.
	 */
	public double get$DIMTSZ(){
		return this.$DIMTSZ;
	}

	/**
	 * @return Returns the $DIMTOL.
	 */
	public short get$DIMTOL(){
		return this.$DIMTOL;
	}

	/**
	 * @return Returns the $DIMLIM.
	 */
	public short get$DIMLIM(){
		return this.$DIMLIM;
	}

	/**
	 * @return Returns the $DIMTIH.
	 */
	public short get$DIMTIH(){
		return this.$DIMTIH;
	}

	/**
	 * @return Returns the $DIMTOH.
	 */
	public short get$DIMTOH(){
		return this.$DIMTOH;
	}

	/**
	 * @return Returns the $DIMSE1.
	 */
	public short get$DIMSE1(){
		return this.$DIMSE1;
	}

	/**
	 * @return Returns the $DIMSE2.
	 */
	public short get$DIMSE2(){
		return this.$DIMSE2;
	}

	/**
	 * @return Returns the $DIMTAD.
	 */
	public short get$DIMTAD(){
		return this.$DIMTAD;
	}

	/**
	 * @return Returns the $DIMZIN.
	 */
	public short get$DIMZIN(){
		return this.$DIMZIN;
	}

	/**
	 * @return Returns the $DIMBLK.
	 */
	public String get$DIMBLK(){
		return this.$DIMBLK;
	}

	/**
	 * @return Returns the $DIMASO.
	 */
	public short get$DIMASO(){
		return this.$DIMASO;
	}

	/**
	 * @return Returns the $DIMSHO.
	 */
	public short get$DIMSHO(){
		return this.$DIMSHO;
	}

	/**
	 * @return Returns the $DIMPOST.
	 */
	public String get$DIMPOST(){
		return this.$DIMPOST;
	}

	/**
	 * @return Returns the $DIMAPOST.
	 */
	public String get$DIMAPOST(){
		return this.$DIMAPOST;
	}

	/**
	 * @return Returns the $DIMALT.
	 */
	public short get$DIMALT(){
		return this.$DIMALT;
	}

	/**
	 * @return Returns the $DIMALTD.
	 */
	public short get$DIMALTD(){
		return this.$DIMALTD;
	}

	/**
	 * @return Returns the $DIMALTF.
	 */
	public double get$DIMALTF(){
		return this.$DIMALTF;
	}

	/**
	 * @return Returns the $DIMLFAC.
	 */
	public double get$DIMLFAC(){
		return this.$DIMLFAC;
	}

	/**
	 * @return Returns the $DIMTOFL.
	 */
	public short get$DIMTOFL(){
		return this.$DIMTOFL;
	}

	/**
	 * @return Returns the $DIMTVP.
	 */
	public double get$DIMTVP(){
		return this.$DIMTVP;
	}

	/**
	 * @return Returns the $DIMTIX.
	 */
	public short get$DIMTIX(){
		return this.$DIMTIX;
	}

	/**
	 * @return Returns the $DIMSOXD.
	 */
	public short get$DIMSOXD(){
		return this.$DIMSOXD;
	}

	/**
	 * @return Returns the $DIMSAH.
	 */
	public short get$DIMSAH(){
		return this.$DIMSAH;
	}

	/**
	 * @return Returns the $DIMBLK1.
	 */
	public String get$DIMBLK1(){
		return this.$DIMBLK1;
	}

	/**
	 * @return Returns the $DIMBLK2.
	 */
	public String get$DIMBLK2(){
		return this.$DIMBLK2;
	}

	/**
	 * @return Returns the $DIMSTYLE.
	 */
	public String get$DIMSTYLE(){
		return this.$DIMSTYLE;
	}

	/**
	 * @return Returns the $DIMCLRD.
	 */
	public short get$DIMCLRD(){
		return this.$DIMCLRD;
	}

	/**
	 * @return Returns the $DIMCLRE.
	 */
	public short get$DIMCLRE(){
		return this.$DIMCLRE;
	}

	/**
	 * @return Returns the $DIMCLRT.
	 */
	public short get$DIMCLRT(){
		return this.$DIMCLRT;
	}

	/**
	 * @return Returns the $DIMTFAC.
	 */
	public double get$DIMTFAC(){
		return this.$DIMTFAC;
	}

	/**
	 * @return Returns the $DIMGAP.
	 */
	public double get$DIMGAP(){
		return this.$DIMGAP;
	}

	/**
	 * @return Returns the $DIMJUST.
	 */
	public short get$DIMJUST(){
		return this.$DIMJUST;
	}

	/**
	 * @return Returns the $DIMSD1.
	 */
	public short get$DIMSD1(){
		return this.$DIMSD1;
	}

	/**
	 * @return Returns the $DIMSD2.
	 */
	public short get$DIMSD2(){
		return this.$DIMSD2;
	}

	/**
	 * @return Returns the $DIMTOLJ.
	 */
	public short get$DIMTOLJ(){
		return this.$DIMTOLJ;
	}

	/**
	 * @return Returns the $DIMTZIN.
	 */
	public short get$DIMTZIN(){
		return this.$DIMTZIN;
	}

	/**
	 * @return Returns the $DIMALTZ.
	 */
	public short get$DIMALTZ(){
		return this.$DIMALTZ;
	}

	/**
	 * @return Returns the $DIMALTTZ.
	 */
	public short get$DIMALTTZ(){
		return this.$DIMALTTZ;
	}

	/**
	 * @return Returns the $DIMUPT.
	 */
	public short get$DIMUPT(){
		return this.$DIMUPT;
	}

	/**
	 * @return Returns the $DIMDEC.
	 */
	public short get$DIMDEC(){
		return this.$DIMDEC;
	}

	/**
	 * @return Returns the $DIMTDEC.
	 */
	public short get$DIMTDEC(){
		return this.$DIMTDEC;
	}

	/**
	 * @return Returns the $DIMALTU.
	 */
	public short get$DIMALTU(){
		return this.$DIMALTU;
	}

	/**
	 * @return Returns the $DIMALTTD.
	 */
	public short get$DIMALTTD(){
		return this.$DIMALTTD;
	}

	/**
	 * @return Returns the $DIMTXSTY.
	 */
	public String get$DIMTXSTY(){
		return this.$DIMTXSTY;
	}

	/**
	 * @return Returns the $DIMAUNIT.
	 */
	public short get$DIMAUNIT(){
		return this.$DIMAUNIT;
	}

	/**
	 * @return Returns the $DIMADEC.
	 */
	public short get$DIMADEC(){
		return this.$DIMADEC;
	}

	/**
	 * @return Returns the $DIMALTRND.
	 */
	public double get$DIMALTRND(){
		return this.$DIMALTRND;
	}

	/**
	 * @return Returns the $DIMAZIN.
	 */
	public short get$DIMAZIN(){
		return this.$DIMAZIN;
	}

	/**
	 * @return Returns the $DIMDSEP.
	 */
	public short get$DIMDSEP(){
		return this.$DIMDSEP;
	}

	/**
	 * @return Returns the $DIMATFIT.
	 */
	public short get$DIMATFIT(){
		return this.$DIMATFIT;
	}

	/**
	 * @return Returns the $DIMFRAC.
	 */
	public short get$DIMFRAC(){
		return this.$DIMFRAC;
	}

	/**
	 * @return Returns the $DIMLDRBLK.
	 */
	public String get$DIMLDRBLK(){
		return this.$DIMLDRBLK;
	}

	/**
	 * @return Returns the $DIMLUNIT.
	 */
	public short get$DIMLUNIT(){
		return this.$DIMLUNIT;
	}

	/**
	 * @return Returns the $DIMLWD.
	 */
	public short get$DIMLWD(){
		return this.$DIMLWD;
	}

	/**
	 * @return Returns the $DIMLWE.
	 */
	public short get$DIMLWE(){
		return this.$DIMLWE;
	}

	/**
	 * @return Returns the $DIMTMOVE.
	 */
	public short get$DIMTMOVE(){
		return this.$DIMTMOVE;
	}

	/**
	 * @return Returns the $DIMFXL.
	 */
	public double get$DIMFXL(){
		return this.$DIMFXL;
	}

	/**
	 * @return Returns the $DIMFXLON.
	 */
	public short get$DIMFXLON(){
		return this.$DIMFXLON;
	}

	/**
	 * @return Returns the $DIMJOGANG.
	 */
	public double get$DIMJOGANG(){
		return this.$DIMJOGANG;
	}

	/**
	 * @return Returns the $DIMTFILL.
	 */
	public short get$DIMTFILL(){
		return this.$DIMTFILL;
	}

	/**
	 * @return Returns the $DIMTFILLCLR.
	 */
	public short get$DIMTFILLCLR(){
		return this.$DIMTFILLCLR;
	}

	/**
	 * @return Returns the $DIMARCSYM.
	 */
	public short get$DIMARCSYM(){
		return this.$DIMARCSYM;
	}

	/**
	 * @return Returns the $DIMLTYPE.
	 */
	public String get$DIMLTYPE(){
		return this.$DIMLTYPE;
	}

	/**
	 * @return Returns the $DIMLTEX1.
	 */
	public String get$DIMLTEX1(){
		return this.$DIMLTEX1;
	}

	/**
	 * @return Returns the $DIMLTEX2.
	 */
	public String get$DIMLTEX2(){
		return this.$DIMLTEX2;
	}

	/**
	 * @return Returns the $LUNITS.
	 */
	public short get$LUNITS(){
		return this.$LUNITS;
	}

	/**
	 * @return Returns the $LUPREC.
	 */
	public short get$LUPREC(){
		return this.$LUPREC;
	}

	/**
	 * @return Returns the $SKETCHINC.
	 */
	public double get$SKETCHINC(){
		return this.$SKETCHINC;
	}

	/**
	 * @return Returns the $FILLETRAD.
	 */
	public double get$FILLETRAD(){
		return this.$FILLETRAD;
	}

	/**
	 * @return Returns the $AUNITS.
	 */
	public short get$AUNITS(){
		return this.$AUNITS;
	}

	/**
	 * @return Returns the $AUPREC.
	 */
	public short get$AUPREC(){
		return this.$AUPREC;
	}

	/**
	 * @return Returns the $MENU.
	 */
	public String get$MENU(){
		return this.$MENU;
	}

	/**
	 * @return Returns the $ELEVATION.
	 */
	public double get$ELEVATION(){
		return this.$ELEVATION;
	}

	/**
	 * @return Returns the $PELEVATION.
	 */
	public double get$PELEVATION(){
		return this.$PELEVATION;
	}

	/**
	 * @return Returns the $THICKNESS.
	 */
	public double get$THICKNESS(){
		return this.$THICKNESS;
	}

	/**
	 * @return Returns the $LIMCHECK.
	 */
	public short get$LIMCHECK(){
		return this.$LIMCHECK;
	}

	/**
	 * @return Returns the $CHAMFERA.
	 */
	public double get$CHAMFERA(){
		return this.$CHAMFERA;
	}

	/**
	 * @return Returns the $CHAMFERB.
	 */
	public double get$CHAMFERB(){
		return this.$CHAMFERB;
	}

	/**
	 * @return Returns the $CHAMFERC.
	 */
	public double get$CHAMFERC(){
		return this.$CHAMFERC;
	}

	/**
	 * @return Returns the $CHAMFERD.
	 */
	public double get$CHAMFERD(){
		return this.$CHAMFERD;
	}

	/**
	 * @return Returns the $SKPOLY.
	 */
	public short get$SKPOLY(){
		return this.$SKPOLY;
	}

	/**
	 * @return Returns the $TDCREATE.
	 */
	public double get$TDCREATE(){
		return this.$TDCREATE;
	}

	/**
	 * @return Returns the $TDUCREATE.
	 */
	public double get$TDUCREATE(){
		return this.$TDUCREATE;
	}

	/**
	 * @return Returns the $TDUPDATE.
	 */
	public double get$TDUPDATE(){
		return this.$TDUPDATE;
	}

	/**
	 * @return Returns the $TDUUPDATE.
	 */
	public double get$TDUUPDATE(){
		return this.$TDUUPDATE;
	}

	/**
	 * @return Returns the $TDINDWG.
	 */
	public double get$TDINDWG(){
		return this.$TDINDWG;
	}

	/**
	 * @return Returns the $TDUSRTIMER.
	 */
	public double get$TDUSRTIMER(){
		return this.$TDUSRTIMER;
	}

	/**
	 * @return Returns the $USRTIMER.
	 */
	public short get$USRTIMER(){
		return this.$USRTIMER;
	}

	/**
	 * @return Returns the $ANGBASE.
	 */
	public double get$ANGBASE(){
		return this.$ANGBASE;
	}

	/**
	 * @return Returns the $ANGDIR.
	 */
	public short get$ANGDIR(){
		return this.$ANGDIR;
	}

	/**
	 * @return Returns the $PDMODE.
	 */
	public short get$PDMODE(){
		return this.$PDMODE;
	}

	/**
	 * @return Returns the $PDSIZE.
	 */
	public double get$PDSIZE(){
		return this.$PDSIZE;
	}

	/**
	 * @return Returns the $PLINEWID.
	 */
	public double get$PLINEWID(){
		return this.$PLINEWID;
	}

	/**
	 * @return Returns the $SPLFRAME.
	 */
	public short get$SPLFRAME(){
		return this.$SPLFRAME;
	}

	/**
	 * @return Returns the $SPLINETYPE.
	 */
	public short get$SPLINETYPE(){
		return this.$SPLINETYPE;
	}

	/**
	 * @return Returns the $SPLINESEGS.
	 */
	public short get$SPLINESEGS(){
		return this.$SPLINESEGS;
	}

	/**
	 * @return Returns the $HANDSEED.
	 */
	public String get$HANDSEED(){
		return this.$HANDSEED;
	}

	/**
	 * @return Returns the $SURFTAB1.
	 */
	public short get$SURFTAB1(){
		return this.$SURFTAB1;
	}

	/**
	 * @return Returns the $SURFTAB2.
	 */
	public short get$SURFTAB2(){
		return this.$SURFTAB2;
	}

	/**
	 * @return Returns the $SURFTYPE.
	 */
	public short get$SURFTYPE(){
		return this.$SURFTYPE;
	}

	/**
	 * @return Returns the $SURFU.
	 */
	public short get$SURFU(){
		return this.$SURFU;
	}

	/**
	 * @return Returns the $SURFV.
	 */
	public short get$SURFV(){
		return this.$SURFV;
	}

	/**
	 * @return Returns the $UCSBASE.
	 */
	public String get$UCSBASE(){
		return this.$UCSBASE;
	}

	/**
	 * @return Returns the $UCSNAME.
	 */
	public String get$UCSNAME(){
		return this.$UCSNAME;
	}

	/**
	 * @return Returns the $UCSORG.
	 */
	public wPoint get$UCSORG(){
		return this.$UCSORG;
	}

	/**
	 * @return Returns the $UCSXDIR.
	 */
	public wPoint get$UCSXDIR(){
		return this.$UCSXDIR;
	}

	/**
	 * @return Returns the $UCSYDIR.
	 */
	public wPoint get$UCSYDIR(){
		return this.$UCSYDIR;
	}

	/**
	 * @return Returns the $UCSORTHOREF.
	 */
	public String get$UCSORTHOREF(){
		return this.$UCSORTHOREF;
	}

	/**
	 * @return Returns the $UCSORTHOVIEW.
	 */
	public short get$UCSORTHOVIEW(){
		return this.$UCSORTHOVIEW;
	}

	/**
	 * @return Returns the $UCSORGTOP.
	 */
	public wPoint get$UCSORGTOP(){
		return this.$UCSORGTOP;
	}

	/**
	 * @return Returns the $UCSORGBOTTOM.
	 */
	public wPoint get$UCSORGBOTTOM(){
		return this.$UCSORGBOTTOM;
	}

	/**
	 * @return Returns the $UCSORGLEFT.
	 */
	public wPoint get$UCSORGLEFT(){
		return this.$UCSORGLEFT;
	}

	/**
	 * @return Returns the $UCSORGRIGHT.
	 */
	public wPoint get$UCSORGRIGHT(){
		return this.$UCSORGRIGHT;
	}

	/**
	 * @return Returns the $UCSORGFRONT.
	 */
	public wPoint get$UCSORGFRONT(){
		return this.$UCSORGFRONT;
	}

	/**
	 * @return Returns the $UCSORGBACK.
	 */
	public wPoint get$UCSORGBACK(){
		return this.$UCSORGBACK;
	}

	/**
	 * @return Returns the $PUCSBASE.
	 */
	public String get$PUCSBASE(){
		return this.$PUCSBASE;
	}

	/**
	 * @return Returns the $PUCSNAME.
	 */
	public String get$PUCSNAME(){
		return this.$PUCSNAME;
	}

	/**
	 * @return Returns the $PUCSORG.
	 */
	public wPoint get$PUCSORG(){
		return this.$PUCSORG;
	}

	/**
	 * @return Returns the $PUCSXDIR.
	 */
	public wPoint get$PUCSXDIR(){
		return this.$PUCSXDIR;
	}

	/**
	 * @return Returns the $PUCSYDIR.
	 */
	public wPoint get$PUCSYDIR(){
		return this.$PUCSYDIR;
	}

	/**
	 * @return Returns the $PUCSORTHOREF.
	 */
	public String get$PUCSORTHOREF(){
		return this.$PUCSORTHOREF;
	}

	/**
	 * @return Returns the $PUCSORTHOVIEW.
	 */
	public short get$PUCSORTHOVIEW(){
		return this.$PUCSORTHOVIEW;
	}

	/**
	 * @return Returns the $PUCSORGTOP.
	 */
	public wPoint get$PUCSORGTOP(){
		return this.$PUCSORGTOP;
	}

	/**
	 * @return Returns the $PUCSORGBOTTOM.
	 */
	public wPoint get$PUCSORGBOTTOM(){
		return this.$PUCSORGBOTTOM;
	}

	/**
	 * @return Returns the $PUCSORGLEFT.
	 */
	public wPoint get$PUCSORGLEFT(){
		return this.$PUCSORGLEFT;
	}

	/**
	 * @return Returns the $PUCSORGRIGHT.
	 */
	public wPoint get$PUCSORGRIGHT(){
		return this.$PUCSORGRIGHT;
	}

	/**
	 * @return Returns the $PUCSORGFRONT.
	 */
	public wPoint get$PUCSORGFRONT(){
		return this.$PUCSORGFRONT;
	}

	/**
	 * @return Returns the $PUCSORGBACK.
	 */
	public wPoint get$PUCSORGBACK(){
		return this.$PUCSORGBACK;
	}

	/**
	 * @return Returns the $USERI1.
	 */
	public short get$USERI1(){
		return this.$USERI1;
	}

	/**
	 * @return Returns the $USERI2.
	 */
	public short get$USERI2(){
		return this.$USERI2;
	}

	/**
	 * @return Returns the $USERI3.
	 */
	public short get$USERI3(){
		return this.$USERI3;
	}

	/**
	 * @return Returns the $USERI4.
	 */
	public short get$USERI4(){
		return this.$USERI4;
	}

	/**
	 * @return Returns the $USERI5.
	 */
	public short get$USERI5(){
		return this.$USERI5;
	}

	/**
	 * @return Returns the $USERR1.
	 */
	public double get$USERR1(){
		return this.$USERR1;
	}

	/**
	 * @return Returns the $USERR2.
	 */
	public double get$USERR2(){
		return this.$USERR2;
	}

	/**
	 * @return Returns the $USERR3.
	 */
	public double get$USERR3(){
		return this.$USERR3;
	}

	/**
	 * @return Returns the $USERR4.
	 */
	public double get$USERR4(){
		return this.$USERR4;
	}

	/**
	 * @return Returns the $USERR5.
	 */
	public double get$USERR5(){
		return this.$USERR5;
	}

	/**
	 * @return Returns the $WORLDVIEW.
	 */
	public short get$WORLDVIEW(){
		return this.$WORLDVIEW;
	}

	/**
	 * @return Returns the $SHADEDGE.
	 */
	public short get$SHADEDGE(){
		return this.$SHADEDGE;
	}

	/**
	 * @return Returns the $SHADEDIF.
	 */
	public short get$SHADEDIF(){
		return this.$SHADEDIF;
	}

	/**
	 * @return Returns the $TILEMODE.
	 */
	public short get$TILEMODE(){
		return this.$TILEMODE;
	}

	/**
	 * @return Returns the $MAXACTVP.
	 */
	public short get$MAXACTVP(){
		return this.$MAXACTVP;
	}

	/**
	 * @return Returns the $PINSBASE.
	 */
	public wPoint get$PINSBASE(){
		return this.$PINSBASE;
	}

	/**
	 * @return Returns the $PLIMCHECK.
	 */
	public short get$PLIMCHECK(){
		return this.$PLIMCHECK;
	}

	/**
	 * @return Returns the $PEXTMIN.
	 */
	public wPoint get$PEXTMIN(){
		return this.$PEXTMIN;
	}

	/**
	 * @return Returns the $PEXTMAX.
	 */
	public wPoint get$PEXTMAX(){
		return this.$PEXTMAX;
	}

	/**
	 * @return Returns the $PLIMMIN.
	 */
	public wPoint2D get$PLIMMIN(){
		return this.$PLIMMIN;
	}

	/**
	 * @return Returns the $PLIMMAX.
	 */
	public wPoint2D get$PLIMMAX(){
		return this.$PLIMMAX;
	}

	/**
	 * @return Returns the $UNITMODE.
	 */
	public short get$UNITMODE(){
		return this.$UNITMODE;
	}

	/**
	 * @return Returns the $VISRETAIN.
	 */
	public short get$VISRETAIN(){
		return this.$VISRETAIN;
	}

	/**
	 * @return Returns the $PLINEGEN.
	 */
	public short get$PLINEGEN(){
		return this.$PLINEGEN;
	}

	/**
	 * @return Returns the $PSLTSCALE.
	 */
	public short get$PSLTSCALE(){
		return this.$PSLTSCALE;
	}

	/**
	 * @return Returns the $TREEDEPTH.
	 */
	public short get$TREEDEPTH(){
		return this.$TREEDEPTH;
	}

	/**
	 * @return Returns the $CMLSTYLE.
	 */
	public String get$CMLSTYLE(){
		return this.$CMLSTYLE;
	}

	/**
	 * @return Returns the $CMLJUST.
	 */
	public short get$CMLJUST(){
		return this.$CMLJUST;
	}

	/**
	 * @return Returns the $CMLSCALE.
	 */
	public double get$CMLSCALE(){
		return this.$CMLSCALE;
	}

	/**
	 * @return Returns the $PROXYGRAPHICS.
	 */
	public short get$PROXYGRAPHICS(){
		return this.$PROXYGRAPHICS;
	}

	/**
	 * @return Returns the $MEASUREMENT.
	 */
	public short get$MEASUREMENT(){
		return this.$MEASUREMENT;
	}

	/**
	 * @return Returns the $CELWEIGHT.
	 */
	public short get$CELWEIGHT(){
		return this.$CELWEIGHT;
	}

	/**
	 * @return Returns the $ENDCAPS.
	 */
	public short get$ENDCAPS(){
		return this.$ENDCAPS;
	}

	/**
	 * @return Returns the $JOINSTYLE.
	 */
	public short get$JOINSTYLE(){
		return this.$JOINSTYLE;
	}

	/**
	 * @return Returns the $LWDISPLAY.
	 */
	public boolean get$LWDISPLAY(){
		return this.$LWDISPLAY;
	}

	/**
	 * @return Returns the $INSUNITS.
	 */
	public short get$INSUNITS(){
		return this.$INSUNITS;
	}

	/**
	 * @return Returns the $HYPERLINKBASE.
	 */
	public String get$HYPERLINKBASE(){
		return this.$HYPERLINKBASE;
	}

	/**
	 * @return Returns the $STYLESHEET.
	 */
	public String get$STYLESHEET(){
		return this.$STYLESHEET;
	}

	/**
	 * @return Returns the $XEDIT.
	 */
	public boolean get$XEDIT(){
		return this.$XEDIT;
	}

	/**
	 * @return Returns the $CEPSNTYPE.
	 */
	public short get$CEPSNTYPE(){
		return this.$CEPSNTYPE;
	}

	/**
	 * @return Returns the $PSTYLEMODE.
	 */
	public boolean get$PSTYLEMODE(){
		return this.$PSTYLEMODE;
	}

	/**
	 * @return Returns the $FINGERPRINTGUID.
	 */
	public String get$FINGERPRINTGUID(){
		return this.$FINGERPRINTGUID;
	}

	/**
	 * @return Returns the $VERSIONGUID.
	 */
	public String get$VERSIONGUID(){
		return this.$VERSIONGUID;
	}

	/**
	 * @return Returns the $EXTNAMES.
	 */
	public boolean get$EXTNAMES(){
		return this.$EXTNAMES;
	}

	/**
	 * @return Returns the $PSVPSCALE.
	 */
	public double get$PSVPSCALE(){
		return this.$PSVPSCALE;
	}

	/**
	 * @return Returns the $OLESTARTUP.
	 */
	public boolean get$OLESTARTUP(){
		return this.$OLESTARTUP;
	}

	/**
	 * @return Returns the $SORTENTS.
	 */
	public short get$SORTENTS(){
		return this.$SORTENTS;
	}

	/**
	 * @return Returns the $INDEXCTL.
	 */
	public short get$INDEXCTL(){
		return this.$INDEXCTL;
	}

	/**
	 * @return Returns the $HIDETEXT.
	 */
	public short get$HIDETEXT(){
		return this.$HIDETEXT;
	}

	/**
	 * @return Returns the $XCLIPFRAME.
	 */
	public boolean get$XCLIPFRAME(){
		return this.$XCLIPFRAME;
	}

	/**
	 * @return Returns the $HALOGAP.
	 */
	public short get$HALOGAP(){
		return this.$HALOGAP;
	}

	/**
	 * @return Returns the $OBSCOLOR.
	 */
	public short get$OBSCOLOR(){
		return this.$OBSCOLOR;
	}

	/**
	 * @return Returns the $OBSLTYPE.
	 */
	public short get$OBSLTYPE(){
		return this.$OBSLTYPE;
	}

	/**
	 * @return Returns the $INTERSECTIONDISPLAY.
	 */
	public short get$INTERSECTIONDISPLAY(){
		return this.$INTERSECTIONDISPLAY;
	}

	/**
	 * @return Returns the $INTERSECTIONCOLOR.
	 */
	public short get$INTERSECTIONCOLOR(){
		return this.$INTERSECTIONCOLOR;
	}

	/**
	 * @return Returns the $DIMASSOC.
	 */
	public short get$DIMASSOC(){
		return this.$DIMASSOC;
	}

	/**
	 * @return Returns the $PROJECTNAME.
	 */
	public String get$PROJECTNAME(){
		return this.$PROJECTNAME;
	}

	/**
	 * @return Returns the $CAMERADISPLAY.
	 */
	public boolean get$CAMERADISPLAY(){
		return this.$CAMERADISPLAY;
	}

	/**
	 * @return Returns the $LENSLENGTH.
	 */
	public double get$LENSLENGTH(){
		return this.$LENSLENGTH;
	}

	/**
	 * @return Returns the $CAMERAHEIGHT.
	 */
	public double get$CAMERAHEIGHT(){
		return this.$CAMERAHEIGHT;
	}

	/**
	 * @return Returns the $STEPSPERSEC.
	 */
	public double get$STEPSPERSEC(){
		return this.$STEPSPERSEC;
	}

	/**
	 * @return Returns the $STEPSIZE.
	 */
	public double get$STEPSIZE(){
		return this.$STEPSIZE;
	}

	/**
	 * @return Returns the $3DDWFPREC.
	 */
	public double get$3DDWFPREC(){
		return this.$3DDWFPREC;
	}

	/**
	 * @return Returns the $PSOLWIDTH.
	 */
	public double get$PSOLWIDTH(){
		return this.$PSOLWIDTH;
	}

	/**
	 * @return Returns the $PSOLHEIGHT.
	 */
	public double get$PSOLHEIGHT(){
		return this.$PSOLHEIGHT;
	}

	/**
	 * @return Returns the $LOFTANG1.
	 */
	public double get$LOFTANG1(){
		return this.$LOFTANG1;
	}

	/**
	 * @return Returns the $LOFTANG2.
	 */
	public double get$LOFTANG2(){
		return this.$LOFTANG2;
	}

	/**
	 * @return Returns the $LOFTMAG1.
	 */
	public double get$LOFTMAG1(){
		return this.$LOFTMAG1;
	}

	/**
	 * @return Returns the $LOFTMAG2.
	 */
	public double get$LOFTMAG2(){
		return this.$LOFTMAG2;
	}

	/**
	 * @return Returns the $LOFTPARAM.
	 */
	public short get$LOFTPARAM(){
		return this.$LOFTPARAM;
	}

	/**
	 * @return Returns the $LOFTNORMALS.
	 */
	public short get$LOFTNORMALS(){
		return this.$LOFTNORMALS;
	}

	/**
	 * @return Returns the $LATITUDE.
	 */
	public double get$LATITUDE(){
		return this.$LATITUDE;
	}

	/**
	 * @return Returns the $LONGITUDE.
	 */
	public double get$LONGITUDE(){
		return this.$LONGITUDE;
	}

	/**
	 * @return Returns the $NORTHDIRECTION.
	 */
	public double get$NORTHDIRECTION(){
		return this.$NORTHDIRECTION;
	}

	/**
	 * @return Returns the $TIMEZONE.
	 */
	public short get$TIMEZONE(){
		return this.$TIMEZONE;
	}

	/**
	 * @return Returns the $LIGHTGLYPHDISPLAY.
	 */
	public short get$LIGHTGLYPHDISPLAY(){
		return this.$LIGHTGLYPHDISPLAY;
	}

	/**
	 * @return Returns the $TILEMODELIGHTSYNCH.
	 */
	public short get$TILEMODELIGHTSYNCH(){
		return this.$TILEMODELIGHTSYNCH;
	}

	/**
	 * @return Returns the $CMATERIAL.
	 */
	public String get$CMATERIAL(){
		return this.$CMATERIAL;
	}

	/**
	 * @return Returns the $SOLIDHIST.
	 */
	public short get$SOLIDHIST(){
		return this.$SOLIDHIST;
	}

	/**
	 * @return Returns the $SHOWHIST.
	 */
	public short get$SHOWHIST(){
		return this.$SHOWHIST;
	}

	/**
	 * @return Returns the $DWFFRAME.
	 */
	public short get$DWFFRAME(){
		return this.$DWFFRAME;
	}

	/**
	 * @return Returns the $DGNFRAME.
	 */
	public short get$DGNFRAME(){
		return this.$DGNFRAME;
	}

	/**
	 * @return Returns the $REALWORLDSCALE.
	 */
	public boolean get$REALWORLDSCALE(){
		return this.$REALWORLDSCALE;
	}

	/**
	 * @return Returns the $INTERFERECOLOR.
	 */
	public short get$INTERFERECOLOR(){
		return this.$INTERFERECOLOR;
	}

	/**
	 * @return Returns the $INTERFEREOBJVS.
	 */
	public String get$INTERFEREOBJVS(){
		return this.$INTERFEREOBJVS;
	}

	/**
	 * @return Returns the $INTERFEREVPVS.
	 */
	public String get$INTERFEREVPVS(){
		return this.$INTERFEREVPVS;
	}

	/**
	 * @return Returns the $CSHADOW.
	 */
	public short get$CSHADOW(){
		return this.$CSHADOW;
	}

	/**
	 * @return Returns the $SHADOWPLANELOCATION.
	 */
	public double get$SHADOWPLANELOCATION(){
		return this.$SHADOWPLANELOCATION;
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
	 * @param  this_GC_Header to set.
	 */
	public void setThis_GC_Header(GC_Header var){
		this.this_GC_Header = var;
	}

	/**
	 * @param  $ACADVER to set.
	 */
	public void set$ACADVER(String var){
		this.$ACADVER = var;
	}

	/**
	 * @param  $ACADMAINTVER to set.
	 */
	public void set$ACADMAINTVER(short var){
		this.$ACADMAINTVER = var;
	}

	/**
	 * @param  $DWGCODEPAGE to set.
	 */
	public void set$DWGCODEPAGE(String var){
		this.$DWGCODEPAGE = var;
	}

	/**
	 * @param  $LASTSAVEDBY to set.
	 */
	public void set$LASTSAVEDBY(String var){
		this.$LASTSAVEDBY = var;
	}

	/**
	 * @param  $INSBASE to set.
	 */
	public void set$INSBASE(wPoint var){
		this.$INSBASE = var;
	}

	/**
	 * @param  $EXTMIN to set.
	 */
	public void set$EXTMIN(wPoint var){
		this.$EXTMIN = var;
	}

	/**
	 * @param  $EXTMAX to set.
	 */
	public void set$EXTMAX(wPoint var){
		this.$EXTMAX = var;
	}

	/**
	 * @param  $LIMMIN to set.
	 */
	public void set$LIMMIN(wPoint2D var){
		this.$LIMMIN = var;
	}

	/**
	 * @param  $LIMMAX to set.
	 */
	public void set$LIMMAX(wPoint2D var){
		this.$LIMMAX = var;
	}

	/**
	 * @param  $ORTHOMODE to set.
	 */
	public void set$ORTHOMODE(short var){
		this.$ORTHOMODE = var;
	}

	/**
	 * @param  $REGENMODE to set.
	 */
	public void set$REGENMODE(short var){
		this.$REGENMODE = var;
	}

	/**
	 * @param  $FILLMODE to set.
	 */
	public void set$FILLMODE(short var){
		this.$FILLMODE = var;
	}

	/**
	 * @param  $QTEXTMODE to set.
	 */
	public void set$QTEXTMODE(short var){
		this.$QTEXTMODE = var;
	}

	/**
	 * @param  $MIRRTEXT to set.
	 */
	public void set$MIRRTEXT(short var){
		this.$MIRRTEXT = var;
	}

	/**
	 * @param  $LTSCALE to set.
	 */
	public void set$LTSCALE(double var){
		this.$LTSCALE = var;
	}

	/**
	 * @param  $ATTMODE to set.
	 */
	public void set$ATTMODE(short var){
		this.$ATTMODE = var;
	}

	/**
	 * @param  $TEXTSIZE to set.
	 */
	public void set$TEXTSIZE(double var){
		this.$TEXTSIZE = var;
	}

	/**
	 * @param  $TRACEWID to set.
	 */
	public void set$TRACEWID(double var){
		this.$TRACEWID = var;
	}

	/**
	 * @param  $TEXTSTYLE to set.
	 */
	public void set$TEXTSTYLE(String var){
		this.$TEXTSTYLE = var;
	}

	/**
	 * @param  $CLAYER to set.
	 */
	public void set$CLAYER(String var){
		this.$CLAYER = var;
	}

	/**
	 * @param  $CELTYPE to set.
	 */
	public void set$CELTYPE(String var){
		this.$CELTYPE = var;
	}

	/**
	 * @param  $CECOLOR to set.
	 */
	public void set$CECOLOR(short var){
		this.$CECOLOR = var;
	}

	/**
	 * @param  $CELTSCALE to set.
	 */
	public void set$CELTSCALE(double var){
		this.$CELTSCALE = var;
	}

	/**
	 * @param  $DISPSILH to set.
	 */
	public void set$DISPSILH(short var){
		this.$DISPSILH = var;
	}

	/**
	 * @param  $DIMSCALE to set.
	 */
	public void set$DIMSCALE(double var){
		this.$DIMSCALE = var;
	}

	/**
	 * @param  $DIMASZ to set.
	 */
	public void set$DIMASZ(double var){
		this.$DIMASZ = var;
	}

	/**
	 * @param  $DIMEXO to set.
	 */
	public void set$DIMEXO(double var){
		this.$DIMEXO = var;
	}

	/**
	 * @param  $DIMDLI to set.
	 */
	public void set$DIMDLI(double var){
		this.$DIMDLI = var;
	}

	/**
	 * @param  $DIMRND to set.
	 */
	public void set$DIMRND(double var){
		this.$DIMRND = var;
	}

	/**
	 * @param  $DIMDLE to set.
	 */
	public void set$DIMDLE(double var){
		this.$DIMDLE = var;
	}

	/**
	 * @param  $DIMEXE to set.
	 */
	public void set$DIMEXE(double var){
		this.$DIMEXE = var;
	}

	/**
	 * @param  $DIMTP to set.
	 */
	public void set$DIMTP(double var){
		this.$DIMTP = var;
	}

	/**
	 * @param  $DIMTM to set.
	 */
	public void set$DIMTM(double var){
		this.$DIMTM = var;
	}

	/**
	 * @param  $DIMTXT to set.
	 */
	public void set$DIMTXT(double var){
		this.$DIMTXT = var;
	}

	/**
	 * @param  $DIMCEN to set.
	 */
	public void set$DIMCEN(double var){
		this.$DIMCEN = var;
	}

	/**
	 * @param  $DIMTSZ to set.
	 */
	public void set$DIMTSZ(double var){
		this.$DIMTSZ = var;
	}

	/**
	 * @param  $DIMTOL to set.
	 */
	public void set$DIMTOL(short var){
		this.$DIMTOL = var;
	}

	/**
	 * @param  $DIMLIM to set.
	 */
	public void set$DIMLIM(short var){
		this.$DIMLIM = var;
	}

	/**
	 * @param  $DIMTIH to set.
	 */
	public void set$DIMTIH(short var){
		this.$DIMTIH = var;
	}

	/**
	 * @param  $DIMTOH to set.
	 */
	public void set$DIMTOH(short var){
		this.$DIMTOH = var;
	}

	/**
	 * @param  $DIMSE1 to set.
	 */
	public void set$DIMSE1(short var){
		this.$DIMSE1 = var;
	}

	/**
	 * @param  $DIMSE2 to set.
	 */
	public void set$DIMSE2(short var){
		this.$DIMSE2 = var;
	}

	/**
	 * @param  $DIMTAD to set.
	 */
	public void set$DIMTAD(short var){
		this.$DIMTAD = var;
	}

	/**
	 * @param  $DIMZIN to set.
	 */
	public void set$DIMZIN(short var){
		this.$DIMZIN = var;
	}

	/**
	 * @param  $DIMBLK to set.
	 */
	public void set$DIMBLK(String var){
		this.$DIMBLK = var;
	}

	/**
	 * @param  $DIMASO to set.
	 */
	public void set$DIMASO(short var){
		this.$DIMASO = var;
	}

	/**
	 * @param  $DIMSHO to set.
	 */
	public void set$DIMSHO(short var){
		this.$DIMSHO = var;
	}

	/**
	 * @param  $DIMPOST to set.
	 */
	public void set$DIMPOST(String var){
		this.$DIMPOST = var;
	}

	/**
	 * @param  $DIMAPOST to set.
	 */
	public void set$DIMAPOST(String var){
		this.$DIMAPOST = var;
	}

	/**
	 * @param  $DIMALT to set.
	 */
	public void set$DIMALT(short var){
		this.$DIMALT = var;
	}

	/**
	 * @param  $DIMALTD to set.
	 */
	public void set$DIMALTD(short var){
		this.$DIMALTD = var;
	}

	/**
	 * @param  $DIMALTF to set.
	 */
	public void set$DIMALTF(double var){
		this.$DIMALTF = var;
	}

	/**
	 * @param  $DIMLFAC to set.
	 */
	public void set$DIMLFAC(double var){
		this.$DIMLFAC = var;
	}

	/**
	 * @param  $DIMTOFL to set.
	 */
	public void set$DIMTOFL(short var){
		this.$DIMTOFL = var;
	}

	/**
	 * @param  $DIMTVP to set.
	 */
	public void set$DIMTVP(double var){
		this.$DIMTVP = var;
	}

	/**
	 * @param  $DIMTIX to set.
	 */
	public void set$DIMTIX(short var){
		this.$DIMTIX = var;
	}

	/**
	 * @param  $DIMSOXD to set.
	 */
	public void set$DIMSOXD(short var){
		this.$DIMSOXD = var;
	}

	/**
	 * @param  $DIMSAH to set.
	 */
	public void set$DIMSAH(short var){
		this.$DIMSAH = var;
	}

	/**
	 * @param  $DIMBLK1 to set.
	 */
	public void set$DIMBLK1(String var){
		this.$DIMBLK1 = var;
	}

	/**
	 * @param  $DIMBLK2 to set.
	 */
	public void set$DIMBLK2(String var){
		this.$DIMBLK2 = var;
	}

	/**
	 * @param  $DIMSTYLE to set.
	 */
	public void set$DIMSTYLE(String var){
		this.$DIMSTYLE = var;
	}

	/**
	 * @param  $DIMCLRD to set.
	 */
	public void set$DIMCLRD(short var){
		this.$DIMCLRD = var;
	}

	/**
	 * @param  $DIMCLRE to set.
	 */
	public void set$DIMCLRE(short var){
		this.$DIMCLRE = var;
	}

	/**
	 * @param  $DIMCLRT to set.
	 */
	public void set$DIMCLRT(short var){
		this.$DIMCLRT = var;
	}

	/**
	 * @param  $DIMTFAC to set.
	 */
	public void set$DIMTFAC(double var){
		this.$DIMTFAC = var;
	}

	/**
	 * @param  $DIMGAP to set.
	 */
	public void set$DIMGAP(double var){
		this.$DIMGAP = var;
	}

	/**
	 * @param  $DIMJUST to set.
	 */
	public void set$DIMJUST(short var){
		this.$DIMJUST = var;
	}

	/**
	 * @param  $DIMSD1 to set.
	 */
	public void set$DIMSD1(short var){
		this.$DIMSD1 = var;
	}

	/**
	 * @param  $DIMSD2 to set.
	 */
	public void set$DIMSD2(short var){
		this.$DIMSD2 = var;
	}

	/**
	 * @param  $DIMTOLJ to set.
	 */
	public void set$DIMTOLJ(short var){
		this.$DIMTOLJ = var;
	}

	/**
	 * @param  $DIMTZIN to set.
	 */
	public void set$DIMTZIN(short var){
		this.$DIMTZIN = var;
	}

	/**
	 * @param  $DIMALTZ to set.
	 */
	public void set$DIMALTZ(short var){
		this.$DIMALTZ = var;
	}

	/**
	 * @param  $DIMALTTZ to set.
	 */
	public void set$DIMALTTZ(short var){
		this.$DIMALTTZ = var;
	}

	/**
	 * @param  $DIMUPT to set.
	 */
	public void set$DIMUPT(short var){
		this.$DIMUPT = var;
	}

	/**
	 * @param  $DIMDEC to set.
	 */
	public void set$DIMDEC(short var){
		this.$DIMDEC = var;
	}

	/**
	 * @param  $DIMTDEC to set.
	 */
	public void set$DIMTDEC(short var){
		this.$DIMTDEC = var;
	}

	/**
	 * @param  $DIMALTU to set.
	 */
	public void set$DIMALTU(short var){
		this.$DIMALTU = var;
	}

	/**
	 * @param  $DIMALTTD to set.
	 */
	public void set$DIMALTTD(short var){
		this.$DIMALTTD = var;
	}

	/**
	 * @param  $DIMTXSTY to set.
	 */
	public void set$DIMTXSTY(String var){
		this.$DIMTXSTY = var;
	}

	/**
	 * @param  $DIMAUNIT to set.
	 */
	public void set$DIMAUNIT(short var){
		this.$DIMAUNIT = var;
	}

	/**
	 * @param  $DIMADEC to set.
	 */
	public void set$DIMADEC(short var){
		this.$DIMADEC = var;
	}

	/**
	 * @param  $DIMALTRND to set.
	 */
	public void set$DIMALTRND(double var){
		this.$DIMALTRND = var;
	}

	/**
	 * @param  $DIMAZIN to set.
	 */
	public void set$DIMAZIN(short var){
		this.$DIMAZIN = var;
	}

	/**
	 * @param  $DIMDSEP to set.
	 */
	public void set$DIMDSEP(short var){
		this.$DIMDSEP = var;
	}

	/**
	 * @param  $DIMATFIT to set.
	 */
	public void set$DIMATFIT(short var){
		this.$DIMATFIT = var;
	}

	/**
	 * @param  $DIMFRAC to set.
	 */
	public void set$DIMFRAC(short var){
		this.$DIMFRAC = var;
	}

	/**
	 * @param  $DIMLDRBLK to set.
	 */
	public void set$DIMLDRBLK(String var){
		this.$DIMLDRBLK = var;
	}

	/**
	 * @param  $DIMLUNIT to set.
	 */
	public void set$DIMLUNIT(short var){
		this.$DIMLUNIT = var;
	}

	/**
	 * @param  $DIMLWD to set.
	 */
	public void set$DIMLWD(short var){
		this.$DIMLWD = var;
	}

	/**
	 * @param  $DIMLWE to set.
	 */
	public void set$DIMLWE(short var){
		this.$DIMLWE = var;
	}

	/**
	 * @param  $DIMTMOVE to set.
	 */
	public void set$DIMTMOVE(short var){
		this.$DIMTMOVE = var;
	}

	/**
	 * @param  $DIMFXL to set.
	 */
	public void set$DIMFXL(double var){
		this.$DIMFXL = var;
	}

	/**
	 * @param  $DIMFXLON to set.
	 */
	public void set$DIMFXLON(short var){
		this.$DIMFXLON = var;
	}

	/**
	 * @param  $DIMJOGANG to set.
	 */
	public void set$DIMJOGANG(double var){
		this.$DIMJOGANG = var;
	}

	/**
	 * @param  $DIMTFILL to set.
	 */
	public void set$DIMTFILL(short var){
		this.$DIMTFILL = var;
	}

	/**
	 * @param  $DIMTFILLCLR to set.
	 */
	public void set$DIMTFILLCLR(short var){
		this.$DIMTFILLCLR = var;
	}

	/**
	 * @param  $DIMARCSYM to set.
	 */
	public void set$DIMARCSYM(short var){
		this.$DIMARCSYM = var;
	}

	/**
	 * @param  $DIMLTYPE to set.
	 */
	public void set$DIMLTYPE(String var){
		this.$DIMLTYPE = var;
	}

	/**
	 * @param  $DIMLTEX1 to set.
	 */
	public void set$DIMLTEX1(String var){
		this.$DIMLTEX1 = var;
	}

	/**
	 * @param  $DIMLTEX2 to set.
	 */
	public void set$DIMLTEX2(String var){
		this.$DIMLTEX2 = var;
	}

	/**
	 * @param  $LUNITS to set.
	 */
	public void set$LUNITS(short var){
		this.$LUNITS = var;
	}

	/**
	 * @param  $LUPREC to set.
	 */
	public void set$LUPREC(short var){
		this.$LUPREC = var;
	}

	/**
	 * @param  $SKETCHINC to set.
	 */
	public void set$SKETCHINC(double var){
		this.$SKETCHINC = var;
	}

	/**
	 * @param  $FILLETRAD to set.
	 */
	public void set$FILLETRAD(double var){
		this.$FILLETRAD = var;
	}

	/**
	 * @param  $AUNITS to set.
	 */
	public void set$AUNITS(short var){
		this.$AUNITS = var;
	}

	/**
	 * @param  $AUPREC to set.
	 */
	public void set$AUPREC(short var){
		this.$AUPREC = var;
	}

	/**
	 * @param  $MENU to set.
	 */
	public void set$MENU(String var){
		this.$MENU = var;
	}

	/**
	 * @param  $ELEVATION to set.
	 */
	public void set$ELEVATION(double var){
		this.$ELEVATION = var;
	}

	/**
	 * @param  $PELEVATION to set.
	 */
	public void set$PELEVATION(double var){
		this.$PELEVATION = var;
	}

	/**
	 * @param  $THICKNESS to set.
	 */
	public void set$THICKNESS(double var){
		this.$THICKNESS = var;
	}

	/**
	 * @param  $LIMCHECK to set.
	 */
	public void set$LIMCHECK(short var){
		this.$LIMCHECK = var;
	}

	/**
	 * @param  $CHAMFERA to set.
	 */
	public void set$CHAMFERA(double var){
		this.$CHAMFERA = var;
	}

	/**
	 * @param  $CHAMFERB to set.
	 */
	public void set$CHAMFERB(double var){
		this.$CHAMFERB = var;
	}

	/**
	 * @param  $CHAMFERC to set.
	 */
	public void set$CHAMFERC(double var){
		this.$CHAMFERC = var;
	}

	/**
	 * @param  $CHAMFERD to set.
	 */
	public void set$CHAMFERD(double var){
		this.$CHAMFERD = var;
	}

	/**
	 * @param  $SKPOLY to set.
	 */
	public void set$SKPOLY(short var){
		this.$SKPOLY = var;
	}

	/**
	 * @param  $TDCREATE to set.
	 */
	public void set$TDCREATE(double var){
		this.$TDCREATE = var;
	}

	/**
	 * @param  $TDUCREATE to set.
	 */
	public void set$TDUCREATE(double var){
		this.$TDUCREATE = var;
	}

	/**
	 * @param  $TDUPDATE to set.
	 */
	public void set$TDUPDATE(double var){
		this.$TDUPDATE = var;
	}

	/**
	 * @param  $TDUUPDATE to set.
	 */
	public void set$TDUUPDATE(double var){
		this.$TDUUPDATE = var;
	}

	/**
	 * @param  $TDINDWG to set.
	 */
	public void set$TDINDWG(double var){
		this.$TDINDWG = var;
	}

	/**
	 * @param  $TDUSRTIMER to set.
	 */
	public void set$TDUSRTIMER(double var){
		this.$TDUSRTIMER = var;
	}

	/**
	 * @param  $USRTIMER to set.
	 */
	public void set$USRTIMER(short var){
		this.$USRTIMER = var;
	}

	/**
	 * @param  $ANGBASE to set.
	 */
	public void set$ANGBASE(double var){
		this.$ANGBASE = var;
	}

	/**
	 * @param  $ANGDIR to set.
	 */
	public void set$ANGDIR(short var){
		this.$ANGDIR = var;
	}

	/**
	 * @param  $PDMODE to set.
	 */
	public void set$PDMODE(short var){
		this.$PDMODE = var;
	}

	/**
	 * @param  $PDSIZE to set.
	 */
	public void set$PDSIZE(double var){
		this.$PDSIZE = var;
	}

	/**
	 * @param  $PLINEWID to set.
	 */
	public void set$PLINEWID(double var){
		this.$PLINEWID = var;
	}

	/**
	 * @param  $SPLFRAME to set.
	 */
	public void set$SPLFRAME(short var){
		this.$SPLFRAME = var;
	}

	/**
	 * @param  $SPLINETYPE to set.
	 */
	public void set$SPLINETYPE(short var){
		this.$SPLINETYPE = var;
	}

	/**
	 * @param  $SPLINESEGS to set.
	 */
	public void set$SPLINESEGS(short var){
		this.$SPLINESEGS = var;
	}

	/**
	 * @param  $HANDSEED to set.
	 */
	public void set$HANDSEED(String var){
		this.$HANDSEED = var;
	}

	/**
	 * @param  $SURFTAB1 to set.
	 */
	public void set$SURFTAB1(short var){
		this.$SURFTAB1 = var;
	}

	/**
	 * @param  $SURFTAB2 to set.
	 */
	public void set$SURFTAB2(short var){
		this.$SURFTAB2 = var;
	}

	/**
	 * @param  $SURFTYPE to set.
	 */
	public void set$SURFTYPE(short var){
		this.$SURFTYPE = var;
	}

	/**
	 * @param  $SURFU to set.
	 */
	public void set$SURFU(short var){
		this.$SURFU = var;
	}

	/**
	 * @param  $SURFV to set.
	 */
	public void set$SURFV(short var){
		this.$SURFV = var;
	}

	/**
	 * @param  $UCSBASE to set.
	 */
	public void set$UCSBASE(String var){
		this.$UCSBASE = var;
	}

	/**
	 * @param  $UCSNAME to set.
	 */
	public void set$UCSNAME(String var){
		this.$UCSNAME = var;
	}

	/**
	 * @param  $UCSORG to set.
	 */
	public void set$UCSORG(wPoint var){
		this.$UCSORG = var;
	}

	/**
	 * @param  $UCSXDIR to set.
	 */
	public void set$UCSXDIR(wPoint var){
		this.$UCSXDIR = var;
	}

	/**
	 * @param  $UCSYDIR to set.
	 */
	public void set$UCSYDIR(wPoint var){
		this.$UCSYDIR = var;
	}

	/**
	 * @param  $UCSORTHOREF to set.
	 */
	public void set$UCSORTHOREF(String var){
		this.$UCSORTHOREF = var;
	}

	/**
	 * @param  $UCSORTHOVIEW to set.
	 */
	public void set$UCSORTHOVIEW(short var){
		this.$UCSORTHOVIEW = var;
	}

	/**
	 * @param  $UCSORGTOP to set.
	 */
	public void set$UCSORGTOP(wPoint var){
		this.$UCSORGTOP = var;
	}

	/**
	 * @param  $UCSORGBOTTOM to set.
	 */
	public void set$UCSORGBOTTOM(wPoint var){
		this.$UCSORGBOTTOM = var;
	}

	/**
	 * @param  $UCSORGLEFT to set.
	 */
	public void set$UCSORGLEFT(wPoint var){
		this.$UCSORGLEFT = var;
	}

	/**
	 * @param  $UCSORGRIGHT to set.
	 */
	public void set$UCSORGRIGHT(wPoint var){
		this.$UCSORGRIGHT = var;
	}

	/**
	 * @param  $UCSORGFRONT to set.
	 */
	public void set$UCSORGFRONT(wPoint var){
		this.$UCSORGFRONT = var;
	}

	/**
	 * @param  $UCSORGBACK to set.
	 */
	public void set$UCSORGBACK(wPoint var){
		this.$UCSORGBACK = var;
	}

	/**
	 * @param  $PUCSBASE to set.
	 */
	public void set$PUCSBASE(String var){
		this.$PUCSBASE = var;
	}

	/**
	 * @param  $PUCSNAME to set.
	 */
	public void set$PUCSNAME(String var){
		this.$PUCSNAME = var;
	}

	/**
	 * @param  $PUCSORG to set.
	 */
	public void set$PUCSORG(wPoint var){
		this.$PUCSORG = var;
	}

	/**
	 * @param  $PUCSXDIR to set.
	 */
	public void set$PUCSXDIR(wPoint var){
		this.$PUCSXDIR = var;
	}

	/**
	 * @param  $PUCSYDIR to set.
	 */
	public void set$PUCSYDIR(wPoint var){
		this.$PUCSYDIR = var;
	}

	/**
	 * @param  $PUCSORTHOREF to set.
	 */
	public void set$PUCSORTHOREF(String var){
		this.$PUCSORTHOREF = var;
	}

	/**
	 * @param  $PUCSORTHOVIEW to set.
	 */
	public void set$PUCSORTHOVIEW(short var){
		this.$PUCSORTHOVIEW = var;
	}

	/**
	 * @param  $PUCSORGTOP to set.
	 */
	public void set$PUCSORGTOP(wPoint var){
		this.$PUCSORGTOP = var;
	}

	/**
	 * @param  $PUCSORGBOTTOM to set.
	 */
	public void set$PUCSORGBOTTOM(wPoint var){
		this.$PUCSORGBOTTOM = var;
	}

	/**
	 * @param  $PUCSORGLEFT to set.
	 */
	public void set$PUCSORGLEFT(wPoint var){
		this.$PUCSORGLEFT = var;
	}

	/**
	 * @param  $PUCSORGRIGHT to set.
	 */
	public void set$PUCSORGRIGHT(wPoint var){
		this.$PUCSORGRIGHT = var;
	}

	/**
	 * @param  $PUCSORGFRONT to set.
	 */
	public void set$PUCSORGFRONT(wPoint var){
		this.$PUCSORGFRONT = var;
	}

	/**
	 * @param  $PUCSORGBACK to set.
	 */
	public void set$PUCSORGBACK(wPoint var){
		this.$PUCSORGBACK = var;
	}

	/**
	 * @param  $USERI1 to set.
	 */
	public void set$USERI1(short var){
		this.$USERI1 = var;
	}

	/**
	 * @param  $USERI2 to set.
	 */
	public void set$USERI2(short var){
		this.$USERI2 = var;
	}

	/**
	 * @param  $USERI3 to set.
	 */
	public void set$USERI3(short var){
		this.$USERI3 = var;
	}

	/**
	 * @param  $USERI4 to set.
	 */
	public void set$USERI4(short var){
		this.$USERI4 = var;
	}

	/**
	 * @param  $USERI5 to set.
	 */
	public void set$USERI5(short var){
		this.$USERI5 = var;
	}

	/**
	 * @param  $USERR1 to set.
	 */
	public void set$USERR1(double var){
		this.$USERR1 = var;
	}

	/**
	 * @param  $USERR2 to set.
	 */
	public void set$USERR2(double var){
		this.$USERR2 = var;
	}

	/**
	 * @param  $USERR3 to set.
	 */
	public void set$USERR3(double var){
		this.$USERR3 = var;
	}

	/**
	 * @param  $USERR4 to set.
	 */
	public void set$USERR4(double var){
		this.$USERR4 = var;
	}

	/**
	 * @param  $USERR5 to set.
	 */
	public void set$USERR5(double var){
		this.$USERR5 = var;
	}

	/**
	 * @param  $WORLDVIEW to set.
	 */
	public void set$WORLDVIEW(short var){
		this.$WORLDVIEW = var;
	}

	/**
	 * @param  $SHADEDGE to set.
	 */
	public void set$SHADEDGE(short var){
		this.$SHADEDGE = var;
	}

	/**
	 * @param  $SHADEDIF to set.
	 */
	public void set$SHADEDIF(short var){
		this.$SHADEDIF = var;
	}

	/**
	 * @param  $TILEMODE to set.
	 */
	public void set$TILEMODE(short var){
		this.$TILEMODE = var;
	}

	/**
	 * @param  $MAXACTVP to set.
	 */
	public void set$MAXACTVP(short var){
		this.$MAXACTVP = var;
	}

	/**
	 * @param  $PINSBASE to set.
	 */
	public void set$PINSBASE(wPoint var){
		this.$PINSBASE = var;
	}

	/**
	 * @param  $PLIMCHECK to set.
	 */
	public void set$PLIMCHECK(short var){
		this.$PLIMCHECK = var;
	}

	/**
	 * @param  $PEXTMIN to set.
	 */
	public void set$PEXTMIN(wPoint var){
		this.$PEXTMIN = var;
	}

	/**
	 * @param  $PEXTMAX to set.
	 */
	public void set$PEXTMAX(wPoint var){
		this.$PEXTMAX = var;
	}

	/**
	 * @param  $PLIMMIN to set.
	 */
	public void set$PLIMMIN(wPoint2D var){
		this.$PLIMMIN = var;
	}

	/**
	 * @param  $PLIMMAX to set.
	 */
	public void set$PLIMMAX(wPoint2D var){
		this.$PLIMMAX = var;
	}

	/**
	 * @param  $UNITMODE to set.
	 */
	public void set$UNITMODE(short var){
		this.$UNITMODE = var;
	}

	/**
	 * @param  $VISRETAIN to set.
	 */
	public void set$VISRETAIN(short var){
		this.$VISRETAIN = var;
	}

	/**
	 * @param  $PLINEGEN to set.
	 */
	public void set$PLINEGEN(short var){
		this.$PLINEGEN = var;
	}

	/**
	 * @param  $PSLTSCALE to set.
	 */
	public void set$PSLTSCALE(short var){
		this.$PSLTSCALE = var;
	}

	/**
	 * @param  $TREEDEPTH to set.
	 */
	public void set$TREEDEPTH(short var){
		this.$TREEDEPTH = var;
	}

	/**
	 * @param  $CMLSTYLE to set.
	 */
	public void set$CMLSTYLE(String var){
		this.$CMLSTYLE = var;
	}

	/**
	 * @param  $CMLJUST to set.
	 */
	public void set$CMLJUST(short var){
		this.$CMLJUST = var;
	}

	/**
	 * @param  $CMLSCALE to set.
	 */
	public void set$CMLSCALE(double var){
		this.$CMLSCALE = var;
	}

	/**
	 * @param  $PROXYGRAPHICS to set.
	 */
	public void set$PROXYGRAPHICS(short var){
		this.$PROXYGRAPHICS = var;
	}

	/**
	 * @param  $MEASUREMENT to set.
	 */
	public void set$MEASUREMENT(short var){
		this.$MEASUREMENT = var;
	}

	/**
	 * @param  $CELWEIGHT to set.
	 */
	public void set$CELWEIGHT(short var){
		this.$CELWEIGHT = var;
	}

	/**
	 * @param  $ENDCAPS to set.
	 */
	public void set$ENDCAPS(short var){
		this.$ENDCAPS = var;
	}

	/**
	 * @param  $JOINSTYLE to set.
	 */
	public void set$JOINSTYLE(short var){
		this.$JOINSTYLE = var;
	}

	/**
	 * @param  $LWDISPLAY to set.
	 */
	public void set$LWDISPLAY(boolean var){
		this.$LWDISPLAY = var;
	}

	/**
	 * @param  $INSUNITS to set.
	 */
	public void set$INSUNITS(short var){
		this.$INSUNITS = var;
	}

	/**
	 * @param  $HYPERLINKBASE to set.
	 */
	public void set$HYPERLINKBASE(String var){
		this.$HYPERLINKBASE = var;
	}

	/**
	 * @param  $STYLESHEET to set.
	 */
	public void set$STYLESHEET(String var){
		this.$STYLESHEET = var;
	}

	/**
	 * @param  $XEDIT to set.
	 */
	public void set$XEDIT(boolean var){
		this.$XEDIT = var;
	}

	/**
	 * @param  $CEPSNTYPE to set.
	 */
	public void set$CEPSNTYPE(short var){
		this.$CEPSNTYPE = var;
	}

	/**
	 * @param  $PSTYLEMODE to set.
	 */
	public void set$PSTYLEMODE(boolean var){
		this.$PSTYLEMODE = var;
	}

	/**
	 * @param  $FINGERPRINTGUID to set.
	 */
	public void set$FINGERPRINTGUID(String var){
		this.$FINGERPRINTGUID = var;
	}

	/**
	 * @param  $VERSIONGUID to set.
	 */
	public void set$VERSIONGUID(String var){
		this.$VERSIONGUID = var;
	}

	/**
	 * @param  $EXTNAMES to set.
	 */
	public void set$EXTNAMES(boolean var){
		this.$EXTNAMES = var;
	}

	/**
	 * @param  $PSVPSCALE to set.
	 */
	public void set$PSVPSCALE(double var){
		this.$PSVPSCALE = var;
	}

	/**
	 * @param  $OLESTARTUP to set.
	 */
	public void set$OLESTARTUP(boolean var){
		this.$OLESTARTUP = var;
	}

	/**
	 * @param  $SORTENTS to set.
	 */
	public void set$SORTENTS(short var){
		this.$SORTENTS = var;
	}

	/**
	 * @param  $INDEXCTL to set.
	 */
	public void set$INDEXCTL(short var){
		this.$INDEXCTL = var;
	}

	/**
	 * @param  $HIDETEXT to set.
	 */
	public void set$HIDETEXT(short var){
		this.$HIDETEXT = var;
	}

	/**
	 * @param  $XCLIPFRAME to set.
	 */
	public void set$XCLIPFRAME(boolean var){
		this.$XCLIPFRAME = var;
	}

	/**
	 * @param  $HALOGAP to set.
	 */
	public void set$HALOGAP(short var){
		this.$HALOGAP = var;
	}

	/**
	 * @param  $OBSCOLOR to set.
	 */
	public void set$OBSCOLOR(short var){
		this.$OBSCOLOR = var;
	}

	/**
	 * @param  $OBSLTYPE to set.
	 */
	public void set$OBSLTYPE(short var){
		this.$OBSLTYPE = var;
	}

	/**
	 * @param  $INTERSECTIONDISPLAY to set.
	 */
	public void set$INTERSECTIONDISPLAY(short var){
		this.$INTERSECTIONDISPLAY = var;
	}

	/**
	 * @param  $INTERSECTIONCOLOR to set.
	 */
	public void set$INTERSECTIONCOLOR(short var){
		this.$INTERSECTIONCOLOR = var;
	}

	/**
	 * @param  $DIMASSOC to set.
	 */
	public void set$DIMASSOC(short var){
		this.$DIMASSOC = var;
	}

	/**
	 * @param  $PROJECTNAME to set.
	 */
	public void set$PROJECTNAME(String var){
		this.$PROJECTNAME = var;
	}

	/**
	 * @param  $CAMERADISPLAY to set.
	 */
	public void set$CAMERADISPLAY(boolean var){
		this.$CAMERADISPLAY = var;
	}

	/**
	 * @param  $LENSLENGTH to set.
	 */
	public void set$LENSLENGTH(double var){
		this.$LENSLENGTH = var;
	}

	/**
	 * @param  $CAMERAHEIGHT to set.
	 */
	public void set$CAMERAHEIGHT(double var){
		this.$CAMERAHEIGHT = var;
	}

	/**
	 * @param  $STEPSPERSEC to set.
	 */
	public void set$STEPSPERSEC(double var){
		this.$STEPSPERSEC = var;
	}

	/**
	 * @param  $STEPSIZE to set.
	 */
	public void set$STEPSIZE(double var){
		this.$STEPSIZE = var;
	}

	/**
	 * @param  $3DDWFPREC to set.
	 */
	public void set$3DDWFPREC(double var){
		this.$3DDWFPREC = var;
	}

	/**
	 * @param  $PSOLWIDTH to set.
	 */
	public void set$PSOLWIDTH(double var){
		this.$PSOLWIDTH = var;
	}

	/**
	 * @param  $PSOLHEIGHT to set.
	 */
	public void set$PSOLHEIGHT(double var){
		this.$PSOLHEIGHT = var;
	}

	/**
	 * @param  $LOFTANG1 to set.
	 */
	public void set$LOFTANG1(double var){
		this.$LOFTANG1 = var;
	}

	/**
	 * @param  $LOFTANG2 to set.
	 */
	public void set$LOFTANG2(double var){
		this.$LOFTANG2 = var;
	}

	/**
	 * @param  $LOFTMAG1 to set.
	 */
	public void set$LOFTMAG1(double var){
		this.$LOFTMAG1 = var;
	}

	/**
	 * @param  $LOFTMAG2 to set.
	 */
	public void set$LOFTMAG2(double var){
		this.$LOFTMAG2 = var;
	}

	/**
	 * @param  $LOFTPARAM to set.
	 */
	public void set$LOFTPARAM(short var){
		this.$LOFTPARAM = var;
	}

	/**
	 * @param  $LOFTNORMALS to set.
	 */
	public void set$LOFTNORMALS(short var){
		this.$LOFTNORMALS = var;
	}

	/**
	 * @param  $LATITUDE to set.
	 */
	public void set$LATITUDE(double var){
		this.$LATITUDE = var;
	}

	/**
	 * @param  $LONGITUDE to set.
	 */
	public void set$LONGITUDE(double var){
		this.$LONGITUDE = var;
	}

	/**
	 * @param  $NORTHDIRECTION to set.
	 */
	public void set$NORTHDIRECTION(double var){
		this.$NORTHDIRECTION = var;
	}

	/**
	 * @param  $TIMEZONE to set.
	 */
	public void set$TIMEZONE(short var){
		this.$TIMEZONE = var;
	}

	/**
	 * @param  $LIGHTGLYPHDISPLAY to set.
	 */
	public void set$LIGHTGLYPHDISPLAY(short var){
		this.$LIGHTGLYPHDISPLAY = var;
	}

	/**
	 * @param  $TILEMODELIGHTSYNCH to set.
	 */
	public void set$TILEMODELIGHTSYNCH(short var){
		this.$TILEMODELIGHTSYNCH = var;
	}

	/**
	 * @param  $CMATERIAL to set.
	 */
	public void set$CMATERIAL(String var){
		this.$CMATERIAL = var;
	}

	/**
	 * @param  $SOLIDHIST to set.
	 */
	public void set$SOLIDHIST(short var){
		this.$SOLIDHIST = var;
	}

	/**
	 * @param  $SHOWHIST to set.
	 */
	public void set$SHOWHIST(short var){
		this.$SHOWHIST = var;
	}

	/**
	 * @param  $DWFFRAME to set.
	 */
	public void set$DWFFRAME(short var){
		this.$DWFFRAME = var;
	}

	/**
	 * @param  $DGNFRAME to set.
	 */
	public void set$DGNFRAME(short var){
		this.$DGNFRAME = var;
	}

	/**
	 * @param  $REALWORLDSCALE to set.
	 */
	public void set$REALWORLDSCALE(boolean var){
		this.$REALWORLDSCALE = var;
	}

	/**
	 * @param  $INTERFERECOLOR to set.
	 */
	public void set$INTERFERECOLOR(short var){
		this.$INTERFERECOLOR = var;
	}

	/**
	 * @param  $INTERFEREOBJVS to set.
	 */
	public void set$INTERFEREOBJVS(String var){
		this.$INTERFEREOBJVS = var;
	}

	/**
	 * @param  $INTERFEREVPVS to set.
	 */
	public void set$INTERFEREVPVS(String var){
		this.$INTERFEREVPVS = var;
	}

	/**
	 * @param  $CSHADOW to set.
	 */
	public void set$CSHADOW(short var){
		this.$CSHADOW = var;
	}

	/**
	 * @param  $SHADOWPLANELOCATION to set.
	 */
	public void set$SHADOWPLANELOCATION(double var){
		this.$SHADOWPLANELOCATION = var;
	}

    /**
     * printAll()
     * <pre>Terminal output the description of Section Header
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
     * @return the dxf data of Section Header.
     * <pre>Output example:
     * 1.0</pre>
     */
    public List<String> getDXF() {

        List<String> DXF_STR = new ArrayList<>();
        /*
        DXF_STR.add("  0");
        DXF_STR.add(this.SectionHeader);
        DXF_STR.add("  2");
        DXF_STR.add(this.SectionName);

        DXF_STR.add("  9");
        DXF_STR.add("$ACADVER");
        DXF_STR.add("  1");
        DXF_STR.add(this.acadver);

        DXF_STR.add("  9");
        DXF_STR.add("$INSBASE");
        DXF_STR.addAll(this.inserBasePoint.getDXF());

        DXF_STR.add("  9");
        DXF_STR.add("$EXTMIN");
        DXF_STR.addAll(this.extmin.getDXF());

        DXF_STR.add("  9");
        DXF_STR.add("$EXTMAX");
        DXF_STR.addAll(this.extmax.getDXF());

        DXF_STR.add("  9");
        DXF_STR.add("$LIMMIN");
        DXF_STR.addAll(this.limmin.getDXF());

        DXF_STR.add("  9");
        DXF_STR.add("$LIMMAX");
        DXF_STR.addAll(this.limmax.getDXF());


        DXF_STR.add("  0");
        DXF_STR.add(this.SectionTail);
        */

        /*
        for (int i=0; i< StdSectionStr_R2K01.length; i++) {
            DXF_STR.add(StdSectionStr_R2K01[i]);
        }

        DXF_STR.add(FileDXF.hex_handle );

        for (int i=0; i< StdSectionStr_R2K02.length; i++) {
            DXF_STR.add(StdSectionStr_R2K02[i]);
        }
        */

        DXF_STR.add("  0");
        DXF_STR.add(this.SectionHeader);
        DXF_STR.add("  2");
        DXF_STR.add(this.SectionName);

        this_GC_Header = new GC_Header();
        this.assembleHeaderDXF();
        DXF_STR.addAll(this_GC_Header.getDXF());

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

