package shop.dangstargram.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class JoinRequireDto {

    @Getter
    @ToString
    public static class Request {
        @NotEmpty
        @Size(min=4, max=20)
        private String id;
        @NotEmpty
        @Size(min=4, max=20)
        private String password;
        @Email
        @NotEmpty
        private String email;
    }
}
