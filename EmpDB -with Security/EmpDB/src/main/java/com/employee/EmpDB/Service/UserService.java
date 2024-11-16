package com.employee.EmpDB.Service;

import com.employee.EmpDB.Entity.User;
import com.employee.EmpDB.Model.UserModel;

public interface UserService {
    public User registerUser(UserModel userModel);

   public  boolean existsByEmail(String email);
}
