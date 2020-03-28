package concurrency;

import java.util.concurrent.TimeUnit;

public class HappensBefore {
	
	private volatile static boolean isRequested=false;

	public static void main(String[] args) {
		
		Thread t = new Thread(()-> {
			int i = 0;
			while(!isRequested) {
				i++;			
			}
		});
		t.start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		isRequested = true;

	}

}
