package lisrecursive;

import java.util.ArrayList;

public class LisRecursive {

	static int max_ref; 


	static int _lis(ArrayList<Integer> arr, int size) {
		
		if (size == 1)
			return 1;

		
		int res, max_ending_here = 1;

		
		for (int i = 1; i < size; i++) {
			res = _lis(arr, i);
			if (arr.get(i - 1) < arr.get(size - 1) && res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		
		return max_ending_here;
	}

	
	public int lis(ArrayList<Integer> arr, int size) {
		
		max_ref = 1;

		
		_lis(arr, size);

		
		return max_ref;
	}
	
}
