package KodlamaIoDemo.dataAccess.abstracts;



import KodlamaIoDemo.entities.concretes.Category;


public interface CategoryDao {
	
	public void add(Category category);
	
	public void delete(Category category);
	
	public void update(Category category);
	
	
}
