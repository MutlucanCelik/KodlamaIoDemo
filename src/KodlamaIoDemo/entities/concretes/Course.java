package KodlamaIoDemo.entities.concretes;

import KodlamaIoDemo.entities.abstracts.Entity;

public class Course implements Entity{

	private int id;
	private int categoryId;
	private int instructorId;
	private String courseName;
	private String explanation;
	private String description;
	private String courseImage;
	private double price;
	
	
	public Course(int id,int categoryId,int instructorId, String courseName, String explanation, String description, String courseImage, double price) {
		
		this.id = id;
		this.categoryId = categoryId;
		this.instructorId = instructorId;
		this.courseName = courseName;
		this.explanation = explanation;
		this.description = description;
		this.courseImage = courseImage;
		this.price = price;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getExplanation() {
		return explanation;
	}


	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCourseImage() {
		return courseImage;
	}


	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}



	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public int getInstructorId() {
		return instructorId;
	}


	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	
	
	
	
}
