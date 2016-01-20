import java.util.*;
import java.lang.*;
import java.io.*;


class LCSByRecursion
{
	
	public static int lcs(char[] a, char[] b, int x, int y)
	{
		if(x<0 || y<0)
		return 0;
		else if(a[x] == b[y])
		{
			return 1+lcs(a,b,x-1,y-1);
		}
		else
		{
			return Math.max(lcs(a,b,x-1,y),lcs(a,b,x,y-1));
		}
		
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		char s[] = {'A','G','G','T','A','B'};
		char r[] = {'G','X','T','X','A','Y','B'};
		int x=s.length-1;
		int y=r.length-1;
		System.out.println(lcs(s,r,x,y));
	
	}
}