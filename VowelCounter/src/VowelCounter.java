
public class VowelCounter {

	private String sentence;
	private int vowelCount = 0;
	
	public VowelCounter(String sentence) {
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public int getVowelCount(String sentence) {
		
		vowelCount = countVowels(sentence); 
		
		return vowelCount;
	}
	
	private int countVowels(String str) { // implement Linear Search Algorithm
		char[] vowelsArr = {'a', 'e', 'i', 'o', 'u'}; 
		char[] getSentence = str.toLowerCase().toCharArray();
		int count=0;
		for (int i=0; i < getSentence.length; i++)  {
			for (int j=0; j < vowelsArr.length; j++) { 
				if (getSentence[i] == vowelsArr[j]) {
					count++; // count every vowels found on sentence
				}
			}
		}
		return count;
	}
	
}
