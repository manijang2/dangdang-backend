package shop.dangstargram.exception;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ApiExceptionDto {
    private final String errorCode;
    private final String errorMessage;

    public ApiExceptionDto(String errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}