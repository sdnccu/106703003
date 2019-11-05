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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class NewPage {

	protected Shell shell;
	private Text text;
	private Composite SHOW;
	private Composite composite_1;
	private Composite composite_8;
	private Button button_4;
	private Button button_5;
	private Composite composite_7;
	private Composite composite;

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
		shell.setSize(450, 311);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(1, false));
		
		SHOW = new Composite(shell, SWT.NONE);
		SHOW.setLayout(new StackLayout());
		
		composite_1 = new Composite(SHOW, SWT.NONE);
		composite_1.setLayout(new GridLayout(3, false));
		
		Composite composite_2 = new Composite(composite_1, SWT.NONE);
		
		Label label = new Label(composite_2, SWT.NONE);
		label.setText("Next Page");
		label.setBounds(0, 0, 55, 16);
		
		Composite composite_3 = new Composite(composite_1, SWT.NONE);
		
		Button button = new Button(composite_3, SWT.RADIO);
		button.setText("Read");
		button.setBounds(0, 0, 178, 16);
		
		DateTime dateTime = new DateTime(composite_1, SWT.BORDER);
		
		Composite composite_4 = new Composite(composite_1, SWT.NONE);
		composite_4.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 3));
		composite_4.setLayout(new GridLayout(1, false));
		new Label(composite_4, SWT.NONE);
		
		Composite composite_5 = new Composite(composite_4, SWT.NONE);
		GridData gd_composite_5 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_composite_5.widthHint = 142;
		gd_composite_5.heightHint = 130;
		composite_5.setLayoutData(gd_composite_5);
		composite_5.setLayout(new FillLayout(SWT.VERTICAL));
		
		Button button_1 = new Button(composite_5, SWT.CHECK);
		button_1.setText("Yes");
		
		Button button_2 = new Button(composite_5, SWT.CHECK);
		button_2.setText("No");
		
		Button button_3 = new Button(composite_5, SWT.CHECK);
		button_3.setText("Not Sure");
		
		Composite composite_6 = new Composite(composite_1, SWT.NONE);
		GridData gd_composite_6 = new GridData(SWT.FILL, SWT.FILL, false, false, 2, 3);
		gd_composite_6.widthHint = 264;
		composite_6.setLayoutData(gd_composite_6);
		composite_6.setLayout(new GridLayout(1, false));
		new Label(composite_6, SWT.NONE);
		
		text = new Text(composite_6, SWT.BORDER);
		GridData gd_text = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text.widthHint = 300;
		gd_text.heightHint = 143;
		text.setLayoutData(gd_text);
		
		composite_8 = new Composite(SHOW, SWT.NONE);
		composite_8.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblLastPage = new Label(composite_8, SWT.NONE);
		lblLastPage.setAlignment(SWT.CENTER);
		lblLastPage.setFont(SWTResourceManager.getFont("Yu Gothic UI", 56, SWT.NORMAL));
		lblLastPage.setText("LAST PAGE");
		
		composite_7 = new Composite(shell, SWT.NONE);
		composite_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		composite_7.setLayout(new GridLayout(2, false));
		
		Composite composite_9 = new Composite(composite_7, SWT.NONE);
		GridData gd_composite_9 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite_9.widthHint = 153;
		composite_9.setLayoutData(gd_composite_9);
		
		composite = new Composite(composite_7, SWT.NONE);
		GridData gd_composite = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_composite.widthHint = 267;
		composite.setLayoutData(gd_composite);
		composite.setLayout(new GridLayout(1, false));
		
		Composite composite_10 = new Composite(composite, SWT.NONE);
		RowLayout rl_composite_10 = new RowLayout(SWT.HORIZONTAL);
		rl_composite_10.spacing = 120;
		composite_10.setLayout(rl_composite_10);
		GridData gd_composite_10 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite_10.widthHint = 257;
		composite_10.setLayoutData(gd_composite_10);
		
		button_4 = new Button(composite_10, SWT.NONE);
		button_4.setSize(64, 30);
		button_4.setText("<<Last");
		button_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		button_4.setFont(SWTResourceManager.getFont("Yu Gothic UI", 14, SWT.NORMAL));
		
		button_5 = new Button(composite_10, SWT.NONE);
		button_5.setSize(71, 30);
		button_5.setText("Next>>");
		button_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		button_5.setFont(SWTResourceManager.getFont("Yu Gothic UI", 14, SWT.NORMAL));
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				show2();
			}
		});
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				show1();
			}
		});

	}
	private void show1() {
		StackLayout layout = (StackLayout) this.SHOW.getLayout();
		layout.topControl = this.composite_8;
		this.SHOW.layout();
	}
	private void show2() {
		StackLayout layout = (StackLayout) this.SHOW.getLayout();
		layout.topControl = this.composite_1;
		this.SHOW.layout();
	}
}
