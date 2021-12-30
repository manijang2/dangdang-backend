package shop.dangstargram.service;

import org.springframework.stereotype.Service;
import shop.dangstargram.domain.User;
import shop.dangstargram.dto.JoinRequireDto;
import shop.dangstargram.exception.ApiException;
import shop.dangstargram.exception.ExceptionEnum;
import shop.dangstargram.repository.UserRepository;

import javax.validation.constraints.NotNull;

@Service
public class JoinService {
    final UserRepository userRepository;

    public JoinService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public JoinRequireDto.Response join(@NotNull final JoinRequireDto.Request request) {

        userRepository.findById(request.getId()).ifPresent(m -> {
            throw new ApiException(ExceptionEnum.DUPLICATE_JOIN_ID_EXCEPTION);
        });

        User joinUser = new User(request.getId(), request.getPassword(), request.getEmail());
        userRepository.save(joinUser);

        return new JoinRequireDto.Response("success", "가입에 성공하였습니다.");
    }
}
