package KodlamaIoDemo;

import java.util.ArrayList;
import java.util.List;

import KodlamaIoDemo.business.concretes.CategoryManager;
import KodlamaIoDemo.business.concretes.CourseManager;
import KodlamaIoDemo.business.concretes.InstructorManager;
import KodlamaIoDemo.core.abstracts.Logger;
import KodlamaIoDemo.core.concretes.DatabaseLogger;
import KodlamaIoDemo.core.concretes.FileLogger;
import KodlamaIoDemo.core.concretes.MailLogger;
import KodlamaIoDemo.core.concretes.SmsLogger;
import KodlamaIoDemo.dataAccess.concretes.category.JdbcCategoryDao;
import KodlamaIoDemo.dataAccess.concretes.course.HibernateCourseDao;
import KodlamaIoDemo.dataAccess.concretes.instructor.HibernateInstructorDao;
import KodlamaIoDemo.entities.concretes.Category;
import KodlamaIoDemo.entities.concretes.Course;
import KodlamaIoDemo.entities.concretes.Instructor;

public class Main {

	public static void main(String[] args) {
		
		//Simüle ettiğimizden dolayı gerekli olan classları newleyerek denemeleri yapıyoruz
		
		List<Logger> loggerList = new ArrayList<Logger>();
		
		loggerList.add(new DatabaseLogger());
		loggerList.add(new FileLogger());
		loggerList.add(new SmsLogger());
		loggerList.add(new MailLogger());
		
		
		Instructor instructor1 = new Instructor(1,"Engin","Demirog","engin.jpg");
		Instructor instructor2 = new Instructor(2,"Mutlucan","Çelik","mutlu.jpg");
		Instructor instructor3 = new Instructor(3,"Furkan","Bakar","Furkan.jpg");

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggerList);
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggerList);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggerList);
		
		
		
		Category category1 = new Category(1,"Programlama");
		Category category2 = new Category(2,"Yabacı Dil");
		Category category3 = new Category(3,"Proje Geliştirme");
		Category category4 = new Category(4,"programlama");
		
		Course course1 = new Course(1,1,1,"İleri Seviye Java","ileri seviye java öğrenmek istiyorsak kaçırma","Son sürüm java","java.jpg",69.99);
		Course course2 = new Course(2,2,1,"Temel Seviye C#","ileri seviye java öğrenmek istiyorsak kaçırma","Son sürüm java","java.jpg",79.99);
		Course course3 = new Course(3,1,1,"Pyton","ileri seviye java öğrenmek istiyorsak kaçırma","Son sürüm java","java.jpg",99.99);
		Course course4 = new Course(4,2,1,"İleri Seviye Java","ileri seviye java öğrenmek istiyorsak kaçırma","Son sürüm java","java.jpg",-8);

		
		instructorManager.add(instructor1);
		System.out.println();
		instructorManager.add(instructor2);
		System.out.println();
		instructorManager.add(instructor3);
		System.out.println("-------------------------------------------------------");
		
		categoryManager.add(category1);
		System.out.println();
		categoryManager.add(category2);
		System.out.println();
		categoryManager.add(category3);
		System.out.println();
		categoryManager.add(category4);
		System.out.println("-------------------------------------------------------");

		
		
		courseManager.add(course1);
		System.out.println();
		courseManager.add(course2);
		System.out.println();
		courseManager.add(course3);
		System.out.println();
		courseManager.add(course4);
		System.out.println("-------------------------------------------------------");

		instructorManager.getInstructor();
		System.out.println("-------------------------------------------------------");

		categoryManager.getCategory();
		System.out.println("-------------------------------------------------------");

		courseManager.getCorse();
		System.out.println("-------------------------------------------------------");

		courseManager.delete(course3);
		System.out.println();
		categoryManager.delete(category3);
		System.out.println();
		instructorManager.delete(instructor3);
		System.out.println("-------------------------------------------------------");

		courseManager.getCorse();
		System.out.println("-------------------------------------------------------");

		categoryManager.getCategory();
		System.out.println("-------------------------------------------------------");

		instructorManager.getInstructor();
		
		
		
	}
}
