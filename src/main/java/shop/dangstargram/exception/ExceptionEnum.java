package shop.dangstargram.exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum ExceptionEnum {
    REQUEST_PARAMETER_MISMATH_EXCEPTION(HttpStatus.BAD_REQUEST, "E0001", "요청 파라미터가 누락되었습니다."),
    NOT_DEFINE_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "E9999", "정의되어 있지 않은 예외입니다.");

    private final HttpStatus status;
    private final String code;
    private String message;

    ExceptionEnum(HttpStatus status, String code) {
        this.status = status;
        this.code = code;
    }

    ExceptionEnum(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}