//package user.user;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.Optional;
//
//@Service
//public class UserServiceImpl implements UserService{
//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Transactional()
//    public Optional<User> get (Long id){
//        return userRepository.findById(id);
//    }
//
//
//
//    @Transactional()
//    public User create(User newUser){
//        return  userRepository.save(newUser);
//    }
//
//
//}
