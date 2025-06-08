package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

class RemoveRepetaedValues {

	public static void main(String[] args) {
		String s = "Hello India";
		s = s.toLowerCase().replace("\s", "");
		boolean b = false;
		Set<Character> hs = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			b = hs.add(s.charAt(i));
			if (!b)
				hs.remove(s.charAt(i));

		}

		System.out.println(hs);

	}

}
