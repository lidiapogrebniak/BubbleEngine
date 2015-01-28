package bubble.engine.main;

import java.util.HashSet;
import java.util.Set;

import bubble.engine.core.Bubble;
import bubble.engine.core.BubbleCoordinate;
import bubble.engine.core.GameBoard;
import bubble.engine.enums.BubbleColor;

public class Main {

	public static void main(String[] args) {
		Bubble [][] mas = new Bubble[3][3];
		mas[0][0] = new Bubble(BubbleColor.RED);
		mas[0][1] = new Bubble(BubbleColor.BLUE);
		mas[0][2] = new Bubble(BubbleColor.RED);
		
		
		mas[1][0] = new Bubble(BubbleColor.BLUE);
		mas[1][1] = new Bubble(BubbleColor.BLUE);
		mas[1][2] = new Bubble(BubbleColor.BLUE);
		
		mas[2][0] = new Bubble(BubbleColor.RED);
		mas[2][1] = new Bubble(BubbleColor.BLUE);
		mas[2][2] = new Bubble(BubbleColor.RED);
		
		GameBoard gameBoard = new GameBoard();
		gameBoard.setMaxX(3);
		gameBoard.setMaxY(3);
		gameBoard.setBoard(mas);
		
		Set<BubbleCoordinate> myHashSet = new HashSet<BubbleCoordinate>();
		
		gameBoard.findNeighbors(1, 1, BubbleColor.BLUE, myHashSet);
		
		myHashSet.forEach(System.out::println);
	}

}
