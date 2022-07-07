package eduflow.demo.services;

import eduflow.demo.Repository.CategoryRepository;
import eduflow.demo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;




    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }
}
