package KodlamaIoDemo.business.abstracts;

import java.util.List;

import KodlamaIoDemo.entities.concretes.Instructor;

public interface InstructorService {

	public void add(Instructor instructor);
	
	public void delete(Instructor instructor);
	
	public void update(Instructor instructor);
	
	public List<Instructor> getInstructorList();
	
	public void getInstructor();
}
