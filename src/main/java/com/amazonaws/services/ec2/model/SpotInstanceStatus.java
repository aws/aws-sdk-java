/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Spot Instance Status
 */
public class SpotInstanceStatus implements Serializable {

    private String code;

    private java.util.Date updateTime;

    private String message;

    /**
     * Returns the value of the Code property for this object.
     *
     * @return The value of the Code property for this object.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * Sets the value of the Code property for this object.
     *
     * @param code The new value for the Code property for this object.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Sets the value of the Code property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code The new value for the Code property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns the value of the UpdateTime property for this object.
     *
     * @return The value of the UpdateTime property for this object.
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }
    
    /**
     * Sets the value of the UpdateTime property for this object.
     *
     * @param updateTime The new value for the UpdateTime property for this object.
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
     * Sets the value of the UpdateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param updateTime The new value for the UpdateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceStatus withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Returns the value of the Message property for this object.
     *
     * @return The value of the Message property for this object.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Sets the value of the Message property for this object.
     *
     * @param message The new value for the Message property for this object.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Sets the value of the Message property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The new value for the Message property for this object.
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
    
}
    