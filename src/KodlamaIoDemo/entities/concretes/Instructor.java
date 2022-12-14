package KodlamaIoDemo.entities.concretes;

import KodlamaIoDemo.entities.abstracts.Entity;

public class Instructor implements Entity{

	//Buraya eğitmenin bir çok özelleği girilebilir adresi maaşı gibi fakat biz yalnızca web tarafında görünen özellikleri tanımlıyoruz	
	
	private int id;
	private String name;
	private String lastName;
	private String image;
	
	
	public Instructor(int id, String name, String lastName, String image) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.image = image;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
	
	
}
