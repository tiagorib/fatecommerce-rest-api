package br.com.fatecommerce.api.repository;

import br.com.fatecommerce.api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
