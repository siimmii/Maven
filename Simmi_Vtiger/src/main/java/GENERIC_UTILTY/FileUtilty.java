package GENERIC_UTILTY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtilty {
	
	public String getKeyAndValue(String Key) throws Throwable
	{

	FileInputStream fis=new FileInputStream("/Simmi_Vtiger/src/test/resources/vtiger.properties");
	Properties p=new Properties();
	p.load(fis);
	String value=p.getProperty(Key);
	return value;
}
}
