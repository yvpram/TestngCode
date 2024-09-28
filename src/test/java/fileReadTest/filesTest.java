package fileReadTest;

import org.testng.Assert;

import org.testng.annotations.Test;

import files.ReadFiles;
import files.WriteFiles;

public class filesTest extends TestNGBaseClass{
	@Test
	public void readFilestext() {
		ReadFiles rf = new ReadFiles();
		String path = "./src/main/resources/TEXT.txt";
		rf.textFileRead(path);
		Assert.assertNotNull(path);
	}

	@Test
	
	public void writeFilestext() {
		WriteFiles wf = new WriteFiles();
		String path = "./src/main/resources/TEXT.txt";
		String text = "hi java selenium automation tester";
		wf.textFileWrite(path, text);
		Assert.assertEquals(true, true);
		ReadFiles rf = new ReadFiles();
		rf.textFileRead(path);
	}
	@Test
	public void	readFilesproperties(){
		ReadFiles rf = new ReadFiles();
		String path = "./src/main/resources/Properties.properties";
		rf.propertiesFileRead(path);
		Assert.assertNotNull(path);
	}

	@Test
	public void WriteFilesproperties() {
		WriteFiles wf = new WriteFiles();
		String path = "./src/main/resources/Properties.properties";
		String key ="name";
		String value="ram";
		wf.propertiesFileWrite(path, key, value);
		Assert.assertEquals(true, true);
		ReadFiles rf = new ReadFiles();
		rf.propertiesFileRead(path);

	}
	@Test
	public void WriteFilesExceal() {
		WriteFiles wf = new WriteFiles();
		String path = "./src/main/resources/Exceal.xls";
		String sheet ="employee";
		int row = 0, coloum=0;
		wf.excealFileWrite(path, sheet, sheet, row, coloum);
	}
	@Test
	public	void readFilesExceal(){
		
	}
}
