package com.assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.path.json.JsonPath;

public class CallingObject {
	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream file = new FileInputStream("C:/Users/aksha/OneDrive/Desktop/Devyanee/jsonviewer.txt");
		JsonPath js = new JsonPath(file);

		// System.out.println("My json : " + json);
		// String value = j.getString(price);
		// System.out.println("My value is : " + value);

		String T = js.getString("courses.webautomation[0].title");
		System.out.println("Ma title : " + T);

		String p = js.getString("courses.webautomation[0].price");
		System.out.println("my price : " + p);

	}
}
