import java.util.*;

public class Markov
{
	private Hashtable<String, ArrayList> chain;
	
	public Markov()
	{
		chain = new Hashtable<String, ArrayList>();
	}
	
	public void addChain(String word, String follows)
	{
		ArrayList<String> wordChains = chain.get(word);
		System.out.println("Adding " + word + " " + follows);
		if(wordChains == null)
		{
			wordChains = new ArrayList<String>();
		}
		wordChains.add(follows);
		chain.put(word, wordChains);
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
	
	public String generate()
	{
		String text = "";
		Set<String> keys = chain.keySet();
		
		//choose a random key to start things off
		Object[] keyArray = keys.toArray();
		Random rand = new Random();
		int random = rand.nextInt(keyArray.length);
		Object key = keyArray[random];
		
		String result = (String)key;
		
		for(int i = 0; i < 10; i++)
		{
			ArrayList<String> wordChain = chain.get(key);
			System.out.println("key " + key + " chain " + wordChain);
			
			random = rand.nextInt(wordChain.size());
			result += " " + wordChain.get(random);
			
			key = wordChain.get(random);
			
		}
		return result;
		
	}
	public String toString()
	{
		return chain.toString();
	}
}