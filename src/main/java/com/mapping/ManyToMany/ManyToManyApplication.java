package com.mapping.ManyToMany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

private static final Logger logger = LoggerFactory.getLogger(ManyToManyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product p1= new Product();
		p1.setPid(101);
		p1.setProductName("Iphone");

		Product p2= new Product();
		p2.setPid(102);
		p2.setProductName("Redmi");

		Product p3= new Product();
		p3.setPid(103);
		p3.setProductName("Samsung");


		Category c1= new Category();
		c1.setCid(201);
		c1.setTitle("Electronics");

		Category c2= new Category();
		c2.setCid(202);
		c2.setTitle("Mobile Phones");

		//for mapping
		List<Product> c1Product = c1.getProduct();
		c1Product.add(p1);
		c1Product.add(p2);
		c1Product.add(p3);

		//for mapping
		List<Product> c2Product = c2.getProduct();
		c2Product.add(p1);
		c2Product.add(p2);

		categoryRepository.save(c1);
		categoryRepository.save(c2);

	}
}
