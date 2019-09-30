package br.com.pagamento.principal;

import java.math.BigDecimal;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import br.com.pagamento.servico.Pagamento;

public class GatewayPagamento {
	
	public static void main(String args[]) {
		
		Pagamento pagamento=new Pagamento(new BigDecimal(500));
		String target="http://book-payment.herokuapp.com/payment";
		Client client=ClientBuilder.newClient();
		String response=client.target(target).request().post(Entity.json(pagamento),String.class);
		
		System.out.println(response);
	}

}
