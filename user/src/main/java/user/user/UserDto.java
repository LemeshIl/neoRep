package user.user;

import lombok.*;

import javax.persistence.Column;



@Data
public class UserDto {
    private Long id;
    private String name;
    private String username;
    private String password;
}
