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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * The timeline of the instance lifecycle.
 * </p>
 */
public class InstanceTimeline implements Serializable {

    /**
     * The creation date and time of the instance.
     */
    private java.util.Date creationDateTime;

    /**
     * The date and time when the instance was ready to perform tasks.
     */
    private java.util.Date readyDateTime;

    /**
     * The date and time when the instance was terminated.
     */
    private java.util.Date endDateTime;

    /**
     * The creation date and time of the instance.
     *
     * @return The creation date and time of the instance.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * The creation date and time of the instance.
     *
     * @param creationDateTime The creation date and time of the instance.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * The creation date and time of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The creation date and time of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceTimeline withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * The date and time when the instance was ready to perform tasks.
     *
     * @return The date and time when the instance was ready to perform tasks.
     */
    public java.util.Date getReadyDateTime() {
        return readyDateTime;
    }
    
    /**
     * The date and time when the instance was ready to perform tasks.
     *
     * @param readyDateTime The date and time when the instance was ready to perform tasks.
     */
    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }
    
    /**
     * The date and time when the instance was ready to perform tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readyDateTime The date and time when the instance was ready to perform tasks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceTimeline withReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
        return this;
    }

    /**
     * The date and time when the instance was terminated.
     *
     * @return The date and time when the instance was terminated.
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }
    
    /**
     * The date and time when the instance was terminated.
     *
     * @param endDateTime The date and time when the instance was terminated.
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    /**
     * The date and time when the instance was terminated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDateTime The date and time when the instance was terminated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceTimeline withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
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
        if (getCreationDateTime() != null) sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getReadyDateTime() != null) sb.append("ReadyDateTime: " + getReadyDateTime() + ",");
        if (getEndDateTime() != null) sb.append("EndDateTime: " + getEndDateTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getReadyDateTime() == null) ? 0 : getReadyDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceTimeline == false) return false;
        InstanceTimeline other = (InstanceTimeline)obj;
        
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null) return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false) return false; 
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null) return false;
        if (other.getReadyDateTime() != null && other.getReadyDateTime().equals(this.getReadyDateTime()) == false) return false; 
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null) return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false) return false; 
        return true;
    }
    
}
    