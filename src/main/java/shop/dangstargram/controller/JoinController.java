package shop.dangstargram.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinController {
    // 가입
    @PutMapping("/user/join")
    public ResponseEntity join() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
