package gui.view;


import gui.controller.GUIController;


i
public class FirstPanel extends JPanel
{
	
	private GUIController appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;
	public FirstPanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");
		
		chatField = new JTextField("Talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		
		chatPane = new JScrollPane();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupScrollPane()
	{
		
	}
}