import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2751

public class Main {	
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		// list �迭 �� �ϳ��� ���� �ȴ�.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list); // �ð� ���⵵ n * logn
		
		for(int i : list) {
			sb.append(i).append('\n'); // ���ڿ� ó�� �ð� ����
		}
		System.out.println(sb);
	}
}