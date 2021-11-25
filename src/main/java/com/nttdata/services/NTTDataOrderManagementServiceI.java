package com.nttdata.services;

import com.nttdata.models.NTTDataOrder;
import com.nttdata.models.NTTDataProduct;

public interface NTTDataOrderManagementServiceI {
	public void insertProduct(NTTDataProduct product, NTTDataOrder order);
	public void calculatePrice(NTTDataOrder order);
}
