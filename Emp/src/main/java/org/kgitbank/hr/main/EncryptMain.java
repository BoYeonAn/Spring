package org.kgitbank.hr.main;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class EncryptMain {

	public static void main(String[] args) {
		StandardPBEStringEncryptor enc=new StandardPBEStringEncryptor();
		enc.setPassword("boyeon");
		System.out.println("jdbc.driverClassName="+enc.encrypt("net.sf.log4jdbc.DriverSpy"));
		System.out.println("jdbc.url="+enc.encrypt("jdbc:log4jdbc:oracle:thin:@localhost:1521/xepdb1"));
		System.out.println("jdbc.username="+enc.encrypt("hr"));
		System.out.println("jdbc.password="+enc.encrypt("hr"));
	}

}
