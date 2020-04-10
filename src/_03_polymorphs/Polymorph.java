package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
	protected int y;

	public int getX() {
		return x;
	}

	public void setX(int var1) {
		x = var1;
	}

	public int getY() {
		return y;
	}

	public void setY(int var2) {
		y = var2;
	}

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);
}
