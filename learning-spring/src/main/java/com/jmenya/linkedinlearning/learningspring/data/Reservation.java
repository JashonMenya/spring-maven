package com.jmenya.linkedinlearning.learningspring.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationID;

    @Column(name = "ROOM_ID")
    private long roomId;

    @Column(name = "GUEST_ID")
    private long guestId;

    @Column(name = "RES_DATE")
    private Date reservationDate;

    public long getReservationID() {
        return reservationID;
    }

    public void setReservationID(long reservationID) {
        this.reservationID = reservationID;
    }

    public long getRoodId() {
        return roomId;
    }

    public void setRoodId(long roodId) {
        this.roomId = roodId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getResDate() {
        return reservationDate;
    }

    public void setResDate(Date resDate) {
        this.reservationDate = resDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationID=" + reservationID +
                ", roodId=" + roomId +
                ", guestId=" + guestId +
                ", resDate=" + reservationDate +
                '}';
    }
}
