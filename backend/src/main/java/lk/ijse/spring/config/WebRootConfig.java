package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Kaveesh Hemaka Senevirathne
 * @created : 07/07/2022 - 1:53 PM
 **/
@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {

}
