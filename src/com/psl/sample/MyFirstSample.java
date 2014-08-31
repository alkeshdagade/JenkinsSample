package com.psl.sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MyFirstSample {

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("I m inside before my first test");
  }
  
  @Test
  public void f() {
	  System.out.println("Inside my first test");
  }  

  @AfterTest
  public void afterTest() {
	  System.out.println("I m inside after my first test");
	  
  }

}
