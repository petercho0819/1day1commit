package lotto;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
	      
	      /* 로또번호 6개 자동 생성기 */
	      int[] lotto = new int[6];
	      
	      /* 중복값이 발생하지 않으면서 난수들을 배열에 쌓는 작업 */
	      for(int i = 0 ; i < lotto.length ; i++) {

	         int random = (int)(Math.random()*45) + 1;
	         lotto[i] = random;
	         
	         /* 중복 제거 */
	         for(int j = 0 ; j < i ; j++) {
	            if(lotto[i] == lotto[j]) {
	               i--;
	            }
	         }   
	      }
	      
	      /* 순차정렬을 통한 오름차순 정렬 */
	      for(int i = 0 ; i < lotto.length ; i++) {
	         int temp = 0;
	         for(int j = 0 ; j < i ; j++) {
	            if(lotto[i] < lotto[j]) {
	               temp = lotto[i];
	               lotto[i] = lotto[j];
	               lotto[j] = temp;
	            }
	         }
	      }
	      
	      /* 순차정렬을 통한 내림차순 정렬 */
	      for(int i = 0 ; i < lotto.length ; i++) {
	         int temp = 0;
	         for(int j = 0 ; j < i ; j++) {
	            if(lotto[i] > lotto[j]) {
	               temp = lotto[i];
	               lotto[i] = lotto[j];
	               lotto[j] = temp;
	            }
	         }
	      }
	      
	      System.out.println("추출 결과 : " + Arrays.toString(lotto));   
	  
	
	}
	
}

