package com.lifestyle.stps.entities;

//Training Type Model, Done by Mun Han on 30/9/2017

import javax.persistence.*;
import java.util.Date;

@Entity
public class PersonalCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer schedule_id;

    private String user_name;

    private String training_Desc;

    private String training_Type;

    private String training_Date_Start;

    private String training_Time_Start;

    private String training_Venue;

    private int training_Price;

    //For ID
    public Integer getId() {
        return schedule_id;
    }
    public void setId(Integer id) {
        this.schedule_id = id;
    }

    //For created by
    public String getUserName() {
        return user_name;
    }
    public void setUserName(String UserName) {
        this.user_name = UserName;
    }

    //For Training Type
    public String getTrainingType() {
        return training_Type;
    }
    public void setTrainingType(String TrainingType) {
        this.training_Type = TrainingType;
    }

    //For Training Description
    public String getTrainingDesc() {
        return training_Desc;
    }
    public void setTrainingDesc(String TrainingDesc) {
        this.training_Desc = TrainingDesc;
    }

    //For Training Date Start
    public String getTrainingDateStart() {
        return training_Date_Start;
    }
    public void setTrainingDateStart(String TrainingDateStart) {
        this.training_Date_Start = TrainingDateStart;
    }

    //For Training Time Start
    public String getTrainingTimeStart() {
        return training_Time_Start;
    }
    public void setTrainingTimeStart(String TrainingTimeStart) {
        this.training_Time_Start = TrainingTimeStart;
    }

    //For Training Venue
    public String getTrainingVenue() {
        return training_Venue;
    }
    public void setTrainingVenue(String TrainingVenue) {
        this.training_Venue = TrainingVenue;
    }

    //For Training Price
    public int getTrainingPrice(){return training_Price;}
    public void setTrainingPrice(int Training_Price){this.training_Price=training_Price;}
}
