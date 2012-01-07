package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class CubikMain {

	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CubikMain window = new CubikMain();
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
		shell.setSize(684, 526);
		shell.setText("Cubik");
		shell.setLayout(new GridLayout(2, false));
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmNewSubmenu = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu.setText("Cubik");
		
		Menu menu_1 = new Menu(mntmNewSubmenu);
		mntmNewSubmenu.setMenu(menu_1);
		
		MenuItem mntmNewItem_1 = new MenuItem(menu_1, SWT.NONE);
		mntmNewItem_1.setText("New Editor");
		
		MenuItem mntmNewItem_2 = new MenuItem(menu_1, SWT.NONE);
		mntmNewItem_2.setText("Exit");
		
		MenuItem mntmNewSubmenu_1 = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu_1.setText("Operations");
		
		Menu menu_2 = new Menu(mntmNewSubmenu_1);
		mntmNewSubmenu_1.setMenu(menu_2);
		
		MenuItem mntmNewItem_4 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_4.setImage(SWTResourceManager.getImage("/home/rijvana/workspace/Cubik/images/rollup1.1.jpeg"));
		mntmNewItem_4.setText("Roll Up");
		
		MenuItem mntmNewItem_6 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_6.setText("Drill Down");
		
		MenuItem mntmNewItem_3 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_3.setText("Sice");
		
		MenuItem mntmNewItem_7 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_7.setText("Dice");
		
		MenuItem mntmNewItem_5 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_5.setText("Pivot");
		
		MenuItem mntmNewSubmenu_2 = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu_2.setText("Report");
		
		Menu menu_3 = new Menu(mntmNewSubmenu_2);
		mntmNewSubmenu_2.setMenu(menu_3);
		
		MenuItem mntmNewItem_9 = new MenuItem(menu_3, SWT.NONE);
		mntmNewItem_9.setText("Line Chart");
		
		MenuItem mntmNewItem_10 = new MenuItem(menu_3, SWT.NONE);
		mntmNewItem_10.setText("Tube Chart");
		
		MenuItem mntmNewItem_11 = new MenuItem(menu_3, SWT.NONE);
		mntmNewItem_11.setText("Pie Chart");
		
		MenuItem mntmNewItem_8 = new MenuItem(menu_3, SWT.NONE);
		mntmNewItem_8.setText("Bar Chart");
		
		MenuItem mntmNewSubmenu_3 = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu_3.setText("Help");
		
		Menu menu_4 = new Menu(mntmNewSubmenu_3);
		mntmNewSubmenu_3.setMenu(menu_4);
		
		MenuItem mntmNewItem = new MenuItem(menu_4, SWT.NONE);
		mntmNewItem.setText("About");
		
		ToolBar toolBar = new ToolBar(shell, SWT.FLAT | SWT.RIGHT);
		toolBar.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
		
		ToolItem tltmNewItem = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem.setText("Q");
		
		ToolItem toolItem = new ToolItem(toolBar, SWT.SEPARATOR);
		
		ToolItem tltmNewItem_1 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_1.setText("R");
		
		ToolItem tltmNewItem_2 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_2.setText("D");
		
		ToolItem tltmNewItem_3 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_3.setText("P");
		
		ToolItem tltmNewItem_4 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_4.setText("S");
		
		ToolItem tltmNewItem_5 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_5.setText("Di");
		
		ToolItem toolItem_1 = new ToolItem(toolBar, SWT.SEPARATOR);
		
		ToolItem tltmNewItem_6 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_6.setText("L");
		
		ToolItem tltmNewItem_7 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_7.setText("T");
		
		ToolItem tltmNewItem_8 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_8.setText("B");
		
		ToolItem tltmNewItem_9 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_9.setText("P");
		
		ToolItem toolItem_2 = new ToolItem(toolBar, SWT.SEPARATOR);
		
		ToolItem tltmE = new ToolItem(toolBar, SWT.NONE);
		tltmE.setText("E");
		
		ToolItem toolItem_3 = new ToolItem(toolBar, SWT.SEPARATOR);
		
		Tree tree = new Tree(shell, SWT.BORDER);
		GridData gd_tree = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 6);
		gd_tree.widthHint = 165;
		tree.setLayoutData(gd_tree);
		
		text = new Text(shell, SWT.BORDER);
		GridData gd_text = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 3);
		gd_text.heightHint = 396;
		text.setLayoutData(gd_text);
		
		text_1 = new Text(shell, SWT.BORDER);
		GridData gd_text_1 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 3);
		gd_text_1.heightHint = 99;
		gd_text_1.widthHint = 347;
		text_1.setLayoutData(gd_text_1);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setText("New Label");
		new Label(shell, SWT.NONE);

	}
}
