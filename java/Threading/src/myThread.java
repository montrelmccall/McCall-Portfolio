
public class myThread implements Runnable{

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static int shareableItem = 0;
	private String name;
	public myThread(){
		
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//no locks
		while(shareableItem <= 100000){
			System.out.println("Repeats possible. "+name +" has " + shareableItem++);
		}
		
		syncCode.count(name);

	}

}
