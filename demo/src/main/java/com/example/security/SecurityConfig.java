package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.example.repositories.ModelRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {

    @Autowired
    private ModelRepository modelRepository;

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        // Configure authentication provider here
//        // Example: auth.userDetailsService(userDetailsService);
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/api/models").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .and()
//                .logout()
//                .permitAll();
//    }
}
