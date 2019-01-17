package com.jeffborda.healthtrackerbackend;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;

    public String title;
    public String quantity;
    public String description;
    public String timestamp;

    // Default Constructor
    public Exercise() {}

    public Exercise(String title, String quantity, String description) {
        this.title = title;
        this.quantity = quantity;
        this.description = description;
        this.timestamp = new Date().toString();
    }


}



