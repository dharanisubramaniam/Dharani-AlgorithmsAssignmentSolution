package com.stockers.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.stockers.service.AscendingOrder;
import com.stockers.service.DescendingOrder;
import com.stockers.service.SearchStock;
import com.stockers.service.StockRiseAndDecline;



public class Driver {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		AscendingOrder ascendingOrder=new AscendingOrder();
		DescendingOrder descendingOrder = new DescendingOrder();
		StockRiseAndDecline stockRiseAndDecline =new StockRiseAndDecline();
		SearchStock searchStockObj =new SearchStock();
		
		//getting no of companies
		System.out.println("Enter the no of companies");
		int noOfCompanies = sc.nextInt();
		
		//initiating array for stockprice
		double[] stockPriceArray = new double[noOfCompanies];
		
		
		//initiating array for stock comparison
		boolean[] stockComparisonArray = new boolean[noOfCompanies];
		
		//inserting values to arrays
		for(int i=1;i<=noOfCompanies;i++) {
			System.out.println("Enter current stock price of the company "+i);
			stockPriceArray[i-1] = sc.nextDouble();
			
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stockComparisonArray[i-1] = sc.nextBoolean();
			
		}
		System.out.println(Arrays.toString(stockPriceArray));
		System.out.println(Arrays.toString(stockComparisonArray));
		
		//menu display function
		displayMenu();
		
		
		//getting input from user
		int input = sc.nextInt();
		
		while(input>0) {
			switch(input) {
			case 1:
			{
				ascendingOrder.sort(stockPriceArray, 0, stockPriceArray.length-1);
				System.out.println("Stock prices in ascending order are\n");
				printStockPrice(stockPriceArray);
			}
				break;
			case 2:
			{
				descendingOrder.sort(stockPriceArray, 0, stockPriceArray.length-1);
				System.out.println("Stock prices in descending order are\n");
				printStockPrice(stockPriceArray);
			}
			    break;
			case 3:
			{
				System.out.println("Total no of companies whose stock price rose today : "+stockRiseAndDecline.stockRise(stockComparisonArray));
			}
			    break;
			case 4:
			{
				System.out.println("Total no of companies whose stock price declined today : "+stockRiseAndDecline.stockDecline(stockComparisonArray));
			}
			break;
			case 5:
			{
			   toFindStock(searchStockObj,stockPriceArray);
			}
			break;
			
			default:
				System.out.println("enter valid option");
			}
			
			input = sc.nextInt();
		}
			System.out.println("Exited successfully");
	}

	//finstock method for case5
	private static void toFindStock(SearchStock searchStockObj, double[] stockPriceArray) {
		System.out.println("Enter the key value");
		double keyValue = sc.nextDouble();
		searchStockObj.searchStock(stockPriceArray,keyValue);
		
	}

	private static void printStockPrice(double[] stockPriceArray) {
		for(int i=0;i<stockPriceArray.length;i++) {
			System.out.println(stockPriceArray[i]+" ");
		}
		
	}

	private static void displayMenu() {
		System.out.println("\n-----------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		System.out.println("-----------------------------------------------\n");
		
		
		}

}
