package com.wymbkj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * test
 */
@SpringBootApplication
public class DempApp {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DempApp.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
