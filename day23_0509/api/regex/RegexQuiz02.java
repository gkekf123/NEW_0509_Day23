package day23_0509.api.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {

		String str = "123123-1231231 GS25(치킨마요) 4,400원";		
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";
		
		String pattern1 = "\\d+-\\d+";		// \\d{6}-\\d{7} / 내 코드 맞음 - \\d+-\\d+
		String pattern2 = "[A-Z]+\\d+";		// [A-Za-z]+25 or GS25 / 내 코드 맞음 - [A-Z]+\\d+
		String pattern3 = "\\([가-힣0-9]+\\)";		// \\([가-힣0-9]+\\) / 내 코드 틀림 - \\([가-힣]*\\d+[가-힣]\\)
		String pattern4 = "\\d+,\\d+원";	// [0-9,]+원
		
		List<String> list = Arrays.asList(str, str2);
		
		for(String s : list) {
			Matcher p1 = Pattern.compile(pattern1).matcher(s);
			Matcher p2 = Pattern.compile(pattern2).matcher(s);
			Matcher p3 = Pattern.compile(pattern3).matcher(s);
			Matcher p4 = Pattern.compile(pattern4).matcher(s);
			
			if(p1.find() && p2.find() && p3.find() && p4.find()) {
				System.out.println(p1.group());
				System.out.println(p2.group());
				System.out.println(p3.group());
				System.out.println(p4.group());
			}
		}

	}

}
