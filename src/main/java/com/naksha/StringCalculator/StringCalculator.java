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
		else if(string.length()==1){
			return Integer.parseInt(string);
		}else {
			String delim="\n|,";
			Stream<String> input = Arrays.stream(string.split(delim));
			return input.mapToInt(Integer::parseInt).sum();
		}
		
	}

}
