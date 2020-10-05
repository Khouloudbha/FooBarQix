package kata;

import org.junit.Test;

import static org.junit.Assert.*;
import static kata.FooBarQix.getFooBarQix;

public class FooBarQixTest {
	
	
	@Test
	public void should_divisible_by_3()
	{
		int input = 9;
		String output = getFooBarQix(input);
		String expectedOutput = "Foo";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_divisible_by_5_contain_0()
	{
		int input = 10;
		String output = getFooBarQix(input);
		String expectedOutput = "Bar*";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_divisible_by_7()
	{
		int input = 14;
		String output = getFooBarQix(input);
		String expectedOutput = "Qix";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_not_divisible()
	{
		int input = 1;
		String output = getFooBarQix(input);
		String expectedOutput = "1";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_not_divisible_contains_3()
	{
		int input = 13;
		String output = getFooBarQix(input);
		String expectedOutput = "Foo";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_divisible_by_3_and_contains_3()
	{
		int input = 3;
		String output = getFooBarQix(input);
		String expectedOutput = "FooFoo";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_divisible_by_3_and_5_contains_5()
	{
		int input = 15;
		String output = getFooBarQix(input);
		String expectedOutput = "FooBarBar";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_divisible_by_5_contains_5()
	{
		int input = 5;
		String output = getFooBarQix(input);
		String expectedOutput = "BarBar";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_divisible_by_3_and_7()
	{
		int input = 21;
		String output = getFooBarQix(input);
		String expectedOutput = "FooQix";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_contains_5_and_3()
	{
		int input = 53;
		String output = getFooBarQix(input);
		String expectedOutput = "BarFoo";
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void should_not_divisible_contains_0()
	{
		int input = 101;
		String output = getFooBarQix(input);
		String expectedOutput = "1*1";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_divisible_by_3_contains_3_contains_0()
	{
		int input = 303;
		String output = getFooBarQix(input);
		String expectedOutput = "Foo*FooFoo";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_divisible_by_3_and_5_and_7_contains_5_contains_0()
	{
		int input = 105;
		String output = getFooBarQix(input);
		String expectedOutput = "FooBarQix*Bar";
		assertEquals(expectedOutput, output);
	}
	@Test
	public void should_divisible_by_3_and_7_contains_0()
	{
		int input = 10101;
		String output = getFooBarQix(input);
		String expectedOutput = "FooQix**";
		assertEquals(expectedOutput, output);
	}
}