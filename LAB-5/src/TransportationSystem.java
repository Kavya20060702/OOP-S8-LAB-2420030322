
class Transport{
	public void ticketPrice(){
		System.out.println("Price varies for both transport");
	}
}
class Bus extends Transport{
	public void ticketPrice() {
		System.out.println("Ticket price of bus:$20");
	}
}
class Train extends Transport{
	public void ticketPrice() {
		System.out.println("Ticket price of Train:$35");
	}
}
public class TransportationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport t1=new Bus();
		Transport t2=new Train();
		t1.ticketPrice();
		t2.ticketPrice();
//		Bus b=new Bus();
//		Train t= new Train();
//		b.ticketPrice();
//		t.ticketPrice();
//		

	}

}
