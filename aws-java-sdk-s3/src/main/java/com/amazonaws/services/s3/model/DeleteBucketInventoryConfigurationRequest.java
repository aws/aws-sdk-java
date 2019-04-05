/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;

/**
 * Request object to delete an inventory configuration.
 */
public class DeleteBucketInventoryConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    private String bucketName;

    private String id;

    public DeleteBucketInventoryConfigurationRequest() {
    }

    public DeleteBucketInventoryConfigurationRequest(String bucketName, String id) {
        this.bucketName = bucketName;
        this.id = id;
    }

    /**
     * Returns the name of the bucket containing the inventory configuration to delete.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the inventory configuration to delete.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket containing the inventory configuration to delete
     * and return {@link DeleteBucketInventoryConfigurationRequest} object for
     * method chaining.
     */
    public DeleteBucketInventoryConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the ID used to identify the inventory configuration.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID used to identify the inventory configuration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the ID used to identify the inventory configuration and
     * returns {@link DeleteBucketInventoryConfigurationRequest} object
     * for method chaining.
     */
    public DeleteBucketInventoryConfigurationRequest withId(String id) {
        setId(id);
        return this;
    }
}
