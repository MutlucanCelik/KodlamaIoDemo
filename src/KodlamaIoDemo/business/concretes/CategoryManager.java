package KodlamaIoDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import KodlamaIoDemo.business.abstracts.CategoryService;
import KodlamaIoDemo.core.abstracts.Logger;
import KodlamaIoDemo.core.concretes.Validators;
import KodlamaIoDemo.dataAccess.abstracts.CategoryDao;
import KodlamaIoDemo.entities.concretes.Category;

public class CategoryManager implements CategoryService{
	
	private CategoryDao categoryDao;
	private List<Logger> loggers;
	

	public CategoryManager(CategoryDao categoryDao,List<Logger> loggers) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	Scanner input = new Scanner(System.in);
	List<Category> categoryList = new ArrayList<Category>();
	
	@Override
	public void add(Category category) {
		if(Validators.categoryNameCheck(category.getCategoryName(), categoryList)) {
			categoryList.add(category);
			
			categoryDao.add(category);
			for(Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
		}else {
			System.out.println("Bu isimde zaten bir kategori mevcut.");
		}
		
	}

	@Override
	public void delete(Category category) {
		categoryList.remove(category);
		System.out.println(category.getCategoryName() + " isimli kategori silindi");
		
	}

	
	@Override
	public void update(Category category) {	
		
		
	}

	@Override
	public List<Category> getCategoryList() {
		
		return categoryList;
	}
	
	@Override
	public void getCategory() {
		
		for(Category cat : categoryList) {
			System.out.println(cat.getCategoryName());
			System.out.println();
		}
		
	}
	
	

}
