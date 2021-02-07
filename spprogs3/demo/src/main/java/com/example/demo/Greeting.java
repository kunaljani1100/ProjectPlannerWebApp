package com.tutorialspoint.demo;
import java.lang.Math;

public class Greeting {

  private long id;
  private String content;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = encryptString(content);
  }
  
  public String encryptString(String str)
	{
		//We remove all the white spaces from the string.
		StringBuilder stringBuilder=new StringBuilder(str.replaceAll("\\s",""));
		//We define the number of rows and columns in the string.
		int rows,cols;
		rows=((int)Math.sqrt(stringBuilder.length()))+1;
		cols=rows;
		
		//We will define the encrypted string as a new stringbuilder object.
		StringBuilder encryptedString=new StringBuilder();
		
		//We will iterate through the stringbuilder object from 0 to rows.
		//Another iterator will jump through the stringbuilder object.
		int i=0;
		while(i<rows)
		{
			int j=i;
			while(j<stringBuilder.length())
			{	
				encryptedString.append(stringBuilder.charAt(j));
				j+=cols;
			}
			encryptedString.append(' ');
			i+=1;
		}
		
		//Finally, we will return the encrypted string.
		return encryptedString.toString();
	}

}