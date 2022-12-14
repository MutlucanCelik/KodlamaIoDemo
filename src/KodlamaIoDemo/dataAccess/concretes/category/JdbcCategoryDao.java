package KodlamaIoDemo.dataAccess.concretes.category;




import KodlamaIoDemo.dataAccess.abstracts.CategoryDao;
import KodlamaIoDemo.entities.concretes.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Jdbc ile " + category.getCategoryName() + " isimli bir kategori eklendi.");
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		
	}

	

}
