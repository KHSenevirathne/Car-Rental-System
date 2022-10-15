package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Kaveesh Hemaka Senevirathne
 * @created : 24/07/2022 - 7:56 AM
 **/
public interface LoginRepo extends JpaRepository<Login, String> {

    @Query(value = "SELECT loginId FROM Login ORDER BY loginId DESC LIMIT 1",nativeQuery = true)
    String getLastLoginId();
}
