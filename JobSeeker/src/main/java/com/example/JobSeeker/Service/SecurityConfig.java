//package com.example.JobSeeker.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//@Configuration
//public class SecurityConfig {
//    @Autowired
//
//    private userservice userservice;
//
//    @Bean
//
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder(); //  Use BCrypt
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        http
//                .authorizeHttpRequests(auth ->auth
//                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .requestMatchers("/user/**").hasAnyRole("USER" , "ADMIN")
//                        .anyRequest().authenticated())
//                .formLogin(form->form.loginPage("/Login")
//                        .permitAll().permitAll()
//                        )
//                .logout(logout->logout.logoutUrl("/logout")
//                        .logoutSuccessUrl("login?login")
//                        .invalidateHttpSession(true)
//                        .deleteCookies("JSESSIONID")
//                        .permitAll()).exceptionHandling(exception->exception.accessDeniedPage("/accessdenied"));
//
//        return http.build();
//    }
//
//    @Bean
//
//    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception{
//        AuthenticationManagerBuilder authBuilder= http.getSharedObject(AuthenticationManagerBuilder.class);
//        authBuilder.userDetailsService(userservice)
//                .passwordEncoder(passwordEncoder());
//        return authBuilder.build();
//
//    }
//
//}
