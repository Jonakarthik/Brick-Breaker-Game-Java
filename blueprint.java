package brickbreakergame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class blueprint 
{
	public int map[][];
	public int bWidth;
	public int bHeight;
	
	public blueprint (int row, int col)
	{
		map = new int[row][col];		
		for(int i = 0; i<map.length; i++)
		{
			for(int j =0; j<map[0].length; j++)
			{
				map[i][j] = 1;
			}			
		}
		
		bWidth = 400/col;
		bHeight = 120/row;
	}	
	
	public void draw(Graphics2D g)
	{
		for(int i = 0; i<map.length; i++)
		{
			for(int j =0; j<map[0].length; j++)
			{
				if(map[i][j] > 0)
				{
					g.setColor(Color.white);
					g.setColor(Color.DARK_GRAY);
					g.fillRect(j * bWidth + 80, i * bHeight + 50, bWidth, bHeight);
					
					// this is just to show separate brick, game can still run without it
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.white);
					g.drawRect(j * bWidth + 80, i * bHeight + 50, bWidth, bHeight);				
				}
			}
		}
	}
	
	public void setBrickValue(int value, int row, int col)
	{
		map[row][col] = value;
	}
}

