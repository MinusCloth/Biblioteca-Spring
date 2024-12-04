package services;

import dtos.UserDTO;
import entitys.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll() {
        List<UserEntity> result = userRepository.findAll();
        return result.stream().map(UserDTO::new).toList();
    }
}
