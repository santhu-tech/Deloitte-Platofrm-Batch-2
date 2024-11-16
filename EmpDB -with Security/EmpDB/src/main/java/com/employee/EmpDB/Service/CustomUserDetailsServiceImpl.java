package com.employee.EmpDB.Service;

import com.employee.EmpDB.Entity.CustomUserDetails;
import com.employee.EmpDB.Entity.User;
import com.employee.EmpDB.Model.UserModel;
import com.employee.EmpDB.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        User user;
        try {
            user = userRepository.findByEmail(email);
        } catch (Exception e) {
            // TODO: handle exception
            throw new UsernameNotFoundException("User Name Not Found");
        }
        return new CustomUserDetails(user);
    }
}

