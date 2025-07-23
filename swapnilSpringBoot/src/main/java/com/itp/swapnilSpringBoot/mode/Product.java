package com.itp.swapnilSpringBoot.mode;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	     int id;
	     String title;
	     double price;
	     String description;
	     String category;
	     String image;
	     
	     @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER) 
	 	@JoinColumn(name = "rating" , referencedColumnName = "id") 	
	     Rating rating;
}
