package javaLearningPoint;

import java.awt.Color;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChessBoard {
	public static void main(String[] args) {
		JFrame f = new JFrame("Chess Board");
		f.setSize(168, 195);
		Point point = new Point(0, 0);
		f.setLocation(point);
		int grids = 8;
		int gridssize = 20;
		for (int i = 0; i < grids; i++) {
			for (int j = 0; j < grids; j++) {
				JLabel l = new JLabel();
				l.setSize(gridssize, gridssize);
				l.setLocation(i * gridssize, j * gridssize);
				if ((i + j) % 2 == 0) {
					l.setBackground(Color.black);
					l.setOpaque(true);
				} else {
					l.setBackground(Color.white);
					l.setOpaque(true);
				}
				l.setBorder(BorderFactory.createLineBorder(Color.black));
				f.add(l);
			}
		}
		f.setVisible(true);
	}
}
