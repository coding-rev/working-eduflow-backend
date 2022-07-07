package eduflow.demo.controller;

import eduflow.demo.dto.RegisterRequest;
import eduflow.demo.entity.User;
import eduflow.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    private UserServices userService;

    @GetMapping("/users")//you can give this any name you want and after adding this string to the end of base url you can use this
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
        System.out.println(registerRequest.getEmail());
        userService.createUser(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

}
