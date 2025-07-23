package com.itp.swapnilSpringBoot.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.itp.swapnilSpringBoot.mode.Product;
import com.itp.swapnilSpringBoot.model.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	public void addProduct(Product product) {
		productRepository.save(product);

		
	}
	public Product savaProduct(Product product) {
		
		return productRepository.save(product);
	}
	public  List<Product> getAllProduct() {
		return productRepository.findAll(); 
		
	}
	public Product getSingleProduct(int prodID) {
		
		return productRepository.findById(prodID).get();
	}
	
//	public List<Product> getProductByCategory(String category) {
//		
//		return productRepository.findByCategory(category);
//	}
	
	public List<Product> getProductByCategory(String prodCat) {
		return productRepository.findByCategory(prodCat);
		
	}
	public List<String> getCategories() {
		
		return productRepository.getCategories();
	}
	public List<Product> findByPriceLessThan(double price) {
		
		return productRepository.findByPriceLessThan(price);
	}
	public List<Product> findByPriceGreaterThan(double price) {
		
		return productRepository.findByPriceGreaterThan(price);
	}
	public List<Product> findByTitleLike(String title) {
		
		return productRepository.findByTitleLike("%" + title + "%") ;
	}
	public List<Product> findByTitleContaining(String title) {
		
		return productRepository.findByTitleContaining(title);
	}
	public List<Product> loadMultipleProducts(List<Product> products) {
		
		return productRepository.saveAll(products);
	}
	public List<Product> sortProduct(String field, String direction) {
		
		return productRepository.findAll(Sort.by(Sort.Direction.fromString(direction),field));
	}
	public Page<Product> productByPagination(int pageNumber, int pageSize) {
		return productRepository.findAll(PageRequest.of(pageNumber, pageSize));
	}
	public Page<Product> productBySortAndPagination(int pageNumber, int pageSize, String fieldName) {
		
		return productRepository.findAll(PageRequest.of(pageNumber, pageSize).withSort(Sort.by(Sort.Direction.ASC,fieldName)));
	} 
	
	

}
