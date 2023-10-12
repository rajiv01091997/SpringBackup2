package com.globallogic.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.Model.Entity;
import com.globallogic.service.ServiceEmail;

@SpringBootApplication
public class EmailServiceApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Entity entity=new Entity("rajiv01091997@gmail.com","prabhatkumar30810@gmail.com","hello biro",
				                                                  "ye code se bhej rha hu java se");
		ServiceEmail email = new ServiceEmail();
		email.sendMail(entity);
	}

}
