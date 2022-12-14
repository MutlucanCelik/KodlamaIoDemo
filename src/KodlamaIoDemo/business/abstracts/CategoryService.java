package KodlamaIoDemo.business.abstracts;

import java.util.List;

import KodlamaIoDemo.entities.concretes.Category;

public interface CategoryService {

	public void add(Category category);
	
	public void delete(Category category);
	
	public void update(Category category);
	
	public List<Category> getCategoryList();
	
	public void getCategory();
	
}
