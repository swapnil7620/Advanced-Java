package com.itp.swapnilSpringBoot.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.itp.swapnilSpringBoot.mode.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByCategory(String category);

	@Query(value = "select distinct category from product" ,nativeQuery = true)
	List<String> getCategories();

	List<Product> findByPriceLessThan(double price);

	List<Product> findByPriceGreaterThan(double price);

	List<Product> findByTitleLike(String title);

	List<Product> findByTitleContaining(String title);
	
	@Query(value = "select * from product order by ?1 ,?2",nativeQuery = true)
	public List<Product> sortProduct(String field, String direction);
	
}
