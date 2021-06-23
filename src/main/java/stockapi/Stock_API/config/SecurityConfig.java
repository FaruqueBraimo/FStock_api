/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockapi.Stock_API.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author faruq
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration{
    
  protected void configure(HttpSecurity http) throws Exception {
      
  }
    
  @Bean
  public PasswordEncoder passwordEnconder(){
      return new  BCryptPasswordEncoder();
      
      
  }
}
