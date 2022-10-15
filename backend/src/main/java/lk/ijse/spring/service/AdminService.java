package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;

import java.util.List;

/**
 * @author : Kaveesh Hemaka Senevirathne
 * @created : 07/07/2022 - 7:22 PM
 **/
public interface AdminService {
    void saveAdmin(AdminDTO dto);

    void updateAdmin(AdminDTO dto);

    void deleteAdmin(String id);

    boolean findAdminByUserName(String username);

    boolean findAdminByPassWord(String password);

    List<AdminDTO> getAllAdmins();

    String generateAdminId();
}
