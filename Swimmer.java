package swimmer;

public class Swimmer {
	private int range = 10;
	private int path ;
	private int position = 0;
	private boolean forward = true;
	
	public Swimmer() {
		path = 1;
	}
	
	public Swimmer(int path) {
		this.path = path;
	}
	
	public void swim() {
		if (forward){
			position += path;
		} else {
			position -= path; 
		}
		
		while (!validPosition()){

			boolean outOfRange = !(position < range - 2);
			boolean negativePosition = position < 0;
			
			if (outOfRange) {
				turnBackward();		
			} else if(negativePosition){
				turnForward();
			}
		}
	}
	
	private boolean validPosition(){
		int size = toString().length() - 1;
		
		return position >= 0 && position < range - size;
	}
	
	
	private void turnBackward() {
		//out of range
		forward = false;
		int size = toString().length();
		position = range*2 - position - (size+2);
		
	}
	
	private void turnForward() {
		forward = true;

		position = -position - 1;
	}

	
	
	public int getPosition() {
		return position;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	public String toString() {
		return forward ? ">+o" : "o+<";
		
	}

}
