package assignment.array;

class Mobile {
	String textMessage;

	public String dialACall() {
		return "Dialed a call";
	}

	public void receiveACall() {
		System.out.println("Received a call");
	}

	public void textMessage(String s) {
		this.textMessage = s;

	}

}

public class CaseStudy2 {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		System.out.println(mobile.dialACall());
		mobile.receiveACall();
		mobile.textMessage("Hello, This is Jeevan");
		System.out.println(mobile.textMessage);

	}

}
