package com.example.entities;

import java.util.Date;

public class Deliverable {
    private String deliverableId;
    private Person leader;
    private Date deadline;
    private Deliverable dependency;
}
