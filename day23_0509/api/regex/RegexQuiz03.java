package day23_0509.api.regex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class RegexQuiz03 {

	public static void main(String[] args) {

		/* 
		 * 1. 버퍼리더를 사용해서 건담.txt를 읽어온다
		 * 
		 * 2. 정규표현식을 이용해서 날짜, 지점, 등금, 내용, 가격을 패턴분석해서
		 * 	Product객체에 저장하고, 리스트에 저장
		 * 
		 * 3. 외부 라이브라리(POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록 기능
		 * 
		 * 4. 
		 */
		
		String path = "C:\\Users\\taeju\\eclipse-workspace\\JavaAPI\\src\\day23_0509\\api\\regex\\건담.txt";
		
		
		try(BufferedReader br = new BufferedReader((new FileInputStream(path))){
			
			String pattenr1 = "\\d{8}-\\d{2}-\\d+";
			String pattenr2 = "건담[베이스]\\s[가-힣]점";
			String pattenr3 = "\\[[A-Z가-힣]+\\]";
			String pattenr4 = "\\s";
			String pattenr5 = "\\d+,\\d+원";
			
			
			String str;	
			while((str = br.readLine()) != null) {
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
