package com.mmnaseri.utils.spring.data.sample.models;

import org.springframework.data.annotation.CreatedBy;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (4/12/16, 5:20 PM)
 */
public class EntityWithCreatedBy {

    private String id;
    @CreatedBy
    private String createdBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

}
