package CN21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
		File file = new File("/Users/kanishk/eclipse-workspace/APITesting/src/discover.txt");
		FileInputStream fis= new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader bufferedReader = new BufferedReader(isr);
		
		String line;
        int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        int whiteSpaceCount = 0;
        int sentenceCount = 0;
  
        while((line=bufferedReader.readLine())!=null)
        {
        	if(line.equals(""))
        	{
        		paraCount+=1;
        	}
        
        	else
        	{
        	characterCount=characterCount+line.length();
        	String[] words=line.split(" ");
        	wordCount=wordCount+words.length;
        	whiteSpaceCount=whiteSpaceCount+wordCount-1;
        	String[] sentence=line.split("[!?.:]+");
        	sentenceCount=sentenceCount+sentence.length;
        	}
        }
        
        if(sentenceCount>=1)
        	paraCount++;
        	
        
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of sentences = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Number of paragraphs = "+ paraCount);
        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
		
		

	}

}
