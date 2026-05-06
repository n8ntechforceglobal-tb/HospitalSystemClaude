package com.Arth.controller;

import java.time.LocalDate;

//controller

public class check {
	
   public static void main(String[] args) {
	   
	   
	   LocalDate date = LocalDate.now();
	   
	 
	   
	   System.out.println(date.getYear()+ "-" +  date.getMonth().getValue() + "-" + date.getDayOfMonth() );
	
}
	
	
	

}
