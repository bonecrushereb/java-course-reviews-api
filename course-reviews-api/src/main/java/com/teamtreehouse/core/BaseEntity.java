package com.teamtreehouse.core;

import javax.persistence.*;

/**
 * Created by BenNolan on 12/23/16.
 */
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    @Version
    private Long version;

    protected BaseEntity() {
        id = null;
    }
}
