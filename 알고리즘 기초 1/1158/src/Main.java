import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


// https://www.acmicpc.net/problem/1158

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] a = br.readLine().split(" ");
		
		int N = Integer.parseInt(a[0]);
		int K = Integer.parseInt(a[1]);
		
		
		sb.append("<");
		
		Queue<Integer> q = new LinkedList<>();

		for(int i=1; i<=N; i++) {
			q.offer(i);
		}
		
		while(q.size() != 1) {
			for(int i=0; i<K-1; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()+", ");
		}
		
				
		sb.append(q.poll()+">");
		
		System.out.println(sb);
	}
	
}
