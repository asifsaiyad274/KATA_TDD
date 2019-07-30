package com;
import spock.lang.Specification

class StringCalculatorSpec extends Specification {
	
	def objStringCalculator = new StringCalculator();
	
	def "API for String calculator" () {
		given:"Comma seperated String numbers"
		when:"StringCalculator .Add is called"
			def sum = objStringCalculator.Add(numbers);
		then:"It should run sum of numbers"
			sum == result
		where:"Given value is numbers"
		numbers | result
		""		|	0
		"1"		|	1
		"1,2"	|	3
		"1\n2,3"|	6
		
	}
}
