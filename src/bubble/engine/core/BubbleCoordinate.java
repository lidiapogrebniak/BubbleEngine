package bubble.engine.core;

public class BubbleCoordinate {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public BubbleCoordinate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
        if (obj instanceof BubbleCoordinate) {
        	BubbleCoordinate pt = (BubbleCoordinate)obj;
            return (x == pt.x) && (y == pt.y);
        }
        return super.equals(obj);
    }
	
	@Override
    public int hashCode() {
		return 100*x+y;
	}
}
