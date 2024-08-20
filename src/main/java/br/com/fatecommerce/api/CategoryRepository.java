package br.com.fatecommerce.api;

import br.com.fatecommerce.api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
