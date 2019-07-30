
package com;
public class StringCalculator {
	public int Add(String numbers) {
		int sum = 0;
		if(numbers.isEmpty() == false) {
			String[] numberList = numbers.split(",|\n");
			for(String num : numberList) {
				sum += Integer.parseInt(num);
			}
		}
		return sum;
	}
}
