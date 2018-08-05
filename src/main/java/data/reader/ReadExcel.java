package data.reader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public String[][] readExcel(String fileName) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx"); 
		//XSSFWorkbook wbook = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount+"row count"+rowCount);
		String data[][]= new String [rowCount][columnCount];
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <columnCount; j++) {
				String value = row.getCell(j).getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			}
		}
		wbook.close();
		return data;
	}

}

