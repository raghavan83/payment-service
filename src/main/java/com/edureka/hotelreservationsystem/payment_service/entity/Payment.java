package com.edureka.hotelreservationsystem.payment_service.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "customerId", nullable = false)
	private Long customerId;

	@Column(name = "amount", nullable = false)
	private BigDecimal amount;
	
	@Column(name = "reservationId", nullable = false)
	private Long reservationId;

   
	@Column(name = "status", nullable = false)
    private String status;

	@Column(name = "payment_date", nullable = false)
    private LocalDateTime paymentDate;

	public Payment() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the customerId
	 */
	public Long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the reservationId
	 */
	public Long getReservationId() {
		return reservationId;
	}

	/**
	 * @param reservationId the reservationId to set
	 */
	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the paymentDate
	 */
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	

	// Additional fields such as payment method, status etc.

}
