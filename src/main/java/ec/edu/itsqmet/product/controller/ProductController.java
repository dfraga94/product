package ec.edu.itsqmet.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.itsqmet.product.dto.ProductDTO;
import ec.edu.itsqmet.product.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping("/getAll")
	public ResponseEntity<List<ProductDTO>> getAll() {
		List<ProductDTO> result = productService.getAll();

		return new ResponseEntity<List<ProductDTO>>(result, HttpStatus.OK);
	}
}
