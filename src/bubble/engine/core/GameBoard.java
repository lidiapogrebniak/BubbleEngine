package bubble.engine.core;

import java.util.HashSet;
import java.util.Set;

import bubble.engine.enums.BubbleColor;

public class GameBoard {
	private Bubble[][] board;
	
	private int maxX;
	
	private int maxY;

	public void findNeighbors(int baseX, int baseY)
	{
		Bubble currentBubble = board[baseX][baseY];
		if(currentBubble == null)
		{
			return;
		}
		
		Set<String> myHashSet = new HashSet<String>();
		
		if(--baseX>=0)
		{
			return; //findNeighbours
		}
	}
	
	public void findNeighbors(int baseX, int baseY, BubbleColor color)
	{
		Bubble currentBubble = board[baseX][baseY];
		if(currentBubble == null || currentBubble.getColor() != color)
		{
			return;
		}
	}
	
	public Bubble[][] getBoard() {
		return board;
	}

	public void setBoard(Bubble[][] board) {
		this.board = board;
	}

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

}
