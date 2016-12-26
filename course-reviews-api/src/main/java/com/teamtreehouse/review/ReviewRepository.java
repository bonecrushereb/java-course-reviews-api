package com.teamtreehouse.review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by BenNolan on 12/23/16.
 */
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
}
