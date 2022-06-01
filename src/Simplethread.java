
public class Simplethread extends Thread {
	 
	Simplethread(){
		
		super();
	}
	Simplethread(String name){
		
		setName(name);
	}
	
	public void run(){
		 
	       System.out.println("One more thread running  and its name is  "+getName());
	    }
	  // comment 1 - for real
}
