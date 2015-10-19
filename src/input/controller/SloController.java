package input.controller;

import input.model.SloModel;
import input.view.SloDisplay;

public class SloController
{
	private SloModel mySloModel;
	private SloDisplay mySloDisplay;
	
	public SloController()
	{
		mySloDisplay = new SloDisplay();
	}
	
	public void start()
	{
		String movie = mySloDisplay.getAnswers("What is your favorite movie? Type in your answer.");
		
		mySloDisplay.displayResponse("Your favorite movie is " + movie);
		
		int family;
		String tempFamily = mySloDisplay.getAnswers("How many people are in your family? Type in your answer.");
		
		while(!isInteger(tempFamily))
		{
			tempFamily = mySloDisplay.getAnswers("Type in an integer!");
		}
		
		if(isInteger(tempFamily))
		{
			family = Integer.parseInt(tempFamily);
		}
		else
		{
			family = -28;
		}
		
		mySloDisplay.displayResponse("You have " + family + " people in your family.");
		double height;
		String tempHeight = mySloDisplay.getAnswers("Type your height in centimeters");
		while(!isDouble(tempHeight))
		{
			tempHeight = mySloDisplay.getAnswers("Give a valid double!");
		}
		
		if(isDouble(tempHeight))
		{
			height = Double.parseDouble(tempHeight);
		}
		else
		{
			height = -.968;
		}
		
		mySloDisplay.displayResponse("You are " + height + "centimeters tall.");
		
		mySloModel = new SloModel(movie, family, height);
		
		mySloDisplay.displayResponse(mySloDisplay.toString());
		
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			mySloDisplay.displayResponse("You did not type in a valid integer!");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			mySloDisplay.displayResponse("You did not type in a valid double!");
		}
		
		return isDouble;
		
	}
	{
		
	}
}













