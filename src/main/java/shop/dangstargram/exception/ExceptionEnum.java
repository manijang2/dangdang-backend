package shop.dangstargram.exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum ExceptionEnum {
    REQUEST_PARAMETER_MISMATH_EXCEPTION(HttpStatus.BAD_REQUEST, "E0001", "요청 파라미터가 누락되거나 조건에 맞지 않습니다."),
    REQUEST_METHOD_MISMATH_EXCEPTION(HttpStatus.BAD_REQUEST, "E0002", "요청 방식이 잘못 되었습니다."),
    DUPLICATE_JOIN_ID_EXCEPTION(HttpStatus.BAD_REQUEST, "E5001", "아이디가 이미 가입되어 있습니다."),
    NOT_DEFINE_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "E9999", "정의되어 있지 않은 예외입니다.");
    private final HttpStatus status;
    private final String code;
    private final String message;

    ExceptionEnum(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}