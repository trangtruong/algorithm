package com.algorithm.demo.sum3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum3 {
	
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        //sort array
        Arrays.sort(num);
 
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> each = new ArrayList<Integer>();
        for(int i=0; i<num.length; i++){
            if(num[i] > 0) break;
 
            for(int j=i+1; j<num.length; j++){
                if(num[i] + num[j] > 0 && num[j] > 0) break;
 
                for(int k=j+1; k<num.length; k++){
                  if(num[i] + num[j] + num[k] == 0) {
 
                      each.add(num[i]);
                      each.add(num[j]);
                      each.add(num[k]);
                      result.add(each);
                      each.clear();
                  }
                }
            }
        }
 
        return result;
    }
}
