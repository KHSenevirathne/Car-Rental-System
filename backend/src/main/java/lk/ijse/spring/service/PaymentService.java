package lk.ijse.spring.service;

import lk.ijse.spring.dto.PaymentDTO;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : Kaveesh Hemaka Senevirathne
 * @created : 07/07/2022 - 7:24 PM
 **/
public interface PaymentService {
    void savePayment(PaymentDTO dto);

    void updatePayment(PaymentDTO dto);

    void deletePayment(String paymentId);

    PaymentDTO searchPayment(String paymentId);

    List<PaymentDTO> getAllPayments();

    List<PaymentDTO> getAllPaymentsByDateRange(String fromDate, String toDate);

    List<PaymentDTO> getAllPaymentsByCustomerId(String customerId);

    String generatePaymentId();

    void deletePaymentByRentId(String rentId);

    double calculatePaidPayments(String rentId);

    double getSumOfPaymentsByDateRange(String fromDate, String toDate);
}
