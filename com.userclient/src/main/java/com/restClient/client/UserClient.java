package com.restClient.client;

import com.restClient.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;


@Component
public class UserClient{


  @Autowired
  private RestOperations restOperations;

  private final String url;

  @Autowired
  public UserClient(@Value("${users.service.url}") final String url){
    this.url = url;
  }

  public UserDto getUsers(final int phoneNumber){
        return restOperations.getForObject(url,UserDto.class,phoneNumber);
  }
}
