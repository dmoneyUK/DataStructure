package exercise.data.structure;

import java.util.ArrayList;
import java.util.List;

import exercise.models.Tree;

public class MaxDiffTree {

	private List<Integer> path = new ArrayList<Integer>();
	int amp = 0;

	public MaxDiffTree() {

	}

	public int solution(Tree T) {

		path.add(T.s);

		if (T.l == null && T.r == null) {
			int max = findMaxDiff(path);
			if (max > amp) {
				amp = max;
			}
			path.remove(path.size() - 1);
			return amp;
		} else {
			if (T.l != null) {
				solution(T.l);
			}
			if (T.r != null) {
				solution(T.r);
			}
		}

		return amp;
	}

	private int findMaxDiff(List<Integer> path) {
		int max = path.get(0);
		int min = path.get(0);
		for (int i : path) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		return max - min;
	}

}
