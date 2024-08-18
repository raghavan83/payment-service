package com.edureka.hotelreservationsystem.payment_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.hotelreservationsystem.payment_service.entity.Payment;
import com.edureka.hotelreservationsystem.payment_service.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	public Payment createPayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	public Payment getPayment(Long id) {
		return paymentRepository.findById(id).orElse(null);
	}

	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}

	public Payment getPaymentById(Long id) {
		return paymentRepository.findById(id).orElse(null);
	}

	public Payment addPayment(Payment payment) {
		return paymentRepository.save(payment);

		// Add Logic to post to Kafka topic
		// event UserRegistered
	}

	public Payment updatePayment(Long id, Payment payment) {
		if (paymentRepository.existsById(id)) {
			payment.setId(id); // Ensure the correct ID is set for update
			return paymentRepository.save(payment);
		} else {
			return null;
		}

		// Add Logic to post to Kafka topic
		// event UserUpdated
	}

	public boolean deletePayment(Long id) {
		if (paymentRepository.existsById(id)) {
			paymentRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

}
