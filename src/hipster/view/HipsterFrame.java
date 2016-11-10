package hipster.view;

import javax.swing.JFrame;
import hipster.controller.HipsterController;
import java.awt.Dimension;

public class HipsterFrame
{
	
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitel("Hipsters 2016");
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
	}
}
