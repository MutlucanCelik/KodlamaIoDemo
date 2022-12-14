package KodlamaIoDemo.core.concretes;

import KodlamaIoDemo.core.abstracts.Logger;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);
		
	}

}
