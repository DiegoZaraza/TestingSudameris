package helper;

public class Helper {
	public float convertPercentage(String value) {
//		value = value.replace(".", ",");
		value = value.replace("%", "");
		
		return Float.parseFloat(value)/100;
	}
	
	public float convertamount(String value) {
		value = value.replace("$", "");
		return Float.parseFloat(value);
	}
}
