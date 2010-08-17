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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest) CreateSpotDatafeedSubscription operation}.
 * <p>
 * Creates the data feed for Spot Instances, enabling you to view Spot
 * Instance usage logs. You can create one data feed per account.
 * </p>
 * <p>
 * For conceptual information about Spot Instances, refer to the Amazon
 * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
 * User Guide .
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest)
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
     * Default constructor for a new CreateSpotDatafeedSubscriptionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateSpotDatafeedSubscriptionRequest() {}
    
    /**
     * Constructs a new CreateSpotDatafeedSubscriptionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param bucket The Amazon S3 bucket in which to store the Spot Instance
     * datafeed.
     */
    public CreateSpotDatafeedSubscriptionRequest(String bucket) {
        this.bucket = bucket;
    }
    
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
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
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
    