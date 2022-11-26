package study.spring.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import study.spring.practice.domain.MyUserDetails;
import study.spring.practice.repository.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Component(value = "authenticationSucessHandler")
public class MyAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        System.out.println("로그인 성공 : " + authentication.getPrincipal());
        MyUserDetails userDetails = (MyUserDetails)authentication.getPrincipal();
        String email = userDetails.getUsername();

        userRepository.updateLastLoginTime(email, new Date());

        super.onAuthenticationSuccess(request, response, authentication);
    }
}
