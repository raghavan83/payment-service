package com.edureka.hotelreservationsystem.payment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edureka.hotelreservationsystem.payment_service.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
