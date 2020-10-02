/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.model.ownership.OwnershipControls;
import java.io.Serializable;

/**
 * Request object to set ownership controls to a bucket.
 */
public class SetBucketOwnershipControlsRequest extends AmazonWebServiceRequest implements Serializable, ExpectedBucketOwnerRequest {

    /** <p>The name of the Amazon S3 bucket whose <code>OwnershipControls</code> you want to set.</p> */
    private String bucketName;

    private String expectedBucketOwner;

    /** <p>The <code>OwnershipControls</code> (BucketOwnerPreferred or ObjectWriter) that you want to apply to this Amazon S3 bucket.</p> */
    private OwnershipControls OwnershipControls;

    public SetBucketOwnershipControlsRequest() {
    }

    public SetBucketOwnershipControlsRequest(String bucketName, OwnershipControls ownershipControls) {
        this.bucketName = bucketName;
        this.OwnershipControls = ownershipControls;
    }

    /**
     * Returns the name of the bucket for which the ownership controls are set.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket for which the ownership controls are set.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket for which the ownership controls are set
     * and returns {@link SetBucketOwnershipControlsRequest} object for method chaining.
     */
    public SetBucketOwnershipControlsRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the ownership controls that are set on the bucket.
     */
    public OwnershipControls getOwnershipControls() {
        return OwnershipControls;
    }

    /**
     * Sets the ownership controls.
     */
    public void setOwnershipControls(OwnershipControls OwnershipControls) {
        this.OwnershipControls = OwnershipControls;
    }

    /**
     * Sets the ownership controls and returns the
     * {@link SetBucketOwnershipControlsRequest} object for method chaining.
     */
    public SetBucketOwnershipControlsRequest withOwnershipControls(OwnershipControls OwnershipControls) {
        setOwnershipControls(OwnershipControls);
        return this;
    }

    public String getExpectedBucketOwner() {
        return expectedBucketOwner;
    }
 
    public SetBucketOwnershipControlsRequest withExpectedBucketOwner(String expectedBucketOwner) {
        this.expectedBucketOwner = expectedBucketOwner;
        return this;
    }
 
    public void setExpectedBucketOwner(String expectedBucketOwner) {
        withExpectedBucketOwner(expectedBucketOwner);
    }
}
