package com.naksha.StringCalculator;

public class StringCalculator {

	public static Integer Add(String string) {
		// TODO Auto-generated method stub
		if(string=="") {
			return 0;
		}
		else if(string.length()==1){
			return Integer.parseInt(string);
		}else {
			String[] line = string.split(",");
			int num1=Integer.parseInt(line[0]);
			int num2=Integer.parseInt(line[1]);
			return num1+num2;
		}
	}

}
