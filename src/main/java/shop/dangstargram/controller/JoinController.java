package shop.dangstargram.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shop.dangstargram.dto.JoinRequireDto;
import shop.dangstargram.service.JoinService;

import javax.validation.Valid;

@RestController
public class JoinController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @PutMapping("/user/join")
    public ResponseEntity<JoinRequireDto.Response> join(@Valid @RequestBody final JoinRequireDto.Request joinRequireRequestDto) {

        JoinRequireDto.Response response = joinService.join(joinRequireRequestDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
