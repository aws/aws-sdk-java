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
 * Describes a Spot Fleet request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SpotFleetRequestConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotFleetRequestConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     * requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is decreased,
     * the status is <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     */
    private String activityStatus;
    /**
     * <p>
     * The creation date and time of the request.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The configuration of the Spot Fleet request.
     * </p>
     */
    private SpotFleetRequestConfigData spotFleetRequestConfig;
    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;
    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestState;

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     * requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is decreased,
     * the status is <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * 
     * @param activityStatus
     *        The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     *        requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to
     *        or greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is
     *        decreased, the status is <code>pending_termination</code> while Spot Instances are terminating.
     * @see ActivityStatus
     */

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     * requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is decreased,
     * the status is <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * 
     * @return The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     *         requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to
     *         or greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is
     *         decreased, the status is <code>pending_termination</code> while Spot Instances are terminating.
     * @see ActivityStatus
     */

    public String getActivityStatus() {
        return this.activityStatus;
    }

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     * requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is decreased,
     * the status is <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * 
     * @param activityStatus
     *        The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     *        requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to
     *        or greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is
     *        decreased, the status is <code>pending_termination</code> while Spot Instances are terminating.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStatus
     */

    public SpotFleetRequestConfig withActivityStatus(String activityStatus) {
        setActivityStatus(activityStatus);
        return this;
    }

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     * requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is decreased,
     * the status is <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * 
     * @param activityStatus
     *        The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     *        requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to
     *        or greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is
     *        decreased, the status is <code>pending_termination</code> while Spot Instances are terminating.
     * @see ActivityStatus
     */

    public void setActivityStatus(ActivityStatus activityStatus) {
        withActivityStatus(activityStatus);
    }

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     * requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is decreased,
     * the status is <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * 
     * @param activityStatus
     *        The progress of the Spot Fleet request. If there is an error, the status is <code>error</code>. After all
     *        requests are placed, the status is <code>pending_fulfillment</code>. If the size of the fleet is equal to
     *        or greater than its target capacity, the status is <code>fulfilled</code>. If the size of the fleet is
     *        decreased, the status is <code>pending_termination</code> while Spot Instances are terminating.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStatus
     */

    public SpotFleetRequestConfig withActivityStatus(ActivityStatus activityStatus) {
        this.activityStatus = activityStatus.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the request.
     * </p>
     * 
     * @param createTime
     *        The creation date and time of the request.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation date and time of the request.
     * </p>
     * 
     * @return The creation date and time of the request.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The creation date and time of the request.
     * </p>
     * 
     * @param createTime
     *        The creation date and time of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfig withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The configuration of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestConfig
     *        The configuration of the Spot Fleet request.
     */

    public void setSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
    }

    /**
     * <p>
     * The configuration of the Spot Fleet request.
     * </p>
     * 
     * @return The configuration of the Spot Fleet request.
     */

    public SpotFleetRequestConfigData getSpotFleetRequestConfig() {
        return this.spotFleetRequestConfig;
    }

    /**
     * <p>
     * The configuration of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestConfig
     *        The configuration of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfig withSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        setSpotFleetRequestConfig(spotFleetRequestConfig);
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestId
     *        The ID of the Spot Fleet request.
     */

    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @return The ID of the Spot Fleet request.
     */

    public String getSpotFleetRequestId() {
        return this.spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestId
     *        The ID of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfig withSpotFleetRequestId(String spotFleetRequestId) {
        setSpotFleetRequestId(spotFleetRequestId);
        return this;
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestState
     *        The state of the Spot Fleet request.
     * @see BatchState
     */

    public void setSpotFleetRequestState(String spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState;
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * 
     * @return The state of the Spot Fleet request.
     * @see BatchState
     */

    public String getSpotFleetRequestState() {
        return this.spotFleetRequestState;
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestState
     *        The state of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchState
     */

    public SpotFleetRequestConfig withSpotFleetRequestState(String spotFleetRequestState) {
        setSpotFleetRequestState(spotFleetRequestState);
        return this;
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestState
     *        The state of the Spot Fleet request.
     * @see BatchState
     */

    public void setSpotFleetRequestState(BatchState spotFleetRequestState) {
        withSpotFleetRequestState(spotFleetRequestState);
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestState
     *        The state of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchState
     */

    public SpotFleetRequestConfig withSpotFleetRequestState(BatchState spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState.toString();
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
        if (getActivityStatus() != null)
            sb.append("ActivityStatus: ").append(getActivityStatus()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getSpotFleetRequestConfig() != null)
            sb.append("SpotFleetRequestConfig: ").append(getSpotFleetRequestConfig()).append(",");
        if (getSpotFleetRequestId() != null)
            sb.append("SpotFleetRequestId: ").append(getSpotFleetRequestId()).append(",");
        if (getSpotFleetRequestState() != null)
            sb.append("SpotFleetRequestState: ").append(getSpotFleetRequestState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotFleetRequestConfig == false)
            return false;
        SpotFleetRequestConfig other = (SpotFleetRequestConfig) obj;
        if (other.getActivityStatus() == null ^ this.getActivityStatus() == null)
            return false;
        if (other.getActivityStatus() != null && other.getActivityStatus().equals(this.getActivityStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getSpotFleetRequestConfig() == null ^ this.getSpotFleetRequestConfig() == null)
            return false;
        if (other.getSpotFleetRequestConfig() != null && other.getSpotFleetRequestConfig().equals(this.getSpotFleetRequestConfig()) == false)
            return false;
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null)
            return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false)
            return false;
        if (other.getSpotFleetRequestState() == null ^ this.getSpotFleetRequestState() == null)
            return false;
        if (other.getSpotFleetRequestState() != null && other.getSpotFleetRequestState().equals(this.getSpotFleetRequestState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityStatus() == null) ? 0 : getActivityStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getSpotFleetRequestConfig() == null) ? 0 : getSpotFleetRequestConfig().hashCode());
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        hashCode = prime * hashCode + ((getSpotFleetRequestState() == null) ? 0 : getSpotFleetRequestState().hashCode());
        return hashCode;
    }

    @Override
    public SpotFleetRequestConfig clone() {
        try {
            return (SpotFleetRequestConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
