import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;

public class TimeFiles
{
	 public static void main(String[] args) throws FileNotFoundException 
		   {
              StopWatch watch = new StopWatch();
              watch.start();
		      Set<String> documentHashWords = readHashWords("war-and-peace.txt");
              watch.stop();
              System.out.println("HashSet elapsed time: " + watch.getElapsedTime());
              StopWatch watchTree = new StopWatch();
              watch.start();
		      Set<String> documentTreeWords = readTreeWords("war-and-peace.txt");
              watch.stop();
              System.out.println("TreeSet elapsed time: " + watch.getElapsedTime());
		      // Print all words that are in the document but not the dictionary


		   }

		   /**
		      Reads all words from a file.
		      @param filename the name of the file
		      @return a set with all lowercased words in the file. Here, a 
		      word is a sequence of upper- and lowercase letters.
		   */
		   public static Set<String> readHashWords(String filename)
		      throws FileNotFoundException
		   {
		      Set<String> words = new HashSet<String>();
		      Scanner in = new Scanner(new File(filename));
		      // Use any characters other than a-z or A-Z as delimiters
		      in.useDelimiter("[^a-zA-Z]+");
		      while (in.hasNext())
		      {
		         words.add(in.next().toLowerCase());        
		      }
		      return words;
		   }
		   public static Set<String> readTreeWords(String filename)
				      throws FileNotFoundException
				   {
				      Set<String> words = new TreeSet<String>();
				      Scanner in = new Scanner(new File(filename));
				      // Use any characters other than a-z or A-Z as delimiters
				      in.useDelimiter("[^a-zA-Z]+");
				      while (in.hasNext())
				      {
				         words.add(in.next().toLowerCase());        
				      }
				      return words;
		}
}

