package models;

import javax.persistence.*;

@Entity
@Table(name="tble_bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
}
