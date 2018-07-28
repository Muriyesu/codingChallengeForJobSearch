package problem2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingByScore {
	
	static String[] sortWordsByScore(String[] words) {

		Arrays.sort(words, new CompareWordsScore());

		return words;
	}

	static class CompareWordsScore implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			Integer s1Score = computeScore(s1);
			Integer s2Score = computeScore(s2);
			return s1Score.compareTo(s2Score);
		}
	}

	private static int computeScore(String str) {

		int score = 0;
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

		for (char c : str.toLowerCase().toCharArray()) {
			if (vowels.contains(c)) {
				score += ((c - 'a') + 1) * 2;
			} else {
				score += (c - 'a') + 1;
			}
		}
		return score;
	}

	public static void main(String[] args) {

		String[] words = { "abana", "ferdis", "kaka", "zuzuzu", "peter", "Zmakuru" };
		sortWordsByScore(words);
		for (String s : words) {
			System.out.println(s + " " + computeScore(s));
		}

	}

}
