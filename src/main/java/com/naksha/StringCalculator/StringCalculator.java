package com.naksha.StringCalculator;

public class StringCalculator {

	public static Integer Add(String string) {
		int sum = 0;
		// TODO Auto-generated method stub
		if(string=="") {
			return 0;
		}
		else if(string.length()==1){
			return Integer.parseInt(string);
		}else {
			String[] line = string.split(",");
			
			for(int i=0;i<line.length;i++) {
				sum+=Integer.parseInt(line[i]);
			}
		}
		return sum;
	}

}
