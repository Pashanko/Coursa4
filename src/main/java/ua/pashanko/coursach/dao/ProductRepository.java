package ua.pashanko.coursach.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pashanko.coursach.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
