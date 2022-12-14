package KodlamaIoDemo.dataAccess.concretes.instructor;


import KodlamaIoDemo.dataAccess.abstracts.InstructorDao;
import KodlamaIoDemo.entities.concretes.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Jdbc ile " + instructor.getName() + " " + instructor.getLastName() + " isimli eğitmen eklendi");	
	}

	@Override
	public void delete(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	

}
