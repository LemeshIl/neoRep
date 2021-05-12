//package user.user;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDtoServiceImpl implements UserDtoService{
//    private final UserService userService;
//
//    @Autowired
//
//    public UserDtoServiceImpl(UserService userService) {
//        this.userService = userService;
//    }
//
//    public UserDto get(Long id){
//        final var user=UserService.get(Long id);
//        return UserDto.builder().id(user.getId()).fullname(user.getFullname()).age(user.getAge()).build();
//    }
//
////    public UserDto create(UserDto newUserDto){
////
////        final var user=UserService.set(UserDto newUserDto);
////        return UserDto.builder().set
////        )
//    }
//
//}
