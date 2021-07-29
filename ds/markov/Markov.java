import java.util.*;

public class Markov
{
	private Hashtable<String, Hashtable> chain;
	
	public Markov()
	{
		chain = new Hashtable<String, Hashtable>();
	}
	
	public void addChain(String word, String follows)
	{
		Hashtable<String, Integer> wordChains = chain.get(word);
		System.out.println("Adding " + word + " " + follows);
		if(wordChains == null)
		{
			wordChains = new Hashtable<String,Integer>();
			wordChains.put(follows, 1);
			chain.put(word, wordChains);
		}
		else
		{
			int newCount = 1;

			if(wordChains.get(follows) != null)
			{
				//System.out.println("incrementing word " + word + " Follows " + wordChains.get(follows));
				newCount = wordChains.get(follows) + 1;
			}
			wordChains.put(follows, newCount);
		}
	}
	
	public void createChain(String text)
	{
		String[] words = text.split(" ", -1);
		for(int i = 0; i < words.length - 1; i++)
		{
			//removing punctuation source: https://www.delftstack.com/howto/java/how-to-remove-punctuation-from-string-in-java/
			//String result = str.replaceAll("\\p{Punct}", "");
			String word = words[i].replaceAll("\\p{Punct}", "");
			String follows = words[i+1].replaceAll("\\p{Punct}", "");
			addChain(word, follows);
		}
	}
	
	public String toString()
	{
		return chain.toString();
	}
}