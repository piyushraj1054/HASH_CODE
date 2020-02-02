package utils;

public class ExcelUtilsDemo {
	public static void main(String[] args) 
	{
		String  projectpath=System.getProperty("user.dir");
		Excelutils excel= new Excelutils(projectpath +"\\excel\\data.xlsx", "Sheet1");
		
		excel.getrowcount();
		excel.getcolumnvalue(1, 0);
		excel.getcolumndatanumber(1, 1);
		
	}

}
