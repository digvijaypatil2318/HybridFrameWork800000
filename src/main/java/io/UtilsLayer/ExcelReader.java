package io.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static FileInputStream fis;
    public static XSSFWorkbook wb;
	
	public ExcelReader(String excelpath) throws Throwable  {
		File f=new File(excelpath);
		System.out.println(f.exists());
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 wb= new XSSFWorkbook(fis);
		
	}
	
  public String getData(int sheetindex,int row,int col) {
	 XSSFSheet sheet= wb.getSheetAt(0);
	 String data=sheet.getRow(row).getCell(col).getStringCellValue();
	 return data; 
  }
  
  public int rowcount(int sheetindex) {
	 int rows= wb.getSheetAt(0).getLastRowNum();
	 rows=rows+1;
	 return rows;
	 
  }

}
