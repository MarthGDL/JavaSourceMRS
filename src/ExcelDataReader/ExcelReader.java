package ExcelDataReader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void tellMePath() {
		System.out.print(System.getProperty("user.dir")+"/TestData/data.xlsx"); 
	}
	
	public static String getCellData(int row,int cell) {
		try {
			workbook=new XSSFWorkbook(System.getProperty("user.dir")+"/TestData/data.xlsx");
			sheet=workbook.getSheet("SignIn");
			String CellData = sheet.getRow(row).getCell(cell).getStringCellValue();
			return CellData;
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return "Error";
		}
	}
	
}
