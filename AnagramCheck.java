package Febo;

public class AnagramCheck {

	public static boolean isAnagram(String word, String anagram)
	{
		if(word.length() != anagram.length())
		{
			return false;
			} 
		char[] chars = word.toCharArray();
		for(char c : chars)
		{
			int index = anagram.indexOf(c);
			if(index != -1)
			{
				anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
				}
			else
			{
				return false;
				}
			}
		return anagram.isEmpty(); 
		}
	
	public void testcheckAnagram()
	{
		assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
		assertTrue(AnagramCheck.isAnagram("b", "bbb")); 
		assertTrue(AnagramCheck.isAnagram("ccc", "ccccccc"));
		assertTrue(AnagramCheck.isAnagram("a", "a")); 
		assertTrue(AnagramCheck.isAnagram("sleep", "slep"));
		assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
		assertTrue(AnagramCheck.isAnagram("pure", "in"));
		assertTrue(AnagramCheck.isAnagram("fill", "fil"));
		}

	private void assertTrue(boolean anagram) {
		// TODO Auto-generated method stub
		
	}
	}

