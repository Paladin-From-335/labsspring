package com.github.hotel.entity;

import com.github.hotel.payload.ReservationStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "reservation")
@NoArgsConstructor
@Data
public class Reservation {

    @Id
    @Column(columnDefinition = "BIGINT", nullable = false, name = "id")
    private long id;

    @Column(columnDefinition = "BIGINT", nullable = false, name = "roomId")
    private long roomId;

    @Column(columnDefinition = "BIGINT", nullable = false, name = "userId")
    private long userId;

    @Column(columnDefinition = "DECIMAL", nullable = false, name = "price")
    private double price;

    @Column(columnDefinition = "VARCHAR", nullable = false, name = "status")
    private ReservationStatus status;

    @Column(columnDefinition = "VARCHAR", nullable = false, name = "startDate")
    private Timestamp startDate;

    public Reservation(long roomId, long userId, double price, ReservationStatus status, Timestamp startDate) {
        this.roomId = roomId;
        this.userId = userId;
        this.price = price;
        this.status = status;
        this.startDate = startDate;
    }
}
