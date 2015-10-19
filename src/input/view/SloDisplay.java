package input.view;

import javax.swing.JOptionPane;

public class SloDisplay
{

	
		public String getAnswers(String input)
		{
			String answer = "";
			
			answer = JOptionPane.showInputDialog(null, input);
			
			return answer;
		}
		
		public void displayResponse(String input)
		{
			JOptionPane.showMessageDialog(null, input);
		}

		
}
