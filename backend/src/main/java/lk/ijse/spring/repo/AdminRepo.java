package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/**
 * @author : Kaveesh Hemaka Senevirathne
 * @created : 07/07/2022 - 7:19 PM
 **/
public interface AdminRepo extends JpaRepository<Admin, String> {
    Optional<Admin> findAdminByUsername(String username);
    Optional<Admin> findAdminByPassword(String password);

    @Query(value = "SELECT adminId FROM Admin ORDER BY adminId DESC LIMIT 1",nativeQuery = true)
    String generateAdminId();
}
