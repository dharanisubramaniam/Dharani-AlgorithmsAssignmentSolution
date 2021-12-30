package com.stockers.service;

import java.util.Arrays;

public class SearchStock {
	public void searchStock(double[] stockPriceArray,double keyValue) {
		//int result = binarySearch(stockPriceArray,keyValue);
		
		//using Arrays.binarySearch method
		
		int result = Arrays.binarySearch(stockPriceArray, keyValue);
		
		String res = result>=0?"present":"not found";
		System.out.println("Stock of value "+keyValue+" is "+res);
		
		
	}
	/*
	 * public int binarySearch(double[] stockPriceArray,double keyValue) { int first
	 * =0; int last = stockPriceArray.length-1; int mid=(first+last)/2;
	 * while(first<=last) {
	 * 
	 * if(stockPriceArray[mid]==keyValue) {
	 * System.out.println("index of the element is "+mid); return mid;
	 * 
	 * }else if(keyValue < stockPriceArray[mid]) { last=mid -1; }else if(keyValue >
	 * stockPriceArray[mid]) { first=mid+1; } mid=(first+last)/2; } return -1;
	 * 
	 * }
	 */
	
}
