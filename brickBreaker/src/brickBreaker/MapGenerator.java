package brickBreaker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
	
	public int map[][];
	public int brickWidth;
	public int brickHeight;
	
	/**
	 * 
	 * @param row
	 * @param col
	 */
	public MapGenerator(int row, int col) {
		map  = new int[row][col];
		for(int i = 0; i < map.length; i++)//3
		{
			for(int j = 0; j < map[0].length; j++)//7
			{
				map[i][j] = 1;// give every brick a value of one
				
			}
		}
		
		brickWidth = 540/col;
		brickHeight = 150/row;
	}
	/**
	 * 
	 * @param g
	 * Draw the bricks
	 */
	public void draw(Graphics2D g) {
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map[0].length; j++)
			{
				if(map[i][j] > 0) {
					// draw the whole brick rectangle
					g.setColor(Color.WHITE);
					g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
					
					// draw the borders between the bricks with draw instead of fillrect function
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
				}
			}
		}
	}
	
	/**
	 * 
	 * @param value
	 * @param row
	 * @param col
	 * when the ball hits one brick we should change its value
	 */
	public void setBrickValue(int value, int row, int col) {
		map[row][col] = value;
	}
}
