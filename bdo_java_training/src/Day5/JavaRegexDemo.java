package Day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UrlValidation{
	private static final String urlpattern = "((http|https)://)(www.)?[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%._\\+~#?&//=]*)";
	private static final Pattern pattern = Pattern.compile(urlpattern);
	public static boolean isValid(String url) {
		Matcher matcher = pattern.matcher(url);
		return matcher.matches();
	}
}
public class JavaRegexDemo {

	public static void main(String[] args) {
		boolean result = UrlValidation.isValid("https://www.javatpoint.com/");
		System.out.println(result);

	}

}
