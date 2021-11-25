package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.models.NTTDataOrder;
import com.nttdata.models.NTTDataOrderDestination;
import com.nttdata.models.NTTDataProduct;
import com.nttdata.services.NTTDataOrderManagementServiceI;

@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner{
	
	@Qualifier("peninsulaService")
	@Autowired
	private NTTDataOrderManagementServiceI peninsulaService;
	
	@Qualifier("cmcService")
	@Autowired
	private NTTDataOrderManagementServiceI cmcService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		NTTDataProduct product1 = new NTTDataProduct();
		product1.setProductId(123);
		product1.setProductName("PS5");
		product1.setProductPriceTaxLess(450.99);
		
		NTTDataOrder order1 = new NTTDataOrder();
		order1.setOrderID(654);
		order1.setOrderAddress("Calle Romero, 36");
		order1.setOrderDestination(NTTDataOrderDestination.PENINSULA_IBERICA);
		order1.setOrderReceiver("Federico");
		
		NTTDataOrder order2 = new NTTDataOrder();
		order2.setOrderID(945);
		order2.setOrderAddress("Calle Leal, 36");
		order2.setOrderDestination(NTTDataOrderDestination.MELILLA);
		order2.setOrderReceiver("Federica");
		
		peninsulaService.insertProduct(product1, order1);
		peninsulaService.insertProduct(product1, order1);
		peninsulaService.calculatePrice(order1);


		cmcService.insertProduct(product1, order2);
		cmcService.insertProduct(product1, order2);
		cmcService.calculatePrice(order2);
		
	}
	

}
