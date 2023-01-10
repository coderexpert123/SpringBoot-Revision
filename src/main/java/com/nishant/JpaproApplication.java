package com.nishant;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.thymeleaf.standard.expression.Each;

import com.nishant.dao.UserRepossitery;
import com.nishant.entities.User;

@SpringBootApplication
public class JpaproApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JpaproApplication.class, args);
		UserRepossitery userRepossitery = context.getBean(UserRepossitery.class);
//		User user1=new User();

//		User user2=new User();
	
//		user1.setName("Nishant Kumar Singh");
//		user1.setCity("Rakiya");
//		user1.setStatus("Active");
//			
//		user2.setName("Nishant Kumar Singh");
//		user2.setCity("Rakiya");
//		user2.setStatus("Active");
//		
//		List<User> users = List.of(user1,user2);
//		
//		Iterable<User> AllUserSave = userRepossitery.saveAll(users);
//	
//		System.out.println("data save");
//		
//		
//		AllUserSave.forEach(user->{
//
//			System.out.println(users);
//		});
			
//		
//		
//		Find by ID  || Update the User
//		
//		Optional<User> uId = userRepossitery.findById(52);
//		User user = uId.get();
//		user.setName(null);
//		User updatedUser = userRepossitery.save(user);
//		System.out.println(updatedUser);

// Find by ID  || Delete the User	
		
userRepossitery.deleteAll();
System.out.println("All User Deleted....");

		
	}

}
