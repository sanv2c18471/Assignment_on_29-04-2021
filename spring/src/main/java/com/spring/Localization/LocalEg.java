package com.spring.Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalEg {
  public static void main(String[] args) {
	/*Locale locale= Locale.getDefault();
	System.out.println(locale.getDisplayCountry());
	System.out.println(locale.getDisplayLanguage());
	System.out.println(locale.getDisplayName());
	System.out.println(locale.getISO3Country());
	System.out.println(locale.getISO3Language());
	System.out.println(locale.getLanguage());
	System.out.println(locale.getCountry());*/
	
	String language="en";
	String country="US";
	Locale ls =new Locale(language,country);
	ResourceBundle rb=ResourceBundle.getBundle("com.spring.Localization/Bundle",ls);
	String str=rb.getString("good.morning.message");
	System.out.println(str);
	
	String language1="ge";
	String country1="GE";
	Locale ls1 =new Locale(language1,country1);
	ResourceBundle rb1=ResourceBundle.getBundle("com.spring.Localization/Bundle",ls1);
	String str1=rb1.getString("good.morning.message");
	System.out.println(str1);
	
	
	}

}
