package day12;

class Sample implements Runnable{
	@Override
	public void run(){
		System.out.println("task three");
		this.play();
	}
	
	void play(){
		System.out.println("cricket");
	}
}

public class ThreadC {
	public static void main(String[] args) {
		Runnable r1 = new Runnable(){ //anonymous approach
			@Override
			public void run(){
				System.out.println("task one");
			}
		};
		Runnable r2 = new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("task two");
			}
		};
		
		Thread t1 = new Thread(r1); //r1 is a runnable
		Thread t2 = new Thread(r2);
		
		Sample s = new Sample();
		Thread t3 = new Thread(s); //need to go to sample class. 
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
