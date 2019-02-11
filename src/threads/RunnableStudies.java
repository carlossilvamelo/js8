package threads;

public class RunnableStudies {
	
	
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()-> {
			for(int i=0; i< 500;i++) {
				System.out.println(String.format("T1 i: %d",i));
			}
		});
		
		Thread t2 = new Thread(()-> {
			for(int i=0; i< 50;i++) {
				System.out.println(String.format("T2 i: %d",i));
			}
		},"t2");
		
		t1.start();
		t2.start();
		
	}

}
