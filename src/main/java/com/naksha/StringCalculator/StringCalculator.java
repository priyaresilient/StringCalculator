package com.naksha.StringCalculator;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {

	public static Integer Add(String string) {
		int sum = 0;
		// TODO Auto-generated method stub
		if(string=="") {
			return 0;
		}
		else {
			String delim = "\n|,";
			
			if(string.startsWith("//")) {
				String[] parts = string.split("\n",2);
				delim=parts[0].substring(2);
				string = parts[1];
			}
			
			String[] input = string.split(delim);
			for(int i=0;i<input.length;i++) {
				if(Integer.parseInt(input[i])<0) {
					
					throw new IllegalArgumentException();
					
				}
				sum+=Integer.parseInt(input[i]);
			}
			return sum;
		}
		
	}

}
