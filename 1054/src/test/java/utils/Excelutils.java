package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String projectpath;
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet;
	
	
	//Constructor, no return type, class name should be same 
	public Excelutils(String excelPath, String sheetName) {
		try {
		//projectpath=System.getProperty("user.dir");
		workbook=new XSSFWorkbook(excelPath);
		sheet=workbook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
	
	public static void main(String[]args)
	{
		getrowcount();
		getcolumnvalue(0, 0);
		getcolumndatanumber(0,0);
	}
	public static void getrowcount()
	{
		try {
			
			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("no of rows: "+rowcount);
		}
		catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}
	public static void getcolumncount()
	{
		try {
			
			int rowcount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("no of rows: "+rowcount);
		}
		catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}
	public static void getcolumnvalue(int rownum, int columnnum)
	{
		try {
		
		String celldata=sheet.getRow(rownum).getCell(columnnum).getStringCellValue();
		System.out.println("Username is :"+celldata);
		}
		catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}
	public static void getcolumndatanumber(int rowNum, int columnNum)
	{
		try {
		
		double celldatanumber=sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();
		System.out.println("Password is:"+celldatanumber);
		}
		catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}
}


