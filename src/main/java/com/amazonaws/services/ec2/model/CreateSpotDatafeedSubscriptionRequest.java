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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * 
 * </p>
 */
public class CreateSpotDatafeedSubscriptionRequest extends AmazonWebServiceRequest {

    /**
     * The Amazon S3 bucket in which to store the Spot Instance datafeed.
     */
    private String bucket;

    /**
     * The prefix that is prepended to datafeed files.
     */
    private String prefix;

    /**
     * The Amazon S3 bucket in which to store the Spot Instance datafeed.
     *
     * @return The Amazon S3 bucket in which to store the Spot Instance datafeed.
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * The Amazon S3 bucket in which to store the Spot Instance datafeed.
     *
     * @param bucket The Amazon S3 bucket in which to store the Spot Instance datafeed.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * The Amazon S3 bucket in which to store the Spot Instance datafeed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket The Amazon S3 bucket in which to store the Spot Instance datafeed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSpotDatafeedSubscriptionRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    
    
    /**
     * The prefix that is prepended to datafeed files.
     *
     * @return The prefix that is prepended to datafeed files.
     */
    public String getPrefix() {
        return prefix;
    }
    
    /**
     * The prefix that is prepended to datafeed files.
     *
     * @param prefix The prefix that is prepended to datafeed files.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    /**
     * The prefix that is prepended to datafeed files.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefix The prefix that is prepended to datafeed files.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSpotDatafeedSubscriptionRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Bucket: " + bucket + ", ");
        sb.append("Prefix: " + prefix + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    