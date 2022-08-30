package J6.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import J6.entity.Product;
import J6.service.Service_Product;

@CrossOrigin("*")
@RestController
@RequestMapping("rest/products")
public class RestController_Product {
	@Autowired private Service_Product productService;
	
	@GetMapping()
	public List<Product>getAll(){
		return productService.findAll();
	}
	
	@GetMapping("{id}")
	public Product getOne(@PathVariable("id")Integer id) {
		return productService.findById(id);
	}
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		return productService.create(product);
	}
	
	@PutMapping("{id}")
	public Product update(@RequestBody Product product,@PathVariable("id")Integer id) {
		return productService.update(product);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id")Integer id) {
		productService.delete(id);
	}
}
