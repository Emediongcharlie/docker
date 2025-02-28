package com.demo.docker.data.Repository;

import com.demo.docker.data.Model.UsersLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepo extends JpaRepository<UsersLogin, String> {
}
