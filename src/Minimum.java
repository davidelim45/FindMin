
public class Minimum {
	
	public static int findMin(int n1, int n2,int n3) {
		int min;
		if(n1<n2 && n1<n3)
			min = n1;
		else if (n2 < n3)
			min = n2;
		else 
			min = n3;
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println("minimum od dvata broja e:" + findMin(10,5,4));

	}

}
