package KodlamaIoDemo.dataAccess.concretes.course;



import KodlamaIoDemo.dataAccess.abstracts.CourseDao;
import KodlamaIoDemo.entities.concretes.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		
		System.out.println("Jdbc ile " + course.getCourseName() + " isimli bir kurs eklendi.");
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		
	}

	

}
