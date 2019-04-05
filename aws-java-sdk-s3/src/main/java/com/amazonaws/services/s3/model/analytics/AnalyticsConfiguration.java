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
package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/**
 * The configuration and any analysis for the analytics filter.
 */
public class AnalyticsConfiguration implements Serializable {
    private String id;
    private AnalyticsFilter filter;
    private StorageClassAnalysis storageClassAnalysis;

    /**
     * Returns the identifier used to represent an analytics configuration.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the identifier used to represent an analytics configuration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the identifier used to represent an analytics configuration
     * and returns the {@link AnalyticsConfiguration} object
     * for method chaining.
     */
    public AnalyticsConfiguration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns the filter used to describe a set of objects for analysis.
     */
    public AnalyticsFilter getFilter() {
        return filter;
    }

    /**
     * Sets the filter used to describe a set of objects for analysis.
     * If no filter is provided, all objects will be considered in any analysis.
     */
    public void setFilter(AnalyticsFilter filter) {
        this.filter = filter;
    }

    /**
     * Sets the filter used to describe a set of objects for analysis.
     * If no filter is provided, all objects will be considered in any analysis.
     *
     * The {@link AnalyticsConfiguration} object is returned for method chaining.
     */
    public AnalyticsConfiguration withFilter(AnalyticsFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Returns the {@link StorageClassAnalysis} object.
     * If present, it indicates that data related to access patterns will be collected
     * and made available to analyze the tradeoffs between different storage classes.
     */
    public StorageClassAnalysis getStorageClassAnalysis() {
        return storageClassAnalysis;
    }

    /**
     * Sets the StorageClassAnalysis object which indicates that data related to access patterns
     * will be collected and made available to analyze the tradeoffs between different storage classes.
     */
    public void setStorageClassAnalysis(StorageClassAnalysis storageClassAnalysis) {
        this.storageClassAnalysis = storageClassAnalysis;
    }

    /**
     * Sets the StorageClassAnalysis object which indicates that data related to access patterns
     * will be collected and made available to analyze the tradeoffs between different storage classes.
     *
     * The {@link AnalyticsConfiguration} object is returned for method chaining.
     */
    public AnalyticsConfiguration withStorageClassAnalysis(StorageClassAnalysis storageClassAnalysis) {
        setStorageClassAnalysis(storageClassAnalysis);
        return this;
    }
}
