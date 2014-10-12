package ru.artem.cherkasov;

import java.awt.Color;
import java.awt.geom.Line2D;

public class LineColor {
	
	private Line2D.Float line2DFloat;
	private Color color;
	
	public Line2D.Float getLine2DFloat() {
		
		return line2DFloat;
		
	}
	
	public void setLine2DFloat(Line2D.Float line2dFloat) {
		
		line2DFloat = line2dFloat;
		
	}
	
	public Color getColor() {
		
		return color;
		
	}
	
	public void setColor(Color color) {
		
		this.color = color;
		
	}

}