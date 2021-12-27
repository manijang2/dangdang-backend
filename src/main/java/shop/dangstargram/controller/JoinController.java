package shop.dangstargram.controller;

import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PutMapping("/user/join")
    public ResponseEntity<String> join(@Valid @RequestBody final JoinRequireDto.Request joinRequireRequestDto) {
        System.out.println(joinRequireRequestDto);


        logger.trace("Trace Level 테스트");
        logger.debug("DEBUG Level 테스트");
        logger.info("INFO Level 테스트");
        logger.warn("Warn Level 테스트");
        logger.error("ERROR Level 테스트");


        return new ResponseEntity<>("join", HttpStatus.OK);
    }
}
