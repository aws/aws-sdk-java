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

import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;

/**
 * Result object to contain the response returned from
 * {@link com.amazonaws.services.s3.AmazonS3Client#getBucketInventoryConfiguration(GetBucketInventoryConfigurationRequest)}
 * operation.
 */
public class GetBucketInventoryConfigurationResult {

    private InventoryConfiguration inventoryConfiguration;

    /**
     * Returns the requested inventory configuration.
     */
    public InventoryConfiguration getInventoryConfiguration() {
        return inventoryConfiguration;
    }

    /**
     * Sets the inventory configuration.
     */
    public void setInventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
        this.inventoryConfiguration = inventoryConfiguration;
    }

    /**
     * Sets the inventory configuration and returns the
     * {@link GetBucketInventoryConfigurationResult} object
     * for method chaining.
     */
    public GetBucketInventoryConfigurationResult withInventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
        setInventoryConfiguration(inventoryConfiguration);
        return this;
    }
}
