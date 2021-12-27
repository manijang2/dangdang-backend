package shop.dangstargram.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shop.dangstargram.dto.JoinRequireDto;

import javax.validation.Valid;

@RestController
public class JoinController {

    @PutMapping("/user/join")
    public ResponseEntity<String> join(@Valid @RequestBody JoinRequireDto.Request joinRequireRequestDto) {
        System.out.println(joinRequireRequestDto);
        return new ResponseEntity<>("join", HttpStatus.OK);
    }
}
