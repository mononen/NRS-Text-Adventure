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
	WindowManager WindowManager = new WindowManager();
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
		
		WindowManager.switchToMenuWindow(shell, label, label2, text, display);
		
		//shell.setLayout(new FillLayout());
		
		//label2 = new Label(shell, SWT.NONE);
		//0 for main game window, 1 for menu
		
		
		//implement windowmanager here
		
		
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