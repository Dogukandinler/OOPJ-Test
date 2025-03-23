
package javaOOPJ.ch08;

 
public class Window {
	boolean open;
	int width;

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void open(){
		open = true;
	}
	
	public void close(){
		open = false;
	}
	
	public static void main(String[] args) {
		Window window = new Window();
		window.setOpen(true);
		System.out.println("Open? : " + window.isOpen());
		
		window.close();
		System.out.println("Open? : " + window.isOpen());
	}
}
