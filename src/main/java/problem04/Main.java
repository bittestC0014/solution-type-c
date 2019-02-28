package problem04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<String> question = new ArrayList<String>(); //문제
		ArrayList result = new ArrayList(); //채점표
		Scanner scanner = new Scanner(System.in);
		
		// 문제 생성
		for(int i = 1; i < 10; i++) {
			question.add(i + "x" + (new Random().nextInt(9) + 1));
			question.add(i + "x" + (new Random().nextInt(9) + 1));
		}
	
		// 문제 출제
		long start= System.currentTimeMillis(); // 시간측정 시작
		
		int i = 1;
		while(question.size() > 0) {
			int index = new Random().nextInt(question.size());
			
			String q = question.get(index);
			System.out.println("Q" + (i++) + ". " + q + " ?");
			int answer = scanner.nextInt();
			
			if(answer == 0) { // 답 체크
				
			}
			
			question.remove(index);
		}
		
		long end= System.currentTimeMillis(); // 시간측정 끝
		
		float time = (float)((end-start)/1000.0); // 걸린 시간

		
		
	}
	
	
	
}