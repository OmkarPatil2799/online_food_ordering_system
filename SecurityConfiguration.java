package com.app.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

	
		auth.userDetailsService(userDetailsService);
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
		.authorizeRequests()
		//.antMatchers("/**").permitAll()
//		.antMatchers("/cart/**").hasRole("ADMIN")			// highest privilege 	
//		.antMatchers("/customers/**").permitAll()
//		.antMatchers("/common/**").authenticated()
//		.antMatchers("/customers/register").permitAll()
		.antMatchers("/", "/authenticate").permitAll()		// lowest privilege
		.antMatchers("/deliveryPartner/register/image").permitAll()
		.antMatchers("/deliveryPartner/register/data").permitAll()
		.antMatchers("/deliveryPartner/home/{city}").permitAll()
		.antMatchers("/deliveryPartner/login").permitAll()
		.antMatchers("/deliveryPartner/forgotpassword").permitAll()
		.antMatchers("/deliveryPartner/allcities").permitAll()
		.antMatchers("/deliveryPartner/search/{searchParameter}").permitAll()
		.antMatchers("/deliveryPartner/hotelSuggestion/{searchParameter}").permitAll()
		.antMatchers("/AdminLogin/{name}/{pass}").permitAll() // Admin login
		.antMatchers("/hotelowner/forgotPassword").permitAll() // Hotel Owner
		.antMatchers("/hotelowner/login").permitAll()
		.antMatchers("/hotelowner/register").permitAll()
		.anyRequest().authenticated()
		.and()
		.cors()		// enable CORS i.e. allow to create "Access-Control-Allow-Origin" = "*" header by @CrossOrigin
		.and()
	//	.formLogin()
	//	.and()
		.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); // because REST services are stateless (so no HttpSession)
		
//		http.authorizeRequests()
//		.antMatchers("/cart").hasRole("ADMIN")
//		.antMatchers("/customers").hasRole("CUSTOMER")
//		.antMatchers("/").permitAll()
//		.and()
		
	}
}

