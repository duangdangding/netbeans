package util;


import java.io.*;

import java.util.regex.Pattern;

/**
 * @Description: 工具类
 * @author: LuShao
 * @create: 2019-03-04 15:54
 **/
public class FileUtils {

	/**
	 * 读取properties文件
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String readProperty(String key) throws IOException {
		String value="";
		InputStream in=new BufferedInputStream(new FileInputStream(Contains.file));
		Contains.properties.load(in);
		value = Contains.properties.getProperty(key);
		in.close();
		return value;
	}

	/**
	 * 设置properties文件
	 * @param key
	 * @param value
	 */
	public static void setProperty(String key,String value) throws IOException {
		//System.out.println(Contains.file.getAbsolutePath());
		FileOutputStream oFile = new FileOutputStream(Contains.file, false);//true表示追加打开
		Contains.properties.setProperty(key, value);
		Contains.properties.store(oFile, null);
		oFile.close();
	}

	/**
	 * 判断是否含有特殊字符
	 *
	 * @param str
	 * @return true为包含，false为不包含
	 */
	public static boolean haSymbol(String str) {
		return Pattern.compile("[|:\\<>/?*\"]").matcher(str).find();
	}
}
