package exercise.data.structure;

import org.junit.Before;
import org.junit.Test;

import exercise.models.Tree;

public class SolutionTest {

	private MaxDiffTree solution;
	Tree t1 = new Tree(12, null, null);
	Tree t2 = new Tree(7, null, null);
	Tree t3 = new Tree(13, null, null);
	Tree t4 = new Tree(6, t1, t2);
	Tree t5 = new Tree(1, null, t3);
	Tree t6 = new Tree(4, null, null);
	Tree t7 = new Tree(5, null, null);
	Tree t8 = new Tree(3, t4, t5);
	Tree t9 = new Tree(7, t6, t7);
	Tree top = new Tree(2, t8, t9);

	int result = 0;

	@Before
	public void setUp() {
		this.solution = new MaxDiffTree();

	}

	@Test
	public void testSolution() {

		result = this.solution.solution(top);
		System.out.println(result);
	}

}
