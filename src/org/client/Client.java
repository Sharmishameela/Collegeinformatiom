package org.client;
import org.company.*;

public class Client extends Company{
	
	public void clientName() {
		System.out.println("Unilever");
	}
	public static void main(String[] args) {
		Client c=new Client();
		c.companyName();
		c.clientName();
	}

}
