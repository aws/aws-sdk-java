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
 * Describes the status of a Spot instance request.
 * </p>
 */
public class SpotInstanceStatus implements Serializable, Cloneable {

    /**
     * The status code. For a list of status codes, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand">Spot
     * Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     */
    private String code;

    /**
     * The date and time of the most recent status update, in UTC format (for
     * example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    private java.util.Date updateTime;

    /**
     * The description for the status code.
     */
    private String message;

    /**
     * The status code. For a list of status codes, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand">Spot
     * Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return The status code. For a list of status codes, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand">Spot
     *         Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * The status code. For a list of status codes, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand">Spot
     * Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @param code The status code. For a list of status codes, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand">Spot
     *         Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * The status code. For a list of status codes, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand">Spot
     * Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code The status code. For a list of status codes, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand">Spot
     *         Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotInstanceStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The date and time of the most recent status update, in UTC format (for
     * example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return The date and time of the most recent status update, in UTC format (for
     *         example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }
    
    /**
     * The date and time of the most recent status update, in UTC format (for
     * example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @param updateTime The date and time of the most recent status update, in UTC format (for
     *         example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
     * The date and time of the most recent status update, in UTC format (for
     * example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param updateTime The date and time of the most recent status update, in UTC format (for
     *         example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotInstanceStatus withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * The description for the status code.
     *
     * @return The description for the status code.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The description for the status code.
     *
     * @param message The description for the status code.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The description for the status code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The description for the status code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotInstanceStatus withMessage(String message) {
        this.message = message;
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
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getUpdateTime() != null) sb.append("UpdateTime: " + getUpdateTime() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpotInstanceStatus == false) return false;
        SpotInstanceStatus other = (SpotInstanceStatus)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null) return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
    @Override
    public SpotInstanceStatus clone() {
        try {
            return (SpotInstanceStatus) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    