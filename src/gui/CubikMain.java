package gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;

public class CubikMain {

	protected Shell Cubik;

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
		Cubik.open();
		Cubik.layout();
		while (!Cubik.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		Cubik = new Shell();
		Cubik.setSize(450, 300);
		Cubik.setText("Cubik");
		Cubik.setLayout(new GridLayout(1, false));
		
		Menu menu = new Menu(Cubik, SWT.BAR);
		Cubik.setMenuBar(menu);
		
		MenuItem mntmNewSubmenu = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu.setText("New SubMenu");
		
		Menu menu_1 = new Menu(mntmNewSubmenu);
		mntmNewSubmenu.setMenu(menu_1);
		
		MenuItem mntmNewItem_1 = new MenuItem(menu_1, SWT.NONE);
		mntmNewItem_1.setText("New Item");
		
		MenuItem mntmNewItem = new MenuItem(menu_1, SWT.NONE);
		mntmNewItem.setText("New Item");
		
		MenuItem mntmNewSubmenu_1 = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu_1.setText("New SubMenu");
		
		Menu menu_2 = new Menu(mntmNewSubmenu_1);
		mntmNewSubmenu_1.setMenu(menu_2);
		
		MenuItem mntmNewItem_3 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_3.setText("New Item");
		
		MenuItem mntmNewItem_4 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_4.setText("New Item");
		
		MenuItem mntmNewItem_2 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_2.setText("New Item");
		
		MenuItem mntmNewItem_5 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_5.setText("New Item");
		
		MenuItem mntmNewItem_11 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_11.setText("New Item");
		
		MenuItem mntmNewSubmenu_2 = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu_2.setText("New SubMenu");
		
		Menu menu_3 = new Menu(mntmNewSubmenu_2);
		mntmNewSubmenu_2.setMenu(menu_3);
		
		MenuItem mntmNewItem_7 = new MenuItem(menu_3, SWT.NONE);
		mntmNewItem_7.setText("New Item");
		
		MenuItem mntmNewItem_8 = new MenuItem(menu_3, SWT.NONE);
		mntmNewItem_8.setText("New Item");
		
		MenuItem mntmNewItem_6 = new MenuItem(menu_3, SWT.NONE);
		mntmNewItem_6.setText("New Item");
		
		MenuItem mntmNewItem_9 = new MenuItem(menu_3, SWT.NONE);
		mntmNewItem_9.setText("New Item");
		
		MenuItem mntmNewSubmenu_3 = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu_3.setText("New SubMenu");
		
		Menu menu_4 = new Menu(mntmNewSubmenu_3);
		mntmNewSubmenu_3.setMenu(menu_4);
		
		MenuItem mntmNewItem_10 = new MenuItem(menu_4, SWT.NONE);
		mntmNewItem_10.setText("New Item");
		
		ToolBar toolBar = new ToolBar(Cubik, SWT.FLAT | SWT.RIGHT);
		GridData gd_toolBar = new GridData(SWT.RIGHT, SWT.FILL, false, false, 100,1);
		gd_toolBar.widthHint = 438;
		toolBar.setLayoutData(gd_toolBar);
		new Label(Cubik, SWT.NONE);
		new Label(Cubik, SWT.NONE);
		new Label(Cubik, SWT.NONE);
		new Label(Cubik, SWT.NONE);
		new Label(Cubik, SWT.NONE);
		new Label(Cubik, SWT.NONE);
		new Label(Cubik, SWT.NONE);
		new Label(Cubik, SWT.NONE);
		new Label(Cubik, SWT.NONE);

	}
}
