package com.itp.swapnilSpringBoot.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itp.swapnilSpringBoot.mode.Product;
import com.itp.swapnilSpringBoot.mode.Rating;
import com.itp.swapnilSpringBoot.model.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired	
    ProductService productService;
	
 	@PostMapping("/addProduct")
   public String addProduct() {
	 Rating rating = Rating.builder()
			 .count(238)
				.rate(2.1)
				.build();
	 
	 Product product = Product.builder()
			 .title("Mens Casual")
				.description("Slim-fitting style")
				.price(90.32)
				.category("Clothes")
				.image("https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg")
				.rating(rating)
				.build();
	 
	      productService.addProduct(product);
		  return "Product added successfully..";	 
 }
	
 	
	@PostMapping("/saveProductWithRequestParam")
 	public ResponseEntity<Product>  saveProductWithRequestParam(
 		    @RequestParam("a") String title,
 		    @RequestParam("b") double price,
 		    @RequestParam("c") String description,
			@RequestParam("d") String category,
			@RequestParam("e") String image,
			@RequestParam("f") double rate,
			@RequestParam("g") int count
			)
 	{
 		Rating rating = Rating.builder()
	            .rate(rate)
	            .count(count)
	            .build();
		
		Product product = Product.builder()
				.title(title)
	            .price(price)
	            .description(description)
	            .category(category)
	            .image(image)
	            .rating(rating)
	            .build();
		Product saveProduct = productService.savaProduct(product);
	      return ResponseEntity.ok(saveProduct);
 	}
 	
 	@PostMapping("/saveProductWithPathVariable/{a}/{b}/{c}/{e}/{f}/{g}")
 	public ResponseEntity<Product>  saveProductWithPathVariable(
 		    @PathVariable("a") String title,
 		    @PathVariable("c") double price,
 		    @PathVariable("b") String description,
 		    @PathVariable("e") String category,
//			@RequestParam("d") String image,
 		    @PathVariable("f") double rate,
 		    @PathVariable("g") int count
			)
 	{
 		Rating rating = Rating.builder()
	            .rate(rate)
	            .count(count)
	            .build();
		
		Product product = Product.builder()
				.title(title)
				.price(price)
	            .description(description)
	            .category(category)
//	            .image(image)
	            .rating(rating)
	            .build();
		Product saveProduct = productService.savaProduct(product);
	      return ResponseEntity.ok(saveProduct);
 	}
 	
 	@PostMapping("/saveProductByRequestBody")
 	public ResponseEntity<Product> saveProductByRequestBody(@RequestBody Product product){
 		
 		Product saveProduct = productService.savaProduct(product);
 		return ResponseEntity.ok(saveProduct);
 	}
 	
 	@PostMapping("/loadMultipleProducts")
	public List<Product> loadMultipleProducts(@RequestBody List<Product> products)
	{
		return productService.loadMultipleProducts(products);
	}
 	
 	@GetMapping("/getAllProduct")
 	public List<Product>getAllProduct(){
 		return productService.getAllProduct();
 		
 	}
 	
 	@GetMapping("/getSingleProduct/{ProdID}")
 	public Product getSingleProduct(
 		@PathVariable int ProdID
 		) {
 		return productService.getSingleProduct(ProdID);
 	}
 	
 	
 	@GetMapping("/getProductByCategory/{prodCat}")	
	public List<Product> getProductByCategory(
			@PathVariable String  prodCat){
		return productService.getProductByCategory(prodCat);
	}
 	
 	@GetMapping("/findDistictCategory")
 	public  List<String> findDistictCategory() {		
 		return productService.getCategories();
 		
 	}
 	
 	@GetMapping("/findByPriceLessThan/{price}")
 	public List<Product> findByPriceLessThan(
 			@PathVariable("price") double price){
 		    return  productService.findByPriceLessThan(price);
 	}
 	
 	@GetMapping("/findByPriceGreaterThan/{price}")
 	public List<Product> findByPriceGreaterThan(
 			@PathVariable("price") double price){
 		    return  productService.findByPriceGreaterThan(price);
 	}
 	@GetMapping("/findByTitleLike/{title}")
 	public List<Product> findByTitleLike(
 			@PathVariable("title") String title){
 		    return  productService.findByTitleLike(title);
 	}
 	
 	@GetMapping("/findByTitleContaining/{title}")
 	public List<Product> findByTitleContaining(
 			@PathVariable("title") String title){
 		    return  productService.findByTitleContaining(title);
 	}
 	
 	
 	@GetMapping("/findByprice/{title}")
 	public List<Product> findBypriceOrderBy(
 			@PathVariable("title") String title){
 		    return  productService.findByTitleContaining(title);
 	}
 	
 	@GetMapping("/product/sort/{field}/{direction}")
 	public List<Product> sortProduct(@PathVariable String field, @PathVariable String direction){
 		return productService.sortProduct(field,direction);
 	}
 	
 	@GetMapping("productByPagination/{pageNumber}/{pageSize}")
 	public Page<Product> productByPagination(@PathVariable int pageNumber,@PathVariable int pageSize){
 		return productService.productByPagination(pageNumber,pageSize);
 	}
 	
 	@GetMapping("productBySortAndPagination/{pageNumber}/{pageSize}/{fieldName}")
 	public Page<Product> productBySortAndPagination(@PathVariable int pageNumber,@PathVariable int pageSize, @PathVariable String fieldName){
 		return productService.productBySortAndPagination(pageNumber,pageSize,fieldName);
 	}
 	
 	@DeleteMapping("/deleteProduct/{prodID}")
 	public String deleteProduct(@PathVariable int prodID) {
 		 productService.deleteProduct(prodID);
 		 return "product deleted";
 	}
 	
 	@GetMapping("/getSingleProduct2/{prodId}")
	public Product getSingleProduct2(@PathVariable int prodId)
	{
		return productService.getSingleProduct2(prodId);
	}
 	
 	@PutMapping("/updateProduct/{prodID}")
 	public Product updateProduct(@PathVariable int prodID , @RequestBody Product newValues) {
 		return productService.updateProduct(prodID,newValues);
 		
 	}
}
