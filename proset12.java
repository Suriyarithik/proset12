# proset12
import java.io.*;
import java.util.*;
public class proset12
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first Number");
int n1=Integer.parseInt(br.readLine());
System.out.println("Enter the second Number");
int n2=Integer.parseInt(br.readLine());
System.out.println(n1!=n2);
}
}
