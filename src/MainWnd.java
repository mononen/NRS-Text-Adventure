import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
//TODO - build a gui manager and make these windows into different methods
public class MainWnd
{	
	private static Shell shell = new Shell();
	private static Label label2 = new Label(shell, SWT.NONE);
	private static Label label = new Label(shell, SWT.NONE);
	private static Text text = new Text(shell, SWT.NONE);
	Runner runner;
	ArrayList<Building> buildings = new ArrayList<>();
	Map map = new Map();
	Player player  = new Player();
	
	public void SetupObject(Map map, Player player)
	{
		this.map = map;
		this.player = player;
	}
	
	public MainWnd(int windowType)
	{
		//Runner runner = new Runner();
		final Display display = Display.getDefault();
		//shell = new Shell(display);
		Splash splash = new Splash();
		splash.splashScreen();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
		//shell.setLayout(new FillLayout());
		
		//label2 = new Label(shell, SWT.NONE);
		//0 for main game window, 1 for menu
		if (windowType == 0)
		{
			Font font = new Font(label2.getDisplay(), new FontData("Mono", 10, SWT.ITALIC));
			label2.setFont(font);
			label2.setText("here's some text with a font applied");
			label2.setBounds(0, 0, 800, 80);
			label2.setToolTipText("Random label expressing mouse listener event");
			label2.setBackground(display.getSystemColor(SWT.COLOR_DARK_GRAY));
			
			//label = new Label(shell, SWT.BORDER);
			label.setText("Welcome to my text adventure!\nAre you ready to play?!?!");
			label.setToolTipText("All responses to your commands will appear here");
			label.setBackground(display.getSystemColor(SWT.COLOR_GRAY));
			//user can type in the text widget
			label.setBounds(0, 80, 800, 70);
			//text = new Text(shell, SWT.NONE);
			text.setText("ENTER COMMANDS HERE!");
			text.setToolTipText("Enter all of your commands here");
			text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
			text.setForeground(display.getSystemColor(SWT.COLOR_CYAN));
			text.setBounds(0, 150, 800, 100);
			
			Button button = new Button(shell, SWT.PUSH);
			button.setText("A button");
			button.setToolTipText("what does it do?");
			button.setBounds(50, 250, 80, 60);
			//listening for button depression
			button.addSelectionListener(new SelectionAdapter()
			{
				@Override
				public void widgetSelected(SelectionEvent e)
				{
					System.out.println(text.getText());
					text.setText("");
				}
			});
			//listening for enter key depression
			text.addListener(SWT.Traverse, new Listener()
			{
				@Override
				public void handleEvent(Event event)
				{
					if(event.detail == SWT.TRAVERSE_RETURN)
					{
						
					
						System.out.println("ENTER PRESSED!");
						System.out.println(text.getText());
						//Runner.Evaluate(label, text.getText());
						//^^^^^^^^very important!^^^^^^^^^^^^^^
						text.setText("");
					}
				}
			});
		}
		else if (windowType == 1)
		{
			Font font = new Font(label2.getDisplay(), new FontData("Mono", 10, SWT.ITALIC));
			label2.setFont(font);
			label2.setText("Welcome to my game!\nSelect what you want to do!");
			label2.setBounds(0, 0, 800, 50);
			label2.setToolTipText("Welcome to my game!\\nSelect what you want to do!");
			label2.setBackground(display.getSystemColor(SWT.COLOR_DARK_GRAY));
			Button startGame = new Button(shell, SWT.PUSH);
			Button quit = new Button(shell, SWT.PUSH);
			Button changeColorScheme = new Button(shell, SWT.PUSH);
			Button resumeGame = new Button(shell, SWT.PUSH);
			
			startGame.setText("Start the game!");
			startGame.setBounds(0, 50, 150, 50);
			startGame.addSelectionListener(new SelectionAdapter()
			{
				@Override
				public void widgetSelected(SelectionEvent e)
				{
					label2.setText("Starting game!");
					//call other Window correctly
				}
			});
			
			resumeGame.setText("Resume your previous game!");
			resumeGame.setBounds(150, 50, 150, 50);
			resumeGame.addSelectionListener(new SelectionAdapter()
			{
				@Override
				public void widgetSelected(SelectionEvent e)
				{
					label2.setText("Resuming game!");
				}
			});
			
			changeColorScheme.setText("Change the colors!");
			changeColorScheme.setBounds(300, 50, 200, 50);
			changeColorScheme.addSelectionListener(new SelectionAdapter()
			{
				@Override
				public void widgetSelected(SelectionEvent e)
				{
					label2.setText("Push button again to change color scheme again");
				}
			});

			quit.setText("Quit");
			quit.setBounds(500, 50, 75, 50);
			quit.addSelectionListener(new SelectionAdapter()
			{
				@Override
				public void widgetSelected(SelectionEvent e)
				{
					label2.setText("Quitting game");
				}
			});
		}
		//opening the shell
		shell.setBounds(100, 100, 800, 315);
		shell.setText("Alex's Text Adventure!");
		shell.open();
		//shell.addMouseMoveListener(e -> showSize(e));
		//label2.addMouseMoveListener(e -> showSize(e));
		while (!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
		display.dispose();
	}
	/*
	public static void showSize(MouseEvent e)
	{
		int x = e.x;
		int y = e.y;
		String s = "bounds for label: " + label2.getBounds() + "\n";
		s+= "bounds for shell: " + shell.getBounds() + "\n";
		s+= "mouse pointer: " + x + " " + y;
		label2.setText(s);
	}
	*/
	
	public Text getText()
	{
		return this.text;
	}
	public void setLabel(Label label)
	{
		this.label = label;
	}
	
	
	//unused getters and setters
	/*
	public void setLabel(Label label)
	{
		this.label = label;
		label.redraw();
	}
	public Label getLabel()
	{
		return this.label;
	}
	public void setShell(Shell shell)
	{
		this.shell = shell;
		shell.redraw();
	}
	public Shell getShell()
	{
		return this.shell;
	}
	public void setText(Text text)
	{
		MainWnd.text = text;
	}
	public Text getText()
	{
		return text;
	}
	public String getLabelText() 
	{
		return LabelText;
	}
	public void setLabelText(String labelText) 
	{
		label.setText(labelText);
		label.redraw();
	}
	*/
}