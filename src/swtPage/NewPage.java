package swtPage;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.wb.swt.SWTResourceManager;

public class NewPage {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			NewPage window = new NewPage();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new GridLayout(3, false));
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setBounds(0, 0, 154, 21);
		
		Label label = new Label(composite_1, SWT.NONE);
		label.setText("Next Page");
		label.setBounds(0, 0, 55, 16);
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setBounds(0, 0, 173, 16);
		
		Button button = new Button(composite_2, SWT.RADIO);
		button.setText("Read");
		button.setBounds(0, 0, 173, 16);
		
		DateTime dateTime = new DateTime(composite, SWT.BORDER);
		dateTime.setBounds(0, 0, 81, 21);
		
		Composite composite_3 = new Composite(composite, SWT.NONE);
		composite_3.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 3));
		composite_3.setBounds(0, 0, 154, 213);
		composite_3.setLayout(new GridLayout(1, false));
		new Label(composite_3, SWT.NONE);
		
		Composite composite_4 = new Composite(composite_3, SWT.NONE);
		GridData gd_composite_4 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_composite_4.widthHint = 142;
		gd_composite_4.heightHint = 130;
		composite_4.setLayoutData(gd_composite_4);
		composite_4.setLayout(new FillLayout(SWT.VERTICAL));
		
		Button button_1 = new Button(composite_4, SWT.CHECK);
		button_1.setText("Yes");
		
		Button button_2 = new Button(composite_4, SWT.CHECK);
		button_2.setText("No");
		
		Button button_3 = new Button(composite_4, SWT.CHECK);
		button_3.setText("Not Sure");
		
		Composite composite_5 = new Composite(composite, SWT.NONE);
		composite_5.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 3));
		composite_5.setBounds(0, 0, 259, 213);
		composite_5.setLayout(new GridLayout(1, false));
		new Label(composite_5, SWT.NONE);
		
		text = new Text(composite_5, SWT.BORDER);
		GridData gd_text = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text.heightHint = 143;
		text.setLayoutData(gd_text);
		new Label(composite, SWT.NONE);
		
		Composite composite_6 = new Composite(composite, SWT.NONE);
		composite_6.setLayout(new GridLayout(5, false));
		composite_6.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		
		Button button_4 = new Button(composite_6, SWT.NONE);
		button_4.setFont(SWTResourceManager.getFont("Yu Gothic UI", 16, SWT.NORMAL));
		button_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		button_4.setText("<<Last");
		new Label(composite_6, SWT.NONE);
		new Label(composite_6, SWT.NONE);
		new Label(composite_6, SWT.NONE);
		
		Button btnNext = new Button(composite_6, SWT.NONE);
		btnNext.setText("Next>>");
		btnNext.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnNext.setFont(SWTResourceManager.getFont("Yu Gothic UI", 16, SWT.NORMAL));

	}
}
