import java.util.Scanner;

// https://www.acmicpc.net/problem/19532
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		int e =sc.nextInt();
		int f =sc.nextInt();
		
		
		if(a!=0 && d!=0) { // a d �Ѵ� 0�� �ƴϴ�.
			int y = (c*d-a*f)/(b*d-a*e);
			int x = (c - b*y) / a;
			System.out.println(x + " " + y);
		}else if(a==0) { // a d ���� �ϳ��� 0
			int y = c / b;
			int x = (f - e*y) / d;
			System.out.println(x + " " + y);
		}else if(d==0) {
			int y = f / c;
			int x = (c - b*y) / a;
			System.out.println(x + " " + y);
		}else { // �Ѵ� 0
			
		}
		
		
	}

}
