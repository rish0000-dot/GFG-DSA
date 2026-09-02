class Solution {
	static int closestNumber(int n, int m) {
		// code here
		int low = n;
		int up = n;
		for (int i = n; ; i--) {
			if (i%m == 0) {
				low = i;
				break;
			}
		}
		for (int i = n; ; i++) {
			if (i%m == 0) {
				up = i;
				break;
			}
		}
		int d1 = Math.abs(n - low);
		int d2 = Math.abs(n - up);
		
		if (d1<d2) {
			return low;
		} else if(d2<d1) {
			return up;
		}else{
		    return Math.abs(low) > Math.abs(up) ? low : up;
		}
	}
	
}
