package com.nttdata.services;

import org.springframework.stereotype.Service;

import com.nttdata.models.NTTDataOrder;
import com.nttdata.models.NTTDataOrderDestination;
import com.nttdata.models.NTTDataProduct;

@Service("peninsulaService")
public class NTTDataOrderManagementServicePeninsulaImpl implements NTTDataOrderManagementServiceI {

	@Override
	public void insertProduct(NTTDataProduct product, NTTDataOrder order) {
		// TODO Auto-generated method stub
		if (order.getOrderDestination().equals(NTTDataOrderDestination.PENINSULA_IBERICA)) {
			product.setProductPricePVP(product.getProductPriceTaxLess() * 1.21);
			order.getOrderProducts().add(product);
		}
	}

	@Override
	public void calculatePrice(NTTDataOrder order) {
		int totalPrice = 0;

		for (NTTDataProduct p : order.getOrderProducts()) {
			totalPrice += p.getProductPricePVP();
		}
		System.out.println("La suma total para peninsula es: "+totalPrice);
	}

}
