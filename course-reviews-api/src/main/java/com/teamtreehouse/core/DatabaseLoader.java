package com.teamtreehouse.core;

import com.teamtreehouse.course.Course;
import com.teamtreehouse.course.CourseRepository;
import com.teamtreehouse.review.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by BenNolan on 12/23/16.
 */
@Component
public class DatabaseLoader implements ApplicationRunner {
    private final CourseRepository courses;

    @Autowired
    public DatabaseLoader(CourseRepository courses) {
        this.courses = courses;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Course course =  new Course("Java Basics", "http://teamtreehouse.com/library/java-basics");
        course.addReview(new Review(3, "You ARE a dork!!!"));
        courses.save(course);
    }
}
