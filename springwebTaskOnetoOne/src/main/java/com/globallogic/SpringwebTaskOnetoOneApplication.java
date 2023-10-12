package com.globallogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.Model.Address;
import com.globallogic.Model.User;
import com.globallogic.Repository.addressRepository;
import com.globallogic.Repository.userRepository;

@SpringBootApplication
public class SpringwebTaskOnetoOneApplication implements CommandLineRunner{
    @Autowired
	addressRepository addRepository;
    @Autowired
	userRepository useRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringwebTaskOnetoOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1=new User("Rajiv", "rajiv01091997@gmail.com", "Pass1");
		Address address1=new Address("Subhashpally","Dankuni","Bengal","India", "712311");
		
		user1.setAddress(address1);
		address1.setUser(user1);
		useRepository.save(user1);
	}

}
