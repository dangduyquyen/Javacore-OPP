package Bai_1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class Demo{
	public static void main(String[] args) {
		Frame fr = new Frame("My first Window");
		// Xác định kích thước, vị trí của Frame;
		fr.setBounds(0, 0, 680, 480);
		// Hiển thị Frame;
		fr.setVisible(true);
		
		// sử lí sự kiện đóng của sổ ứng dụng.
		fr.addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
	}
}