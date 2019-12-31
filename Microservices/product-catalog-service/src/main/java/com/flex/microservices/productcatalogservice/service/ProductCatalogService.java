/**
 * 
 */
package com.flex.microservices.productcatalogservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.flex.microservices.productcatalogservice.model.ProductCatalogModel;
import com.flex.microservices.productcatalogservice.model.ProductInfoResponse;
import com.flex.microservices.productcatalogservice.model.ProductRatingResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * This class acts as the Service Layer for Product Catalog Service.
 * 
 * @version 1.0
 * @author gssmunej
 *
 */
@Service
public class ProductCatalogService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ProductRatingResponse productRatingResponse;
	
	@Autowired
	private ProductInfoResponse productInfoResponse;
	
	@Autowired
	private ProductCatalogModel productCatalog;
	
	/**
	 * This Method makes a REST call to Product Rating Service. 
	 * 
	 * @author gssmunej
	 * 
	 * @param productId
	 * @return productRatingResponse
	 */
	public ProductRatingResponse getProductRating(String productId) {
		
		try {
			productRatingResponse = restTemplate.getForObject("http://product-rating-service/ratingService/getRating?productId="+productId, ProductRatingResponse.class);
			
			return productRatingResponse;
		} catch(Exception exception) {
			System.out.println("Exception occured in ProductCatalogService#getProductRating(). The Exception is: "+exception);
			
			return null;
		}
	}
	
	/**
	 * This Method makes a REST call to Product Info Service. 
	 * 
	 * @author gssmunej
	 * 
	 * @param productId
	 * @return productInfoResponse
	 */
	public ProductInfoResponse getProductInfo(String productId) {
		
		try {
			productInfoResponse  = restTemplate.getForObject("http://product-info-service/ProductInfoService/getProductInfo?productId="+productId, ProductInfoResponse.class);
			
			return productInfoResponse;
		} catch(Exception exception) {
			System.out.println("Exception occured in ProductCatalogService#getProductInfo(). The Exception is: "+exception);
			
			return null;
		}
	}
	
	/**
	 * This Method combines Product Info & Product Rating object to Product Catalog.
	 * 
	 * @author gssmunej
	 * 
	 * @param productRatingObj
	 * @param productInfoObj
	 * @return productCatalog
	 */
	public ProductCatalogModel objectMapper(ProductRatingResponse productRatingObj, ProductInfoResponse productInfoObj) {
		
		try {
			productCatalog.setProductId(productRatingObj.getProductRatingModelList()[0].getProductID());
			productCatalog.setProductName(productInfoObj.getProductInfoModelList()[0].getProductName());
			productCatalog.setProductDesc(productInfoObj.getProductInfoModelList()[0].getProductDesc());
			productCatalog.setProductRating(productRatingObj.getProductRatingModelList()[0].getProductRating());
			
			return productCatalog;
		} catch(Exception exception) {
			System.out.println("Exception occured in ProductCatalogService#objectMapper(). The Exception is: "+exception);
			
			return null;
		}
	}

	/**
	 * This Method makes a REST call to get Health Check of Product Rating Service.
	 *  
	 * @author gssmunej
	 * @return response
	 */
	@HystrixCommand(fallbackMethod = "getRatingApiStatusFallback")
	public String getRatingApiStatus() {
		
		try {
			String response = restTemplate
	                .exchange("http://product-rating-service/ratingService/healthCheck"
	                , HttpMethod.GET
	                , null
	                , new ParameterizedTypeReference<String>() {
	            }).getBody();
			
			return response;
		} catch (Exception exception) {
			System.out.println("Exception occured in ProductCatalogService#getRatingApiStatus(). The Exception is: "+exception);
			
			return null;
		}
		
	}
	
	/**
	 * This Method acts as the fallback method for <b>getRatingApiStatus</b>.
	 * 
	 * @author gssmunej
	 * @return response
	 */
	public String getRatingApiStatusFallback() {
		
		try {
			String response = "Product Ratings API is currently Down! Please Contact System Administrator.";
			
			return response;	
		} catch (Exception exception) {
			System.out.println("Exception occured in ProductCatalogService#getRatingApiStatusFallback(). The Exception is: "+exception);
			
			return null;
		}
		
	}
}
