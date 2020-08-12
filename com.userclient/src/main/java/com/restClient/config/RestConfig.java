package com.restClient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestConfig{

  @Bean
  public RestOperations createRestTemplate(final ClientHttpRequestFactory clientHttpRequestFactory){
    return new RestTemplate(clientHttpRequestFactory);
  }

  @Bean
  public ClientHttpRequestFactory clientHttpRequestFactory(@Value("${connect.timeout}") final int connectTimeOut,@Value("${read.timeout}") final int readTimeOut){
    HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
    httpComponentsClientHttpRequestFactory.setReadTimeout(readTimeOut);
    httpComponentsClientHttpRequestFactory.setConnectTimeout(connectTimeOut);
    httpComponentsClientHttpRequestFactory.
    return httpComponentsClientHttpRequestFactory;
  }
}
