package TestApi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class TestFileStream {

	public static void main(String[] args) {
		
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		try {
			bar();
			
			//Input stream
			inStream = new FileInputStream("C:/tmp/input.txt");
			outStream = new FileOutputStream("C:/tmp/output.txt");
			
			//Stream Reader
			InputStreamReader isr = new InputStreamReader(inStream);
			OutputStreamWriter osw = new OutputStreamWriter(outStream);
			
			//buffer reader
			BufferedReader reader = new BufferedReader(isr);
			
			List<String> strList = new ArrayList<>();
			String line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				strList.add(line);
				line = reader.readLine();
			}
			
			for (String str : strList) {
				osw.write(str);
				osw.write("\n");
			}
			
			osw.flush();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inStream != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (outStream != null) {
				try {
					outStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	private static void bar() throws Exception {
		foo();
	}

	private static void foo() throws Exception {
		int a = 1;
		int b = 0;	
		
		try {
					
			//int c = a / b;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		if (b == 0) {
			throw new Exception("bの結果は0です。");
		}
	}
}
