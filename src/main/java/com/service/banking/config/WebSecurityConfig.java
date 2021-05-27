
 package com.service.banking.config;
  
  import org.springframework.context.annotation.Configuration; 
  import org.springframework.http.HttpMethod;
  import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
  import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter; 
  import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
  
  import com.service.banking.jwt.JWTAuthorizationFilter;
  
  @EnableWebSecurity
  @Configuration
  public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
  
  @Override
  protected void configure(HttpSecurity http) throws Exception {
	  
  http.csrf().disable() .addFilterAfter(new JWTAuthorizationFilter(),
  UsernamePasswordAuthenticationFilter.class) .authorizeRequests()
  .antMatchers(HttpMethod.POST, "/login").permitAll()
  //.antMatchers(HttpMethod.GET, "/dashboard/**").permitAll()
  .anyRequest().authenticated();
 
  }
  
  @Override
  public void configure(WebSecurity web) throws Exception {
      web.ignoring().antMatchers("/dashboard/**");
      web.ignoring().antMatchers("/hod_authority/**");
      web.ignoring().antMatchers("/stock/**");
    //  web.ignoring().antMatchers("/testkkkkkk/**");
      web.ignoring().antMatchers("/printing/**");
      web.ignoring().antMatchers("/gst/**");
      web.ignoring().antMatchers("/accounts/**");
      web.ignoring().antMatchers("/mad/**");
      web.ignoring().antMatchers("/superadmin/**");
      web.ignoring().antMatchers("/transaction/**");
      web.ignoring().antMatchers("/report/**");
     

  }
  
  
  }
