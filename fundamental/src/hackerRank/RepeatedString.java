package hackerRank;

public class RepeatedString {
	public static long repeatedString(String s, long n) {
		long strLength = s.length();
		long q = 0, r = 0;
		q = n / strLength;
		r = n % strLength;
		long partialStrLen = (r == 0) ? 0 : r;
		long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
		return aCount;
	}

	public static long getLetterCount(String s, long strLength) {
		long count = 0;
		for (int i = 0; i < strLength; i++) {
			if (s.charAt(i) == 'a')
				count++;

		}
		return count;
	}

	public static void main(String args[]) {
		RepeatedString rs = new RepeatedString();

		System.out.println(rs.repeatedString("aba", 10));
	}
}
