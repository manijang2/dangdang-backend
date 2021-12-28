package shop.dangstargram.service;

import org.springframework.stereotype.Service;
import shop.dangstargram.dto.JoinRequireDto;

import javax.validation.constraints.NotNull;

@Service
public class JoinService {
    public JoinRequireDto.Response join(@NotNull final JoinRequireDto.Request request) {
        JoinRequireDto.Response response = new JoinRequireDto.Response("success", "ㅅㄷㄴㅅ");
        return response;
    }
}
