package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileHandling {
	public static void main(String[] args) {
		// create an object of FileInputStream class

		try {
			FileInputStream fis = new FileInputStream(".\\config.properties");
			// create Properties class object
			Properties prop = new Properties();
			prop.load(fis);
			String urlValue = prop.getProperty("url");
			System.out.println("url ------ "+urlValue);
			String usernameValue = prop.getProperty("username");
			System.out.println("username ---------- "+usernameValue);
			String passwordValue = prop.getProperty("password");
			System.out.println("password -------- "+passwordValue);
			String emailValue = prop.getProperty("email", "sunshine@gmail.com");
			System.out.println("email ---------- "+emailValue);
		} catch (FileNotFoundException e) {
			System.out.println("file not available in the given path");
		} catch(IOException e) {
			System.out.println("probelm in reading data from the properties file");
		}

	}

}
