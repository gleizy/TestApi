package TestApi;

public class StringUtils {
	public static void main(String[] args) {
		//compare two strings
		String strA = "中国語";
		String strB = "日本語";
		int result = strA.compareTo(strB);
		System.out.println("strAとstrBの比較結果：" + result);
		
		//split a string into array
		String strToSplit = "123456,dcisl,33AA,高雷";
		String[] strArray = strToSplit.split(",");
		System.out.println("strArray's size:" + strArray.length);
		for (String tempStr : strArray) {
			System.out.println(tempStr);
		}
		
		// trim a string
		String strToTrim = " This is a sentence.   ";
		System.out.println("string after trimming:" + strToTrim.trim());
		
		// replace a charactor in a string
		String strToReplace = "I don't want to go home today";
		System.out.println("string after replacing:" + 
				strToReplace.replaceAll("t", ""));
		
		// test a string whether starts / ends with a string
		String strTest = "abcdeabcdeabcdef";
		boolean testStartResult = strTest.startsWith("ab");
		System.out.println("Start With:" + testStartResult);
		boolean testEndResult = strTest.endsWith("ab");
		System.out.println("End With:" + testEndResult);
		testStartResult = strTest.toUpperCase().startsWith("AB");
		System.out.println("Start With AB:" + testStartResult);
		
		// get index of a string
		result = strTest.indexOf("cde");
		System.out.println("Index of cde:" + result);
		result = strTest.indexOf("cf");
		System.out.println("Index of cf:" + result);
		result = strTest.lastIndexOf("cde");
		System.out.println("Last index of cde:" + result);
		
		// get substring from a string
		String path = "/eclipse/configuration/config.ini";
		String subStr = path.substring(1, 10);
		System.out.println("sub string:" + subStr);
		subStr = path.substring(2);
		System.out.println("sub string:" + subStr);		
		subStr = path.substring(path.lastIndexOf("/") + 1);
		System.out.println("sub string:" + subStr);
		
		// use string builder to compose a very very long string
		String sql = "SELECT * ";
		sql += "FROM TABLE_NAME ";
		sql += "WHERE ID = 1 ";
		sql += "AND FLG = 0 ";
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * ");
		sb.append("FROM TABLE_NAME ");
		sb.append("WHERE ID = 1 ");
		sb.append("AND FLG = 0 ");
		sql = sb.toString();
		System.out.println("sql:" + sql);
		
		// change string to upper / lower case
		strTest = "abc";
		System.out.println("To Upper Case:" + strTest.toUpperCase());
		strTest = "ABcd";
		System.out.println("To Lower Case:" + strTest.toLowerCase());
	}
}
