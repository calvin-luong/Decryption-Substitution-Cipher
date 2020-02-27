import java.util.Arrays;

public class Decypher {

	public static void main(String args[])
	{
		int[] frequency = new int[26];
		String input = "PBFPVYFBQXZTYFPBFEQJHDXXQVAPTPQJKTOYQWIPBVWLXTOXBTFXQWAXBVCXQWAXFQJVWLEQNTOZQGGQLFXQWAKVWLXQWAEBIPBFXFQVXGTVJVWLBTPQWAEBFPBFHCVLXBQUFEVWLXGDPEQVPQGVPPBFTIXPFHXZHVFAGFOTHFEFBQUFTDHZBQPOTHXTYFTODXQHFTDPTOGHFQPBQWAQJJTODXQHFOQPWTBDHHIXQVAPBFZQHCFWPFHPBFIPBQWKFABVYYDZBOTHPBQPQJTQOTOGHFQAPBFEQJHDXXQVAVXEBQPEFZBVFOJIWFFACFCCFHQWAUVWFLQHGFXVAFXQHFUFHILTTAVWAFFAWTEVOITDHFHFQAITIXPFHXAFQHEFZQWGFLVWPTOFFA";
		input = input.toLowerCase();
		//Counts frequency
		countLetters(input, frequency);
		int[] sortedFrequency = frequency.clone();
		Arrays.sort(sortedFrequency);
		System.out.println(Arrays.toString(frequency));
		System.out.println(Arrays.toString(sortedFrequency));
		int charPosition = 0;
		String[] englishLetterFrequency = new String[]{"z", "q", "j", "x", "k", "v", "b", "y", "w", "g", "p", "f", "m", "u", "c", "d", "l", "h", "r", "s", "n", "i", "o", "a", "t", "e"};
		System.out.println(Arrays.toString(englishLetterFrequency));
		//Grabs the char
		for (int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			// Frequency of the char
			int frequencyValue = frequency[c - 97];
			//Looks for the position of the char's frequency on the sorted array
			for (int j = 0; j < sortedFrequency.length; j++)
			{
				//Grabs position of the of found frequency to match with the englishLetterFrequency array
				if (sortedFrequency[j] == frequencyValue)
				{
					charPosition = j;
					break;
				}
			}
			//Grabs the character from the statistically gathered letter frequency by looking
			// at charPosition
			String newChar = englishLetterFrequency[charPosition];
			
			//Replaces the char
			input = input.substring(0, i) + newChar + input.substring(i + 1);
		}
		System.out.println("PBFPVYFBQXZTYFPBFEQJHDXXQVAPTPQJKTOYQWIPBVWLXTOXBTFXQWAXBVCXQWAXFQJVWLEQNTOZQGGQLFXQWAKVWLXQWAEBIPBFXFQVXGTVJVWLBTPQWAEBFPBFHCVLXBQUFEVWLXGDPEQVPQGVPPBFTIXPFHXZHVFAGFOTHFEFBQUFTDHZBQPOTHXTYFTODXQHFTDPTOGHFQPBQWAQJJTODXQHFOQPWTBDHHIXQVAPBFZQHCFWPFHPBFIPBQWKFABVYYDZBOTHPBQPQJTQOTOGHFQAPBFEQJHDXXQVAVXEBQPEFZBVFOJIWFFACFCCFHQWAUVWFLQHGFXVAFXQHFUFHILTTAVWAFFAWTEVOITDHFHFQAITIXPFHXAFQHEFZQWGFLVWPTOFFA");
		System.out.println(input);
	}
	
	// Counts the freq
	public static void countLetters(String input, int[] array)
	{
		input = input.toLowerCase();
		for(int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			array[c - 97]++;
		}
	}
}
