import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			
			String str;
			int input;
			ArrayList<CollectableObject> al = new ArrayList();
			LinkedList<CollectableObject> ll = new LinkedList();
			HashSet<CollectableObject> hs = new HashSet();
			TreeMap<Integer,CollectableObject> tm = new TreeMap();
			
			//make and print
			for(int i = 0; i < 1000; i++){
				al.add(create());
				ll.add(create());
				hs.add(create());
				CollectableObject temp = create();
				tm.put(i, temp);
			}
			
			 
			for(int i = 0; i < 1000; i++){
				System.out.println(i+".");
				System.out.println("AL: " + al.get(i).getName());
				System.out.println("LL: " + ll.get(i).getName());
				System.out.println("TM: " + tm.get(i).getName());
			}
			
			for (CollectableObject obj : hs) {
		         
		          System.out.println(obj.getId()+ " " + obj.getName());
		      } 
			
			
	}
	
	public static CollectableObject create(){
		CollectableObject co = new CollectableObject();
		co.setName("CO - " + Integer.toString((int)(Math.random() * 1000 + 1)));
		return co;
	}

}
