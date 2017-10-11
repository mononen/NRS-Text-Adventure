import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class MainWnd
{
	private static Label label2;
	private static Shell shell;
	public static void main(String[] args)
	{
		Display display = new Display();
		shell = new Shell(display);
		Splash splash = new Splash();
		//shell.setLayout(new FillLayout());
		
		label2 = new Label(shell, SWT.NONE);
		Font font = new Font(label2.getDisplay(), new FontData("Mono", 10, SWT.ITALIC));
		label2.setFont(font);
		label2.setText("here's some text with a font applied");
		label2.setBounds(0, 0, 800, 50);
		
		Label label = new Label(shell, SWT.BORDER);
		label.setText("Welcome to my text adventure!");
		label.setToolTipText("this is a label tooltip");
		//user can type in the text widget
		label.setBounds(0, 50, 800, 70);
		Text text = new Text(shell, SWT.NONE);
		text.setText("this is the text in the text widget");
		text.setBackground(display.getSystemColor(SWT.COLOR_DARK_BLUE));
		text.setForeground(display.getSystemColor(SWT.COLOR_CYAN));
		text.setBounds(0, 180, 800, 100);
		
		Button button = new Button(shell, SWT.PUSH);
		button.setBounds(50, 120, 80, 60);
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
					System.out.println("Text recieved: " + text.getText());
					text.setText("");
				}
			}
		});
		shell.setBounds(100, 100, 800, 600);
		shell.open();
		shell.addMouseMoveListener(e -> showSize(e));
		label2.addMouseMoveListener(e -> showSize(e));
		while (!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
		display.dispose();
	}
	public static void showSize(MouseEvent e)
	{
		int x = e.x;
		int y = e.y;
		String s = "bounds for label: " + label2.getBounds() + "\n";
		s+= "bounds for shell: " + shell.getBounds() + "\n";
		s+= "mouse pointer: " + x + " " + y;
		label2.setText(s);
	}
}