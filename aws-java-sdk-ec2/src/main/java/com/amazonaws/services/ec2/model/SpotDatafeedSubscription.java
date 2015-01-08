/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

/**
 * <p>
 * Describes the datafeed for a Spot Instance.
 * </p>
 */
public class SpotDatafeedSubscription implements Serializable {

    /**
     * The AWS account ID of the account.
     */
    private String ownerId;

    /**
     * The Amazon S3 bucket where the Spot Instance datafeed is located.
     */
    private String bucket;

    /**
     * The prefix that is prepended to datafeed files.
     */
    private String prefix;

    /**
     * The state of the Spot Instance datafeed subscription.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String state;

    /**
     * The fault codes for the Spot Instance request, if any.
     */
    private SpotInstanceStateFault fault;

    /**
     * The AWS account ID of the account.
     *
     * @return The AWS account ID of the account.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The AWS account ID of the account.
     *
     * @param ownerId The AWS account ID of the account.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The AWS account ID of the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The AWS account ID of the account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotDatafeedSubscription withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * The Amazon S3 bucket where the Spot Instance datafeed is located.
     *
     * @return The Amazon S3 bucket where the Spot Instance datafeed is located.
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * The Amazon S3 bucket where the Spot Instance datafeed is located.
     *
     * @param bucket The Amazon S3 bucket where the Spot Instance datafeed is located.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * The Amazon S3 bucket where the Spot Instance datafeed is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket The Amazon S3 bucket where the Spot Instance datafeed is located.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotDatafeedSubscription withBucket(String bucket) {
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
    public SpotDatafeedSubscription withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * The state of the Spot Instance datafeed subscription.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return The state of the Spot Instance datafeed subscription.
     *
     * @see DatafeedSubscriptionState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the Spot Instance datafeed subscription.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param state The state of the Spot Instance datafeed subscription.
     *
     * @see DatafeedSubscriptionState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the Spot Instance datafeed subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param state The state of the Spot Instance datafeed subscription.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DatafeedSubscriptionState
     */
    public SpotDatafeedSubscription withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the Spot Instance datafeed subscription.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param state The state of the Spot Instance datafeed subscription.
     *
     * @see DatafeedSubscriptionState
     */
    public void setState(DatafeedSubscriptionState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the Spot Instance datafeed subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param state The state of the Spot Instance datafeed subscription.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DatafeedSubscriptionState
     */
    public SpotDatafeedSubscription withState(DatafeedSubscriptionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The fault codes for the Spot Instance request, if any.
     *
     * @return The fault codes for the Spot Instance request, if any.
     */
    public SpotInstanceStateFault getFault() {
        return fault;
    }
    
    /**
     * The fault codes for the Spot Instance request, if any.
     *
     * @param fault The fault codes for the Spot Instance request, if any.
     */
    public void setFault(SpotInstanceStateFault fault) {
        this.fault = fault;
    }
    
    /**
     * The fault codes for the Spot Instance request, if any.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fault The fault codes for the Spot Instance request, if any.
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
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() + ",");
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getPrefix() != null) sb.append("Prefix: " + getPrefix() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getFault() != null) sb.append("Fault: " + getFault() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode()); 
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getFault() == null) ? 0 : getFault().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpotDatafeedSubscription == false) return false;
        SpotDatafeedSubscription other = (SpotDatafeedSubscription)obj;
        
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false; 
        if (other.getPrefix() == null ^ this.getPrefix() == null) return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getFault() == null ^ this.getFault() == null) return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false) return false; 
        return true;
    }
    
}
    