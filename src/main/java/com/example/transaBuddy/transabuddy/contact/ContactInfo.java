package com.example.transaBuddy.transabuddy.contact;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ContactInfo implements Serializable {
    private Integer userId;
    private Integer contactId;
    private String firstName;
    private String lastName;
    private String personalCode;
    private String phoneNumber;
    private String email;
    private List<String> roleNames;
}
