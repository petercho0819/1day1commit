package problem5;

import java.util.Collection;
import java.util.HashSet;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요
//		이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
//		
//				김씨와 이씨는 각각 몇 명 인가요?
//				"이재영"이란 이름이 몇 번 반복되나요?
//				중복을 제거한 이름을 출력하세요.
//				중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
		
		
		/* 접근 방법
		 * 1. String 값에 담는다
		 * 2. 배열에 split을 통해 ','를 기준으로 나눠서 담는다
		 * 
		 * 1번 질문
		 * 3. 이재영과 동일한 이름을 for문을 통해 찾는다
		 * 4. 이재영이 있을시만 count한다
		 * 
		 * 2번 질문 (중복값 제거)
		 * 1. 이름 전체를 카운트 한다.
		 * 2. 중복이름이 있으면 제거 한다.
		 * 3. 
		 */
		String nameInput = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] name = nameInput.split(",");
		
		
		int count_leejy = 0;	//이재영의 이름 수
		int count_kim = 0;
		int countlee = 0;
		
		for (int i = 0; i < name.length; i ++ ) {
			
			if(name[i].equals("이재영")) {
				count_leejy ++;
			}
			
			if(name[i].startsWith("김")) {
				
				count_kim++;
			}
			
			if(name[i].startsWith("이")) {
				
				countlee++;
			}
		}
		
		System.out.println("이재영의 이름은 총 " + count_leejy + "명입니다.");
		System.out.println("김씨는 총 " + count_kim + "명 입니다.");
		System.out.println("이씨는 총 " + countlee + "명 입니다.");
		
		
		
		HashSet<String> set = new HashSet<String>();
        for(int i = 0; i <name.length; i++) {
        	
        	set.add(name[i]);
        }
        
        System.out.println(set);
        
//        Iterator<String> iter = set.iterator();
       
        
//        System.out.println("오름차순 : " + iter);
        
        
        
	}
}




























