//package com.example.JobSeeker.Service;
//
//
//import com.example.JobSeeker.Entity.UserEntity;
//import com.example.JobSeeker.Repository.UserRepository;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.stream.Collectors;
//
//@Service
//public class userservice implements UserDetailsService {
//    @Autowired
//   UserRepository userRepository;
//
//    @Override
//    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserEntity user= userRepository.findByUsername(username)
//                .orElseThrow( ()-> new UsernameNotFoundException("User not found"));
//        return new org.springframework.security.core.userdetails.User(
//                user.getUsername(),
//                user.getPassword(),
//                user.isEnabled(),
//                true,
//        true ,
//                true,
//                user.getRoles().stream()
//                        .map(role -> new SimpleGrantedAuthority("Role" + role.getName()))
//                        .collect(Collectors.toList())
//        );
//    }
//
//
//
//    }
//
//
//
