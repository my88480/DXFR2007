import java.util.*;

public class GroupCode{
	private String Code;
	private String Value;
	
	public GroupCode(){
	}

	public GroupCode(String code,String value){
		this.Code = code;
		this.Value = value;
	}
	
	public GroupCode(String code,int value){
		this.Code = code;
		this.Value = Integer.toString(value);
	}
	
	public GroupCode(String code,boolean value){
		this.Code = code;
		this.Value = Boolean.toString(value);
	}
	
	public GroupCode(String code,long value){
		this.Code = code;
		this.Value = Long.toString(value);
	}
	
	public GroupCode(String code,double value){
		this.Code = code;
		this.Value = Double.toString(value);
	}

	public GroupCode(String code,float value){
		this.Code = code;
		this.Value = Float.toString(value);
	}

	public void setValue(char value){
		this.Value = Character.toString(value);
	}
	
	public void setValue(String value){
		this.Value = value;
	}
	
	public void setValue(boolean value){
		this.Value = Boolean.toString(value);
	}
	
	public void setValue(short value){
		this.Value = Short.toString(value);
	}
	
	public void setValue(int value){
		this.Value = Integer.toString(value);
	}
	
	public void setValue(long value){
		this.Value = Long.toString(value);
	}
	
	public void setValue(double value){
		this.Value = Double.toString(value);
	}
	
	public void setValue(float value){
		this.Value = Float.toString(value);
	}
	
	public String getValue(){
		return this.Value;
	}
	
	public void setCode(String code){
		this.Code = code;
	}
	
	public String getCode(){
		return this.Code;
	}
	
	public List<String> getDXF(){
        List<String> DXF_STR = new ArrayList<>();

        DXF_STR.add(this.Code);
        DXF_STR.add(this.Value);

        return DXF_STR;
	}		

    public String getDXFString() {
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
	
    public String toString() {
        return getDXFString();
    }
}
