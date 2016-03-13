package bai14;

public class Program {

	public static void main(String[] args) {
		int n = 20;
		int[][] arr = new  int[n][];
		
		for(int i = 0; i < n; i++){
			arr[i] = new int[i + 1];
			
			for(int j = 0; j <= i; j++){
				if(j == 0 || j == i)
					arr[i][j] = 1;
				else{
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");	
		}
	
	}

}
