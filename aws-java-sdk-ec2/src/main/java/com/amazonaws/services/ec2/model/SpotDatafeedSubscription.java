/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the data feed for a Spot Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SpotDatafeedSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotDatafeedSubscription implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon S3 bucket where the Spot Instance data feed is located.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     */
    private SpotInstanceStateFault fault;
    /**
     * <p>
     * The AWS account ID of the account.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The prefix that is prepended to data feed files.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon S3 bucket where the Spot Instance data feed is located.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket where the Spot Instance data feed is located.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the Spot Instance data feed is located.
     * </p>
     * 
     * @return The Amazon S3 bucket where the Spot Instance data feed is located.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the Spot Instance data feed is located.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket where the Spot Instance data feed is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotDatafeedSubscription withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     * 
     * @param fault
     *        The fault codes for the Spot Instance request, if any.
     */

    public void setFault(SpotInstanceStateFault fault) {
        this.fault = fault;
    }

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     * 
     * @return The fault codes for the Spot Instance request, if any.
     */

    public SpotInstanceStateFault getFault() {
        return this.fault;
    }

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     * 
     * @param fault
     *        The fault codes for the Spot Instance request, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotDatafeedSubscription withFault(SpotInstanceStateFault fault) {
        setFault(fault);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the account.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the account.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the account.
     * </p>
     * 
     * @return The AWS account ID of the account.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the account.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotDatafeedSubscription withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The prefix that is prepended to data feed files.
     * </p>
     * 
     * @param prefix
     *        The prefix that is prepended to data feed files.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to data feed files.
     * </p>
     * 
     * @return The prefix that is prepended to data feed files.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to data feed files.
     * </p>
     * 
     * @param prefix
     *        The prefix that is prepended to data feed files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotDatafeedSubscription withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * 
     * @param state
     *        The state of the Spot Instance data feed subscription.
     * @see DatafeedSubscriptionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * 
     * @return The state of the Spot Instance data feed subscription.
     * @see DatafeedSubscriptionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * 
     * @param state
     *        The state of the Spot Instance data feed subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatafeedSubscriptionState
     */

    public SpotDatafeedSubscription withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * 
     * @param state
     *        The state of the Spot Instance data feed subscription.
     * @see DatafeedSubscriptionState
     */

    public void setState(DatafeedSubscriptionState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * 
     * @param state
     *        The state of the Spot Instance data feed subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatafeedSubscriptionState
     */

    public SpotDatafeedSubscription withState(DatafeedSubscriptionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getFault() != null)
            sb.append("Fault: ").append(getFault()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotDatafeedSubscription == false)
            return false;
        SpotDatafeedSubscription other = (SpotDatafeedSubscription) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getFault() == null ^ this.getFault() == null)
            return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getFault() == null) ? 0 : getFault().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public SpotDatafeedSubscription clone() {
        try {
            return (SpotDatafeedSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
