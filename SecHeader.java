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

