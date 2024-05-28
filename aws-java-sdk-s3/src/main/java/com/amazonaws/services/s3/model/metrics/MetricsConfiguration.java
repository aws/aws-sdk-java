/*
 * Copyright 2011-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.metrics;

import java.io.Serializable;

/**
 * Class to specify the metrics configuration.
 */
public class MetricsConfiguration implements Serializable {

    private String id;
    private MetricsFilter filter;

    /**
     * Returns the ID used to identify the metrics configuration. The ID has a 64 character limit and can only contain letters,
     * numbers, periods, dashes, and underscores.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID used to identify the metrics configuration. The ID has a 64 character limit and can only contain letters,
     * numbers, periods, dashes, and underscores.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the ID used to identify the metrics configuration and returns this object for method chaining.
     * The ID has a 64 character limit and can only contain letters, numbers, periods, dashes, and underscores.
     */
    public MetricsConfiguration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns the metrics configuration filter. The metrics configuration will only
     * include objects that meet the filter's criteria.
     *
     * A null filter indicates that the metrics are computed for the entire bucket.
     */
    public MetricsFilter getFilter() {
        return filter;
    }

    /**
     * Sets a metrics configuration filter. The metrics configuration will only
     * include objects that meet the filter's criteria.
     *
     * The filter may be omitted to get metrics for the entire bucket.
     */
    public void setFilter(MetricsFilter filter) {
        this.filter = filter;
    }

    /**
     * Sets a metrics configuration filter and returns {@link MetricsConfiguration}
     * object for method chaining. The metrics configuration will only include objects that meet the filter's criteria.
     *
     * The filter may be omitted to get metrics for the entire bucket.
     */
    public MetricsConfiguration withFilter(MetricsFilter filter) {
        setFilter(filter);
        return this;
    }
}
