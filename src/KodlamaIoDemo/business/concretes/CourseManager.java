package KodlamaIoDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import KodlamaIoDemo.business.abstracts.CourseService;
import KodlamaIoDemo.core.abstracts.Logger;
import KodlamaIoDemo.core.concretes.Validators;
import KodlamaIoDemo.dataAccess.abstracts.CourseDao;
import KodlamaIoDemo.entities.concretes.Course;

public class CourseManager implements CourseService{

	private CourseDao courseDao;
	private List<Logger> loggers;
	
	
	public CourseManager(CourseDao courseDao,List<Logger> loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	List<Course> courseList = new ArrayList<Course>();

	@Override
	public void add(Course course) {
		
		if(!Validators.courseNameCheck(course, courseList) && !Validators.coursePriceCheck(course)) {
			System.out.println("Bu isimde bir kurs zaten mevcut.\nKurs fiyatı 0 TL den az olamaz.");
		}else if(!Validators.courseNameCheck(course, courseList)) {
			System.out.println("Bu isimde bir kurs zaten mevcut.");
		}else if(!Validators.coursePriceCheck(course)) {
			System.out.println("Kurs fiyatı 0 TL den az olamaz.");
		}else {
			courseList.add(course);
			courseDao.add(course);
			for(Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
			
		}
		
	}

	@Override
	public void delete(Course course) {
		courseList.remove(course);
		System.out.println(course.getCourseName() + " isimli kurs silindi");
		
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> getCourseList() {
		
		return courseList;
	}

	@Override
	public void getCorse() {
		for(Course course : courseList) {
			System.out.println("Kurs adı : " + course.getCourseName());
			System.out.println("Kurs fiyat : " + course.getPrice());
			System.out.println("Kurs tanım : " + course.getDescription());
			System.out.println("Kurs açıklama : " + course.getExplanation());
			System.out.println();
		}
		
	}

}
