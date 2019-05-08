package mmm;

public class Demo {
	public Demo() {
	}
public String smallString(String str)// 字符串变小写
	{
		String temp = "error";
		if (str.equals("") || str == null) {
			return temp;
		}
		String s = str.toLowerCase();
		return s;
	}
}
