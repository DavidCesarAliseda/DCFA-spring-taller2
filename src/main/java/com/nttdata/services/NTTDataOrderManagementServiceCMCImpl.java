package com.nttdata.services;

import org.springframework.stereotype.Service;

import com.nttdata.models.NTTDataOrder;
import com.nttdata.models.NTTDataOrderDestination;
import com.nttdata.models.NTTDataProduct;

@Service("cmcService")
public class NTTDataOrderManagementServiceCMCImpl implements NTTDataOrderManagementServiceI {

	@Override
	public void insertProduct(NTTDataProduct product, NTTDataOrder order) {
		if (!order.getOrderDestination().equals(NTTDataOrderDestination.PENINSULA_IBERICA)) {
			product.setProductPricePVP(product.getProductPriceTaxLess() * 1.04);
			order.getOrderProducts().add(product);
		}
	}

	@Override
	public void calculatePrice(NTTDataOrder order) {
		int totalPrice = 0;

		for (NTTDataProduct p : order.getOrderProducts()) {
			totalPrice += p.getProductPricePVP();
		}

		System.out.println("La suma total para la zona no peninsular es: " + totalPrice);
	}

}
