/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
    	ArrayList<ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();
    	
    	if(A.size()==0){
    		sol.add(new ArrayList<Integer>());
    		return sol;
    	}
    	Collections.sort(A);
    	ArrayList<Integer> subset = new ArrayList<Integer>();
    	int index=0;
    	util(sol,A,subset,index);

    for(ArrayList<Integer> e: sol){
    	System.out.println(e);
    }
    
    	return sol;
    }
    
    public static void util(ArrayList<ArrayList<Integer>> sol, ArrayList<Integer> A,ArrayList<Integer> subset, int index){
    	sol.add(new ArrayList<Integer>(subset));
    	for(int i=index;i<A.size();i++){
    		subset.add(A.get(i));
    		util(sol,A,subset,i+1);
    		subset.remove(subset.size()-1);
    	}
    	return;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> A=new ArrayList<Integer>();
		A.add(15);
		A.add(20);
		A.add(12);
		A.add(19);
		A.add(4);
		ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
		B=subsets(A);
		System.out.println("Printing B");
		for(int i=0;i<B.size();i++){
				System.out.println(B.get(i));

		}
	}
}
