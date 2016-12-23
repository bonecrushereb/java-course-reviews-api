package com.teamtreehouse.review;

import com.teamtreehouse.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by BenNolan on 12/23/16.
 */

@Entity
public class Review extends BaseEntity{

    protected Review() {
        super();
    }

    private int Rating;
    private String description;

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