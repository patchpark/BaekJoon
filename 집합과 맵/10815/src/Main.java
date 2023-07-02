import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


// https://www.acmicpc.net/problem/10815

//
//	�ð��ʰ�
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		for(int i=0; i<num; i++) {
//			arr.add(sc.nextInt());
//		}
//		
//		int num2 = sc.nextInt();
//		
//		int[] arr2 = new int[num2];
//		
//		for(int i=0; i<num2; i++) {			
//			if(arr.contains(sc.nextInt())) {
//				arr2[i] = 1;
//			}else {
//				arr2[i] = 0;
//			}
//		}
//		
//		for(int i=0; i< num2; i++) {
//			System.out.print(arr2[i]+" ");
//		}
//		
//	}
//	
//	
//	
//}

// �̺� Ž��
public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
 
        int num = Integer.parseInt(br.readLine()); // ī���� ����
        int[] arr = new int[num];
 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
 
        Arrays.sort(arr); // �̺�Ž���� �迭�� ���ĵǾ� �־�� ��.
        
        int num2 = Integer.parseInt(br.readLine());
        
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < num2; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(arr, num, temp) + " ");
        }
        
        System.out.println(sb);
        
	}
	
	public static int binarySearch(int[] arr, int num, int target) {
		int first = 0;
		int last = num-1;
		int mid = 0;
		
		while(first <= last) {
			mid = (first+last) / 2;
			
			if(arr[mid] == target) {
				return 1;
			}
			
			if(arr[mid] < target) {
				first = mid+1;
			}else {
				last = mid-1;
			}
			
		}
		return 0;
		
	}
	
	
}



























