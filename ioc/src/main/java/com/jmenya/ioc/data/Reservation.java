package com.jmenya.ioc.data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private long reservation_Id;

    @Column(name = "ROOM_ID")
    private long room_Id;

    @Column(name = "GUEST_ID")
    private long guestId;

    @Column(name = "RES_DATE")
    private LocalDate reservationDate;

    public long getReservation_Id() {
        return reservation_Id;
    }

    public void setReservation_Id(long reservation_Id) {
        this.reservation_Id = reservation_Id;
    }

    public long getRoom_Id() {
        return room_Id;
    }

    public void setRoom_Id(long room_Id) {
        this.room_Id = room_Id;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_Id=" + reservation_Id +
                ", room_Id=" + room_Id +
                ", guestId=" + guestId +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
