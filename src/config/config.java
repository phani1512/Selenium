//package config;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.Properties;
//
//import Constaints.Constaints;
//
//public class config {
//	static Properties prop = new Properties();
//	static String projectPath = System.getProperty("user.dir");
//
//	public static void main(String[] args) {
//		getProperties();
//		setProperties();
//		getEmail();
//		setEmail();
//		getPassword();
//		setPassword();
//
//
//	}
//	public static void getProperties() {
//		try {
//			InputStream input = new FileInputStream(projectPath + "\\src\\config\\config.Properties");
//			prop.load(input);
//			String url = prop.getProperty("url");
//			System.out.println(url);
//			Constaints.url = prop.getProperty("url");
//
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//
//	}	
//
//	public static void setProperties() {
//		try {
//			OutputStream output = new FileOutputStream(projectPath + "\\src\\config\\config.Properties");
//			prop.setProperty("url", "https://www.mountaingear.com/");
//			prop.store(output, null);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//
//	}
//
//	public static void getEmail() {
//		try {
//			InputStream input = new FileInputStream(projectPath + "\\src\\config\\config.Properties");
//			prop.load(input);
//			String url = prop.getProperty("email");
//			System.out.println(url);
//
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
//	public static void setEmail() {
//		try {
//			OutputStream output = new FileOutputStream(projectPath + "\\src\\config\\config.Properties");
//			prop.setProperty("email", "phaneendraphani20@gmail.com");
//			prop.store(output, null);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
//
//	public static void getPassword() {
//		try {
//			InputStream input = new FileInputStream(projectPath + "\\src\\config\\config.Properties");
//			prop.load(input);
//			String url = prop.getProperty("password");
//			System.out.println(url);
//
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
//	public static void setPassword() {
//		try {
//			OutputStream output = new FileOutputStream(projectPath + "\\src\\config\\config.Properties");
//			prop.setProperty("password", "Phaneendra@15");
//			prop.store(output, null);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//
//
//	}	
//}
//
