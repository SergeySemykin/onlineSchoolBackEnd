package edu.onlineSchool.eSchool;

import edu.onlineSchool.eSchool.model.AppUser;
import edu.onlineSchool.eSchool.repo.AppUserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AppUserResource {
    private AppUserMapper userMapper;
    public AppUserResource(AppUserMapper userMapper){
        this.userMapper=userMapper;
    }
    @GetMapping("/getCurrent")
    public boolean findACurrent(@PathVariable String login,@PathVariable String password){
        if(userMapper.getCurrentUser(login,password) instanceof AppUser){
            return true;
        }
        else return false;
    }
}
