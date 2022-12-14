package KodlamaIoDemo.core.concretes;

import KodlamaIoDemo.core.abstracts.Logger;

public class SmsLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Sms ile loglandı : " + data);
		
	}

}
