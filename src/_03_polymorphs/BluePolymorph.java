package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{
protected int width;
protected int height;
public int getWidth() {
	return width;
}
public void setWidth(int i) {
	width=i;
}

public int getHeight() {
	return height;
}
public void setHeight(int q) {
	height=q;
}

	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, 50, 50);
		width=500;
		height=500;
	}
	
}
