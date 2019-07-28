package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import solver.HashSolverImpl;

public class Tests {
	
	HashSolverImpl solver = new HashSolverImpl();
//	Solver solver = new Solver();
	@Test
	public void testOne() {
		String path = "E";
		int result = 2;
		solver.reset();
		
		int output = solver.solve(path);
		assertEquals(result, output);
	}
	
	@Test
	public void testTwo() {
		String path = "NESO";
		int result = 4;
		solver.reset();
		
		int output = solver.solve(path);
		assertEquals(result, output);
	}
	
	@Test
	public void testThree() {
		String path = "NSNSNSNSNS";
		int result = 2;
		solver.reset();
		
		int output = solver.solve(path);
		assertEquals(result, output);
	}
	
	@Test
	public void testFour() {
		String path = "NESENESENESEONOSONOSONOS";
		int result = 13;
		solver.reset();
		
		int output = solver.solve(path);
		assertEquals(result, output);
	}
	
	@Test
	public void testFive() {
		String path = "NNNNNNNNNNNNNNEEEEEEEEEEEEEESSSSSSSSSSSSSSOOOOOOOOOOOOOO";
		int result = 56;
		solver.reset();
		
		int output = solver.solve(path);
		assertEquals(result, output);
	}
	
	@Test
	public void testSix() {
		String path = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN";
		int result = 101;
		solver.reset();
		
		int output = solver.solve(path);
		assertEquals(result, output);
	}
	
	@Test
	public void testSeven() {
		String path = "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
				+ "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
				+ "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
		int result = 301;
		solver.reset();
		
		int output = solver.solve(path);
		assertEquals(result, output);
	}
	
	@Test
	public void testEight() {
		String path = "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
				+ "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
				+ "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
				+ "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"
				+ "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"
				+ "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"
				+ "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"
				+ "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"
				+ "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE";
		int result = 601;
		solver.reset();
		
		int output = solver.solve(path);
		assertEquals(result, output);
	}

	@Test
	public void testNine() {
		String path = "";
		int result = 1;
		solver.reset();
		
		int output = solver.solve(path);
		assertEquals(result, output);
	}
}
