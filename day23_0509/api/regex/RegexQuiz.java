package day23_0509.api.regex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz {

	public static void main(String[] args) {

		/* 
		 * 가격 형식은 번부 찾아서 순서대로 출력
		 */
		
		String str = "안녕하세요? 점심은 4,500원 인데요. 커피가 무려 1600원 이에요. 디저트는 무려 14000원이나 한답니다";
		
		String pattern = "\\d+,*\\d+원";
		
//		Pattern p = Pattern.compile(pattern);
//		Matcher m = p.matcher(str);
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
		
	}

}
