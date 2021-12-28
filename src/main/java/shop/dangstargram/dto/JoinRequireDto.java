package shop.dangstargram.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class JoinRequireDto {

    @Getter
    @ToString
    @RequiredArgsConstructor
    public static class Request {
        @NotEmpty
        @Size(min=4, max=20)
        private final String id;
        @NotEmpty
        @Size(min=4, max=20)
        private final String password;
        @Email
        @NotEmpty
        private final String email;
    }

    @RequiredArgsConstructor
    public static class Response {
        private final String result;
        private final String desc;
    }
}
