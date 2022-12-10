package ec.edu.itsqmet.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.product.dto.ProductDTO;

public interface IProductRepository extends JpaRepository<ProductDTO, Integer> {

}
