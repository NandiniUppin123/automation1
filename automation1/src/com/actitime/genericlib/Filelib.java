package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
/**
 * 
 * @param key
 * @return String
 * @throws IOException
 */
public String getproprtydata(String key) throws IOException
{
	
	FileInputStream file=new FileInputStream("./Data/commondata.properties");
	Properties p=new Properties();
	p.load(file);
	String value = p.getProperty(key);
	//String url = p.getProperty("url");
	//String un = p.getProperty("username");
	//String pw = p.getProperty("password");
	return value;
	
	
}
/**
 * 
 * @param Sheetname
 * @param row
 * @param cell
 * @return String
 * @throws Exception
 */
public String getExceldata(String Sheetname,int row,int cell) throws Exception
{
	FileInputStream fis=new FileInputStream("./Data/testscriptdata.xlsx");
Workbook wb = WorkbookFactory.create(fis);
String value1 = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value1;
}
}
