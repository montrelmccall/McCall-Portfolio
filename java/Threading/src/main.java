
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			myThread first = new myThread();
			first.setName("first");
			Thread firstT = new Thread(first);
			myThread second = new myThread();
			second.setName("second");
			Thread secondT = new Thread(second);
			myThread third = new myThread();
			third.setName("third");
			Thread thirdT = new Thread(third);
			firstT.start();
			secondT.start();
			thirdT.start();
	}

}
