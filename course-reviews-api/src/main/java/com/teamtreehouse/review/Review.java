package com.teamtreehouse.review;

import com.teamtreehouse.core.BaseEntity;
import com.teamtreehouse.course.Course;
import com.teamtreehouse.user.User;

import javax.persistence.*;

/**
 * Created by BenNolan on 12/23/16.
 */

@Entity
public class Review extends BaseEntity{
    private int Rating;
    private String description;
    @ManyToOne
    private Course course;
    @ManyToOne
    private User reviewer;

    protected Review() {
        super();
    }

    public Review(int rating, String description) {
        Rating = rating;
        this.description = description;
    }

    public User getReviewer() {
        return reviewer;
    }

    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
