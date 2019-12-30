/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a,int b) {
    	ArrayList<Integer> A=a;
    	int B=b;
    	HashSet<ArrayList<Integer>> sol = new HashSet<ArrayList<Integer>>();
    	ArrayList<ArrayList<Integer>> sol1=new ArrayList<ArrayList<Integer>>();
    	
    	if(A.size()==0 || B==0){
    		sol1.add(new ArrayList<Integer>());
    		return sol1;
    	}
    	Collections.sort(A);
    	ArrayList<Integer> subset = new ArrayList<Integer>();

    	int index=0;
    	util(sol,A,subset,index,B);


		sol1=new ArrayList<ArrayList<Integer>>(sol);
    
    	return sol1;
    }
    
    public static int Sumset(ArrayList<Integer> A){
    	int sum=0;
    	for(int i=0;i<A.size();i++){
    		sum+=A.get(i);
    	}
    	return sum;
    }
    
    public static void util(HashSet<ArrayList<Integer>> sol, ArrayList<Integer> A,ArrayList<Integer> subset, int index,int B){
    	if(Sumset(subset)==B){
    		    	sol.add(new ArrayList<Integer>(subset));
    	}


    	for(int i=index;i<A.size();i++){
    		subset.add(A.get(i));
    		util(sol,A,subset,i+1,B);
    		subset.remove(subset.size()-1);
    	}
    	return;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> A=new ArrayList<Integer>();
		A.add(10);
		A.add(1);
		A.add(2);
		A.add(7);
		A.add(6);
		A.add(1);
		A.add(5);
		Solution solution = new Solution();
		ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
		B=solution.combinationSum(A,8);
		System.out.println("Printing B");
		for(int i=0;i<B.size();i++){
				System.out.println(B.get(i));

		}
	}
}
