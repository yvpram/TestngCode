package files;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFiles {

	public void textFileRead(String tpath) {
		try {
			File file = new File(tpath);
			FileInputStream fis = new FileInputStream(file);
			byte[] bytearray = new byte[fis.available()];
			fis.read(bytearray);
			String str = new String(bytearray);

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("it is the result got from text file");
		}

	}

	public void propertiesFileRead(String path) {
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			Properties pro = new Properties();
			pro.load(fis);
			pro.forEach((t, u) -> System.out.println(t + " " + u));

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("it is the result got from propertis file");
		}

	}

	public List<String> Execel(String path, String sheet) {
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook book = new XSSFWorkbook(fis);
			Sheet sheeet = book.getSheet(sheet);
			List<String> list = new ArrayList<String>();
			Iterator<Row> rows = sheeet.rowIterator();

			while (rows.hasNext()) {
				Row row = rows.next();
				Iterator<Cell> cells = row.cellIterator();
				while (cells.hasNext()) {
					Cell cell = cells.next();
					if (cell.getCellType() == CellType.STRING) {
						String s = cell.getStringCellValue();
						list.add(s);
						System.out.println(s);
					}
				}

				System.out.println();
			}
			return list;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("it is the result got from excel file");
		}
		return null;

	}

	public static void main(String[] args) throws Exception {
		ReadFiles rf = new ReadFiles();
		String path = "./src/main/resources/TEXT.txt";

		rf.textFileRead(path);
		System.out.println(" ");
		String ppath = "./src/main/resources/Properties.properties";
		rf.propertiesFileRead(ppath);
		System.out.println();
		String epath = "./src/main/resources/Excealfile.xlsx";
		String sheet = "employee";
		Thread.sleep(2000);
		rf.Execel(epath, sheet);

	}

}
