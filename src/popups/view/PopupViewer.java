package popups.view;

import javax.swing.JOptionPane;

/**
 * Pop-Up View Class
 * @author jtuc1613
 * @version 29 September 2016
 */
public class PopupViewer
{
	
	/**
	 * Makes a Pop-Up window to display the supplied message.
	 * @param message The message to be placed in the Pop-Up.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Creates an input Pop-Up to collect a response from the user as a String.
	 * @param question the Question being asked to the user.
	 * @return The user's response.
	 */
	
	public String collectResponse(String question)
	{
		String response = "";
		
		response= JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	
	/**
	 * Creates a Pop-Up window to ask a yes/no/cancel type question.
	 * @param question The question being asked the user.
	 * @return The constant value of JOptionPane for y/n/c
	 */
	public int collectUserOption(String question)
	{
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null, question);
		
		return response;
	}
}
