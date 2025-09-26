package com.dfxy.springboot;
import com.dfxy.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository
        extends JpaRepository<User, Long> {
}