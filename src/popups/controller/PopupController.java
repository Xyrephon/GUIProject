package popups.controller;

import popups.view.PopupViewer;

public class PopupController
{

	private PopupViewer display;
	public PopupController()
	{
		display = new PopupViewer();
	}
	
	public void start()
	{
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{

			display.displayMessage("Hi there :D");
			
			answer = display.collectResponse("What is going on?");
			display.displayMessage(answer + " is what you said.");
			
		}
	}
	
	/**
	 * Checks if the supplied String can be parsed to a double value.
	 * @param potentialValue The string to test.
	 * @return Whether the value could be parsed; true if it can be parsed, false otherwise
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isParseable = false;
		
		try
		{
			double test = Double.parseDouble(potentialValue);
			isParseable = true;
		}
		catch(NumberFormatException notDouble)
		{
			display.displayMessage("This is not a double value =:<");
		}
		
		return isParseable;
	}
	
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseable = false;
		
		try
		{
			int test = Integer.parseInt(potentialNumber);
			isParseable = true;
		}
		catch(NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage());
			display.displayMessage("Type in an integer next time!");
		}
		
		return isParseable;
	}
}
