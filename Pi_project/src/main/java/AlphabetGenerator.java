import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AlphabetGenerator {
	/**
	 * Given a numeric base, return a char[] that maps every digit that is
	 * representable in that base to a lower-case char.
	 * 
	 * This method will try to weight each character of the alphabet
	 * proportional to their occurrence in words in a training set.
	 * 
	 * The letters should occur in lexicographically ascending order in the
	 * returned array. - {"a", "b", "c", "c", "d"} is a valid output. - {"b",
	 * "c", "c", "d", "a"} is not.
	 * 
	 * If base >= 0, the returned array should have length equal to the size of
	 * the base.
	 * 
	 * If base < 0, return null.
	 * 
	 * If a String of trainingData has any characters outside the range a-z,
	 * ignore those characters and continue.
	 * 
	 * @param base
	 *            A numeric base to get an alphabet for.
	 * @param trainingData
	 *            The training data from which to generate frequency counts.
	 *            This array is not mutated.
	 * @return A char[] that maps every digit of the base to a char that the
	 *         digit should be translated into.
	 */
	public static char[] generateFrequencyAlphabet(int base,
			String[] trainingData) {
		if (base < 0) {
			return null;
		}
		if (base == 0) {
			char[] emptyRes = {};
			return emptyRes;
		}
		int characterCount = 0;
		Map<Character, Integer> cMap = new HashMap<Character, Integer>();
		for(int i = 0; i < trainingData.length;i++){
			char[] charArray = trainingData[i].toCharArray();
			for(int j = 0; j < charArray.length;j++){
				char letter = charArray[j];
				if (Character.isLetter(letter)) {
					characterCount += 1;
					char letterToLower = Character.toLowerCase(letter);
					if (cMap.containsKey(letterToLower)) {
						cMap.put(letterToLower, cMap.get(letterToLower) + 1);
					} else {
						cMap.put(letterToLower, 1);
					}
				}
			}
		}

		Character[] keys = cMap.keySet().toArray(new Character[0]);
		Arrays.sort(keys);
		Map<Character, Float> charFrequencyMap = new HashMap<Character, Float>();
		for(int i = 0; i < cMap.size();i++){
			charFrequencyMap.put(keys[i],(float)cMap.get(keys[i])/characterCount);
		}
		Map<Character, Float> cumulativeProbability = new HashMap<Character, Float>();
		float cumProbtoAdd = 0;
		for(int i = 0; i < keys.length;i++){
			cumProbtoAdd += charFrequencyMap.get(keys[i]);
			cumulativeProbability.put(keys[i],cumProbtoAdd*base);
		}
		String result = "";
		int end = 0;
		for(int i = 0; i < keys.length; i++){
			for(int j = end; j < (int)Math.ceil(cumulativeProbability.get(keys[i])); j++){
				result += keys[i];
			}
			end = (int)Math.ceil(cumulativeProbability.get(keys[i]));
		}
		return result.toCharArray();
	}
}
