import java.io.*;
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
	
	}

	public static String readFile(String filename) {
	FileReader inputStream = null;
	String content = "";
	
		try {
			inputStream = new FileReader(filename);
			int c;
		
				while ((c = inputStream.read()) != -1) {
					content += (char)c;
				}
		
			return content;
		}
		catch (IOException e) {
			System.out.println(e);
		return "";
		}
		finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
	}

	public static String backwardsReadFile(String filename) {
	FileReader inputStream = null;
	String content = "";
	String reversed = "";
	
		try {
			inputStream = new FileReader(filename);
			int c;
		
			while ((c = inputStream.read()) != -1) {
				content += (char)c;
			}
		
			for (int i = content.length() - 1; i >= 0; i--) {
				reversed += content.charAt(i);
			}
		
			return reversed;
		}
			catch (IOException e) {
				System.out.println(e);
			return "";
		}
		finally {
			try {
			if (inputStream != null) {
				inputStream.close();
				}
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
