
public class test {
	static Pkt punkt1;
	public static void main(String[] args) {
		
		//ArrayList <Pkt> punkt2 = ArrayList <>
		punkt1 = new Pkt(10,90);
		punkt1.momentBezwladnosci();
		punkt1.twSteinera(19.9);
		punkt1.setMasa(20);
		punkt1.getInfo();
		punkt1.getTwSteinera();
		
		Pkt[] punkt2 = new Pkt[6];
	
		
		for(int i = 0; i<punkt2.length; i++) 
		{
			
			punkt2[i] = new Pkt(Math.random(),Math.random());
		}
		 for(int i = 0; i<punkt2.length;i++)
		 {
			 punkt2[i].momentBezwladnosci();
			 punkt2[i].getInfo();
			 punkt2[i].twSteinera(Math.random());
			 punkt2[i].getTwSteinera();
		 }
	}
	

}
