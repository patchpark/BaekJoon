import java.util.Scanner;

// https://www.acmicpc.net/problem/11653

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(num != 1) {
			for(int i = 2; i<=num; i++) {
				if(num%i == 0) {
					System.out.println(i);
					num = num / i;
					break;
				}
			}
		}
		
	}
	
}
