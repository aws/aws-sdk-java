/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates the specified bucket. 
 */
public class CreateBucketRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Amazon S3 bucket to create.
     */
    private String bucketName;
    
    /**
     * The name of the Amazon S3 region in which to create this bucket.
     */
    private String region;
    
    /**
     * Constructs a new CreateBucketRequest, ready to be executed and create the
     * specified bucket in the US_Standard region.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket to create.
     */
    public CreateBucketRequest(String bucketName) {
        this(bucketName, Region.US_Standard);
    }

    /**
     * Constructs a new CreateBucketRequest, ready to be executed and create the
     * specified bucket in the specified region.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket to create.
     * @param region
     *            The region in which to create this bucket.           
     */
    public CreateBucketRequest(String bucketName, Region region) {
        this(bucketName, region.toString());
    }

    /**
     * Constructs a new CreateBucketRequest, ready to be executed and create the
     * specified bucket in the specified region.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket to create.
     * @param region
     *            The region in which to create this bucket.           
     */
    public CreateBucketRequest(String bucketName, String region) {
        setBucketName(bucketName);
        setRegion(region);        
    }
    
    /**
     * Sets the name of the Amazon S3 bucket to create.
     * 
     * @param bucketName the name of the Amazon S3 bucket to create.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Returns the name of the Amazon S3 bucket to create.
     * 
     * @return the name of the Amazon S3 bucket to create.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 region in which this bucket will be created.
     * 
     * @param region the name of the Amazon S3 region in which this bucket will be created.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Returns the name of the Amazon S3 region in which this bucket will be created.
     * 
     * @return the name of the Amazon S3 region in which this bucket will be created.
     */
    public String getRegion() {
        return region;
    }
    
}
