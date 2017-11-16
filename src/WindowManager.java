import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class WindowManager 
{
	int windowStatus;
	public WindowManager() 
	{
		
	}
	public void switchToMenuWindow(Shell shell, Label label, Label label2, Text text, Display display)
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
	public void switchToMainWindow(Shell shell, Label label, Label label2, Text text, Display display)
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
	
	public int getWindowStatus()
	{
		return this.windowStatus;
	}
}
