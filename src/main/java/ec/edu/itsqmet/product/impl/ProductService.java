package ec.edu.itsqmet.product.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.itsqmet.product.dto.ProductDTO;
import ec.edu.itsqmet.product.repository.IProductRepository;
import ec.edu.itsqmet.product.service.IProductService;

@Service
public class ProductService implements IProductService {
	@Autowired
	private IProductRepository productRepository;

	@Override
	public List<ProductDTO> getAll() {
		List<ProductDTO> result = productRepository.findAll();
		return result;
	}

}
