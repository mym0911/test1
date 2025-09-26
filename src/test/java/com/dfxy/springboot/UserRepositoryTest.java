package com.dfxy.springboot;
import com.dfxy.springboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private com.dfxy.springboot.UserRepository userRepository;
    @Test
    public void testSaveUser() {
        // 创建User对象
        User user = new User();
        user.setId(1L);
        user.setUsername("testUser");
        // 保存到数据库
        User savedUser = userRepository.save(user);
        // 打印保存结果
        System.out.println("保存的用户信息: " + savedUser);
    }
}
