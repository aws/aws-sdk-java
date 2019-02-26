/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;
import java.io.Serializable;

/**
 * Defines a set of filter criteria that limits the objects that can trigger event notifications
 */
public class Filter implements Serializable {

    private S3KeyFilter s3KeyFilter;

    /**
     * Filter criteria that limits the objects that can trigger event notifications based on their
     * S3 Key name
     * 
     * @return The {@code S3KeyFilter} object associated with this {@code Filter}
     */
    public S3KeyFilter getS3KeyFilter() {
        return s3KeyFilter;
    }

    /**
     * Sets the {@code S3KeyFilter} for this {@code Filter}
     * 
     * @param s3KeyFilter
     *            New {@code S3KeyFilter}
     */
    public void setS3KeyFilter(S3KeyFilter s3KeyFilter) {
        this.s3KeyFilter = s3KeyFilter;
    }

    /**
     * Sets the {@code S3KeyFilter} for this {@code Filter} and returns this object for method
     * chaining
     * 
     * @param s3KeyFilter
     *            New {@code S3KeyFilter}
     * @return This object for method chaining
     */
    public Filter withS3KeyFilter(S3KeyFilter s3KeyFilter) {
        setS3KeyFilter(s3KeyFilter);
        return this;
    }
}
