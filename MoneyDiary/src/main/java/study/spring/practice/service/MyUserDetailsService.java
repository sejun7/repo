package study.spring.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import study.spring.practice.domain.MyUserDetails;
import study.spring.practice.domain.User;

@Service(value = "userDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = null;

        try {
            user = userService.read(username);
        } catch (IllegalArgumentException e) {
            throw new UsernameNotFoundException(username);
        }

        MyUserDetails userDetails = new MyUserDetails(user);
        return userDetails;
    }
}
