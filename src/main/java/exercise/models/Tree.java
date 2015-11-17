package exercise.models;

public class Tree {
	public int s;
	public Tree l;
	public Tree r;

	public Tree(int value, Tree left, Tree right) {
		s = value;
		l = left;
		r = right;
	}
}