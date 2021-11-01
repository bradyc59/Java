public class Word
{
	public static String showLetters(String word, String seq)
	{
		String hangman = "";
		for(int i = 0; i < word.length(); i++)
		{
			{
				if(containsLetter(seq, word.charAt(i)))
				{
					hangman += word.substring(i, i+1);
				}
				else
				{
					hangman += "_";
				}
			}
		}
		return hangman;
	}


	public static boolean containsLetter(String word, char c)
	{
		boolean check = false;

		for(int i = 0; i < (word.length()); i++)
		{
			if(word.charAt(i) == c)
			{
				check = true;
			}
		}
		return check;
	}
}
