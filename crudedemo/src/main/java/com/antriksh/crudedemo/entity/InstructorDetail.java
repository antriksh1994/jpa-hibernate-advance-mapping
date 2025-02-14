package com.antriksh.crudedemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="youtube_channel")
    private String youtube_channel;
    @Column(name="hobby")
    private String hobby;
    // first we create a no arg constructor
    public InstructorDetail() {
    }

    public int getId() {
        return id;
    }

    public String getYoutube_channel() {
        return youtube_channel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYoutube_channel(String youtube_channel) {
        this.youtube_channel = youtube_channel;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public InstructorDetail(String youtube_channel, String hobby) {
        this.youtube_channel = youtube_channel;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InstructorDetail{" +
                "id=" + id +
                ", youtube_channel='" + youtube_channel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
