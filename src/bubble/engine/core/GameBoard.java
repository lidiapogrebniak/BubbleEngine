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
		
		Set<BubbleCoordinate> myHashSet = new HashSet<BubbleCoordinate>();
		
		findNeighbors(baseX, baseY, currentBubble.getColor(), myHashSet);
	}
	
	public void findNeighbors(int baseX, int baseY, BubbleColor color, Set<BubbleCoordinate> myHashSet)
	{
		Bubble currentBubble = board[baseX][baseY];
		if(currentBubble == null || currentBubble.getColor() != color || currentBubble.isToDelete())
		{
			return;
		}
		
		System.out.println("X="+baseX+"Y="+baseY);
		
		myHashSet.add(new BubbleCoordinate(baseX, baseY));
		currentBubble.setToDelete(true);
		
		int curX = baseX - 1;
		int curY = baseY;
		if(curX > -1)
		{
			findNeighbors(curX, curY, color, myHashSet);
		}
		
		curX = baseX;
		curY = baseY - 1;
		if(curY > -1)
		{
			findNeighbors(curX, curY, color, myHashSet);
		}
		
		curX = baseX + 1;
		curY = baseY;
		if(curX < maxX)
		{
			findNeighbors(curX, curY, color, myHashSet);
		}
		
		curX = baseX;
		curY = baseY + 1;
		if(curY < maxY)
		{
			findNeighbors(curX, curY, color, myHashSet);
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
