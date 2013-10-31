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
 * The timeline of the instance group lifecycle.
 * </p>
 */
public class InstanceGroupTimeline implements Serializable {

    /**
     * The creation date and time of the instance group.
     */
    private java.util.Date creationDateTime;

    /**
     * The date and time when the instance group became ready to perform
     * tasks.
     */
    private java.util.Date readyDateTime;

    /**
     * The date and time when the instance group terminated.
     */
    private java.util.Date endDateTime;

    /**
     * The creation date and time of the instance group.
     *
     * @return The creation date and time of the instance group.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * The creation date and time of the instance group.
     *
     * @param creationDateTime The creation date and time of the instance group.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * The creation date and time of the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The creation date and time of the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupTimeline withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * The date and time when the instance group became ready to perform
     * tasks.
     *
     * @return The date and time when the instance group became ready to perform
     *         tasks.
     */
    public java.util.Date getReadyDateTime() {
        return readyDateTime;
    }
    
    /**
     * The date and time when the instance group became ready to perform
     * tasks.
     *
     * @param readyDateTime The date and time when the instance group became ready to perform
     *         tasks.
     */
    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }
    
    /**
     * The date and time when the instance group became ready to perform
     * tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readyDateTime The date and time when the instance group became ready to perform
     *         tasks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupTimeline withReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
        return this;
    }

    /**
     * The date and time when the instance group terminated.
     *
     * @return The date and time when the instance group terminated.
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }
    
    /**
     * The date and time when the instance group terminated.
     *
     * @param endDateTime The date and time when the instance group terminated.
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    /**
     * The date and time when the instance group terminated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDateTime The date and time when the instance group terminated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupTimeline withEndDateTime(java.util.Date endDateTime) {
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

        if (obj instanceof InstanceGroupTimeline == false) return false;
        InstanceGroupTimeline other = (InstanceGroupTimeline)obj;
        
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null) return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false) return false; 
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null) return false;
        if (other.getReadyDateTime() != null && other.getReadyDateTime().equals(this.getReadyDateTime()) == false) return false; 
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null) return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false) return false; 
        return true;
    }
    
}
    