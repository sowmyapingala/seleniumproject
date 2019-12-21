package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JavaUtil {
	
	JavaUtil() throws IOException{
		JavaUtil.setProp();
		JavaUtil.setFis();
		JavaUtil.getProp();
		
	}
	
	private static Properties prop;
	static FileInputStream fis;

	public static Properties getProp() throws IOException {
		prop.load(fis);
		return prop;
	}

	public static void setProp() {
		JavaUtil.prop = new Properties();
	}
	
	
	public static void setFis() throws FileNotFoundException {
		fis =  new FileInputStream(new File("./config.properties"));
	}
	
	public static String getValueFromProperties(String str) {
		String str1 = prop.getProperty(str);
		
		return str1;
		
	}
	
	

}
