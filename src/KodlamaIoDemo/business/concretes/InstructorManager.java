package KodlamaIoDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import KodlamaIoDemo.business.abstracts.InstructorService;
import KodlamaIoDemo.core.abstracts.Logger;
import KodlamaIoDemo.dataAccess.abstracts.InstructorDao;
import KodlamaIoDemo.entities.concretes.Instructor;

public class InstructorManager implements InstructorService{
	
	private InstructorDao instructorDao;
	private List<Logger> loggers;
	
	

	public InstructorManager(InstructorDao instructorDao,List<Logger> loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	private List<Instructor> instructorList = new ArrayList<Instructor>();
	
	@Override
	public void add(Instructor instructor) {
		
		instructorList.add(instructor);
		instructorDao.add(instructor);
		for(Logger logger : loggers) {
			logger.log(instructor.getName()+ " " + instructor.getLastName());
		}
	}

	@Override
	public void delete(Instructor instructor) {
		instructorList.remove(instructor);
		System.out.println(instructor.getName() + " " + instructor.getLastName() + " isimli eğitmen silindi");
		
	}

	@Override
	public void update(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Instructor> getInstructorList() {
		return instructorList;
	}

	@Override
	public void getInstructor() {
		for(Instructor instructor : instructorList) {
			System.out.println("Eğitmen adı : " + instructor.getName() + " " + instructor.getLastName());
			System.out.println();
		}
		
	}

}
