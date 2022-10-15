package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Kaveesh Hemaka Senevirathne
 * @created : 07/07/2022 - 7:03 PM
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AdminDTO {
    private String adminId;
    private String name;
    private String address;
    private String contact;
    private String email;
    private String username;
    private String password;
}
