package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarRentReturnDTO;

import java.util.List;

/**
 * @author : Kaveesh Hemaka Senevirathne
 * @created : 07/07/2022 - 7:23 PM
 **/
public interface CarRentReturnService {
    void saveCarRentReturn(CarRentReturnDTO dto);

    void updateCarRentReturn(CarRentReturnDTO dto);

    void deleteCarRentReturn(String returnId);

    CarRentReturnDTO searchCarRentReturn(String returnId);

    List<CarRentReturnDTO> getAllCarRentReturns();

    String generateReturnId();
}
