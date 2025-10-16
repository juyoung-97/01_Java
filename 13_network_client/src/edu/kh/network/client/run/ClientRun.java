package edu.kh.network.client.run;

import edu.kh.network.client.model.service.ClientService;

class ClientRun {
	public static void main(String[] args) {
		ClientService service = new ClientService();
		
		service.clientStart();
	}
}
