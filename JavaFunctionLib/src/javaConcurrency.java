import java.util.concurrent.TimeUnit;

public class javaConcurrency {

	private static boolean isRequested=false;
	/**
	 * Dead lock scenarion
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t = new Thread(()-> {
			int i = 0;
			//System.out.print(i);
			synchronized ("BH") {
				while(!isRequested) {
					i++;			
				}
			}
		});
		t.start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized ("BH") {
			isRequested = true;
		}

	}

}
