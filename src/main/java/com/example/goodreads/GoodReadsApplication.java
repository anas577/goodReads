package com.example.goodreads;

import com.example.goodreads.dao.entities.Book;
import com.example.goodreads.dao.entities.Role;
import com.example.goodreads.dao.entities.User;
import com.example.goodreads.service.BookManager;
import com.example.goodreads.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class GoodReadsApplication {

	@Autowired
	BookManager bookManager;
	@Autowired
	UserManager userManager;
	public static void main(String[] args) {
		SpringApplication.run(GoodReadsApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			User user = new User(null, "user","user@gmail.com","pdpUrl","123", Role.USER,null,null,null);
			userManager.addUser(user);
			//bookManager.addBook(new Book(null,"The Great Gatsby","Great book","url://greatgatsby.com",new Date(),4.3,200,null,null,null,null));
		};
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
