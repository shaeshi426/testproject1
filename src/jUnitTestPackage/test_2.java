package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_2 {

	@Test
	public void test() {
		jUnitTestPackage.jUnitfunction j = new jUnitTestPackage.jUnitfunction();
		j.AddStrings("Hello ", "World");
	}

}
