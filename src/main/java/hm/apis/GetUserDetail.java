package hm.apis;

import hm.bean.UserDetail;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetUserDetail {

    @GetMapping("/user")
    String getAllUser() {
        UserDetail user = new UserDetail();
        user.setUserName("Vijaya Singh");
        user.setAddress("Sangria, pune");
        user.setPhoneNumber("123456789");
        return "Test response";
    }

    @GetMapping("/employees/{id}")
    String getuser(@PathVariable Long userId) {
        return "Alok Ranjan";
    }

    @PostMapping("/employees")
    String addUser(@RequestBody String user) {
        return user;
    }

}
