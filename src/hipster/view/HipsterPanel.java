package hipster.view;

import javax.swing.*;
import hipster.controller.HipsterController;
import java.awt.Color;

public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private JButton myButton;
	private JComboBox dropDown;
	private JLabel wordabel;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		myButton = new Jbutton("Click here!!");
		wordsLabel = new Jlabel("such words!");
		baseLayout = new SpringLayout();
		dropDown = new JCComboBox(baseController.getHipsters());
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(color.ORANGE);
		this.add(myButton);
		this.add(wordsLabel);
		this.add(dropDown);
		
		
	}
	private void setup()
	{
		
	}
}
