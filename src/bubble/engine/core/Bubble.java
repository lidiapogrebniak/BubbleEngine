package bubble.engine.core;

import bubble.engine.enums.BubbleColor;

public class Bubble {
	
	private BubbleColor color;
	
	private boolean toDelete;

	public boolean isToDelete() {
		return toDelete;
	}

	public void setToDelete(boolean toDelete) {
		this.toDelete = toDelete;
	}

	public BubbleColor getColor() {
		return color;
	}

	public void setColor(BubbleColor color) {
		this.color = color;
	}
}
