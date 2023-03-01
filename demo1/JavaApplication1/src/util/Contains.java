package util;

//import org.springframework.util.ResourceUtils;

import javax.swing.*;
import java.io.*;
import java.util.Properties;

import static util.FileUtils.readProperty;

/**
 * @Description: 静态类
 * @author: LuShao
 * @create: 2019-03-04 15:31
 **/
public class Contains {

	public static JFileChooser jFileChooser=new JFileChooser();
	public static String filePath="classpath:config.properties";
	public static String chooseFilepath;
	public static Properties properties=new Properties();
	public static File file;

	static {
		try {
//			file = ResourceUtils.getFile(Contains.filePath);
			chooseFilepath=readProperty("chooseFilepath");
			jFileChooser.setCurrentDirectory(new File(chooseFilepath));
			/*if ("".equals(chooseFilepath)){
				chooseFilepath="C:\\";
			}*/
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
