package gui.view;


import gui.controller.GUIController;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import chat.controller.ChatController;

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
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.magenta);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(chatField);
	}
	
	private void setupLayout()
	{
		//cords
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener);
	}
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
}