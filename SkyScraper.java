package assigniii;

import java.util.Scanner;
import java.util.Stack;


public class SkyScraper {

	public static Stack<Integer> ss(Stack<Integer> input) {
		Stack<Integer> ts = new Stack<Integer>();
		while (!input.isEmpty()) {

			int tmp = input.pop();

			while (!ts.isEmpty() && ts.peek() > tmp) {
				input.push(ts.pop());
			}
			ts.push(tmp);
		}
		return ts;
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no. of floors in the building");
		int nf = sc.nextInt();

		Stack<Integer> input = new Stack<Integer>();
		for (int i = 1; i <= nf; i++) {
			System.out.println("Enter the floor size give on day " + i);
			int fs = sc.nextInt();
			input.add(fs);
			
		}
		Stack<Integer> ts = ss(input);
		System.out.println("The order of construction is as follows according to days:");
		while (!ts.empty()) { 
			System.out.print(ts.pop() + " ");
		}

	}
}
