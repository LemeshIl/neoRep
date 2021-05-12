package user.user;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final UserConverter converter;

    public UserController(UserRepository userRepository, UserConverter converter) {
        this.userRepository = userRepository;
        this.converter = converter;
    }

    @PostMapping

    public List<UserDto> findAll() {
        List<User> findAll = userRepository.findAll();
        return converter.entityToDto(findAll);
    }

    @GetMapping("/find/{ID}")
    public UserDto findById(@PathVariable(value = "ID") Long id) {
        User orElse = userRepository.findById(id).orElse(null);
        return converter.entityToDto(orElse);

    }

    @PostMapping("/save")
    public UserDto save(@RequestBody UserDto dto) {

        User user = converter.dtoToEntity(dto);
        user=  userRepository.save(user);
        return converter.entityToDto(user);
    }

}
