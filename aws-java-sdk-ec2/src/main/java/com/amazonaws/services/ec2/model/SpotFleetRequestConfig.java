/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a Spot fleet request.
 * </p>
 */
public class SpotFleetRequestConfig implements Serializable, Cloneable {

    /**
     * The ID of the Spot fleet request.
     */
    private String spotFleetRequestId;

    /**
     * The state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     */
    private String spotFleetRequestState;

    /**
     * Information about the configuration of the Spot fleet request.
     */
    private SpotFleetRequestConfigData spotFleetRequestConfig;

    /**
     * The creation date and time of the request.
     */
    private java.util.Date createTime;

    /**
     * The ID of the Spot fleet request.
     *
     * @return The ID of the Spot fleet request.
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfig withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * The state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @return The state of the Spot fleet request.
     *
     * @see BatchState
     */
    public String getSpotFleetRequestState() {
        return spotFleetRequestState;
    }
    
    /**
     * The state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param spotFleetRequestState The state of the Spot fleet request.
     *
     * @see BatchState
     */
    public void setSpotFleetRequestState(String spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState;
    }
    
    /**
     * The state of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param spotFleetRequestState The state of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BatchState
     */
    public SpotFleetRequestConfig withSpotFleetRequestState(String spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState;
        return this;
    }

    /**
     * The state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param spotFleetRequestState The state of the Spot fleet request.
     *
     * @see BatchState
     */
    public void setSpotFleetRequestState(BatchState spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState.toString();
    }
    
    /**
     * The state of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param spotFleetRequestState The state of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BatchState
     */
    public SpotFleetRequestConfig withSpotFleetRequestState(BatchState spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState.toString();
        return this;
    }

    /**
     * Information about the configuration of the Spot fleet request.
     *
     * @return Information about the configuration of the Spot fleet request.
     */
    public SpotFleetRequestConfigData getSpotFleetRequestConfig() {
        return spotFleetRequestConfig;
    }
    
    /**
     * Information about the configuration of the Spot fleet request.
     *
     * @param spotFleetRequestConfig Information about the configuration of the Spot fleet request.
     */
    public void setSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
    }
    
    /**
     * Information about the configuration of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestConfig Information about the configuration of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfig withSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
        return this;
    }

    /**
     * The creation date and time of the request.
     *
     * @return The creation date and time of the request.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * The creation date and time of the request.
     *
     * @param createTime The creation date and time of the request.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * The creation date and time of the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime The creation date and time of the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfig withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
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
        if (getSpotFleetRequestId() != null) sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getSpotFleetRequestState() != null) sb.append("SpotFleetRequestState: " + getSpotFleetRequestState() + ",");
        if (getSpotFleetRequestConfig() != null) sb.append("SpotFleetRequestConfig: " + getSpotFleetRequestConfig() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getSpotFleetRequestState() == null) ? 0 : getSpotFleetRequestState().hashCode()); 
        hashCode = prime * hashCode + ((getSpotFleetRequestConfig() == null) ? 0 : getSpotFleetRequestConfig().hashCode()); 
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpotFleetRequestConfig == false) return false;
        SpotFleetRequestConfig other = (SpotFleetRequestConfig)obj;
        
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null) return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false) return false; 
        if (other.getSpotFleetRequestState() == null ^ this.getSpotFleetRequestState() == null) return false;
        if (other.getSpotFleetRequestState() != null && other.getSpotFleetRequestState().equals(this.getSpotFleetRequestState()) == false) return false; 
        if (other.getSpotFleetRequestConfig() == null ^ this.getSpotFleetRequestConfig() == null) return false;
        if (other.getSpotFleetRequestConfig() != null && other.getSpotFleetRequestConfig().equals(this.getSpotFleetRequestConfig()) == false) return false; 
        if (other.getCreateTime() == null ^ this.getCreateTime() == null) return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false) return false; 
        return true;
    }
    
    @Override
    public SpotFleetRequestConfig clone() {
        try {
            return (SpotFleetRequestConfig) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    