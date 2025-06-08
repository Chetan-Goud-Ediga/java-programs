package com.interview.questions;

import java.util.HashMap;
import java.util.Map;

class stringOccureanceCount {

	public static void main(String[] args) {

		String[] str = { "java", "python", "Csharp", "VC++", "java", "VC++" };

		HashMap<String, Integer> m = new HashMap<String, Integer>();

		for (int i = 0; i < str.length; i++) {

			if (m.containsKey(str[i])) {

				m.put(str[i], m.get(str[i]) + 1);

			} else {

				m.put(str[i], 1);
			}

		}
		
		
		
		for(Map.Entry<String, Integer> x : m.entrySet()) {
			
			
			System.out.println(x.getKey()+"\t"+x.getValue());
		}

	}
}