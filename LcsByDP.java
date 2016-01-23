/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LcsByDP
{
	public static int DpLCS(char[] x, char[] y, int n, int m)
	{
		int[][] dp = new int[n+1][m+1];
		for(int i=0;i<=n;i++)
		for(int j=0;j<=m;j++)
		{
		if(i==0 || j==0)
		dp[i][j]=0;
		else if(x[i-1]==y[j-1])
		dp[i][j]=1+dp[i-1][j-1];
		else
		dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		}
		return dp[n][m];
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
	
	char s[] = {'s','h','r','e','y','c','h','a','u'};
		char r[] = {'r','y','a','s'};
		int x=s.length;
		int y=r.length;
		System.out.println(DpLCS(s,r,x,y));
	}
}