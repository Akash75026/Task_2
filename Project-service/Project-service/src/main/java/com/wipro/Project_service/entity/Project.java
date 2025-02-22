package com.wipro.Project_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int pid;

    public String name;
    public String description;
    public String status;
    public String start_date;
    public String end_date;
    public String poc;
    public String poc_email;
    public double budget;
    public Long pcode;
}
