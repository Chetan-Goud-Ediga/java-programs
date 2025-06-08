package com.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumOccurenace {
	
	
	public static void main(String[] args) {
		
		
		char arr[] = {'a','b','a','d','c','b','c','e'};
		
		//int arr[] = {1,2,2,3,4,4,3};
		int arr_size = arr.length;
		
		HashMap<Character,Integer> frequency = findRepeating( arr,arr_size);
		
		for(Map.Entry<Character, Integer> entry : frequency.entrySet()){
			
					
				
				System.out.println(entry.getKey()+"    "+entry.getValue());
			
			
			
		}			
			
		}
	static HashMap<Character,Integer> findRepeating(char[] arr, int size){
		
		HashMap<Character, Integer> frequency = new HashMap<Character,Integer>();
		
		for(int i=0;i<size;i++) {
			
			if(frequency.containsKey(arr[i])) {
				
				frequency.put(arr[i], frequency.get(arr[i])+1);
				
			}else {
				
				frequency.put(arr[i], 1);
				
			}
			
			
		}
		
		
		return frequency;
				
				
		
	}

}
