//package com.example.JobSeeker.Entity;
//
//import jakarta.persistence.*;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.management.relation.Role;
//import java.util.Arrays;
//import java.util.Set;
//
//@Entity
//@Table(name = "user_table")
//public class UserEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//
//    int id;
//    String username , password;
//   boolean enabled;
//    private Set<Role> roles;
//
//
//
//
//
//
//
//    public UserEntity(int id, String username, String password, boolean enabled) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.enabled = enabled;
//    }
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "user_roles",
//            joinColumns = @JoinColumn(name = "user_id"  , referencedColumnName="id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id" , referencedColumnName = "id")
//
//    )
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public boolean isEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }
//
//    public UserEntity() {
//    }
//
//    public Set<RolesEntity> getRoles() {
//        return null;
//    }
//}
