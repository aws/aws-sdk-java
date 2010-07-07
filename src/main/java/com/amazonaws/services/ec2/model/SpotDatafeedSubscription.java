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

/**
 * <p>
 * The SpotDatafeedSubscriptionType data type.
 * </p>
 */
public class SpotDatafeedSubscription {

    /**
     * Specifies the AWS account ID of the account.
     */
    private String ownerId;

    /**
     * Specifies the Amazon S3 bucket where the Spot Instance data feed is
     * located.
     */
    private String bucket;

    /**
     * Contains the prefix that is prepended to data feed files.
     */
    private String prefix;

    /**
     * Specifies the state of the Spot Instance request.
     */
    private String state;

    /**
     * Specifies a fault code for the Spot Instance request, if present.
     */
    private SpotInstanceStateFault fault;

    /**
     * Specifies the AWS account ID of the account.
     *
     * @return Specifies the AWS account ID of the account.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * Specifies the AWS account ID of the account.
     *
     * @param ownerId Specifies the AWS account ID of the account.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * Specifies the AWS account ID of the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId Specifies the AWS account ID of the account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotDatafeedSubscription withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    
    
    /**
     * Specifies the Amazon S3 bucket where the Spot Instance data feed is
     * located.
     *
     * @return Specifies the Amazon S3 bucket where the Spot Instance data feed is
     *         located.
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * Specifies the Amazon S3 bucket where the Spot Instance data feed is
     * located.
     *
     * @param bucket Specifies the Amazon S3 bucket where the Spot Instance data feed is
     *         located.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * Specifies the Amazon S3 bucket where the Spot Instance data feed is
     * located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket Specifies the Amazon S3 bucket where the Spot Instance data feed is
     *         located.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotDatafeedSubscription withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    
    
    /**
     * Contains the prefix that is prepended to data feed files.
     *
     * @return Contains the prefix that is prepended to data feed files.
     */
    public String getPrefix() {
        return prefix;
    }
    
    /**
     * Contains the prefix that is prepended to data feed files.
     *
     * @param prefix Contains the prefix that is prepended to data feed files.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    /**
     * Contains the prefix that is prepended to data feed files.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefix Contains the prefix that is prepended to data feed files.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotDatafeedSubscription withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    
    
    /**
     * Specifies the state of the Spot Instance request.
     *
     * @return Specifies the state of the Spot Instance request.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Specifies the state of the Spot Instance request.
     *
     * @param state Specifies the state of the Spot Instance request.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Specifies the state of the Spot Instance request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state Specifies the state of the Spot Instance request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotDatafeedSubscription withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Specifies a fault code for the Spot Instance request, if present.
     *
     * @return Specifies a fault code for the Spot Instance request, if present.
     */
    public SpotInstanceStateFault getFault() {
        return fault;
    }
    
    /**
     * Specifies a fault code for the Spot Instance request, if present.
     *
     * @param fault Specifies a fault code for the Spot Instance request, if present.
     */
    public void setFault(SpotInstanceStateFault fault) {
        this.fault = fault;
    }
    
    /**
     * Specifies a fault code for the Spot Instance request, if present.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fault Specifies a fault code for the Spot Instance request, if present.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotDatafeedSubscription withFault(SpotInstanceStateFault fault) {
        this.fault = fault;
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
        sb.append("OwnerId: " + ownerId + ", ");
        sb.append("Bucket: " + bucket + ", ");
        sb.append("Prefix: " + prefix + ", ");
        sb.append("State: " + state + ", ");
        sb.append("Fault: " + fault + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    