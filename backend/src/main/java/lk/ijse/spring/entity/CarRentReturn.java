package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author : Kaveesh Hemaka Senevirathne
 * @created : 07/07/2022 - 8:59 AM
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class CarRentReturn {
    @Id
    private String returnId;
    private String date;
    private double noOfKm;

    @OneToOne(cascade = {CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "rentId", referencedColumnName = "rentId", nullable = false)
    private CarRent rental;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentId", referencedColumnName = "paymentId", nullable = false)
    private Payment payment;
}
