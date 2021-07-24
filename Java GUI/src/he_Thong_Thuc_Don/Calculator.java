package he_Thong_Thuc_Don;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Calculator {
	public static void main(String[] args) {
		createMenu();
	}
	private static void createMenu() {
		// TODO Auto-generated method stub
		// Tạo Frame.
		Frame fr = new Frame();
		fr.setLayout(new BorderLayout());
		
		
		// Tạo menu bar.
		MenuBar menu = new MenuBar(); // ??
		Menu menuFile = new Menu("Edit");
		MenuItem copyItem = new MenuItem("Copy Ctrl + C");
		MenuItem pasteItem = new MenuItem("paste Ctrl + V");
		menuFile.add(copyItem);
		menuFile.add(pasteItem);
		
		Menu menuHelp = new Menu("Help");
		MenuItem hTopicItem = new MenuItem("Help Topics");
		MenuItem hAboutItem = new MenuItem("About Calculator");
		menuHelp.add(hTopicItem);
		menuHelp.addSeparator();// Tạo 1 đường kẻ ngang
		menuHelp.add(hAboutItem);
		menu.add(menuFile);
		menu.add(menuHelp);
		
		fr.setMenuBar(menu); // ??
		fr.setBounds(100, 100, 300, 200);// tạo giá trị kích thức frame.
		fr.setTitle("Calculator"); // Tiêu đề
		//fr.setResizable(false);
		fr.setVisible(true);
		
		// sử lí sự kiện đóng của sổ ứng dụng.
		fr.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
			);
		
		
	}
}
