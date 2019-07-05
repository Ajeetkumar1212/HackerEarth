import java.io.*;
public class stringlen {

public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;

//System.out.println("Enter String:");
str=br.readLine();

int len=str.length();

int temp=len;
int i=0,cout=0;
while(len>0)
{
if(str.charAt(i)==str.charAt(len-1))
{
cout++;

}

len--;
i++;
}
if(cout==temp)
{
System.out.println("string is palindrom");
} 
else
{
System.out.println("NOT AT ALL");
}

}

}