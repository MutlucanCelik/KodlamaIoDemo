package KodlamaIoDemo.dataAccess.abstracts;



import KodlamaIoDemo.entities.concretes.Course;


public interface CourseDao {

	public void add(Course course);
	
	public void delete(Course course);
	
	public void update(Course course);
	
	
}
