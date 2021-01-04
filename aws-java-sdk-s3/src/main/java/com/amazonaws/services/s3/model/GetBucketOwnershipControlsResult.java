/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.model.ownership.OwnershipControls;
import java.io.Serializable;

/**
 * Result object to contain the response returned from
 * {@link com.amazonaws.services.s3.AmazonS3Client#getBucketOwnershipControls(GetBucketOwnershipControlsRequest)}
 * operation.
 */
public class GetBucketOwnershipControlsResult implements Serializable {

    /** The <code>OwnershipControls</code> (BucketOwnerPreferred or ObjectWriter) currently in effect for this Amazon S3 bucket. */
    private OwnershipControls OwnershipControls;

    /**
     * Returns the requested ownership controls.
     */
    public OwnershipControls getOwnershipControls() {
        return OwnershipControls;
    }

    /**
     * Sets the requested ownership controls.
     */
    public void setOwnershipControls(OwnershipControls OwnershipControls) {
        this.OwnershipControls = OwnershipControls;
    }

    /**
     * Sets the requested ownership controls and returns
     * {@link GetBucketOwnershipControlsResult} object for method chaining.
     */
    public GetBucketOwnershipControlsResult withOwnershipControls(OwnershipControls OwnershipControls) {
        setOwnershipControls(OwnershipControls);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetBucketOwnershipControlsOutput{");
        sb.append("OwnershipControls=").append(OwnershipControls);
        sb.append('}');
        return sb.toString();
    }
}
