package Exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class majorminor {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("\\C:\\Users\\swath\\OneDrive\\Desktop\\ms excel\\data.xlsx\\");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("data");
		for(int i=0;i<=sheet.getLastRowNum()-1;i++)
		{
			XSSFRow row = sheet.getRow(i);
			if(row!=null)
			{
				 XSSFCell agecell = row.getCell(1);
				  XSSFCell statuscell = row.createCell(2, CellType.STRING);
				  if(agecell!=null)
				  {
					  
				  }
			}
		}
	}

}
