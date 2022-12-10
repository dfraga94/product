package ec.edu.itsqmet.product.service;

import java.util.List;

import ec.edu.itsqmet.product.dto.ProductDTO;

public interface IProductService {
	List<ProductDTO> getAll();
}
