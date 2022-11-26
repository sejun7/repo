package study.spring.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import study.spring.practice.Entity.UserEntity;

import java.util.Date;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    public Optional<UserEntity> findByEmail(String email);

    @Transactional
    @Modifying
    @Query(value = "UPDATE user1 SET last_login_time = :time WHERE email = :email", nativeQuery = true)
    public void updateLastLoginTime(
            @Param("email") String email,
            @Param("time") Date loginTime);
}
