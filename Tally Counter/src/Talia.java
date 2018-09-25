
public class Talia {

	// Instance Variable
	
	private int count = 0;
	
	public Talia() {
		
		count = 0;
		
	}
			
	public Talia(int startCount) {
		count = startCount;
	}
	
	public void click() {
		//accomplishing a task, doesn't need a  return type
		count += 1;
		//or count++
	}
}
