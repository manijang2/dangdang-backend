package shop.dangstargram.service;

import org.springframework.stereotype.Service;
import shop.dangstargram.domain.User;
import shop.dangstargram.dto.JoinRequireDto;
import shop.dangstargram.repository.UserRepository;

import javax.validation.constraints.NotNull;

@Service
public class JoinService {
    final UserRepository userRepository;

    public JoinService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public JoinRequireDto.Response join(@NotNull final JoinRequireDto.Request request) {

        User joinUser = new User(request.getId(), request.getPassword(), request.getEmail());
        userRepository.save(joinUser);

        JoinRequireDto.Response response = new JoinRequireDto.Response("success", "가입에 성공하였습니다.");
        return response;
    }
}
