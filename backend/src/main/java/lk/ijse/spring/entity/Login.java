package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Kaveesh Hemaka Senevirathne
 * @created : 22/07/2022 - 4:39 PM
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Login {
    @Id
    private String loginId;
    private String username;
    private String password;
    private String role;
}
