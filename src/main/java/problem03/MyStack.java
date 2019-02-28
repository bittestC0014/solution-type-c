package problem03;

public class MyStack {
	
	private String[] buffer;
	private int cur;

	public MyStack( int size ) {
		buffer = new String[size];
		cur = 0;
	}
	
	public void push(String item) {
		if(size() == cur) resize();
		buffer[cur++] = item;
	}

	public String pop() {
		
		return (cur > 0) ? buffer[--cur] : null;
	}

	public boolean isEmpty() {
		return (cur < 1) ? true : false;
	}
	
	public int size() {
		return buffer.length;
	}
	
	public void resize() {

		String[] tempBuffer = buffer;
		buffer = new String[size()+1];
		
		for(int i = 0; i < tempBuffer.length; i++) {
			buffer[i] = tempBuffer[i];
		}
	}
}