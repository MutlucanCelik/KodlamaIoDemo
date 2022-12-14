package KodlamaIoDemo.core.concretes;

import java.util.List;

import KodlamaIoDemo.entities.concretes.Category;
import KodlamaIoDemo.entities.concretes.Course;

public class Validators {

	public static boolean categoryNameCheck(String name,List<Category> list) {
		
		for(Category ctgry : list) {
			if(name.toUpperCase().equals(ctgry.getCategoryName().toUpperCase())) {
				return false;
			}			
		}
		return true;
	}
	
	
	public static boolean courseNameCheck(Course course,List<Course> list) {
		
		for(Course c : list) {
			
			if(c.getCourseName().toUpperCase().equals(course.getCourseName().toUpperCase())) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean coursePriceCheck(Course course) {
		
		if(course.getPrice() >= 0) {
			return true;
		}
		return false;
	}
}
