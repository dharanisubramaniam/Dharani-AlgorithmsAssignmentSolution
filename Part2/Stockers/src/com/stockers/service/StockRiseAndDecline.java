package com.stockers.service;

public class StockRiseAndDecline {
	public int count1=0,count2=0;
	public int stockRise(boolean[] stockComparisonArray) {
		
		for(int i=0;i<stockComparisonArray.length;i++) 
			if(stockComparisonArray[i]==true) 
				count1++;
		
		return count1;
	}
	public int stockDecline(boolean[] stockComparisonArray) {
		
		for(int i=0;i<stockComparisonArray.length;i++) 
			if(stockComparisonArray[i]==false) 
				count2++;
			
		return count2;
	}
}
