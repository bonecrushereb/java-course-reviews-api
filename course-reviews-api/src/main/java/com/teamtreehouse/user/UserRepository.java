package com.teamtreehouse.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by BenNolan on 1/6/17.
 */

@RepositoryRestResource(exported = false)
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
