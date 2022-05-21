package point;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyPaintApp extends JFrame{
	int x,y;
	Vector<point> list = new Vector<>();
	class MyPanel extends JPanel{
		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseDragged(MouseEvent event) {
					x= event.getX();
					y= event.getY();
					list.add(new point(x,y));
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(point p : list)
				g.fillOval(p.x, p.y, 4, 4);
		}
	}
	public MyPaintApp() {
		setSize(600,150);
		setTitle("My Paint");
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyPaintApp f = new MyPaintApp();
	}
	
}