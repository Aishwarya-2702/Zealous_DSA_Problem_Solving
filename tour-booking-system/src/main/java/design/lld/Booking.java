package design.lld;

import java.io.Serializable;

public class Booking implements Serializable {
    private int bookingId;
    private int touristId;
    private String tourName;
    private String bookingDate;

    public Booking(int bookingId, int touristId, String tourName, String bookingDate) {
        this.bookingId = bookingId;
        this.touristId = touristId;
        this.tourName = tourName;
        this.bookingDate = bookingDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getTouristId() {
        return touristId;
    }

    public void setTouristId(int touristId) {
        this.touristId = touristId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", touristId=" + touristId +
               ", tourName=" + tourName + ", bookingDate=" + bookingDate + "]\n";
    }
}
