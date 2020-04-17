package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	int ctr = 0;
	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.gray);
		g.fillRect(x, y, 50, 50);
	}
	public void update() {
		x += Math.sin(ctr * 0.1) * 10;
		y += Math.cos(ctr * 0.1) * 10;
		ctr++;
	}

}
