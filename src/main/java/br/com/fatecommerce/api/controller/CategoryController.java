package br.com.fatecommerce.api.controller;

import br.com.fatecommerce.api.entity.Category;
import br.com.fatecommerce.api.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/category")
@CrossOrigin(value = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/list")
    public ResponseEntity<Object> getInfoCategories() {
        List<Category> result = categoryService.getInfoCategories();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PostMapping(value = "/create")
    public ResponseEntity<Object> saveCategory(@RequestBody Category category) {
        Category result = categoryService.saveCategory(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @DeleteMapping(value = "/delete/{idCategory}")
    public ResponseEntity<Object> deleteCategory(@PathVariable Long idCategory) {
        HashMap<String, Object> result = categoryService.deleteCategory(idCategory);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping(value = "/findCategory/{idCategory}")
    public ResponseEntity<Object> getCategoryById(@PathVariable Long idCategory){
        Category result = categoryService.findCategoryById(idCategory);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object> updateCategory(@RequestBody Category category) {
        Category result = categoryService.updateCategory(category);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}