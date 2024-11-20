package com.santhiya.ProductServiceMs.Service;

import com.santhiya.ProductServiceMs.Model.ProductRequest;
import com.santhiya.ProductServiceMs.Model.ProductResponse;

public interface ProductService {
   public long addProduct(ProductRequest productRequest);

   public ProductResponse getProductById(long productId);

   public void reduceQuantity(long productId, long quantity);
}
