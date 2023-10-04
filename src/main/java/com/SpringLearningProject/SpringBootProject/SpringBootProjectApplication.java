package com.SpringLearningProject.SpringBootProject;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringLearningProject.SpringBootProject.dao.UserRepo;
import com.SpringLearningProject.SpringBootProject.entity.User;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);
		
		//save
		
		/*User user=new User();
		user.setName("Padmanav");
		user.setCity("HYD");
		user.setStatus("working");
		User user2=userRepo.save(user);
		System.out.println(user2.toString()); */
		
		//update
		
//		Optional<User> optinal = userRepo.findById(1);
//		User user=optinal.get();
//		System.out.println(user.toString());
//		user.setName("Name Changed");
//		User result = userRepo.save(user);
//		System.out.println(result.toString());
		
//		//delete	
//		userRepo.deleteAll();
		
		
//		List<User> users=userRepo.findByName("Padmanav");
//		users.forEach(e->System.out.println(e));
		
		
//		List<User> users=userRepo.getAllUser();
//		users.forEach(e->System.out.println(e));
		
		
		List<User> users=userRepo.getUserByIdAndCity(52,"HYD");
		users.forEach(e->System.out.println(e));
		
		
	}

}
