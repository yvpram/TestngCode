package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class WriteFiles {

	public String textFileWrite(String path, String text) {
		try {
			File file= new File(path);
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(text.getBytes());
			System.out.println("It is ok");
			return text;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
		
	}

	public void propertiesFileWrite(String path, String key, String value) {
		try {
			File file= new File(path);
			FileOutputStream fos = new FileOutputStream(file);
			Properties p = new Properties();
			p.setProperty(key, value);
			p.store(fos, "chinru");
			System.out.println("It is ok");
			fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void excealFileWrite(String path,String sheet,String value,int i,int j) {
		try {
			File file= new File(path);
			
		 FileOutputStream fos = new FileOutputStream(file);
			
			XSSFWorkbook wf= new XSSFWorkbook();
			
				wf.createSheet(sheet).createRow(0).createCell(0).setCellValue(value);
	       
	        wf.write(fos);
	        wf.close();
	        
			System.out.println("It is ok");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static void main(String[] args) {
		WriteFiles wf = new WriteFiles();
		String path = "./src/main/resources/Excealfile.xlsx";
		String key = "employee";
		String value= "natasha";
		int i=0,j=0;
		wf.excealFileWrite(path, key, value, i, j);
	}
}
