
class Runner extends Thread {
	public void run() {
		for(int i = 0; i < 10; i ++) {
			System.out.println("ehllo" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Try{
	public static void main (String[] args) {
		Runner runner1 = new Runner();
		runner1.start();
	}
}