package com.github.hotel.entity;

import com.github.hotel.payload.RoomCategory;
import com.github.hotel.payload.RoomStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
@Data
@NoArgsConstructor
public class Room {

    @Id
    @Column(columnDefinition = "BIGINT", nullable = false, name = "id")
    private long id;

    @Column(columnDefinition = "BIGINT", nullable = false, name = "roomNumber")
    private long roomNumber;

    @Column(columnDefinition = "BIGINT", nullable = false, name = "guestsNumber")
    private long guestsNumber;

    @Column(columnDefinition = "VARCHAR", nullable = false, name = "category")
    private RoomCategory category;

    @Column(columnDefinition = "VARCHAR", nullable = false, name = "status")
    private RoomStatus status;

    @Column(columnDefinition = "DECIMAL", nullable = false, name = "status")
    private double price;

    public Room(long roomNumber, long guestsNumber, RoomCategory category, RoomStatus status, double price) {
        this.roomNumber = roomNumber;
        this.guestsNumber = guestsNumber;
        this.category = category;
        this.status = status;
        this.price = price;
    }

}
