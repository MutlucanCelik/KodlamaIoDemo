package KodlamaIoDemo.business.abstracts;

import java.util.List;

import KodlamaIoDemo.entities.concretes.Course;

public interface CourseService {

	public void add(Course course);
	
	public void delete(Course course);
	
	public void update(Course course);
	
	public List<Course> getCourseList();
	
	public void getCorse();
}
