package com.restClient;

import com.restClient.client.UserClient;
import com.restClient.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App implements CommandLineRunner{

  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args){
    SpringApplication.run(App.class,args);
  }

  @Autowired
  private UserClient userClient;

  @Override public void run(String... args) throws Exception{
    UserDto users =  userClient.getUsers(1);
    logger.info("{Response}",users);
  }
}
