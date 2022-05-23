package com.assignments;

import io.restassured.path.json.JsonPath;

public class Assign1 {
	public static void main(String[] args) {
		String json = "{\r\n" + "  \"dashboard\": {\r\n" + "    \"purchaseAmount\": 40000,\r\n"
				+ "    \"website\": \"www.testingshastra.com\",\r\n" + "    \"studentId\" : \"911\"\r\n" + "  },\r\n"
				+ "  \"courses\": {\r\n" + "    \"webautomation\":[\r\n" + "      {\r\n"
				+ "        \"title\": \"Selenium\",\r\n" + "        \"price\": 4000\r\n" + "      },\r\n"
				+ "      {\r\n" + "        \"title\": \"Cypress\",\r\n" + "        \"price\": 6000\r\n" + "      },\r\n"
				+ "      {\r\n" + "        \"title\": \"Protractor\",\r\n" + "        \"price\": 7000\r\n"
				+ "      }\r\n" + "    ],\r\n" + "    \"api\":[\r\n" + "      {\r\n"
				+ "        \"title\": \"Rest API\",\r\n" + "        \"price\": 5000\r\n" + "      },\r\n"
				+ "      {\r\n" + "        \"title\": \"Soap UI\",\r\n" + "        \"price\": 6000\r\n" + "      }\r\n"
				+ "    ],\r\n" + "    \"MobileAutomation\":[\r\n" + "      {\r\n" + "        \"title\": \"C-Test\",\r\n"
				+ "        \"price\": 5000\r\n" + "      },\r\n" + "      {\r\n" + "        \"title\": \"Appium\",\r\n"
				+ "        \"price\": 6000\r\n" + "      }\r\n" + "    ]\r\n" + "  }\r\n" + "\r\n" + "}\r\n" + "\r\n"
				+ "\r\n" + "\r\n" + "";

		JsonPath js = new JsonPath(json);
	
	}
}
<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<groupId>testingshastra</groupId>
<artifactId>reSonance</artifactId>
<version>1.0</version>

<properties>
	<maven.compiler.source>1.8</maven.compiler.source>
	<maven.compiler.target>1.8</maven.compiler.target>
</properties>
<dependencies>
	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
	<dependency>
		<groupId>org.testng</groupId>
		<artifactId>testng</artifactId>
		<version>7.1.0</version>
	</dependency>

	<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
	<dependency>
		<groupId>io.github.bonigarcia</groupId>
		<artifactId>webdrivermanager</artifactId>
		<version>5.0.3</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>4.1.1</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi</artifactId>
		<version>4.1.2</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-ooxml</artifactId>
		<version>4.1.2</version>
	</dependency><!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-java</artifactId>
		<version>7.2.3</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-testng</artifactId>
		<version>7.2.3</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-testng -->
	<dependency>
		<groupId>io.qameta.allure</groupId>
		<artifactId>allure-testng</artifactId>
		<version>2.17.3</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-cucumber-jvm -->
	<dependency>
		<groupId>io.qameta.allure</groupId>
		<artifactId>allure-cucumber-jvm</artifactId>
		<version>2.17.3</version>
	</dependency>

</dependencies>

</project>
