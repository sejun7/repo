package study.spring.practice.service;

import study.spring.practice.domain.User;

public interface UserService {

    public User read(Long userIdx);

    public User read(String email);

    public User register(User user);
}
