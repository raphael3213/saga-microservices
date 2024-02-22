package com.microservices.event;

import com.microservices.dto.OrderRequestDto;
import com.microservices.dto.PaymentRequestDto;

import java.util.Date;
import java.util.UUID;

public class PaymentEvent implements Event {
    private UUID eventId = UUID.randomUUID();

    private Date eventDate = new Date();

    private PaymentRequestDto paymentRequestDto;

    private PaymentStatus paymentStatus;

    @Override
    public UUID getEventId() {
        return null;
    }

    @Override
    public Date getDate() {
        return null;
    }
}
