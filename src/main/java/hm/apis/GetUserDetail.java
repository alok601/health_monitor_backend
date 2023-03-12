package hm.apis;

import hm.bean.UserDetail;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class GetUserDetail {

    @GetMapping("/all")
    UserDetail getAllUser() {
        UserDetail user = new UserDetail();
        user.setUserName("Vijaya Singh");
        user.setAddress("Sangria, pune");
        user.setPhoneNumber("123456789");
        return user;
    }

    @GetMapping("/{id}")
    String getuser(@PathVariable Long userId) {
        return "Alok Ranjan";
    }

    @PostMapping("/{id}")
    String addUser(@RequestBody String user) {
        return user;
    }

}
